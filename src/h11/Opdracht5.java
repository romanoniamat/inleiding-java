package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht5 extends Applet{
    public void init() {

    }

    public void paint(Graphics g) {

        int y = 0;

        for(int teller = 0; teller < 5; teller++) {
            y += 30;

            g.drawRect(y, y, 30, 30);


        }
    }
}
