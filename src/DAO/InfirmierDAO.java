/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import modele.Infirmier;

/**
 *
 * @author thomas
 */
public class InfirmierDAO extends DAO<Infirmier> {

    @Override
    public Infirmier find(int id) {
        Infirmier inf = new Infirmier();
        
        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT * FROM employe e,infirmier i WHERE e.numero = " + id + " AND e.numero = i.numero"
                    );

            if (result.first()) {
                inf = new Infirmier(id, result.getString("nom"), result.getString("prenom"), result.getString("tel"), result.getString("adresse"),result.getString("code_service"),result.getString("rotation"),result.getInt("salaire"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return inf;
    }

    @Override
    public Infirmier create(Infirmier obj) {
        try {
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate(
                    "INSERT into infirmier values('" + obj.getNumero() + "'," + obj.getCode_service() + "," + obj.getRotation() + "," + obj.getSalaire() + ");"
                    + "INSERT into employe values('" + obj.getNumero() + "'," + obj.getNom() + "'," + obj.getPrenom() + "'," + obj.getAdresse() + "'," + obj.getTel() + ");"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public Infirmier update(Infirmier obj) {
        try {
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate(
                    "UPDATE employe SET nom = '" + obj.getNom() + "', "
                    + "Prenom = '" + obj.getPrenom() + "', " + "adresse =  '" + obj.getAdresse() + "', "
                    + "tel =  '" + obj.getTel() + "', "
                    + " WHERE numero = '" + obj.getNumero() + "';"
                    + " UPDATE infirmier SET code_service = '" + obj.getCode_service() + "', "
                    + "rotation = '" + obj.getRotation()+ "', " + "salaire =  '" + obj.getSalaire()
                    + " WHERE numero = '" + obj.getNumero() + "';"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public void delete(Infirmier obj) {
        try {
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate("DELETE FROM employe WHERE numero = '" + obj.getNumero() + "'; "
                    + "DELETE FROM infirmier WHERE numero = '" + obj.getNumero() + "'; "
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
