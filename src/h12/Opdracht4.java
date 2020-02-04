package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht4 extends Applet{
    boolean gevonden;
    TextField tekstvak;
    Button knop;
    String s;
    int[] getal;
    int zoeken;

    public void init() {
        getal = new int[20];
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new OkknopListener());
        knop = new Button("OK");
        knop.addActionListener(new OkknopListener());
        s = "";
        add(tekstvak);
        add(knop);
        zoeken = 0;

        for (int i = 0; i < getal.length; i++) {
            getal[i] = (int)(Math.random() * 10 + 1);

        }
    }
    public void paint(Graphics g) {
        int y = 50;

        for (int i = 0; i < getal.length; i++) {
            g.drawString(getal[i] + "", 50, y);
            y += 15;
        }
        g.drawString(s, 150, 80);
    }
    class OkknopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            boolean gevonden = false;
            zoeken = Integer.parseInt(tekstvak.getText());
            for (int i = 0; i < getal.length; i++) {
                if (getal[i] == zoeken){
                    gevonden =  true;
                    s = "De waarde is gevonden" + "  index: " + i;
//   De break; comment hoort bij opdracht 12.5
                    break;
                }
                if (!gevonden){
                    s = zoeken + " is niet gevonden";
                }
            }
            repaint();
        }
    }
}
