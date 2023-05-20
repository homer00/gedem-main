package comFenetre;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;


import javax.swing.JLabel;
import javax.swing.JPanel;

public class PannPlanning2 {

	
	public static JPanel newJPanel(){
		
		
	      JPanel panel16 = new JPanel();
	      
	      panel16.setBackground (new Color(135, 135, 248));
	      panel16.setPreferredSize(new Dimension(1010, 520));
	      JLabel labTdb = new JLabel("PLANNING_2",JLabel.CENTER);
	      labTdb.setFont(new Font("Serif", Font.BOLD, 50));
	      panel16.add(labTdb);
	     
	      panel16.setSize(350,350);  
	      
	      
	      return panel16;
}
}