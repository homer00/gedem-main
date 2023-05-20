package comFenetre;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;


import javax.swing.JLabel;
import javax.swing.JPanel;

public class PannFormateurs2 {

	
	public static JPanel newJPanel(){
		
		
	      JPanel panel17 = new JPanel();
	      
	      panel17.setBackground (new Color(64, 224, 208));
	      panel17.setPreferredSize(new Dimension(1010, 520));
	      JLabel labTdb = new JLabel("FORMATEURS_2",JLabel.CENTER);
	      labTdb.setFont(new Font("Serif", Font.BOLD, 50));
	      panel17.add(labTdb);
	     
	      panel17.setSize(350,350);  
	      
	      
	      return panel17;
}
}
