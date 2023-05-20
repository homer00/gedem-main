package comFenetre;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PannFormation {

	public static JPanel newJPanel(){
		
		
	      JPanel panel11 = new JPanel();
	      
	      panel11.setBackground (new Color(175, 238, 238));
	      panel11.setPreferredSize(new Dimension(1010, 520));
	      JLabel labTdb = new JLabel("FORMATION",JLabel.CENTER);
	      labTdb.setFont(new Font("Serif", Font.BOLD, 50));
	      panel11.add(labTdb);
	      
	    
	       
	      
	      
	      return panel11;
}
}
