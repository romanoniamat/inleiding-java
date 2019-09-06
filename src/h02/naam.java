package h02;

import java.awt.*;
import java.applet.*;

public class naam extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Romano", 50, 60 );
        g.setColor(Color.RED);
        g.drawString("Niamat", 50, 70 );
    }
}