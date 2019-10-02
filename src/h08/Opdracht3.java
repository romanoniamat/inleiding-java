package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht3 extends Applet {
    TextField tekstvak;
    Label label;
    Button knopOk;
    String s;
    double Btw;
    double invoer;

    public void init() {
        tekstvak = new TextField("", 20);
        knopOk = new Button("OK");
        knopOk.addActionListener(new TekstvakListener() );
        label = new Label("Type een getal");
        Btw = 1.21;
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
        add(knopOk);



    }

    public void paint(Graphics g) {
        g.drawString("Het getal inclusief 21% BTW: " + invoer*Btw, 50, 60 );

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            invoer = Double.parseDouble( s );
            //Je kan deze regels ook samenvoegen
            //getal = Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }
}