package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht3 extends Applet {
    int getal1;
    int getal2;
    int uitkomst;




    public void init() {
       getal1 = 2147483647;
       getal2 = 586424;
       uitkomst = (getal1 + getal2);





    }

    public void paint(Graphics g) {
        g.drawString("de uitkomst is:" + uitkomst, 20, 20);


    }
}

















