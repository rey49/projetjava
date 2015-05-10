/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author thomas
 */
public class CustomModel extends AbstractTableModel {

    private Object[][] data;
    private String[] title;

    public CustomModel() {
        this.data = new Object[][]{};
    }

    //Constructeur
    public CustomModel(Object[][] data, String[] title) {
        this.data = data;
        this.title = title;
    }

    public void setColumnIdentifiers(String[] title) {
        this.title = title;
    }

    //Retourne le titre de la colonne à l'indice spécifié

    @Override
    public String getColumnName(int col) {
        return this.title[col];
    }

    //Retourne le nombre de colonnes
    @Override
    public int getColumnCount() {
        return this.title.length;
    }

    //Retourne le nombre de lignes
    @Override
    public int getRowCount() {
        return this.data.length;
    }

    /**
     * Retourne la valeur à l'emplacement spécifié
     *
     * @param row
     * @param col
     * @return
     */
    @Override
    public Object getValueAt(int row, int col) {
        return this.data[row][col];
    }

    /**
     * définit la valeur à l'emplacement spécifié
     *
     * @param value
     * @param row
     * @param col
     */
    @Override
    public void setValueAt(Object value, int row, int col) {
        //On interdit la modification sur certaines colonnes !
        if (!this.getColumnName(col).equals("Age")
                && !this.getColumnName(col).equals("Suppression")) {
            this.data[row][col] = value;
        }
    }

    /**
     * Retourne la classe de la donnée de la colonne
     *
     * @param col
     * @return
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
     * @param position
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
            System.out.println("Indice = " + indice);
            indice++;
        }
        this.data = temp;
        temp = null;
        //Cette méthode permet d'avertir le tableau que les données
        //ont été modifiées, ce qui permet une mise à jour complète du tableau
        //this.fireTableDataChanged();
    }

    /**
     * Permet d'ajouter une ligne dans le tableau
     *
     * @param data
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
        //Cette méthode permet d'avertir le tableau que les données
        //ont été modifiées, ce qui permet une mise à jour complète du tableau
        //this.fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return col != 0;
    }
}
