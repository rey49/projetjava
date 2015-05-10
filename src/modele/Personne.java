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

    /**
     *
     */
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

    /**
     *
     * @return
     */
        public String getNom() {
        return nom;
    }

    /**
     *
     * @return
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     *
     * @return
     */
    public String getTel() {
        return tel;
    }
    
    //Setter

    /**
     *
     * @param nom
     */
        public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     *
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }
    
}
