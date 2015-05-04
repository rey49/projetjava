/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import controleur.Connexion;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author thomas
 */
public class MainFen extends JFrame implements ActionListener, ItemListener {

    private JPanel p0;
    private Fconnexion connexionPanel;
    private MainForm form;

    public MainFen() {
        super("Base de Donnée");

        setLayout(new BorderLayout());
        setBounds(0, 0, 800, 700);
        setResizable(true);
        setVisible(true);

        //panel principal pour stocker les 2 autres panels
        p0 = new JPanel();
        p0.setLayout(new GridLayout(1, 1));

        connexionPanel = new Fconnexion();
        form = new MainForm();

        p0.add(connexionPanel);
        add("Center", p0);

        connexionPanel.BoutonCo.addActionListener((ActionListener) this);

        // pour fermer la fenetre
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // tout fermer												System.exit(0); // tout fermer
            }
        });
    }

    public void changer(JPanel panel) {
        //retire tous les panels
        p0.removeAll();
        p0.repaint();
        p0.revalidate();

        //met le panel passé en paramètre
        p0.add(panel);
        p0.repaint();
        p0.revalidate();
    }

    /**
     *
     * @param evt
     */
    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getActionCommand().equals("Connexion")) {
            Connexion.setPasswordECE(connexionPanel.TextPassEce.getText());
            Connexion.setUsernameECE(connexionPanel.TextUserEce.getText());
            Connexion.setPassBDD(connexionPanel.TextPassSQL.getText());
            Connexion.setLoginBDD(connexionPanel.TextUserSQL.getText());

            try {
                Connexion.getInstance().setAutoCommit(false);
                changer(form);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}