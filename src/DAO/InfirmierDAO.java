/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modele.Employe;
import modele.Infirmier;

/**
 * Classe pour gerer la table Infirmier
 * @author thomas
 */
public class InfirmierDAO extends DAO<Infirmier> {

    @Override
    public ArrayList<Infirmier> all() {
        ArrayList tab_inf = new ArrayList();

        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT * FROM employe e,infirmier i WHERE e.numero = i.numero ORDER BY i.numero"
                    );

            if (result.first()) {
                do {
                    Infirmier inf = new Infirmier(result.getInt("numero"), result.getString("nom"), result.getString("prenom"), result.getString("tel"), result.getString("adresse"), result.getString("code_service"), result.getString("rotation"), result.getInt("salaire"));
                    tab_inf.add(inf);
                } while (result.next());

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tab_inf;
    }

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
                inf = new Infirmier(id, result.getString("nom"), result.getString("prenom"), result.getString("tel"), result.getString("adresse"), result.getString("code_service"), result.getString("rotation"), result.getInt("salaire"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return inf;
    }

    @Override
    public Infirmier create(Infirmier obj) {
        try {
            DAO<Employe> employeDAO = new EmployeDAO();
            Employe emp = new Employe(obj.getNumero(), obj.getNom(), obj.getPrenom(), obj.getTel(), obj.getAdresse());
            employeDAO.create(emp);

            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate(
                    "INSERT into infirmier values(" + obj.getNumero() + ",'" + obj.getCode_service() + "','" + obj.getRotation() + "'," + obj.getSalaire() + ");"
            );

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public Infirmier update(Infirmier obj) {
        try {
            DAO<Employe> employeDAO = new EmployeDAO();
            Employe emp = new Employe(obj.getNumero(), obj.getNom(), obj.getPrenom(), obj.getTel(), obj.getAdresse());
            employeDAO.update(emp);
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate(" UPDATE infirmier SET code_service = '" + obj.getCode_service() + "', "
                    + "rotation = '" + obj.getRotation() + "', " + "salaire =  '" + obj.getSalaire()
                    + "' WHERE numero = " + obj.getNumero() + ";"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public void delete(Infirmier obj) {
        try {
            DAO<Employe> employeDAO = new EmployeDAO();
            Employe emp = new Employe(obj.getNumero(), obj.getNom(), obj.getPrenom(), obj.getTel(), obj.getAdresse());
            employeDAO.delete(emp);
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate("DELETE FROM infirmier WHERE numero = " + obj.getNumero() + ";"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Infirmier> requete(String req) {
        ArrayList tab_inf = new ArrayList();

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
                    Infirmier inf = new Infirmier(result.getInt("numero"), result.getString("nom"), result.getString("prenom"), result.getString("tel"), result.getString("adresse"), result.getString("code_service"), result.getString("rotation"), result.getInt("salaire"));
                    tab_inf.add(inf);
                } while (result.next());

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tab_inf;
    }
}
