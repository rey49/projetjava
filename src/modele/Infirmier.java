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
public class Infirmier extends Employe
{
    private String rotation;
    private double salaire;
    private String code_service;

    /**
     * Default Constructeur
     */
    public Infirmier() {
    }
    
    /**
     * Constructeur : initialise les données d'un infirmier
     * @param numero l'identifiant unique de l'infirmier
     * @param nom le nom de l'infirmier
     * @param prenom le prénom de l'infirmier
     * @param tel le numéro de téléphone de l'infirmier
     * @param adresse l'adresse de l'infirmier
     * @param code_service le code du service dans lequel travaille l'infirmier
     * @param rotation pour savoir si l'infirmier travaille de jour ou de nuit
     * @param salaire le salaire de l'infirmier
     */
    public Infirmier(int numero, String nom, String prenom, String tel, String adresse, String code_service,String rotation, double salaire)
    {
        super(numero, nom, prenom, tel, adresse);
        this.rotation = rotation;
        this.salaire = salaire;
        this.code_service = code_service;
    }
    
    //Getter

    /**
     * Getter : getRotation
     * @return rotation
     */
        public String getRotation() {
        return rotation;
    }

    /**
     * Getter : getSalaire
     * @return salaire
     */
    public double getSalaire() {
        return this.salaire;
    }

    /**
     * Getter : getCode_service
     * @return code_service
     */
    public String getCode_service() {
        return code_service;
    }
    
    //Setter

    /**
     * Setter : setRotation
     * @param rotation
     */
        public void setRotation(String rotation) {
        this.rotation = rotation;
    }

    /**
     * Setter : setSalaire
     * @param salaire
     */
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    /**
     * Setter : setCode_service
     * @param code_service
     */
    public void setCode_service(String code_service) {
        this.code_service = code_service;
    }
}
