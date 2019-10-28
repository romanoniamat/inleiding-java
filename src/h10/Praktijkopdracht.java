package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijkopdracht  extends  Applet{
    TextField tekstvak;
    Label label;
    Button okknop;
    String s;
    String rate;
    int cijfer;


    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new OkknopListener() );
        label = new Label("Typ je cijfer in:");
        okknop = new Button("OK");
        okknop.addActionListener(new OkknopListener());
        add(label);
        add(tekstvak);
        add(okknop);
        cijfer = 0;
        s = "";
        rate = "";
    }
    public void paint(Graphics g) {
        g.drawString("Je cijfer is " + rate, 50, 50);
    }
    class OkknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            cijfer = Integer.parseInt(s);
            if (cijfer <= 3) {
                rate = "slecht";
            } else if (cijfer == 4) {
                rate = "onvoldoende";
            } else if (cijfer == 5) {
                rate = "matig";
            } else if (cijfer == 6) {
                rate = "voldoende";
            } else if (cijfer == 7) {
                rate = "voldoende";
            } else if (cijfer > 7) {
                rate = "goed";
            } else if (cijfer > 10){
                rate = "Er is een verkeerd cijfer ingetypt";
            }
            repaint();
        }
    }
}