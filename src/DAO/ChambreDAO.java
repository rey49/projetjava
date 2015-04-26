/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import modele.Chambre;

/**
 *
 * @author thomas
 */
public class ChambreDAO extends DAO<Chambre>{

    public ChambreDAO(Connection conn)
    {
        super(conn);
    }
    
    @Override
    public Chambre find(int id)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public Chambre find(String text) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Chambre create(Chambre obj) 
    {
         try{
            this.connect.createStatement(
                	ResultSet.TYPE_SCROLL_INSENSITIVE, 
                	ResultSet.CONCUR_UPDATABLE
                 ).executeUpdate(
                	"INSERT into chambre values('"+ obj.getCode_service() + "'," + obj.getNo_chambre() + "," + obj.getSurveillant() + "," + obj.getNb_lits() + ")"
                         );
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
	    return obj;
    }

    @Override
    public Chambre update(Chambre obj) 
    {
        try{
            this.connect.createStatement(
                	ResultSet.TYPE_SCROLL_INSENSITIVE, 
                	ResultSet.CONCUR_UPDATABLE
                 ).executeUpdate(
                	"UPDATE chambre SET surveillant = '" + obj.getSurveillant() + "', " +
                        "nb_lits = " + obj.getNb_lits() +
                        " WHERE code_service = '" + obj.getCode_service() + "'" +
                        " AND no_chambre = " + obj.getNo_chambre()
                         
                        );
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
        return obj;
    }

    @Override
    public void delete(Chambre obj) {
        try{
            this.connect.createStatement(
                	ResultSet.TYPE_SCROLL_INSENSITIVE, 
                	ResultSet.CONCUR_UPDATABLE
                 ).executeUpdate(
                	"DELETE FROM chambre WHERE code_service = '" + obj.getCode_service() + "' " +
                        "AND no_chambre = " + obj.getNo_chambre() +
                        " AND surveillant = " + obj.getSurveillant() +
                        " AND nb_lits = " + obj.getNb_lits());
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
    }    

}
