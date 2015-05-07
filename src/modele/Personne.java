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
public class Personne
{
    private String nom;
    private String prenom;
    private String tel;

    public Personne() {
    }
    
    /**
     * Constructeur : initialise les données d'une personne
     * @param nom le nom de la personne
     * @param prenom le prénom de la personne
     * @param tel le numéro de téléphone de la personne
     */
    public Personne(String nom, String prenom, String tel)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
    }
    
    //Getter
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTel() {
        return tel;
    }
    
    //Setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
}
