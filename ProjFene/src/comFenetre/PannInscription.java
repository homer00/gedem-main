package comFenetre;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;


import javax.swing.JLabel;
import javax.swing.JPanel;

public class PannInscription {

	
	public static JPanel newJPanel(){
		
		
	      JPanel panel19 = new JPanel();
	      
	      panel19.setBackground (new Color(255, 191, 0));
	      panel19.setPreferredSize(new Dimension(1010, 520));
	      JLabel labTdb = new JLabel("INSCRIPTION",JLabel.CENTER);
	      labTdb.setFont(new Font("Serif", Font.BOLD, 50));
	      panel19.add(labTdb);
	     
	      panel19.setSize(350,350);  
	      
	      
	      return panel19;
}
}