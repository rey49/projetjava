package Vue;

import DAO.ChambreDAO;
import DAO.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modele.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Panda
 */
public class MainForm extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public MainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        LabelTable = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        LabelNom = new javax.swing.JLabel();
        LabelPrenom = new javax.swing.JLabel();
        LabelAdresse = new javax.swing.JLabel();
        LabelTel = new javax.swing.JLabel();
        LabelSPe = new javax.swing.JLabel();
        TextNom = new javax.swing.JTextField();
        TextPrenom = new javax.swing.JTextField();
        TextAdr = new javax.swing.JTextField();
        TextTel = new javax.swing.JTextField();
        ComboSpe = new javax.swing.JComboBox();
        BoutonAjo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        PanelLecture = new javax.swing.JScrollPane();
        table_aff = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        BoutonCopier = new javax.swing.JToggleButton();
        LabelChoix = new javax.swing.JLabel();
        choix_table = new javax.swing.JComboBox();
        BoutonAff = new javax.swing.JButton();
        saveBouton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        LabelReq = new javax.swing.JLabel();
        ComboRequete = new javax.swing.JComboBox();
        jPanel8 = new javax.swing.JPanel();
        PanelReq = new javax.swing.JScrollPane();
        TableReq = new javax.swing.JTable();

        LabelTable.setText("Table :");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Medecin", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        LabelNom.setText("Nom :");

        LabelPrenom.setText("Prenom :");

        LabelAdresse.setText("Adresse :");

        LabelTel.setText("Tel :");

        LabelSPe.setText("Specialité :");

        TextNom.setText("jTextField7");

        TextPrenom.setText("jTextField7");

        TextAdr.setText("jTextField7");

        TextTel.setText("jTextField7");

        ComboSpe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cancerologue", "Item 2", "Item 3", "Item 4" }));

        BoutonAjo.setText("Ajouter");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LabelTable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LabelNom)
                            .addComponent(LabelPrenom)
                            .addComponent(LabelAdresse)
                            .addComponent(LabelTel)
                            .addComponent(LabelSPe)
                            .addComponent(TextNom)
                            .addComponent(TextPrenom, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(TextAdr, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(TextTel, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(ComboSpe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(BoutonAjo)))
                .addContainerGap(767, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTable)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(LabelNom)
                .addGap(3, 3, 3)
                .addComponent(TextNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelPrenom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelAdresse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextAdr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelTel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(LabelSPe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboSpe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addComponent(BoutonAjo)
                .addGap(45, 45, 45))
        );

        jTabbedPane1.addTab("Ajout", jPanel2);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        table_aff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        PanelLecture.setViewportView(table_aff);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(PanelLecture, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLecture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);

        BoutonCopier.setText("Copier la selection");
        BoutonCopier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonCopierActionPerformed(evt);
            }
        });

        LabelChoix.setText("Table à afficher :");

        choix_table.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "malade ", "chambre", "infirmier ", "service ", "docteur ", "employe" }));
        choix_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choix_tableActionPerformed(evt);
            }
        });

        BoutonAff.setText("Afficher");

        saveBouton.setText("<html>\n<p>Enregistrer</p> \n<p>modifications</p>");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BoutonCopier, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(LabelChoix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(choix_table, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BoutonAff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveBouton))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BoutonCopier)
                .addGap(18, 18, 18)
                .addComponent(LabelChoix)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choix_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 504, Short.MAX_VALUE)
                .addComponent(saveBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BoutonAff)
                .addContainerGap())
        );

        jPanel1.add(jPanel6);

        jTabbedPane1.addTab("Lecture et Modification", jPanel1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1027, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Reporting", jPanel4);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.PAGE_AXIS));

        LabelReq.setText("Requête :");

        ComboRequete.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Medecin", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelReq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboRequete, 0, 955, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelReq)
                    .addComponent(ComboRequete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel7);

        TableReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        PanelReq.setViewportView(TableReq);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1027, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelReq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1027, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelReq, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel8);

        jTabbedPane1.addTab("Requête", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void afficher_table() {
        //declaration des variables communes aux cases
        DefaultTableModel tableModel = new DefaultTableModel(0, 0);
        ArrayList tab;
        String[] title;
        
        switch (choix_table.getSelectedIndex()) {
            case 0 : //malade
                //declaration d'une nouvelle classe DAO
                MaladeDAO maDAO = new MaladeDAO();
                
                //récupération de toutes lignes d'une table, chacune stockée dans un objet, et stockage dans un tableau
                tab = maDAO.all();
                
                //création des titres des colonnes
                title = new String[]{"Numero", "Nom", "Prenom", "Telephone", "Adresse", "Mutuelle"};
                tableModel = new DefaultTableModel(title, 0);
                
                //pour chaque objet dans le tableau, on récupère les informations et on les ajoutes sur une nouvelle ligne du JTable
                for (int i = 0; i < tab.size(); i++) {
                    Malade elem = (Malade) tab.get(i);
                    Object obj[] = {
                        elem.getNumero(),
                        elem.getNom(),
                        elem.getPrenom(),
                        elem.getTel(),
                        elem.getAdresse(),
                        elem.getMutuelle()
                    };
                    tableModel.addRow(obj);
                }
                break;
            case 1: //chambre
                //declaration d'une nouvelle classe DAO
                ChambreDAO chDAO = new ChambreDAO();
                
                //récupération de toutes lignes d'une table, chacune stockée dans un objet, et stockage dans un tableau
                tab = chDAO.all();
                
                //création des titres des colonnes
                title = new String[]{"Code service", "No Chambre", "Surveillant", "Nb de lits"};
                tableModel = new DefaultTableModel(title, 0);
                
                //pour chaque objet dans le tableau, on récupère les informations et on les ajoutes sur une nouvelle ligne du JTable
                for (int i = 0; i < tab.size(); i++) {
                    Chambre elem = (Chambre) tab.get(i);
                    Object obj[] = {
                        elem.getCode_service(),
                        elem.getNo_chambre(),
                        elem.getSurveillant(),
                        elem.getNb_lits()
                    };
                    tableModel.addRow(obj);
                }
                break;
            case 2 : //infirmier
                //declaration d'une nouvelle classe DAO
                InfirmierDAO infDAO = new InfirmierDAO();
                
                //récupération de toutes lignes d'une table, chacune stockée dans un objet, et stockage dans un tableau
                tab = infDAO.all();
                
                //création des titres des colonnes
                title = new String[]{"Numero", "Nom", "Prenom", "Telephone", "Adresse", "Code Service", "Rotation", "Salaire"};
                tableModel = new DefaultTableModel(title, 0);
                
                //pour chaque objet dans le tableau, on récupère les informations et on les ajoutes sur une nouvelle ligne du JTable
                for (int i = 0; i < tab.size(); i++) {
                    Infirmier elem = (Infirmier) tab.get(i);
                    Object obj[] = {
                        elem.getNumero(),
                        elem.getNom(),
                        elem.getPrenom(),
                        elem.getTel(),
                        elem.getAdresse(),
                        elem.getCode_service(),
                        elem.getRotation(),
                        elem.getSalaire()
                    };
                    tableModel.addRow(obj);
                }
                break;
            case 3 : //Service
                //declaration d'une nouvelle classe DAO
                ServiceDAO servDAO = new ServiceDAO();
                
                //récupération de toutes lignes d'une table, chacune stockée dans un objet, et stockage dans un tableau
                tab = servDAO.all();
                
                //création des titres des colonnes
                title = new String[]{"Code", "Nom", "Batiment", "Directeur"};
                tableModel = new DefaultTableModel(title, 0);
                
                //pour chaque objet dans le tableau, on récupère les informations et on les ajoutes sur une nouvelle ligne du JTable
                for (int i = 0; i < tab.size(); i++) {
                    Service elem = (Service) tab.get(i);
                    Object obj[] = {
                        elem.getCode(),
                        elem.getNom(),
                        elem.getBatiment(),
                        elem.getDirecteur()
                    };
                    tableModel.addRow(obj);
                }
                break;
            case 4 : //Docteur
                //declaration d'une nouvelle classe DAO
                DocteurDAO docDAO = new DocteurDAO();
                
                //récupération de toutes lignes d'une table, chacune stockée dans un objet, et stockage dans un tableau
                tab = docDAO.all();
                
                //création des titres des colonnes
                title = new String[]{"Numero", "Nom", "Prenom", "Telephone", "Adresse", "Specialite"};
                tableModel = new DefaultTableModel(title, 0);
                
                //pour chaque objet dans le tableau, on récupère les informations et on les ajoutes sur une nouvelle ligne du JTable
                for (int i = 0; i < tab.size(); i++) {
                    Docteur elem = (Docteur) tab.get(i);
                    Object obj[] = {
                        elem.getNumero(),
                        elem.getNom(),
                        elem.getPrenom(),
                        elem.getTel(),
                        elem.getAdresse(),
                        elem.getSpecialite()
                    };
                    tableModel.addRow(obj);
                }
                break;
            case 5 : //employe
                //declaration d'une nouvelle classe DAO
                EmployeDAO empDAO = new EmployeDAO();
                
                //récupération de toutes lignes d'une table, chacune stockée dans un objet, et stockage dans un tableau
                tab = empDAO.all();
                
                //création des titres des colonnes
                title = new String[]{"Numero", "Nom", "Prenom", "Telephone", "Adresse"};
                tableModel = new DefaultTableModel(title, 0);
                
                //pour chaque objet dans le tableau, on récupère les informations et on les ajoutes sur une nouvelle ligne du JTable
                for (int i = 0; i < tab.size(); i++) {
                    Employe elem = (Employe) tab.get(i);
                    Object obj[] = {
                        elem.getNumero(),
                        elem.getNom(),
                        elem.getPrenom(),
                        elem.getTel(),
                        elem.getAdresse()
                    };
                    tableModel.addRow(obj);
                }
                break;
        }
        
        //affichage du JTable remplis avec les informations demandées par l'utilisateur
        table_aff.setModel(tableModel);
        PanelLecture.setViewportView(table_aff);

    }

    private void choix_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choix_tableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choix_tableActionPerformed

    private void BoutonCopierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonCopierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoutonCopierActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BoutonAff;
    private javax.swing.JButton BoutonAjo;
    private javax.swing.JToggleButton BoutonCopier;
    private javax.swing.JComboBox ComboRequete;
    private javax.swing.JComboBox ComboSpe;
    private javax.swing.JLabel LabelAdresse;
    private javax.swing.JLabel LabelChoix;
    private javax.swing.JLabel LabelNom;
    private javax.swing.JLabel LabelPrenom;
    private javax.swing.JLabel LabelReq;
    private javax.swing.JLabel LabelSPe;
    private javax.swing.JLabel LabelTable;
    private javax.swing.JLabel LabelTel;
    private javax.swing.JScrollPane PanelLecture;
    private javax.swing.JScrollPane PanelReq;
    private javax.swing.JTable TableReq;
    private javax.swing.JTextField TextAdr;
    private javax.swing.JTextField TextNom;
    private javax.swing.JTextField TextPrenom;
    private javax.swing.JTextField TextTel;
    public javax.swing.JComboBox choix_table;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton saveBouton;
    public javax.swing.JTable table_aff;
    // End of variables declaration//GEN-END:variables
}
