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
public class Malade extends Personne
{
    private int numero;
    private String adresse;
    private int mutuelle;
    
    public Malade(int numero, String nom, String prenom, String tel, String adresse, int mutuelle)
    {
        super(nom,prenom,tel);
        this.numero = numero;
        this.mutuelle = mutuelle;
        this.adresse = adresse;
        
    }
    
    //Getter
    public int getNumero() {
        return numero;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getMutuelle() {
        return mutuelle;
    }
    
    //Setter
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setMutuelle(int mutuelle) {
        this.mutuelle = mutuelle;
    }
    
}
