/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import modele.Service;

/**
 *
 * @author thomas
 */
public class ServiceDAO extends DAO<Service>{

    public ServiceDAO(Connection conn) {
        super(conn);
    }

    @Override
    public Service find(int code) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Service create(Service obj) {
        try {
            this.connect.createStatement(
                	ResultSet.TYPE_SCROLL_INSENSITIVE, 
                	ResultSet.CONCUR_UPDATABLE
                 ).executeUpdate(
                	"INSERT into service values('"+ obj.getCode() + "'," + obj.getNom() + "," + obj.getBatiment() + "," + obj.getDirecteur() + ")"
                         );
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
	return obj;
    }

    @Override
    public Service update(Service obj) {
        try{
            this.connect.createStatement(
                	ResultSet.TYPE_SCROLL_INSENSITIVE, 
                	ResultSet.CONCUR_UPDATABLE
                 ).executeUpdate(
                	"UPDATE service SET nom = '" + obj.getNom() + "', " +
                        "batiment = '" + obj.getBatiment() + "', " +
                        "directeur = '" + obj.getDirecteur() + "'" +
                        " WHERE code = '" + obj.getCode()
                         
                        );
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
        return obj;
    }

    @Override
    public void delete(Service obj) {
        try{
            this.connect.createStatement(
                	ResultSet.TYPE_SCROLL_INSENSITIVE, 
                	ResultSet.CONCUR_UPDATABLE
                 ).executeUpdate(
                	"DELETE FROM service WHERE code = '" + obj.getCode() + "'");
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
    }
    
}
