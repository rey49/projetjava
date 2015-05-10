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
public class Service
{
    private String code;
    private String nom;
    private String batiment;
    private int directeur;
    
    /**
     * Default Constructeur
     */
    public Service() {
    }
    
    /**
     * Constructeur : initialise les données d'un service
     * @param code le code en 3 lettres du service
     * @param nom le nom complet du service
     * @param batiment la lettre référence du bâtiment dans lequel se trouve le service
     * @param directeur l'identifiant unique du docteur qui dirige le service
     */
    public Service(String code, String nom, String batiment, int directeur)
    {
        this.code = code;
        this.nom = nom;
        this.batiment = batiment;
        this.directeur = directeur;
    }

    
    
    /**
     * Getter : getCode
     * @return code
     */
    public String getCode() {
        return code;
    }
    
    /**
     * Getter : getNom
     * @return nom
     */
    public String getNom() {
        return nom;
    }
    
    /**
     * Getter : getBatiment
     * @return batiment
     */
    public String getBatiment() {
        return batiment;
    }
    
    /**
     * Getter : getDirecteur
     * @return directeur
     */
    public int getDirecteur() {
        return directeur;
    }
    

    /**
     * Setter : setCode
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Setter : setNom
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Setter : setBatiment
     * @param batiment
     */
    public void setBatiment(String batiment) {
        this.batiment = batiment;
    }
    
    /**
     * Setter : setDirecteur
     * @param directeur
     */
    public void setDirecteur(int directeur) {
        this.directeur = directeur;
    }
    
}
