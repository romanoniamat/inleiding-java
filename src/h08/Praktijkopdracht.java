package h08;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {
    TextField tekstvak;
    TextField tekstvak1;
    double getal;
    double getal1;
    double uitkomst;
    String s1;
    String s2;
    Button vermenigvuldigingsknop;
    Button deelknop;
    Button minknop;
    Button plusknop;


    public void init() {
        setSize(400, 400);
        tekstvak = new TextField("", 10);
        add(tekstvak);
        tekstvak1 = new TextField("", 10);
        add(tekstvak1);
        vermenigvuldigingsknop = new Button("*");
        vermenigvuldigingsknop.addActionListener(new VermenigvuldigingsknopListener());
        add(vermenigvuldigingsknop);
        deelknop = new Button("/");
        deelknop.addActionListener(new DeelknopListener());
        add(deelknop);
        minknop = new Button("-");
        minknop.addActionListener(new MinknopListener());
        add(minknop);
        plusknop = new Button("+");
        plusknop.addActionListener(new PlusknopListener());
        add(plusknop);


        getal = 0;
        getal1 = 0;
        uitkomst = getal + getal1;

        s1 = "";
        s2 = "";
    }

    public void paint(Graphics g) {
        g.drawString("" + getal, 50, 60);
    }

    class VermenigvuldigingsknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s1 = tekstvak.getText();
            getal = Double.parseDouble(s1);
            s2 = tekstvak1.getText();
            getal1 = Double.parseDouble(s2);
            uitkomst = getal * getal1;
            tekstvak.setText("" + uitkomst);
            tekstvak1.setText("");
            repaint();
        }
    }

    class DeelknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s1 = tekstvak.getText();
            getal = Double.parseDouble(s1);
            s2 = tekstvak1.getText();
            getal1 = Double.parseDouble(s2);
            uitkomst = getal / getal1;
            tekstvak.setText("" + uitkomst);
            tekstvak1.setText("");
            repaint();
        }
    }

    class MinknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s1 = tekstvak.getText();
            getal = Double.parseDouble(s1);
            s2 = tekstvak1.getText();
            getal1 = Double.parseDouble(s2);
            uitkomst = getal - getal1;
            tekstvak.setText("" + uitkomst);
            tekstvak1.setText("");
            repaint();
        }
    }

    class PlusknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s1 = tekstvak.getText();
            getal = Double.parseDouble(s1);
            s2 = tekstvak1.getText();
            getal1 = Double.parseDouble(s2);
            uitkomst = getal + getal1;
            tekstvak.setText("" + uitkomst);
            tekstvak1.setText("");
            repaint();
        }
    }
}