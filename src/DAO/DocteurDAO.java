/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modele.Docteur;
import modele.Employe;

/**
 *
 * @author thomas
 */
public class DocteurDAO extends DAO<Docteur> {
    
    
    @Override
    public ArrayList<Docteur> all(){
        ArrayList tab_docteur = new ArrayList();
        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT * FROM employe e,docteur d WHERE e.numero = d.numero ORDER BY d.numero"
                    );

            if (result.first()) {
                do 
                {   
                    Docteur doct = find(result.getInt("numero"));
                    tab_docteur.add(doct);
                }while(result.next());
                
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return tab_docteur;
    }
    
    @Override
    public Docteur find(int id) {
        Docteur doct = new Docteur();
        
        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT * FROM employe e,docteur d WHERE e.numero = " + id + " AND e.numero = d.numero"
                    );

            if (result.first()) {
                doct = new Docteur(id, result.getString("nom"), result.getString("prenom"), result.getString("tel"), result.getString("adresse"),result.getString("specialite"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
         //récupération du tableau de malades
        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT * FROM soigne WHERE no_docteur = " + id
                    );

            if (result.first()) {
                ArrayList<Integer> tab_ma = new ArrayList();

                do {
                    tab_ma.add(result.getInt("no_malade"));
                } while (result.next());

                doct.setTab_ma(tab_ma);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return doct;
    }

    @Override
    public Docteur create(Docteur obj) {
        try {
            
            DAO<Employe> employeDAO = new EmployeDAO();
            Employe emp = new Employe(obj.getNumero(), obj.getNom(), obj.getPrenom(), obj.getTel(), obj.getAdresse());
            employeDAO.create(emp); 
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate(
                    "INSERT into docteur values(" + obj.getNumero() + ",'" + obj.getSpecialite() + "');"             
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        //création des relations entre le malade et le docteur
        ArrayList<Integer> tab_ma = obj.getTab_ma();
        for (int i = 0; i < tab_ma.size(); i++) {

            try {
                this.connect.createStatement(
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_UPDATABLE
                ).executeUpdate(
                        "INSERT into soigne values('" + obj.getNumero() + "',"
                        + "'" + tab_ma.get(i) + "')"
                );
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return obj;
    }

    @Override
    public Docteur update(Docteur obj) {
        try {
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate(
                    "UPDATE employe SET nom = '" + obj.getNom() + "', "
                    + "Prenom = '" + obj.getPrenom() + "', " + "adresse =  '" + obj.getAdresse() + "', "
                    + "tel =  '" + obj.getTel() + "', "
                    + " WHERE numero = '" + obj.getNumero() + "';"
                    + " UPDATE docteur SET specialite = '" + obj.getSpecialite() + "', "
                    + " WHERE numero = '" + obj.getNumero() + "';"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //création des relations entre le malade et le docteur
        ArrayList<Integer> tab_ma = obj.getTab_ma();
        for (int i = 0; i < tab_ma.size(); i++) {

            try {
                this.connect.createStatement(
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_UPDATABLE
                ).executeUpdate("DELETE FROM soigne WHERE no_docteur = '" + obj.getNumero() + "'; " + //suppression des valeurs
                        "INSERT into soigne values('" + obj.getNumero() + "',"                        //ajout des nouvelles valeurs
                        + "'" + tab_ma.get(i)+ "')"
                );
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return obj;
    }

    @Override
    public void delete(Docteur obj) {
        try {
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate("DELETE FROM employe WHERE numero = '" + obj.getNumero() + "'; "
                          + "DELETE FROM docteur WHERE numero = '" + obj.getNumero() + "'; "
                          + "DELETE FROM soigne WHERE no_docteur = '" + obj.getNumero() + "';"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
