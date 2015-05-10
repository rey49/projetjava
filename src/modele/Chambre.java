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
     *
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
     *
     * @return
     */
        public String getCode_service() {
        return code_service;
    }
    
    /**
     *
     * @return
     */
    public int getNo_chambre() {
        return no_chambre;
    }

    /**
     *
     * @return
     */
    public int getSurveillant() {
        return surveillant;
    }

    /**
     *
     * @return
     */
    public int getNb_lits() {
        return nb_lits;
    }

    //Setter

    /**
     *
     * @param code_service
     */
        public void setCode_service(String code_service) {
        this.code_service = code_service;
    }
    
    /**
     *
     * @param no_chambre
     */
    public void setNo_chambre(int no_chambre) {
        this.no_chambre = no_chambre;
    }

    /**
     *
     * @param surveillant
     */
    public void setSurveillant(int surveillant) {
        this.surveillant = surveillant;
    }

    /**
     *
     * @param nb_lits
     */
    public void setNb_lits(int nb_lits) {
        this.nb_lits = nb_lits;
    }

}
