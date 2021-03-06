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
 * Classe pour gerer la table Chambre
 * @author thomas
 */
public class ChambreDAO extends DAO<Chambre> {

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
                do {
                    Chambre cham = new Chambre(result.getString("code_service"), result.getInt("no_chambre"), result.getInt(3), result.getInt(4));
                    tab_chambre.add(cham);
                } while (result.next());

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tab_chambre;
    }

    @Override
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

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cham;
    }

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

    @Override
    public ArrayList<Chambre> requete(String req) {
        ArrayList tab_chambre = new ArrayList();

        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            req
                    );

            if (result.first()) {
                do {
                    Chambre cham = new Chambre(result.getString("code_service"), result.getInt("no_chambre"), result.getInt(3), result.getInt(4));
                    tab_chambre.add(cham);
                } while (result.next());

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tab_chambre;
    }
}
