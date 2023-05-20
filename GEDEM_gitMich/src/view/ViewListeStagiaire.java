package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

//import controller.ControlFormateur;
import controller.ControlStagiaire;


public class ViewListeStagiaire extends JPanel implements ActionListener {

	private ControlStagiaire cs;
	String res;
	private JLabel labelDate;
	private JLabel labelf1;
	private JTable tableFormation;
	private JScrollPane scrollpane;

	public ViewListeStagiaire(App appli) {
		
		setBorder(BorderFactory.createSoftBevelBorder(1, Color.yellow,Color.red,Color.blue,Color.green));

		this.setLayout(new GridLayout(2,2,20,30));

		labelf1 = new JLabel("Liste des Stagiaires - vue Stagiaire");
		this.add(labelf1);
		cs = new ControlStagiaire(appli,this);

		Vector<Vector> leVector = cs.showTableFormationJT();

		Vector<String> v = new Vector<>(cs.getEnteteFormation());
		for (String element : cs.getEnteteFormation()) {
			System.out.println(element);
		}
		System.out.println("leVector :"+leVector);
		tableFormation = new JTable(leVector,v);
		this.scrollpane = new JScrollPane(tableFormation);
		scrollpane.setPreferredSize(new Dimension(200,100));
		add(scrollpane,BorderLayout.CENTER);
	}

// ========================================= ACCESSEURS
	public JLabel getLabelDate() {
		return labelDate;
	}

	public void setLabelDate(JLabel labelDate) {
		DateFormat monFormat = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		Date aujourdhui = Calendar.getInstance().getTime();
		String resultat = monFormat.format(aujourdhui);
		this.labelDate.setText(resultat);
	}
// ================================================= ACTIONPERFORMED
	@Override
	public void actionPerformed(ActionEvent evt) {
		//if (evt.getSource()==btnf1) {
		if (evt.getSource()==this.getActionForKeyStroke(null)) {
			res = Integer.toString(evt.getID());
			System.out.println(res);


			this.setLabelDate(labelDate);

		}
	}


}
