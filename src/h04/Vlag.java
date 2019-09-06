package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Vlag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(50, 100, 100, 100);
        g.setColor(Color.RED);
        g.fillRect(50, 100, 100, 33);
        g.setColor(Color.blue);
        g.fillRect(50, 167, 100, 33);
        g.setColor(Color.black);
        g.drawRect(40, 75, 10, 250);
        g.setColor(Color.yellow);
        g.fillOval(35, 70, 30, 30);

    }
}
