package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class Opdracht3 extends Applet{
    TextField[] tekstvak;
    Button knopje;
    int[] getal;

    public void init() {
        tekstvak = new TextField[5];
        getal = new int[5];
        knopje = new Button("OK");
        knopje.addActionListener(new KnopjeListener());

        for (int i = 0; i < tekstvak.length; i++) {
            tekstvak[i] = new TextField("", 5);
            add(tekstvak[i]);
        }
        add(knopje);
    }
    public void paint(Graphics g){

    }
    class KnopjeListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < tekstvak.length; i++) {
                getal[i] = Integer.parseInt(tekstvak[i].getText());
            }
            Arrays.sort(getal);
            for (int i = 0; i < getal.length; i++) {
                tekstvak[i].setText(String.valueOf(getal[i]));
            }
            repaint();
        }
    }
}
