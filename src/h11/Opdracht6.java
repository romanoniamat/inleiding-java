package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht6 extends Applet{
    public void init() {

    }

    public void paint(Graphics g) {
        int y = 150;
        int x = 150;
        int width = 10;
        int height = 10;

        for (int teller = 0; teller <5; teller++){
            g.drawOval(x, y, width, height);
            y -= 10;
            x -= 10;
            width += 20;
            height += 20;
        }
    }
}