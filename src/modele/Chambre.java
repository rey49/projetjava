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

    private int no_chambre;
    private int surveillant;
    private int nb_lits;

    public Chambre(int no_chambre, int surveillant, int nb_lits) {
        this.no_chambre = no_chambre;
        this.surveillant = surveillant;
        this.nb_lits = nb_lits;
    }
    
    
    //getter
    public int getNo_chambre() {
        return no_chambre;
    }

    public int getSurveillant() {
        return surveillant;
    }

    public int getNb_lits() {
        return nb_lits;
    }

    //Setter
    public void setNo_chambre(int no_chambre) {
        this.no_chambre = no_chambre;
    }

    public void setSurveillant(int surveillant) {
        this.surveillant = surveillant;
    }

    public void setNb_lits(int nb_lits) {
        this.nb_lits = nb_lits;
    }

}
