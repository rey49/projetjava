/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import DAO.DocteurDAO;
import DAO.MaladeDAO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import modele.Docteur;
import modele.Malade;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 * Classe contenant toutes les fonctions pour gerer JFreeChart pour l'affichage des diagrammes
 * @author Gib
 */
public class Reporting {
    public Reporting(){};
    
    public JFreeChart circulaire(int choix)
    {
        ArrayList tab;
        String[] title;
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        JFreeChart chart = ChartFactory.createPieChart("Erreur", pieDataset, true, true, true);
        int temp;
        int stockint;
        String stockchaine;
        Map<Integer , String> options = new HashMap<Integer, String>();
        Map<String, Integer> compteurs = new HashMap<>();
        Iterator<Integer> it;
        
        switch(choix)
        {
            case 0: //docteurs
                //declaration d'une nouvelle classe DAO
                DocteurDAO maDAO0 = new DocteurDAO();

                //recuperation de toutes lignes d'une table, chacune stockee dans un objet, et stockage dans un tableau
                tab = maDAO0.all();
                
                
                //on traite chaque element de la requaªte
                for (Object tab1 : tab)
                {
                    Docteur elem = (Docteur) tab1;
                    String spec = elem.getSpecialite();
                    //on verifie si la specialite est deja  dans le tableau ou pas
                    if(options.containsValue(spec))
                    {
                       temp = compteurs.get(spec);
                       compteurs.put(spec,temp+1);
                    }
                    else
                    {
                        options.put(options.size(),spec);
                        compteurs.put(spec,1);
                    }
                }
                
                //creation des donnees du diagramme circulaire
                it = options.keySet().iterator();
                while(it.hasNext())
                {
                    stockint = it.next();
                    stockchaine = options.get(stockint);
                    pieDataset.setValue(stockchaine, compteurs.get(stockchaine));
                }
                chart = ChartFactory.createPieChart("Docteurs par specialite", pieDataset, true, true, true);
            break;
            
            case 1: //malades
                //declaration d'une nouvelle classe DAO
                MaladeDAO maDAO1 = new MaladeDAO();

                //recuperation de toutes lignes d'une table, chacune stockee dans un objet, et stockage dans un tableau
                tab = maDAO1.all();
                
                for (Object tab1 : tab)
                {
                    Malade elem = (Malade) tab1;
                    String spec = elem.getMutuelle();
                    //on verifie si la specialite est deja  dans le tableau ou pas
                    if(options.containsValue(spec))
                    {
                       temp = compteurs.get(spec);
                       compteurs.put(spec,temp+1);
                    }
                    else
                    {
                        options.put(options.size(),spec);
                        compteurs.put(spec,1);
                    }
                }
                
                //creation des donnees du diagramme circulaire
                it = options.keySet().iterator();
                while(it.hasNext())
                {
                    stockint = it.next();
                    stockchaine = options.get(stockint);
                    pieDataset.setValue(stockchaine, compteurs.get(stockchaine));
                }
                chart = ChartFactory.createPieChart("Malades par mutuelle", pieDataset, true, true, true);
            break;
            
        }
        return chart;
    }
    
    public JFreeChart barres(int choix)
    {
        ArrayList tab;
        String[] title;
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        JFreeChart chart = ChartFactory.createBarChart("", "", "Erreur",dataset, PlotOrientation.VERTICAL,false,true,false);
        int temp;
        int stockint;
        String stockchaine;
        Map<Integer , String> options = new HashMap<Integer, String>();
        Map<String, Integer> compteurs = new HashMap<>();
        Iterator<Integer> it;
        
        switch(choix)
        {
            case 0: //docteurs
                //declaration d'une nouvelle classe DAO
                DocteurDAO maDAO0 = new DocteurDAO();

                //recuperation de toutes lignes d'une table, chacune stockee dans un objet, et stockage dans un tableau
                tab = maDAO0.all();
                
                
                //on traite chaque element de la requete
                for (Object tab1 : tab)
                {
                    Docteur elem = (Docteur) tab1;
                    String spec = elem.getSpecialite();
                    //on verifie si la specialite est deja  dans le tableau ou pas
                    if(options.containsValue(spec))
                    {
                       temp = compteurs.get(spec);
                       compteurs.put(spec,temp+1);
                    }
                    else
                    {
                        options.put(options.size(),spec);
                        compteurs.put(spec,1);
                    }
                }
                
                //creation des donnees du diagramme circulaire
                it = options.keySet().iterator();
                while(it.hasNext())
                {
                    stockint = it.next();
                    stockchaine = options.get(stockint);
                    dataset.setValue(compteurs.get(stockchaine),"Docteurs",stockchaine);
                }
                chart = ChartFactory.createBarChart("Docteurs par specialite", "Specialite", "Docteurs",dataset, PlotOrientation.VERTICAL,false,true,false);
            break;
            
            case 1: //malades
                //declaration d'une nouvelle classe DAO
                MaladeDAO maDAO1 = new MaladeDAO();

                //recuperation de toutes lignes d'une table, chacune stockee dans un objet, et stockage dans un tableau
                tab = maDAO1.all();
                
                for (Object tab1 : tab)
                {
                    Malade elem = (Malade) tab1;
                    String spec = elem.getMutuelle();
                    //on verifie si la mutuelle est deja  dans le tableau ou pas
                    if(options.containsValue(spec))
                    {
                       temp = compteurs.get(spec);
                       compteurs.put(spec,temp+1);
                    }
                    else
                    {
                        options.put(options.size(),spec);
                        compteurs.put(spec,1);
                    }
                }
                
                //creation des donnees du diagramme circulaire
                it = options.keySet().iterator();
                while(it.hasNext())
                {
                    stockint = it.next();
                    stockchaine = options.get(stockint);
                    dataset.setValue(compteurs.get(stockchaine),"Malades",stockchaine);
                }
                chart = ChartFactory.createBarChart("Malades par mutuelle", "Mutuelle", "Malades",dataset, PlotOrientation.VERTICAL,false,true,false);
            break;
        }
        return chart;
    }
}
