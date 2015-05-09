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
import modele.Malade;

/**
 *
 * @author thomas
 */
public class MaladeDAO extends DAO<Malade>{

    @Override
    public ArrayList<Malade> all(){
        ArrayList tab_mal = new ArrayList();
        
        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT * FROM malade ORDER BY numero"
                    );

            if (result.first()) {
                do 
                {
                    Malade mal = find(result.getInt("numero"));
                    tab_mal.add(mal);
                }while(result.next());
                
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return tab_mal;
    }
    
    @Override
    public Malade find(int id) {
        
        Malade mal = new Malade();

        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT * FROM malade WHERE numero = " + id
                    );

            if (result.first()) {
                mal = new Malade(id, result.getString("nom"), result.getString("prenom"), result.getString("adresse"), result.getString("tel"), result.getString("mutuelle"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        //récupération du tableau de docteur
        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT * FROM soigne WHERE no_malade = " + id
                    );

            if (result.first()) {
                DocteurDAO docDAO = new DocteurDAO();
                ArrayList<Docteur> tab_docteur = new ArrayList();
                
                do{
                    tab_docteur.add(docDAO.find(result.getInt("no_docteur")));
                }while(result.next());
                
                mal.setTab_docteur(tab_docteur);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return mal;
    }

    @Override
    public Malade create(Malade obj) {
        try{
            this.connect.createStatement(
                	ResultSet.TYPE_SCROLL_INSENSITIVE, 
                	ResultSet.CONCUR_UPDATABLE
                 ).executeUpdate(
                	"INSERT into malade values('"+ obj.getNumero() + "',"
                                + "'" + obj.getNom() + "',"
                                + "'" + obj.getPrenom() + "',"
                                + "'" + obj.getAdresse() + "',"
                                + "'" + obj.getTel() + "',"
                                + "'" + obj.getMutuelle() + "')"
                         );
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
	return obj;
    }

    @Override
    public Malade update(Malade obj) {
        try{
            this.connect.createStatement(
                	ResultSet.TYPE_SCROLL_INSENSITIVE, 
                	ResultSet.CONCUR_UPDATABLE
                 ).executeUpdate(
                	"UPDATE malade SET nom = '" + obj.getNom() + "', " +
                        "prenom = '" + obj.getPrenom() + "', " +
                        "adresse = '" + obj.getAdresse() + "', " +
                        "tel = '" + obj.getTel() + "', " +
                        "mutuelle = '" + obj.getMutuelle() + "'" +
                        " WHERE numero = " + obj.getNumero() + ";"
                         
                        );
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
        return obj;
    }

    @Override
    public void delete(Malade obj) {
        try {
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate("DELETE FROM malade WHERE numero = '" + obj.getNumero() + "';"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
