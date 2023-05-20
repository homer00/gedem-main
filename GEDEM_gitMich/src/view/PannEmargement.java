package view;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;


import javax.swing.JLabel;
import javax.swing.JPanel;

public class PannEmargement {

	
	public static JPanel newJPanel(){
		
		
	      JPanel panel20 = new JPanel();
	      
	      panel20.setBackground (new Color(200, 46, 140));
	      panel20.setPreferredSize(new Dimension(1020, 520));
	      JLabel labTdb = new JLabel("EMARGEMENT",JLabel.CENTER);
	      labTdb.setFont(new Font("Serif", Font.BOLD, 50));
	      panel20.add(labTdb);
	     
	      //panel20.setSize(350,350);  
	      
	      
	      return panel20;
}
}