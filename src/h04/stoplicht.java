package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.BLACK);
        g.fillRoundRect(50, 20, 100, 200, 10, 10);
        g.fillRect(95, 200, 10, 200);
        g.setColor(Color.red);
        g.fillOval(75, 30, 50, 50);
        g.setColor(Color.orange);
        g.fillOval(75, 90, 50, 50);
        g.setColor(Color.green);
        g.fillOval(75, 150, 50, 50);


    }
}
