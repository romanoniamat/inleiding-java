package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht3 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    String s1, tekst2;
    int maand;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        tekst2 = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
        g.drawString(tekst2, 50, 75);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            s1 = tekstvak.getText();
            maand = Integer.parseInt(s1);
            switch(maand) {
                case 1:
                    tekst = "januari";
                    tekst2 = "31 dagen";
                    break;
                case 2:
                    tekst = "februari";
                    tekst2 = "28 dagen";
                    break;
                case 3:
                    tekst = "maart";
                    tekst2 = "31 dagen";
                    break;
                case 4:
                    tekst = "april";
                    tekst2 = "30 dagen";
                    break;
                case 5:
                    tekst = "mei";
                    tekst2 = "31 dagen";
                    break;
                case 6:
                    tekst = "juni";
                    tekst2 = "30 dagen";
                    break;
                case 7:
                    tekst = "juli";
                    tekst2 = "31 dagen";
                    break;
                case 8:
                    tekst = "augustus";
                    tekst2 = "31 dagen";
                    break;
                case 9:
                    tekst = "september";
                    tekst2 = "30 dagen";
                    break;
                case 10:
                    tekst = "oktober";
                    tekst2 = "31 dagen";
                    break;
                case 11:
                    tekst = "november";
                    tekst2 = "30 dagen";
                    break;
                case 12:
                    tekst = "december";
                    tekst2 = "31 dagen";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}