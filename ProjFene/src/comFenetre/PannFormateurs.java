package comFenetre;

import java.awt.*;
import javax.swing.*;

public class PannFormateurs
{
	
	public static JPanel newJPanel(){
		
		
	      JPanel panel12 = new JPanel();
	      
	      panel12.setBackground (new Color(216, 191, 216));
	      panel12.setPreferredSize(new Dimension(1010, 520));
	      JLabel labTdb = new JLabel("FORMATEURS",JLabel.CENTER);
	      labTdb.setFont(new Font("Serif", Font.BOLD, 50));
	      panel12.add(labTdb);
	     
	     
	      panel12.setSize(350,350);  
	      
	      
	      return panel12;
}
}