/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modele.Employe;

/**
 * Classe pour gerer la table Employe
 * @author thomas
 */
public class EmployeDAO extends DAO<Employe> {
    
    @Override
    public ArrayList<Employe> all(){
        ArrayList tab_emp = new ArrayList();
        
         try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT * FROM employe ORDER BY numero"
                    );

            if (result.first()) {
                do
                {
                    Employe emp = new Employe(result.getInt("numero"), result.getString("nom"), result.getString("prenom"), result.getString("tel"), result.getString("adresse"));
                    tab_emp.add(emp);
                }while(result.next());
                
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return tab_emp;
    }
    
    @Override
    public Employe find(int id) {
        Employe emp = new Employe();

        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT * FROM employe WHERE numero = " + id
                    );

            if (result.first()) {
                emp = new Employe(id, result.getString("nom"), result.getString("prenom"), result.getString("tel"), result.getString("adresse"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return emp;
    }

    @Override
    public Employe create(Employe obj) {
        try {
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate(
                    "INSERT into employe values(" + obj.getNumero() + ",'" + obj.getNom() + "','" + obj.getPrenom() + "','" + obj.getAdresse() + "','" + obj.getTel() + "');"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public Employe update(Employe obj) {
        try {
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate(
                    "UPDATE employe SET nom = '" + obj.getNom() + "', "
                    + "Prenom = '" + obj.getPrenom() + "', " + "adresse =  '" + obj.getAdresse() + "', "
                    + "tel =  '" + obj.getTel()
                    + "' WHERE numero = " + obj.getNumero() + ";"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public void delete(Employe obj) {
        try {
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate("DELETE FROM employe WHERE numero = " + obj.getNumero() + ";");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public ArrayList<Employe> requete(String req){
        ArrayList tab_emp = new ArrayList();
        
         try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            req
                    );

            if (result.first()) {
                do
                {
                    Employe emp = new Employe(result.getInt("numero"), result.getString("nom"), result.getString("prenom"), result.getString("tel"), result.getString("adresse"));
                    tab_emp.add(emp);
                }while(result.next());
                
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return tab_emp;
    }
}
