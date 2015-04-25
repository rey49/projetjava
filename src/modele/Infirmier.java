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
    private int salaire;
    
    public Infirmier(int numero, String nom, String prenom, String tel, String adresse, String rotation, int salaire)
    {
        super(numero, nom, prenom, tel, adresse);
        this.rotation = rotation;
        this.salaire = salaire;
    }
    
    //Getter
    public String getRotation() {
        return rotation;
    }

    public int getSalaire() {
        return salaire;
    }
    
    //Setter
    public void setRotation(String rotation) {
        this.rotation = rotation;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
}
