package comFenetre;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import comConnexion.TabEtudiant;
 
public class FenetreConn extends JFrame{
    JPanel p = new JPanel();
    JLabel label = new JLabel("Listes des Stagiaires");
     
    JTable table = null;
     
    public FenetreConn() {
        
        this.setSize(700,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("GEDEM");
        
        
        label.setFont(new Font("Dialog", Font.BOLD, 24));
        label.setForeground(Color.white);
        p.setBackground(new Color(65,164, 191));
        p.add(label);
        this.add(p, BorderLayout.NORTH);
      this.setUndecorated(true);
        data();
    }
     
    public void data() {
        TabEtudiant etudiant= new TabEtudiant();
        Object body[][] = new Object[etudiant.afficher().size()][4];
        String [] header= {"NOM", "PRENOM","TEL","MAIL"} ;
        table = new JTable();
        int i =0;
        for(TabEtudiant et:etudiant.afficher()) {
         
            body[i][0] = et.getNom();
            body[i][1] = et.getPrenom();
            body[i][2] = et.getTel();
            body[i][3] = et.getMail();
            i++;
             
        }
        this.add(new JScrollPane(table));
        table.setModel(new DefaultTableModel(body,header));

        
    }
     
     
 /*
    public static void main(String[] args) {
        new FenetreConn().setVisible(true);
 
    }
 */
}
