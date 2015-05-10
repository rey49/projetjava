/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import controleur.Connexion;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *  classe abstraite DAO
 * @author thomas
 * @param <T> objet
 */
public abstract class DAO<T> {

    /**
     *  Objet contenant les informations de connexion a la BDD
     */
    public Connection connect = Connexion.getInstance();

    /**
     * Permet de récupérer tous les objets d'une table
     *
     * @return Arraylist d'objet
     */
    public abstract ArrayList<T> all();

    /**
     * Permet de récupérer un objet via son ID
     *
     * @param id identifiant de l'objet à chercher dans la BDD
     * @return Objet T
     */
    public abstract T find(int id);

    /**
     * Permet de créer une entrée dans la base de données par rapport à un objet
     *
     * @param obj Objet de type T à créer dans BDD
     * @return Objet T
     */
    public abstract T create(T obj);

    /**
     * Permet de mettre à jour les données d'une entrée dans la base
     *
     * @param obj Objet de type T à mettre a jour
     * @return Objet T
     */
    public abstract T update(T obj);

    /**
     * Permet la suppression d'une entrée de la base
     *
     * @param obj Objet de type T à detruire
     */
    public abstract void delete(T obj);
    
    /**
     * Permet l'execution d'une requete de la base
     *
     * @param s requete SQL sous forme de String
     * @return ArrayList D'objet T
     */
    public abstract ArrayList<T> requete(String s);
}
