package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht5 extends Applet{
    TextField tekstvak;
    Label label;
    Button okknop;
    String s;
    String vo;
    String gemiddelde;
    double cijfer;
    double totaal;
    double uitslag;
    int aantal;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener( new OKListener() );
        label = new Label("Typ je cijfers in: ");
        okknop = new Button("OK");
        okknop.addActionListener( new OKListener() );
        add(label);
        add(tekstvak);
        add(okknop);
        gemiddelde = "";
        vo = "";
        s = "";
        cijfer = 0.0;

    }
    public void paint(Graphics g) {
        g.drawString("Dit is je uitslag: " + uitslag, 50, 70);
        g.drawString("Je hebt een  " + vo, 50, 90);

    }
    class OKListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            s = tekstvak.getText();
            cijfer = Double.parseDouble(s);
            tekstvak.setText("");
            aantal++;
            totaal += cijfer;
            uitslag = totaal / aantal;
            if (uitslag < 5.5){
                vo = "onvoldoende";
            }
            else if (uitslag >= 5.5){
                vo = "voldoende";
            }
            repaint();
        }
    }
}
