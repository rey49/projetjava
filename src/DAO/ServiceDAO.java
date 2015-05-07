/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modele.Service;

/**
 *
 * @author thomas
 */
public class ServiceDAO extends DAO<Service> {

    @Override
    public ArrayList<Service> all() {
        ArrayList tab_serv = new ArrayList();
        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT * FROM service ORDER BY 'code'"
                    );

            if (result.first()) {
                do
                {
                    Service serv = new Service(result.getString("code"), result.getString("nom"), result.getString("batiment"), result.getInt("directeur"));
                    tab_serv.add(serv);
                }while(result.next());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tab_serv;
    }

    public Service find(String id) {

        Service serv = new Service();

        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT * FROM service WHERE code = " + id
                    );

            if (result.first()) {
                serv = new Service(id, result.getString("nom"), result.getString("batiment"), result.getInt("directeur"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return serv;
    }

    @Override
    public Service create(Service obj) {
        try {
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate(
                    "INSERT into service values('" + obj.getCode() + "'," + obj.getNom() + "," + obj.getBatiment() + "," + obj.getDirecteur() + ")"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public Service update(Service obj) {
        try {
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate(
                    "UPDATE service SET nom = '" + obj.getNom() + "', "
                    + "batiment = '" + obj.getBatiment() + "', "
                    + "directeur = '" + obj.getDirecteur() + "'"
                    + " WHERE code = '" + obj.getCode()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public void delete(Service obj) {
        try {
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate(
                    "DELETE FROM service WHERE code = '" + obj.getCode() + "'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Service find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
