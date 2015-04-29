/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.java;

import DAO.*;
import controleur.Connexion;
import java.sql.SQLException;
import modele.*;


/**
 *
 * @author Panda
 */
public class ProjetJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try 
        {
            Connexion.getInstance().setAutoCommit(false);
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
	}
    DAO<Employe> employedao = new EmployeDAO();
    DAO<Chambre> chambredao = new ChambreDAO();
    DAO<Service> servicedao = new ServiceDAO();
    
    }
    
}
