package Vue;

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

        conOnglet = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        LabelPassSQL = new javax.swing.JLabel();
        TextUserSQL = new javax.swing.JTextField();
        TextPassSQL = new javax.swing.JPasswordField();
        TextPassEce = new javax.swing.JPasswordField();
        BoutonCo = new javax.swing.JButton();
        TextUserEce = new javax.swing.JTextField();
        LabelUserEce = new javax.swing.JLabel();
        LabelPassEce = new javax.swing.JLabel();
        LabelUserSQL = new javax.swing.JLabel();
        afResult = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LabelUserLocal = new javax.swing.JLabel();
        BoutonCoLocal = new javax.swing.JToggleButton();
        LabelPassLocal = new javax.swing.JLabel();
        TextPassLocal = new javax.swing.JTextField();
        TextUserLocal = new javax.swing.JTextField();

        LabelPassSQL.setText("Password MYSQL :");

        BoutonCo.setText("Connexion");
        BoutonCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonCoActionPerformed(evt);
            }
        });

        TextUserEce.setName("TextBoxUserECE"); // NOI18N

        LabelUserEce.setText("Username ECE :");

        LabelPassEce.setText("Password ECE :");

        LabelUserSQL.setText("Username MYSQL :");

        afResult.setForeground(new java.awt.Color(255, 0, 0));
        afResult.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(LabelPassSQL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TextPassSQL))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(LabelUserEce)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TextUserEce))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(LabelPassEce)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TextPassEce))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(LabelUserSQL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TextUserSQL, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(afResult, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)))
                    .addComponent(BoutonCo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUserEce)
                    .addComponent(TextUserEce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPassEce)
                    .addComponent(TextPassEce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUserSQL)
                    .addComponent(TextUserSQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPassSQL)
                    .addComponent(TextPassSQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BoutonCo)
                .addGap(20, 20, 20)
                .addComponent(afResult, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(825, Short.MAX_VALUE))
        );

        conOnglet.addTab("Connexion Reseau", jPanel1);

        LabelUserLocal.setText("User MYSQL :");

        BoutonCoLocal.setText("Connexion");

        LabelPassLocal.setText("Password MYSQL :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BoutonCoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(LabelPassLocal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TextPassLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(LabelUserLocal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TextUserLocal))))
                .addGap(1515, 1515, 1515))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUserLocal)
                    .addComponent(TextUserLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPassLocal)
                    .addComponent(TextPassLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BoutonCoLocal)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        conOnglet.addTab("Connexion Locale", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conOnglet)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(conOnglet, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BoutonCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonCoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoutonCoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BoutonCo;
    public javax.swing.JToggleButton BoutonCoLocal;
    private javax.swing.JLabel LabelPassEce;
    private javax.swing.JLabel LabelPassLocal;
    private javax.swing.JLabel LabelPassSQL;
    private javax.swing.JLabel LabelUserEce;
    private javax.swing.JLabel LabelUserLocal;
    private javax.swing.JLabel LabelUserSQL;
    public javax.swing.JPasswordField TextPassEce;
    public javax.swing.JTextField TextPassLocal;
    public javax.swing.JPasswordField TextPassSQL;
    public javax.swing.JTextField TextUserEce;
    public javax.swing.JTextField TextUserLocal;
    public javax.swing.JTextField TextUserSQL;
    public javax.swing.JLabel afResult;
    public javax.swing.JTabbedPane conOnglet;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
