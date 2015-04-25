/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.java;

import DAO.ChambreDAO;
import DAO.DAO;
import controleur.Connexion;
import java.sql.SQLException;
import modele.Chambre;
import com.jcraft.jsch.*;


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
    DAO<Chambre> chambredao = new ChambreDAO(Connexion.getInstance());
    
    Chambre t = new Chambre("REA", 106, 12, 1);
    Chambre t2 = new Chambre("REA", 105, 320, 50);
    chambredao.update(t2);
    }
    
}
