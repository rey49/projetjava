/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import javax.swing.table.AbstractTableModel;

/**
 * TableModel customisé pour gerer l'affichage des données dans un JTable
 * @author thomas
 */
public class CustomModel extends AbstractTableModel {

    private Object[][] data;
    private String[] title;

    /**
     *
     */
    public CustomModel() {
        this.data = new Object[][]{};
    }

    //Constructeur
    /**
     *
     * @param data tableau d'objet, contient les données à afficher
     * @param title tableau de string, contient les entetes
     */
    public CustomModel(Object[][] data, String[] title) {
        this.data = data;
        this.title = title;
    }

    /**
     *
     * @param title tableau de string, contient les entetes 
     */
    public void setColumnIdentifiers(String[] title) {
        this.title = title;
    }

    //Retourne le titre de la colonne à l'indice spécifié
    /**
     *
     * @param col colonne du tableau
     * @return String nom de l'entete à la colonne col
     */
    @Override
    public String getColumnName(int col) {
        return this.title[col];
    }

    //Retourne le nombre de colonnes
    /**
     *
     * @return int le nombre de colonnes
     */
    @Override
    public int getColumnCount() {
        return this.title.length;
    }

    //Retourne le nombre de lignes
    /**
     *
     * @return int le nombre de lignes
     */
    @Override
    public int getRowCount() {
        return this.data.length;
    }

    /**
     * Retourne la valeur à l'emplacement spécifié
     *
     * @param row ligne
     * @param col colonnes
     * @return recupere l'Object à la case row, col
     */
    @Override
    public Object getValueAt(int row, int col) {
        return this.data[row][col];
    }

    /**
     * définit la valeur à l'emplacement spécifié
     *
     * @param value valeur à assigner
     * @param row ligne 
     * @param col colonne
     */
    @Override
    public void setValueAt(Object value, int row, int col) {
        //On interdit la modification sur certaines colonnes !
        this.data[row][col] = value;
        fireTableCellUpdated(row, col);
    }

    /**
     * Retourne la classe de la donnée de la colonne
     *
     * @param col colonne
     * @return Class type de la cellule à la colonne demandée
     */
    @Override
    public Class getColumnClass(int col) {
        //On retourne le type de la cellule à la colonne demandée
        //On se moque de la ligne puisque les données sont les mêmes
        //On choisit donc la première ligne
        return this.data[0][col].getClass();
    }

    /**
     * Méthode permettant de retirer une ligne du tableau
     *
     * @param position position de la ligne a retirer
     */
    public void removeRow(int position) {

        int indice = 0, indice2 = 0;
        int nbRow = this.getRowCount() - 1;
        int nbCol = this.getColumnCount();
        Object temp[][] = new Object[nbRow][nbCol];

        for (Object[] value : this.data) {
            if (indice != position) {
                temp[indice2++] = value;
            }
            indice++;
        }
        this.data = temp;
        temp = null;
    }

    /**
     * Permet d'ajouter une ligne dans le tableau
     *
     * @param data tableau d'objet à ajouter au JTable
     */
    public void addRow(Object[] data) {
        int indice = 0, nbRow = this.getRowCount(), nbCol = this.getColumnCount();

        Object temp[][] = this.data;
        this.data = new Object[nbRow + 1][nbCol];

        for (Object[] value : temp) {
            this.data[indice++] = value;
        }

        this.data[indice] = data;
        temp = null;
    }

    /**
     *
     * @param row ligne
     * @param col colonne
     * @return boolean indique si la cellule [row][col] est modifiable ou non
     */
    @Override
    public boolean isCellEditable(int row, int col) {
        return col != 0;
    }
}
