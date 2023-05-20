package view;



import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


 
public class PannPlanning extends JFrame{
	
	

	public static JPanel newJPanel(){
		
		
	      JPanel panel20 = new JPanel();
	      
	      panel20.setBackground (new Color(135, 135, 248));
	      panel20.setPreferredSize(new Dimension(1020, 520));
	      JLabel labTdb = new JLabel("PLANNING",JLabel.CENTER);
	      labTdb.setFont(new Font("Serif", Font.BOLD, 50));
	      panel20.add(labTdb);
	     
	      
	      
	      
	      return panel20;
}
} 

	
 
