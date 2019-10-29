package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht7 extends Applet{
    public void init() {


    }
    public void paint(Graphics g) {
        int y = 250;
        int x = 250;
        int width = 10;
        int height = 10;

        for (int teller = 0; teller <50; teller++){
            g.drawOval(x, y, width, height);
            y -= 5;
            x -= 5;
            width += 10;
            height += 10;


        }

    }
}
