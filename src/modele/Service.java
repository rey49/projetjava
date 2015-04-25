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
    private int code;
    private String nom;
    private int batiment;
    private int directeur;
    
    
    public Service() {}
    
    public Service(int code, String nom, int batiment, int directeur)
    {
        this.code = code;
        this.nom = nom;
        this.batiment = batiment;
        this.directeur = directeur;
    }

    
    
    //Getter
    public int getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public int getBatiment() {
        return batiment;
    }

    public int getDirecteur() {
        return directeur;
    }
    
    //Setter
    public void setCode(int code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setBatiment(int batiment) {
        this.batiment = batiment;
    }

    public void setDirecteur(int directeur) {
        this.directeur = directeur;
    }
    
}
