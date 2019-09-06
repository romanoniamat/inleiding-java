package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class huis extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRect(0, 100, 100, 100);
        g.drawLine(50, 50, 100, 100);
        g.drawLine(50, 50, 0, 100);
        g.drawRect(20, 160, 25, 40);
        g.drawRect(60, 120, 25, 25);
    }
}
