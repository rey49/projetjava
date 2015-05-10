/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author thomas
 */
public class Hospitalisation {

    private int no_malade;
    private String code_service;
    private int no_chambre;
    private int no_lit;

    /**
     *
     */
    public Hospitalisation() {
    }

    /**
     * Constructeur : initialise les données d'un infirmier
     *
     * @param no_malade l'identifiant unique du malade
     * @param code_service l'identifiant du service
     * @param no_chambre numero de la chambre liée a l'hospitalisation
     * @param no_lit le numéro de lit lié à l'hospitalisation
     */

    public Hospitalisation(int no_malade, String code_service, int no_chambre, int no_lit) {
        this.no_malade = no_malade;
        this.code_service = code_service;
        this.no_chambre = no_chambre;
        this.no_lit = no_lit;
    }

    //getter
    /**
     *
     * @return
     */
    public int getNo_malade() {
        return no_malade;
    }

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
    public int getNo_lit() {
        return no_lit;
    }

    //setter
    /**
     *
     * @param no_malade
     */
    public void setNo_malade(int no_malade) {
        this.no_malade = no_malade;
    }

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
     * @param no_lit
     */
    public void setNo_lit(int no_lit) {
        this.no_lit = no_lit;
    }

}
