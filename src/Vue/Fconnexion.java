package Vue;

import controleur.Connexion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Panda
 */
public class Fconnexion extends javax.swing.JPanel {

    /**
     * Creates new form connexion
     */
    public Fconnexion() {
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

        BoutonCo = new javax.swing.JButton();
        BoutonAnn = new javax.swing.JButton();
        TextUserEce = new javax.swing.JTextField();
        LabelUserEce = new javax.swing.JLabel();
        LabelPassEce = new javax.swing.JLabel();
        LabelUserSQL = new javax.swing.JLabel();
        LabelPassSQL = new javax.swing.JLabel();
        TextPassEce = new javax.swing.JTextField();
        TextUserSQL = new javax.swing.JTextField();
        TextPassSQL = new javax.swing.JTextField();

        BoutonCo.setText("Connexion");
        BoutonCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonCoActionPerformed(evt);
            }
        });

        BoutonAnn.setText("Annuler");
        BoutonAnn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonAnnActionPerformed(evt);
            }
        });

        TextUserEce.setName("TextBoxUserECE"); // NOI18N

        LabelUserEce.setText("Username ECE :");

        LabelPassEce.setText("Password ECE :");

        LabelUserSQL.setText("Username MYSQL :");

        LabelPassSQL.setText("Password MYSQL :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BoutonAnn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BoutonCo)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextPassSQL, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextUserSQL, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextPassEce, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelPassSQL)
                            .addComponent(LabelUserSQL)
                            .addComponent(LabelPassEce)
                            .addComponent(LabelUserEce)
                            .addComponent(TextUserEce, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 234, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(LabelUserEce)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextUserEce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(LabelPassEce)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextPassEce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(LabelUserSQL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextUserSQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(LabelPassSQL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextPassSQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoutonCo)
                    .addComponent(BoutonAnn))
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BoutonCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonCoActionPerformed
        // TODO add your handling code here:
        Connexion.setPasswordECE(TextPassEce.getText());
        Connexion.setUsernameECE(TextUserEce.getText());
        Connexion.setPassBDD(TextPassSQL.getText());
        Connexion.setLoginBDD(TextUserSQL.getText());

    }//GEN-LAST:event_BoutonCoActionPerformed

    private void BoutonAnnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonAnnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoutonAnnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonAnn;
    private javax.swing.JButton BoutonCo;
    private javax.swing.JLabel LabelPassEce;
    private javax.swing.JLabel LabelPassSQL;
    private javax.swing.JLabel LabelUserEce;
    private javax.swing.JLabel LabelUserSQL;
    private javax.swing.JTextField TextPassEce;
    private javax.swing.JTextField TextPassSQL;
    private javax.swing.JTextField TextUserEce;
    private javax.swing.JTextField TextUserSQL;
    // End of variables declaration//GEN-END:variables
}
