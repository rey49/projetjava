/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modele.Soigne;

/**
 *
 * @author thomas
 */
public class SoigneDAO extends DAO<Soigne> {

    @Override
    public ArrayList<Soigne> all() {
         ArrayList tab_so = new ArrayList();
        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT * FROM soigne"
                    );

            if (result.first()) {
                do
                {
                    Soigne so = new Soigne(result.getInt("no_docteur"), result.getInt("no_malade"));
                    tab_so.add(so);
                }while(result.next());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tab_so;
    }

    public Soigne find(int no_malade, int no_docteur) {
        Soigne so = new Soigne();

        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT * FROM soigne WHERE no_malade = " + no_malade + "AND no_docteur = " + no_docteur
                    );

            if (result.first()) {
                so = new Soigne(no_docteur,no_malade);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return so;
    }

    @Override
    public Soigne create(Soigne obj) {
        try {
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate(
                    "INSERT into soigne values('" + obj.getNo_docteur()+ "'," + obj.getNo_malade() + ")"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public Soigne update(Soigne obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Soigne obj) {
        try {
            this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            ).executeUpdate(
                    "DELETE FROM soigne WHERE no_docteur = '" + obj.getNo_docteur()+ "' AND no_malade = '"+ obj.getNo_malade() +"'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Soigne find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
