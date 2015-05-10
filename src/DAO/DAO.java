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
 *
 * @author thomas
 * @param <T>
 */
public abstract class DAO<T> {

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
     * @param id
     * @return Objet T
     */
    public abstract T find(int id);

    /**
     * Permet de créer une entrée dans la base de données par rapport à un objet
     *
     * @param obj
     * @return Objet T
     */
    public abstract T create(T obj);

    /**
     * Permet de mettre à jour les données d'une entrée dans la base
     *
     * @param obj
     * @return Objet T
     */
    public abstract T update(T obj);

    /**
     * Permet la suppression d'une entrée de la base
     *
     * @param obj
     */
    public abstract void delete(T obj);
    
    /**
     * Permet l'execution d'une requete de la base
     *
     * @param s
     * @return ArrayList D'objet T
     */
    public abstract ArrayList<T> requete(String s);
}
