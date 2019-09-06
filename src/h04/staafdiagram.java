package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class staafdiagram extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        // verticale as
        g.drawLine(50,50,50,350);
        // horizontale as
        g.drawLine(50,350,350,350);

        // tekenen van de staven
            // 1. Valerie
        g.setColor(Color.BLUE);
        g.fillRect(50, 250, 50, 100);
        // Schrijf de namen
        g.setColor(Color.BLACK);
        g.drawString("Valerie", 50,375);
           // 2. Jeroen
        g.setColor(Color.red);
        g.fillRect(100, 100, 50, 250);
        // schrijf de namen
        g.setColor(Color.black);
        g.drawString("Jeroen", 100, 375);
           // 3. Hans
        g.setColor(Color.yellow);
        g.fillRect(150,150 , 50, 200);
        // schrijf de namen
        g.setColor(Color.black);
        g.drawString("Hans", 150, 375);

        // percentages
        g.drawString("0", 30, 360);
        g.drawString("20", 30, 310);
        g.drawString("40",30, 260 );
        g.drawString("60", 30, 210);
        g.drawString("80", 30, 160);
        g.drawString("100", 25, 110);



    }
}