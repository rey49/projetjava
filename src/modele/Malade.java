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
    private String mutuelle;
    
    public Malade(){
    }
    
    /**
     * Constructeur : initialise les données d'un malade
     * @param numero l'identifiant unique du malade
     * @param nom le nom du malade
     * @param prenom le prénom du malade
     * @param tel le numéro de téléphone du malade
     * @param adresse l'adresse du malade
     * @param mutuelle la mutuelle du malade
     */
    public Malade(int numero, String nom, String prenom, String tel, String adresse, String mutuelle)
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

    public String getMutuelle() {
        return mutuelle;
    }
    
    //Setter
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setMutuelle(String mutuelle) {
        this.mutuelle = mutuelle;
    }
    
}
