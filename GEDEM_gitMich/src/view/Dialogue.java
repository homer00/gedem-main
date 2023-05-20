package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dialogue extends JPanel implements ActionListener {

	private Dimension dim;

	JButton bouton_val, bouton_annul;
	JDialog jd1;
	public Toolkit tk;
	Dimension dimEcran;
	int largeur_ecran, hauteur_ecran, largeurFenetre, hauteurFenetre;

	public Dialogue() {
		super();

		jd1 = new JDialog(new JFrame());
		jd1.setLayout(new FlowLayout());
		JLabel jl1 = new JLabel("Ceci est un texte");
		bouton_annul = new JButton("Annuler");
		bouton_val = new JButton("Valider");
		jd1.add(jl1);
		jd1.add(bouton_annul,BorderLayout.AFTER_LAST_LINE );
		jd1.add(bouton_val);

		jd1.setSize(250,150);
		jd1.setResizable(false);
		taillePositionDialog(jd1);
		jd1.setVisible(true);

	}

	/**
	 * fonction qui centre et ajuste la taille d'une boite de dialogue
	 * @param jd
	 */
	public void taillePositionDialog(JDialog jd) { 
		tk = Toolkit.getDefaultToolkit(); // tk : instance de Toolkit
		dimEcran = tk.getScreenSize(); // application de la méthode getScreenSize() sur tk, le résultat est de type	"Dimension"
		this.largeur_ecran = dimEcran.width;
		this.hauteur_ecran = dimEcran.height;
		this.largeurFenetre = (int)Math.round(0.3*largeur_ecran); // on doit caster en int , sinon perte de précision long -> int (erreur)
		this.hauteurFenetre = (int)(Math.round(0.3*hauteur_ecran)); // Math.round arrondit en utilisant un double ou un float en argument.
		jd.setSize(largeurFenetre, hauteurFenetre);
		System.out.println("Ecran : "+largeur_ecran+" x "+hauteur_ecran);
		System.out.println("Fenetre : "+largeurFenetre+" x "+hauteurFenetre+"\n\n");
		jd.setPreferredSize(new Dimension(largeurFenetre, hauteurFenetre));
		jd.setAlwaysOnTop(true);
		jd.setLocationRelativeTo(null); // centre la position

	}
	@Override
	public void actionPerformed(ActionEvent evt) {

		if(evt.getSource()==bouton_val) {
			//new ControlLogin(this,appli);
		}

	}
}
