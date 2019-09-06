package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class fillArc extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(20, 20, 150, 75, 90, 400);
    }
}