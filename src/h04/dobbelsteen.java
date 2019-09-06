package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class dobbelsteen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawRect(20, 20, 100, 100);
        g.setColor(Color.black);
        g.fillOval(30, 30, 25, 25);
        g.fillOval(85, 30, 25, 25);
        g.fillOval(30, 85, 25, 25);
        g.fillOval(85, 85, 25, 25);

    }
}
