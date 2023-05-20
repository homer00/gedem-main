package comFenetre;


import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;



//import comActBout.Panneau100;

public class Fenetre extends JFrame {
	
	private JPanel panel5=new JPanel();
	private JLabel label10 = new JLabel("TABLEAU DE BORD", JLabel.CENTER);
	JButton btn1 = new JButton("PLANNING");
	
	JButton btn10 = new JButton();
	
	
	public Fenetre(){
	
	
		setTitle("GEDEM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        setSize(1200,700);
        setLocationRelativeTo(null);
        setResizable(false);
        
        Container c=getContentPane();
		
        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        JPanel panel4=new JPanel();
        JPanel panel5=new JPanel();
        
        
        
        
        
        
        
        
        
        
        
        
		
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        panel4.setLayout(null);
        panel5.setLayout(null);
	
        panel1.setBackground(new Color(25, 34, 42));
        panel1.setBounds(0,0,180,100);
        panel2.setBackground(Color.WHITE);
        panel2.setBounds(180,0,1010,40);
        panel3.setBackground(new Color(226, 234, 242));
        panel3.setBounds(180,40,1010,100);
        panel4.setBackground(new Color(65, 73, 80));
        panel4.setBounds(0,100,180,565);
        panel5.setBackground(Color.WHITE);
        panel5.setBounds(180,140,1010,520);
       
        
        
        
        JLabel label10 = new JLabel("TABLEAU DE BORD", JLabel.CENTER);
        JLabel label11 = new JLabel("FORMATION", JLabel.CENTER);
        JLabel label12 = new JLabel("FORMATEURS", JLabel.CENTER);
        JLabel label13 = new JLabel("STAGIAIRES", JLabel.CENTER);
        JLabel label14 = new JLabel("PLANNING", JLabel.CENTER);
        JLabel label15 = new JLabel("MATIERES", JLabel.CENTER);
        
       
        
        
        
        
        
        
        
        
        
        
        c.add(panel1);
        c.add(panel2);
        c.add(panel3);
        c.add(panel4);
        c.add(panel5);	
        
        
        
        
        
        panel1.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 15,20));
        panel4.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel5.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        
        JButton btn1 = new JButton("PLANNING");
        JButton btn2 = new JButton("FORMATEURS");
        JButton btn3 = new JButton("STAGIAIRES");
        JButton btn4 = new JButton("INSCRIPTION");
        JButton btn5 = new JButton("EMARGEMENT");
        JButton btn6 = new JButton(new ImageIcon("./images/home.png"));
        JButton btn7 = new JButton(new ImageIcon("./images/cloche.png"));
        JButton btn8 = new JButton(new ImageIcon("./images/mail.png"));
        JButton btn9 = new JButton(new ImageIcon("./images/troisBar.png"));
        JButton btn10 = new JButton("Tableau de bord", new ImageIcon("./images/tableau_bord.png"));
        
        JButton btn11 = new JButton("Formation", new ImageIcon("./images/formation.png"));
        JButton btn12 = new JButton("Formateurs", new ImageIcon("./images/formation.png"));
        JButton btn13 = new JButton("Stagiaires", new ImageIcon("./images/stagiaire.png"));
        JButton btn14 = new JButton("Planning", new ImageIcon("./images/planning.png"));
        JButton btn15 = new JButton("Matière", new ImageIcon("./images/matiere.png"));
        JButton btn16 = new JButton("Impression", new ImageIcon("./images/impression.png"));
        JButton btn17 = new JButton("B");
        JButton btn18 = new JButton("C");
        JButton btn19 = new JButton("D");
        JButton btn20 = new JButton("E");
        JButton btn21 = new JButton("F");
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        btn1.setFont(new Font("Arial", Font.BOLD, 15));
        btn2.setFont(new Font("Arial", Font.BOLD, 15));
        btn3.setFont(new Font("Arial", Font.BOLD, 15));
        btn4.setFont(new Font("Arial", Font.BOLD, 15));
        btn5.setFont(new Font("Arial", Font.BOLD, 15));
        
        
        
        
        
        
        
        
        
        btn1.setPreferredSize(new Dimension(180, 60));
        btn2.setPreferredSize(new Dimension(180, 60));
        btn3.setPreferredSize(new Dimension(180, 60));
        btn4.setPreferredSize(new Dimension(180, 60));
        btn5.setPreferredSize(new Dimension(180, 60));
        btn10.setPreferredSize(new Dimension(140, 30));
        btn11.setPreferredSize(new Dimension(140, 30));
        btn12.setPreferredSize(new Dimension(140, 30));
        btn13.setPreferredSize(new Dimension(140, 30));
        btn14.setPreferredSize(new Dimension(140, 30));
        btn15.setPreferredSize(new Dimension(140, 30));
        btn16.setPreferredSize(new Dimension(140, 30));
        btn17.setPreferredSize(new Dimension(140, 30));
        btn18.setPreferredSize(new Dimension(140, 30));
        btn19.setPreferredSize(new Dimension(140, 30));
        btn20.setPreferredSize(new Dimension(140, 30));
        btn21.setPreferredSize(new Dimension(140, 30));
        
        
        btn1.setBackground(new Color(135, 135, 248));
        btn2.setBackground(new Color(64, 224, 208));
        btn3.setBackground(new Color(65,164, 191));
        btn4.setBackground(new Color(219, 185, 73));
        btn5.setBackground(new Color(200, 46, 140));
        btn6.setBackground(Color.WHITE);
        btn7.setBackground(Color.WHITE);
        btn8.setBackground(Color.WHITE);
        btn9.setBackground(Color.WHITE);
        btn10.setBackground(new Color(65, 73, 80));
        btn10.setBorder(null);
        btn11.setBackground(new Color(65, 73, 80));
        btn11.setBorder(null);
        btn12.setBackground(new Color(65, 73, 80));
        btn12.setBorder(null);
        btn13.setBackground(new Color(65, 73, 80));
        btn13.setBorder(null);
        btn14.setBackground(new Color(65, 73, 80));
        btn14.setBorder(null);
        btn15.setBackground(new Color(65, 73, 80));
        btn15.setBorder(null);
        btn16.setBackground(new Color(65, 73, 80));
        btn16.setBorder(null);
        btn17.setBackground(new Color(65, 73, 80));
        btn17.setBorder(null);
        btn18.setBackground(new Color(65, 73, 80));
        btn18.setBorder(null);
        
       
        btn1.setForeground(Color.WHITE);
        btn2.setForeground(Color.WHITE);
        btn3.setForeground(Color.WHITE);
        btn4.setForeground(Color.WHITE);
        btn5.setForeground(Color.WHITE);
        btn10.setForeground(Color.WHITE);
        btn11.setForeground(Color.WHITE);
        btn12.setForeground(Color.WHITE);
        btn13.setForeground(Color.WHITE);
        btn14.setForeground(Color.WHITE);
        btn15.setForeground(Color.WHITE);
        btn16.setForeground(Color.WHITE);
        btn17.setForeground(Color.WHITE);
        
        
        btn1.setBorder(null);
        btn2.setBorder(null);
        btn3.setBorder(null);
        btn4.setBorder(null);
        btn5.setBorder(null);
        btn6.setBorder(new LineBorder(Color.WHITE));
        btn7.setBorder(new LineBorder(Color.WHITE));
        btn8.setBorder(new LineBorder(Color.WHITE));
        btn9.setBorder(new LineBorder(Color.WHITE));
        
        btn6.setPreferredSize(new Dimension(40, 30));
        btn7.setPreferredSize(new Dimension(40, 30));
        btn8.setPreferredSize(new Dimension(40, 30));
        btn9.setPreferredSize(new Dimension(80, 30));
        
        
        btn1.setMargin(new Insets(0,0,0,0));
        btn2.setMargin(new Insets(0,0,0,0));
        btn3.setMargin(new Insets(0,0,0,0));
        btn4.setMargin(new Insets(0,0,0,0));
        btn5.setMargin(new Insets(0,0,0,0));

       
        btn1.setHorizontalAlignment(JButton.CENTER);
        btn2.setHorizontalAlignment(JButton.CENTER);
        btn3.setHorizontalAlignment(JButton.CENTER);
        btn4.setHorizontalAlignment(JButton.CENTER);
        btn5.setHorizontalAlignment(JButton.CENTER);
        
       
        btn10.setHorizontalAlignment(SwingConstants.LEFT);
        btn11.setHorizontalAlignment(SwingConstants.LEFT);
        btn12.setHorizontalAlignment(SwingConstants.LEFT);
        btn13.setHorizontalAlignment(SwingConstants.LEFT);
        btn14.setHorizontalAlignment(SwingConstants.LEFT);
        btn15.setHorizontalAlignment(SwingConstants.LEFT);
        btn16.setHorizontalAlignment(SwingConstants.LEFT);
        
        String imgUrl="./images/personnage.png";
        ImageIcon icone = new ImageIcon(imgUrl);
        
        
        JLabel jlabel1 = new JLabel("<html>Formateur<br>Maurice Leblanc</html>", icone, JLabel.LEFT);
        jlabel1.setForeground(new Color(51, 187, 255));
        jlabel1.setPreferredSize(new Dimension(170, 70));
        
        
        panel1.add(jlabel1);
        panel2.add(btn6);
        panel2.add(btn7);
        panel2.add(btn8);
        panel2.add(btn9);
        panel3.add(btn1);
        panel3.add(btn2);
        panel3.add(btn3);
        panel3.add(btn4);
        panel3.add(btn5);
        panel4.add(btn10);
        panel4.add(btn11);
        panel4.add(btn12);
        panel4.add(btn13);
        panel4.add(btn14);
        panel4.add(btn15);
        panel4.add(btn16);
        panel4.add(btn17);
        panel4.add(btn18);
        
        
     
    setVisible(true);
        
   
    
    
	
	
	
	

	 btn10.addActionListener(new ActionListener(){
		 
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	JPanel panel10 = PannTdb.newJPanel();	
	        	
	        	panel5.removeAll();
	        	panel5.add(panel10);
	        	panel5.revalidate();
	        	panel5.repaint();
	 
	        }
	 
	    });

	 
	 btn11.addActionListener(new ActionListener(){
		 
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	JPanel panel11 = PannFormation.newJPanel();	
	        	
	        	panel5.removeAll();
	        	panel5.add(panel11);
	        	panel5.revalidate();
	        	panel5.repaint();
	 
	        }
	 
	    });
	 
	 btn12.addActionListener(new ActionListener(){
		 
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	JPanel panel12 = PannFormateurs.newJPanel();	
	        	
	        	panel5.removeAll();
	        	panel5.add(panel12);
	        	panel5.revalidate();
	        	panel5.repaint();
	 
	        }
	 
	    });
	 
	 btn13.addActionListener(new ActionListener(){
		 
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	JPanel panel13 = PannStagiaires.newJPanel();	
	        	
	        	panel5.removeAll();
	        	panel5.add(panel13);
	        	panel5.revalidate();
	        	panel5.repaint();
	 
	        }
	 
	    });
	 
	 btn14.addActionListener(new ActionListener(){
		 
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	JPanel panel14 = PannPlanning.newJPanel();	
	        	
	        	panel5.removeAll();
	        	panel5.add(panel14);
	        	panel5.revalidate();
	        	panel5.repaint();
	 
	        }
	 
	    });
	 
	 
	 btn15.addActionListener(new ActionListener(){
		 
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	JPanel panel15 = PannMatiere.newJPanel();	
	        	
	        	panel5.removeAll();
	        	panel5.add(panel15);
	        	panel5.revalidate();
	        	panel5.repaint();
	 
	        }
	 
	    });

	
	 btn1.addActionListener(new ActionListener(){
		 
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	JPanel panel16 = PannPlanning2.newJPanel();	
	        	
	        	panel5.removeAll();
	        	panel5.add(panel16);
	        	panel5.revalidate();
	        	panel5.repaint();
	 
	        }
	 
	    });
	
	
	 btn2.addActionListener(new ActionListener(){
		 
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	JPanel panel17 = PannFormateurs2.newJPanel();	
	        	
	        	panel5.removeAll();
	        	panel5.add(panel17);
	        	panel5.revalidate();
	        	panel5.repaint();
	 
	        }
	 
	    });
	 
	 
	 btn3.addActionListener(new ActionListener(){
		 
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	JPanel panel18 = PannStagiaires2.newJPanel();	
	        	
	        	panel5.removeAll();
	        	panel5.add(panel18);
	        	panel5.revalidate();
	        	panel5.repaint();
	 
	        }
	 
	    });
	 
	 
	 
	 btn4.addActionListener(new ActionListener(){
		 
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	JPanel panel19 = PannInscription.newJPanel();	
	        	
	        	panel5.removeAll();
	        	panel5.add(panel19);
	        	panel5.revalidate();
	        	panel5.repaint();
	 
	        }
	 
	    });
	 
	 
	 btn5.addActionListener(new ActionListener(){
		 
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	JPanel panel20 = PannEmargement.newJPanel();	
	        	
	        	panel5.removeAll();
	        	panel5.add(panel20);
	        	panel5.revalidate();
	        	panel5.repaint();
	 
	        }
	 
	    });
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	    
}	

}	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	





























	





























	







	
