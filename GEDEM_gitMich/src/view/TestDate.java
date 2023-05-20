package view;

import java.text.ParseException;

import controller.ControlCreneau;
import model.Stagiaire;

public class TestDate {
//private Creneau cren;
//private ControlCreneau ccren;

	public static void main(String[] args) {

try {
	Stagiaire st1 = new Stagiaire(2,2);
	st1.afficheStagiaires();
	ControlCreneau cren = new ControlCreneau("29-08-2022","30-09-2022");
	Dialogue dial = new Dialogue();
}
catch (ParseException e) {
	System.out.println("Erreur dans la creation de l instance cd ControlCreneau");
	e.printStackTrace();
}
	}

}
