package comFenetre;

import java.awt.Color;
import java.awt.Frame;
import java.awt.geom.RoundRectangle2D;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

public class GedemPrinci {
	
	
	public static void main(String[] args) {
		/*
		JFrame F = new JFrame();
		F.setTitle("GEDEM");
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F.setLayout(null);
        F.setSize(1200,680);
        F.setLocationRelativeTo(null);
        F.setResizable(false);
        F.setVisible(true);
		
		*/
		
		
		
		LoginFrame frame = new LoginFrame();
		frame.setUndecorated( true );
        frame.setVisible(true);
        frame.setSize(800,600);
        
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        
        frame.getRootPane().setBorder(
                BorderFactory.createMatteBorder(4, 4, 4, 4, (new Color(123, 165, 151))));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
		new LoginFrame();
		
	}

	

	


	
}