package comFenetre;



	import java.awt.Color;
	import java.awt.Dimension;
	import java.awt.Font;

	
	import javax.swing.JLabel;
	import javax.swing.JPanel;

	public class PannPlanning {
	
		
		public static JPanel newJPanel(){
			
			
		      JPanel panel14 = new JPanel();
		      
		      panel14.setBackground (new Color(223, 211, 219));
		      panel14.setPreferredSize(new Dimension(1010, 520));
		      JLabel labTdb = new JLabel("PLANNING",JLabel.CENTER);
		      labTdb.setFont(new Font("Serif", Font.BOLD, 50));
		      panel14.add(labTdb);
		     
		      panel14.setSize(350,350);  
		      
		      
		      return panel14;
	}
	}

