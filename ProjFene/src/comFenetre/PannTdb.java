package comFenetre;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PannTdb {
	
	
	public static JPanel newJPanel(){
	
		
	      JPanel panel10 = new JPanel();
	      
	      panel10.setBackground(Color.lightGray);
	      panel10.setPreferredSize(new Dimension(1010, 520));
	      JLabel labTdb = new JLabel("TABLEAU DE BORD",JLabel.CENTER);
	      labTdb.setFont(new Font("Serif", Font.BOLD, 50));
	      panel10.add(labTdb);
	      panel10.setSize(350,350);  
	      return panel10;
}
}