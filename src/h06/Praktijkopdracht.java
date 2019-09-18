package h06;

import java.applet.Applet;
import java.awt.*;



public class Praktijkopdracht extends Applet {

    double getal1;
    double getal2;
    double getal3;
    double uitkomst;


    @Override
    public void init() {
        getal1 = 5.9;
        getal2 = 6.3;
        getal3 = 6.9;
        uitkomst = (getal1 + getal2 + getal3) / 3;
        uitkomst = uitkomst * 10;
        uitkomst = (int) uitkomst;
        uitkomst = uitkomst / 10;

    }

    @Override
    public void paint(Graphics g) {
        g.drawString(String.valueOf(uitkomst ), 50, 70);
}


}
