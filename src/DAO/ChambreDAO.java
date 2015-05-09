/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modele.Chambre;

/**
 *
 * @author thomas
 */
public class ChambreDAO extends DAO<Chambre> {

    /**
     * Permet de retourner la liste de toutes les chambres
     *
     * @return
     */
    @Override
    public ArrayList<Chambre> all() {
        ArrayList tab_chambre = new ArrayList();

        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT * FROM chambre"
                    );

            if (result.first()) {
                while (result.next()) {
                    Chambre cham = new Chambre(result.getString("code_service"), result.getInt("no_chambre"), result.getInt(3), result.getInt(4));
                    tab_chambre.add(cham);
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tab_chambre;
    }

    /**
     * Permet de récupérer une chambre via son numéro
     *
     * @return
     */
    public Chambre find(int id) {
        Chambre cham = new Chambre();

        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT * FROM chambre WHERE no_chambre = " + id
                    );

            if (result.first()) {
                cham = new Chambre(result.getString("code_service"), id, result.getInt(3), result.getInt(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cham;
    }

    /**
     * Permet de créer une chambre dans la base de données
     *
     * @return
     */
    @Override
    public Chambre create(Chambre cham) {
        try {
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate(
                    "INSERT into chambre values('" + cham.getCode_service() + "'," + cham.getNo_chambre() + "," + cham.getSurveillant() + "," + cham.getNb_lits() + ")"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cham;
    }

    /**
     * Permet de mettre à jour les données d'une chambre dans la base de données
     *
     * @return
     */
    @Override
    public Chambre update(Chambre cham) {
        try {
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate(
                    "UPDATE chambre SET surveillant = '" + cham.getSurveillant() + "', "
                    + "nb_lits = " + cham.getNb_lits()
                    + " WHERE code_service = '" + cham.getCode_service() + "'"
                    + " AND no_chambre = " + cham.getNo_chambre()
            );

            this.connect.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cham;
    }

    /**
     * Permet de supprimer une chambre de la base de données
     *
     */
    @Override
    public void delete(Chambre cham) {
        try {
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate(
                    "DELETE FROM chambre WHERE code_service = '" + cham.getCode_service() + "' "
                    + "AND no_chambre = " + cham.getNo_chambre()
                    + " AND surveillant = " + cham.getSurveillant()
                    + " AND nb_lits = " + cham.getNb_lits());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
