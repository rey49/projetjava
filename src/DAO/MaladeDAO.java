/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import modele.Malade;

/**
 *
 * @author thomas
 */
public class MaladeDAO extends DAO<Malade>{

    public MaladeDAO(Connection conn) {
        super(conn);
    }

    @Override
    public Malade find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                	"UPDATE malade SET nom = '" + obj.getNom() + "'," +
                        "prenom = '" + obj.getPrenom() + "'," +
                        "adresse = '" + obj.getAdresse() + "'," +
                        "tel = '" + obj.getTel() + "'," +
                        "mutuelle = '" + obj.getMutuelle() + "'" +
                        " WHERE numero = '" + obj.getNumero()
                         
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
