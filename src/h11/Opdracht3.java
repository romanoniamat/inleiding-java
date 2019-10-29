package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet{
    public void init() {

    }
    public void paint(Graphics g) {
        int teller;
        int y = 0;

        int a = 1;
        int b = 0;
        int c;

        for (teller = 0; teller <=20; teller++ ) {
            y += 15;
            c = a+b;
            g.drawString(""+ c, 100, y);
            a = b;
            b = c;
        }
    }
}
