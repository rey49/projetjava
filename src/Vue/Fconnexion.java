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

        BoutonCo = new javax.swing.JButton();
        BoutonAnn = new javax.swing.JButton();
        TextUserEce = new javax.swing.JTextField();
        LabelUserEce = new javax.swing.JLabel();
        LabelPassEce = new javax.swing.JLabel();
        LabelUserSQL = new javax.swing.JLabel();
        LabelPassSQL = new javax.swing.JLabel();
        TextUserSQL = new javax.swing.JTextField();
        TextPassSQL = new javax.swing.JPasswordField();
        TextPassEce = new javax.swing.JPasswordField();
        afResult = new javax.swing.JLabel();

        BoutonCo.setText("Connexion");

        BoutonAnn.setText("Annuler");

        TextUserEce.setName("TextBoxUserECE"); // NOI18N

        LabelUserEce.setText("Username ECE :");

        LabelPassEce.setText("Password ECE :");

        LabelUserSQL.setText("Username MYSQL :");

        LabelPassSQL.setText("Password MYSQL :");

        afResult.setForeground(new java.awt.Color(255, 0, 0));
        afResult.setToolTipText("");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextUserSQL, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                            .addComponent(LabelPassSQL)
                            .addComponent(LabelUserSQL)
                            .addComponent(LabelPassEce)
                            .addComponent(LabelUserEce)
                            .addComponent(TextUserEce, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                            .addComponent(TextPassSQL)
                            .addComponent(TextPassEce))
                        .addGap(0, 117, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(afResult)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(afResult)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoutonCo)
                    .addComponent(BoutonAnn))
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BoutonAnn;
    public javax.swing.JButton BoutonCo;
    private javax.swing.JLabel LabelPassEce;
    private javax.swing.JLabel LabelPassSQL;
    private javax.swing.JLabel LabelUserEce;
    private javax.swing.JLabel LabelUserSQL;
    public javax.swing.JPasswordField TextPassEce;
    public javax.swing.JPasswordField TextPassSQL;
    public javax.swing.JTextField TextUserEce;
    public javax.swing.JTextField TextUserSQL;
    public javax.swing.JLabel afResult;
    // End of variables declaration//GEN-END:variables
}
