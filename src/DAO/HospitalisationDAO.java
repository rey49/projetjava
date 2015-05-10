/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modele.Hospitalisation;

/**
 *
 * @author thomas
 */
public class HospitalisationDAO extends DAO<Hospitalisation> {

    @Override
    public ArrayList<Hospitalisation> all() {
        ArrayList tab_hop = new ArrayList();
        
         try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT * FROM hospitalisation ORDER BY no_malade"
                    );

            if (result.first()) {
                do
                {
                    Hospitalisation hop = new Hospitalisation(result.getInt("no_malade"), result.getString("code_service"), result.getInt("no_chambre"), result.getInt("lit"));
                    tab_hop.add(hop);
                }while(result.next());
                
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return tab_hop;
    }

    @Override
    //recherche avec le no_malade
    public Hospitalisation find(int id) {
        Hospitalisation hop = new Hospitalisation();

        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT * FROM hospitalisation WHERE no_malade = " + id
                    );

            if (result.first()) {
                hop = new Hospitalisation(id, result.getString("code_service"), result.getInt("no_chambre"), result.getInt("lit"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return hop;
    }
    
    public Hospitalisation find(String code_service) {
        Hospitalisation hop = new Hospitalisation();

        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT * FROM hospitalisation WHERE code_service = " + code_service
                    );

            if (result.first()) {
                hop = new Hospitalisation(result.getInt("no_malade"), code_service, result.getInt("no_chambre"), result.getInt("lit"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return hop;
    }

    @Override
    public Hospitalisation create(Hospitalisation obj) {
        try {
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate(
                    "INSERT into hospitalisation values(" + obj.getNo_malade()+ ",'" + obj.getCode_service()+ "','" + obj.getNo_chambre()+ "','" + obj.getNo_lit() + "');"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public Hospitalisation update(Hospitalisation obj) {
        try {
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate(
                    "UPDATE hospitalisation SET code_service = '" + obj.getCode_service()+ "', " 
                    + "no_chambre =  '" + obj.getNo_chambre()+ "', "
                    + "lit =  '" + obj.getNo_lit()
                    + " WHERE no_malade = '" + obj.getNo_malade()+ "';"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public void delete(Hospitalisation obj) {
        try {
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate("DELETE FROM hospitalisation WHERE no_malade = '" + obj.getNo_malade()+ "' ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
