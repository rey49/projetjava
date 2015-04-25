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
