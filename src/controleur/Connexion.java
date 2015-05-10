/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *  Permet de gérer une connexion soit en ligne soit à une base en local 
 * @author thomas
 * 
 */
public class Connexion {

    private static Boolean type = true;
    private static Connection conn;
    private static String usernameECE = "";
    private static String passwordECE = "";
    private static String loginBDD = "";
    private static String passBDD = "";

    /**
     * Permet de créer un objet de connexion à la base de données
     *
     * @return toutes les informations de connexion à la base de données
     */
    public static Connection getInstance() {
        if (conn == null) {
            if (type) {
                try {
                    // chargement driver "com.mysql.jdbc.Driver"
                    Class.forName("com.mysql.jdbc.Driver");

                    // Connexion via le tunnel SSH avec le username et le password ECE
                    SSHTunnel ssh = new SSHTunnel(usernameECE, passwordECE);

                    if (ssh.connect()) {
                        System.out.println("Connexion reussie");

                        // url de connexion "jdbc:mysql://localhost:3305/usernameECE"
                        String urlDatabase = "jdbc:mysql://localhost:3305/" + usernameECE;

                        //création d'une connexion JDBC à la base
                        conn = DriverManager.getConnection(urlDatabase, loginBDD, passBDD);
                    }
                } catch (ClassNotFoundException | SQLException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    // chargement driver "com.mysql.jdbc.Driver"
                    Class.forName("com.mysql.jdbc.Driver");

                    // url de connexion a la bdd locale
                    String urlDatabase = "jdbc:mysql://localhost/hopital";

                    //création d'une connexion JDBC à la base
                    conn = DriverManager.getConnection(urlDatabase, loginBDD, passBDD);
                } catch (ClassNotFoundException | SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        try {
            conn.setAutoCommit(true);
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    //getter

    /**
     *
     * @return booleen type de connexion (en ligne ou local)
     */
        public static Boolean getType() {
        return type;
    }

    /**
     *
     * @return objet connexion
     */
    public static Connection getConn() {
        return conn;
    }

    /**
     *
     * @return nom d'utilisateur ECE
     */
    public static String getUsernameECE() {
        return usernameECE;
    }

    /**
     *
     * @return mot de passe ECE
     */
    public static String getPasswordECE() {
        return passwordECE;
    }

    /**
     *
     * @return nom d'utilisateur BDD
     */
    public static String getLoginBDD() {
        return loginBDD;
    }

    /**
     *
     * @return mot de passe BDD
     */
    public static String getPassBDD() {
        return passBDD;
    }
    
    //setter

    /**
     *
     * @param type type
     */
        public static void setType(Boolean type) {
        Connexion.type = type;
    }

    /**
     *
     * @param conn objet connexion
     */
    public static void setConn(Connection conn) {
        Connexion.conn = conn;
    }

    /**
     *
     * @param usernameECE nom d'utilisateur ECE
     */
    public static void setUsernameECE(String usernameECE) {
        Connexion.usernameECE = usernameECE;
    }

    /**
     *
     * @param passwordECE mot de passe ECE
     */
    public static void setPasswordECE(String passwordECE) {
        Connexion.passwordECE = passwordECE;
    }

    /**
     *
     * @param loginBDD nom d'utilisateur BDD
     */
    public static void setLoginBDD(String loginBDD) {
        Connexion.loginBDD = loginBDD;
    }

    /**
     *
     * @param passBDD mot de passe BDD
     */
    public static void setPassBDD(String passBDD) {
        Connexion.passBDD = passBDD;
    }

}
