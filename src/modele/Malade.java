/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 * 
 * @author Gib
 */
public class Malade extends Personne {

    private int numero;
    private String adresse;
    private String mutuelle;
    private ArrayList<Integer> tab_docteur = new ArrayList<>();

    /**
     * Default Constructeur
     */
    public Malade() {
    }

    /**
     * Constructeur : initialise les données d'un malade
     *
     * @param numero l'identifiant unique du malade
     * @param nom le nom du malade
     * @param prenom le prénom du malade
     * @param tel le numéro de téléphone du malade
     * @param adresse l'adresse du malade
     * @param mutuelle la mutuelle du malade
     */
    public Malade(int numero, String nom, String prenom, String adresse, String tel, String mutuelle) {
        super(nom, prenom, tel);
        this.numero = numero;
        this.mutuelle = mutuelle;
        this.adresse = adresse;

    }

    //Getter
    /**
     * Getter : getTab_docteur
     * @return tab_docteur
     */
    public ArrayList<Integer> getTab_docteur() {
        return tab_docteur;
    }

    /**
     * Getter : getNumero
     * @return numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Getter : getAdresse
     * @return adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Getter : getMutuelle
     * @return mutuelle
     */
    public String getMutuelle() {
        return mutuelle;
    }

    //Setter
    /**
     * Setter : setTab_docteur
     * @param tab_docteur tableau contenant les id des docteurs
     */
    public void setTab_docteur(ArrayList<Integer> tab_docteur) {
        this.tab_docteur = tab_docteur;
    }

    /**
     * Setter : setNumero
     * @param numero numero d'identifiant
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Setter : setAdresse
     * @param adresse adresse
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Setter : setMutuelle
     * @param mutuelle nom de la mutuelle
     */
    public void setMutuelle(String mutuelle) {
        this.mutuelle = mutuelle;
    }

}
