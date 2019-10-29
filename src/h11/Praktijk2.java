package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijk2 extends Applet {
    Label label;
    Button okknop;
    int cijfer;

    public void init() {
        label = new Label("Klik op de OK-knop:");
        okknop = new Button("OK");
        okknop.addActionListener( new OkknopListener());
        add(label);
        add(okknop);
        cijfer = 0;

    }
    public void paint(Graphics g) {
        int teller;
        int x = 50;
        int y = 80;


        for(teller = 1; teller <= 10; teller++){

            g.drawString(teller + " x "+ cijfer + " = " + teller * cijfer, x, y);
            y += 20;
        }
    }
    class OkknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijfer++;
            repaint();
        }
    }
}
