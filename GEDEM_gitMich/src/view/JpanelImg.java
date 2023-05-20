package view;

// Classe qui permet uniquement d'afficher une image de fond à l'intérieur
// d'un JPanel
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

@SuppressWarnings("serial")
class JPanelImg extends JPanel {

     private Image image;
     private int width, height, panelWidth, panelHeight;

     // ================================ CONSTRUCTEUR
     public JPanelImg(Image img){
       this.image = img;
     }

     // =================================== METHODE
     @Override
	public void paintComponent(Graphics g) {
       super.paintComponent(g);

       this.width = image.getWidth(getRootPane());
       this.height = image.getHeight(getRootPane());
       this.panelWidth = this.getWidth();
       this.panelHeight = this.getHeight();
       System.out.println("JpanelImg : width : "+ width);
       System.out.println("JpanelImg : height : "+ height);
       System.out.println("JpanelImg : panelWidth : "+ panelWidth);
       System.out.println("JpanelImg : panelHeight : "+ panelHeight);
       g.drawImage(image,
    		   0,0,panelWidth,panelHeight,		// coordonnées x,y du panel
    		   0,0,width, height,						// coordonnées de l'image
    		   this);		// this = ce JPanel

       		// on dessine l'image en redéfinissant ses dimensions par rapport au JPanel parent.

     }
     /*
       	Dans la page où on doit afficher le résultat :
     	Image image = new Image(..);
		JPanelImg fond = new JPanelImg (image);
		...
		fond.add(etiquette);
		...
      */

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

}

