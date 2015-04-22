/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author thomas
 */
public class Connexion {

    private static Connection conn;
    private static String usernameECE = "";
    private static String passwordECE = "";
    private static String loginBDD = "";
    private static String passBDD = "";

    public static Connection getInstance(){
        if (conn == null) {
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
        }
        return conn;
    }

    public static Connection getConn() {
        return conn;
    }

    public static String getUsernameECE() {
        return usernameECE;
    }

    public static String getPasswordECE() {
        return passwordECE;
    }

    public static String getLoginBDD() {
        return loginBDD;
    }

    public static String getPassBDD() {
        return passBDD;
    }

    public static void setConn(Connection conn) {
        Connexion.conn = conn;
    }

    public static void setUsernameECE(String usernameECE) {
        Connexion.usernameECE = usernameECE;
    }

    public static void setPasswordECE(String passwordECE) {
        Connexion.passwordECE = passwordECE;
    }

    public static void setLoginBDD(String loginBDD) {
        Connexion.loginBDD = loginBDD;
    }

    public static void setPassBDD(String passBDD) {
        Connexion.passBDD = passBDD;
    }

}