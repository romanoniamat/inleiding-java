package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class driehoek extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(100, 100, 50, 100);
        g.drawLine(75, 50, 50, 100);
        g.drawLine(75, 50, 100, 100);

    }
}
