/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import modele.Docteur;

/**
 *
 * @author thomas
 */
public class DocteurDAO extends DAO<Docteur> {

    public DocteurDAO(Connection conn) {
        super(conn);
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
        
        return doct;
    }

    @Override
    public Docteur create(Docteur obj) {
        try {
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate(
                    "INSERT into docteur values('" + obj.getNumero() + "'," + obj.getSpecialite() + ");"
                    + "INSERT into employe values('" + obj.getNumero() + "'," + obj.getNom() + "'," + obj.getPrenom() + "'," + obj.getAdresse() + "'," + obj.getTel() + ");"
            );
        } catch (SQLException e) {
            e.printStackTrace();
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
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
