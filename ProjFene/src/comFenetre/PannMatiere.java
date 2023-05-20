package comFenetre;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;


import javax.swing.JLabel;
import javax.swing.JPanel;

public class PannMatiere {

	
	public static JPanel newJPanel(){
		
		
	      JPanel panel15 = new JPanel();
	      
	      panel15.setBackground (new Color(213, 223, 211));
	      panel15.setPreferredSize(new Dimension(1010, 520));
	      JLabel labTdb = new JLabel("MATIERE",JLabel.CENTER);
	      labTdb.setFont(new Font("Serif", Font.BOLD, 50));
	      panel15.add(labTdb);
	     
	      panel15.setSize(350,350);  
	      
	      
	      return panel15;
}
}