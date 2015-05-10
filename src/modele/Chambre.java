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
public class Chambre {

    private String code_service;
    private int no_chambre;
    private int surveillant;
    private int nb_lits;

    /**
     * Default Constructeur
     */
    public Chambre(){}
    
    /**
     * Constructeur : initialise les données d'une chambre
     * @param code_service le service dans lequel se trouve la chambre
     * @param no_chambre le numéro de la chambre
     * @param surveillant le surveillant responsable de la chambre
     * @param nb_lits le nombre de lits que possède la chambre
     */
    public Chambre(String code_service, int no_chambre, int surveillant, int nb_lits) {
        this.code_service = code_service;
        this.no_chambre = no_chambre;
        this.surveillant = surveillant;
        this.nb_lits = nb_lits;
    }
    
    
    //getter

    /**
     * Getter : getCode_service
     * @return code_service
     */
        public String getCode_service() {
        return code_service;
    }
    
     /**
     * Getter : getNo_chambre
     * @return no_chambre
     */
    public int getNo_chambre() {
        return no_chambre;
    }

    /**
     * Getter : getSurveillant
     * @return surveillant
     */
    public int getSurveillant() {
        return surveillant;
    }

    /**
     * Getter : getNb_lits
     * @return nb_lits
     */
    public int getNb_lits() {
        return nb_lits;
    }

    //Setter

    /**
     * Setter : setCode_service
     * @param code_service
     */
        public void setCode_service(String code_service) {
        this.code_service = code_service;
    }
    
    /**
     * Setter : setNo_chambre
     * @param no_chambre
     */
    public void setNo_chambre(int no_chambre) {
        this.no_chambre = no_chambre;
    }

    /**
     * Setter : setSurveillant
     * @param surveillant
     */
    public void setSurveillant(int surveillant) {
        this.surveillant = surveillant;
    }

    /**
     * Setter : setNb_lits
     * @param nb_lits
     */
    public void setNb_lits(int nb_lits) {
        this.nb_lits = nb_lits;
    }

}
