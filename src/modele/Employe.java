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
public class Employe extends Personne
{
    private int numero;
    private String adresse;
    
    public Employe(){
    }
    
    /**
     * Constructeur : initialise les données d'un employé
     * @param numero l'identifiant unique de l'employé
     * @param nom le nom de l'employé
     * @param prenom le prénom de l'employé
     * @param tel le numéro de téléphone de l'employé
     * @param adresse l'adresse de l'employé
     */
    public Employe(int numero, String nom, String prenom, String tel, String adresse)
    {
        super(nom, prenom, tel);
        this.numero = numero;
        this.adresse = adresse;
        
    }
    
    //Getter
    public int getNumero() {
        return numero;
    }

    public String getAdresse() {
        return adresse;
    }
    
    //Setter
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    
}
