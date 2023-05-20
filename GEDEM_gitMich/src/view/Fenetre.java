package view;


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
import java.awt.print.PrinterException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;





//import comActBout.Panneau100;

public class Fenetre extends JFrame {
	
	
	
	
	public Fenetre(){
	
	
		setTitle("GEDEM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        setSize(1020,700);
        setLocationRelativeTo(null);
        setResizable(false);
        
        Container c=getContentPane();
		
        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
     
        JPanel panel5=new JPanel();
        
        
        
        
        
        
        
        
        
        
        
        
		
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        
        panel5.setLayout(null);
	
        panel1.setBackground(Color.white);
        panel1.setBounds(0,0,250,40);
        panel2.setBackground(Color.white);
        panel2.setBounds(250,0,770,40);
        panel3.setBackground(new Color(226, 234, 242));
        panel3.setBounds(0,40,1020,100);
        
        panel5.setBackground(Color.WHITE);
        panel5.setBounds(0,140,1020,520);
       
        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        c.add(panel1);
        c.add(panel2);
        c.add(panel3);
        
        c.add(panel5);	
        
        
        
        
        
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 15,20));
        
        panel5.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        
        JButton btn1 = new JButton("PLANNING");
        JButton btn2 = new JButton("FORMATEURS");
        JButton btn3 = new JButton("STAGIAIRES");
        JButton btn4 = new JButton("ADMINISTRATEURS");
        JButton btn5 = new JButton("EMARGEMENT");
        JButton btn6 = new JButton(new ImageIcon("./images/home.png"));
        JButton btn7 = new JButton(new ImageIcon("./images/cloche.png"));
        JButton btn8 = new JButton(new ImageIcon("./images/mail.png"));
        JButton btn9 = new JButton(new ImageIcon("./images/troisBar.png"));
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
       
        
        
        btn1.setBackground(new Color(135, 135, 248));
        btn2.setBackground(new Color(64, 224, 208));
        btn3.setBackground(new Color(65,164, 191));
        btn4.setBackground(new Color(219, 185, 73));
        btn5.setBackground(new Color(200, 46, 140));
        btn6.setBackground(Color.WHITE);
        btn7.setBackground(Color.WHITE);
        btn8.setBackground(Color.WHITE);
        btn9.setBackground(Color.WHITE);
        
        
       
        btn1.setForeground(Color.WHITE);
        btn2.setForeground(Color.WHITE);
        btn3.setForeground(Color.WHITE);
        btn4.setForeground(Color.WHITE);
        btn5.setForeground(Color.WHITE);
        
        
        
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
        
       
        
        
        String imgUrl="./images/personnage.png";
        ImageIcon icone = new ImageIcon(imgUrl);
        
        
        JLabel jlabel1 = new JLabel("<html>Administrateur : Maurice Leblanc</html>", icone, JLabel.LEFT);
        jlabel1.setForeground(new Color(51, 187, 255));
        jlabel1.setPreferredSize(new Dimension(200, 35));
        
        
        panel2.add(btn6);
        panel2.add(btn7);
        panel2.add(btn8);
        panel2.add(btn9);
        panel1.add(jlabel1);
        panel3.add(btn1);
        panel3.add(btn2);
        panel3.add(btn3);
        panel3.add(btn4);
        panel3.add(btn5);
        
        
        
     
    setVisible(true);
        
   
    
    
	
	
	
	

	 btn1.addActionListener(new ActionListener(){
		 
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	JPanel jPanel20 = PannPlanning.newJPanel();	
	        	
	        	panel5.removeAll();
	            panel5.add(jPanel20);
	        	panel5.revalidate();
	        	panel5.repaint();
	 
	        }
	 
	    });

	 
	 btn2.addActionListener(new ActionListener(){
		 
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	
	        	JPanel jPanel12 = PannFormateurs.newJPanel();
	        	
	    		
	        	jPanel12.setVisible(true);
	        	        	
	        	
	        	panel5.removeAll();
	        	panel5.add(jPanel12);
	        	panel5.revalidate();
	        	panel5.repaint();
	 
	        }

			
	 
	    });    	
	        	
	        	
	        	
	 

	    		
	 
	 btn3.addActionListener(new ActionListener(){
		 
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	
	        	JPanel jPanel13 = PannStagiaires.newJPanel();
	        	
	    		
	        	jPanel13.setVisible(true);
	        	        	
	        	
	        	panel5.removeAll();
	        	panel5.add(jPanel13);
	        	panel5.revalidate();
	        	panel5.repaint();
	 
	        }

			
	 
	    });
	 
	 btn4.addActionListener(new ActionListener(){
		 
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	JPanel jPanel11 = PannAdministrateur.newJPanel();	
	        	
	        	panel5.removeAll();
	        	panel5.add(jPanel11);
	        	panel5.revalidate();
	        	panel5.repaint();
	 
	        }
	 
	    });
	 
	 btn5.addActionListener(new ActionListener(){
		 
	        @Override
	        public void actionPerformed(ActionEvent e) {
	       	JPanel jPanel20 = PannEmargement.newJPanel();	
	        	
	        	panel5.removeAll();
	        	panel5.add(jPanel20);
	        	panel5.revalidate();
	        	panel5.repaint();
	 
	        }
	 
	    });
	 
	/* 
	 btn15.addActionListener(new ActionListener(){
		 
		 
		 public void actionPerformed(ActionEvent e){
		//JPanel jPanel3 = PannMatiere.newJPanel();
			 panel5.removeAll();
			  
		 // panel5.add(JPanel3) getContentPane();;
			  panel5.revalidate();
	        	panel5.repaint();
			  
			  
		  }
	       
	 
	        
	 
	 });

	
	 btn1.addActionListener(new ActionListener(){
		 
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	java.awt.EventQueue.invokeLater(new Runnable() {
	                public void run() {
	                    new Principal().setVisible(true);
	                }
	            });
	 
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
	        	JPanel panel19 = PannAdministrateurs.newJPanel();	
	        	
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
	 
	 */
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	    
}	

}	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	





























	





























	







	
