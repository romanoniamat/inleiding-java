package h05;

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet{
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        //teken rechthoek
        g.drawRect(100, 100, breedte, hoogte);
        //teken afgeronde rechthoek
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        //teken gevulde rechthoek
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);
        //teken ovaal
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);
        //teken gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);
        // teken cirkel
        g.setColor(lijnkleur);
        g.drawOval(550, 225, 100, hoogte);
        // teken taartpunt met ovaal
        g.setColor(lijnkleur);
        g.drawOval(535, 100, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillArc(530, 100, 205, 105, 0, 45);



    }
}


