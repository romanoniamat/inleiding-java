package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht2 extends Applet {
    int seconden;
    int uur;
    int dag;
    int jaar;
    int uitkomst;



    public void init() {
        seconden = 60;
        uur = 60;
        dag = 24;
        jaar = 365;
        uitkomst = 86400 * 365;




    }

    public void paint(Graphics g) {
        g.drawString("aantal seconden in een uur: " + seconden * uur, 20, 20);
        g.drawString("aantal seconden in een dag: " + seconden * uur * dag, 20, 40);
        g.drawString("aantal seconden in een jaar: " + uitkomst , 20, 60);

    }
}
