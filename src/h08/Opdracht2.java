package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht2 extends Applet {
    Button knopmeisjes;
    Button knopvrouwen;
    Button knopmannen;
    Button knopjongens;
    Button knoptotaal;
    int countermeisje, countervrouw, counterjongen, counterman, countertotaal;

    public void init() {
        knopmannen = new Button("Mannen");
        knopvrouwen = new Button("Vrouwen");
        knopmeisjes = new Button("Meisjes");
        knopjongens = new Button("Jongens");
        knoptotaal = new Button("Totaal");


        knopmeisjes.addActionListener(new KnopmeisjeListener());

        knopmannen.addActionListener(new KnopmanListener());

        knopjongens.addActionListener(new KnopjongenListener());

        knopvrouwen.addActionListener(new KnopvrouwListener());



        add(knopmeisjes);
        add(knopmannen);
        add(knopjongens);
        add(knopvrouwen);
    }

    public void paint(Graphics g) {
        g.drawString("aantal meisjes " + countermeisje, 50, 60);
        g.drawString("aantal Mannnen " + counterman, 50, 75);
        g.drawString("aantal jongens " + counterjongen, 50, 90);
        g.drawString("aantal vrouwen " + countervrouw, 50, 105);
        g.drawString("totaal "+ (countervrouw+counterman+countermeisje+counterjongen), 50, 120);
    }


    class KnopmeisjeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            countermeisje++;
            repaint();

        }


    }

    class KnopmanListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            counterman++;
            repaint();

        }
    }

    class KnopjongenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            counterjongen++;
            repaint();

        }
    }

    class KnopvrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            countervrouw++;
            repaint();
        }
    }
}

