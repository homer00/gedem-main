package comFenetre;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PannStagiaires
{
	
	public static JPanel newJPanel(){
		
		
	      JPanel panel13 = new JPanel();
	      
	      panel13.setBackground (new Color(212, 244, 216));
	      panel13.setPreferredSize(new Dimension(1010, 520));
	      JLabel labTdb = new JLabel("STAGIAIRES",JLabel.CENTER);
	      labTdb.setFont(new Font("Serif", Font.BOLD, 50));
	      panel13.add(labTdb);
	      
        
	      
	      return panel13;
}

	
}
