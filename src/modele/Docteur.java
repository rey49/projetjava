/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author Gib
 */
public class Docteur extends Employe
{
    private String specialite;
    
    public Docteur(int numero, String nom, String prenom, String tel, String adresse, String specialite)
    {
        super(numero, nom, prenom, tel, adresse);
        this.specialite = specialite;
    }
    
    //Getter
    public String getSpecialite() {
        return specialite;
    }
    
    //Setter
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    
    
}
