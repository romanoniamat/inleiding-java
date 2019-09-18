package h05;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {

    // variabelen declareren
    int gewichtValerie;
    int gewichtJeroen;
    int gewichtHans;
    int hoogteXas;


    public void init() {

        // variabelen initialiseren

        setSize(400, 400);
        hoogteXas = 350;
        gewichtValerie = 40;
        gewichtJeroen = 100;
        gewichtHans = 80;

    }

    public void paint(Graphics g) {

        // dingen in beeld brengen

        // verticale as
        g.drawLine(50, 50, 50, hoogteXas);
        // horizontale as
        g.drawLine(50, hoogteXas, hoogteXas, hoogteXas);

        // tekenen van de staven
           // 1. Valerie
        g.setColor(Color.BLUE);
        g.fillRect(50, hoogteXas - gewichtValerie, 80, gewichtValerie);
        g.setColor(Color.black);
        g.drawString("Valerie", 50, 360);
          // 2. Jeroen
        g.setColor(Color.RED);
        g.fillRect(130, hoogteXas - gewichtJeroen, 80, gewichtJeroen);
        g.setColor(Color.black);
        g.drawString("Jeroen", 130, 360);
          // 3. Hans
        g.setColor(Color.yellow);
        g.fillRect(210, hoogteXas - gewichtHans, 80, gewichtHans);
        g.setColor(Color.black);
        g.drawString("Hans", 225, 360);
         // getallen
        g.drawString("0", 30, 360);
        g.drawString("20", 30, 340);
        g.drawString("40", 30, 320);
        g.drawString("60", 30, 300);
        g.drawString("80",30, 280 );
        g.drawString("100", 30, 260);






    }
}






