package comFenetre;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;


import javax.swing.JLabel;
import javax.swing.JPanel;

public class PannStagiaires2 {

	
	public static JPanel newJPanel(){
		
		
	      JPanel panel18 = new JPanel();
	      
	      panel18.setBackground (new Color(159, 226, 191));
	      panel18.setPreferredSize(new Dimension(1010, 520));
	      JLabel labTdb = new JLabel("STAGIAIRES",JLabel.CENTER);
	      labTdb.setFont(new Font("Serif", Font.BOLD, 50));
	      panel18.add(labTdb);
	     
	      panel18.setSize(350,350);  
	      
	      
	      return panel18;
}
}
