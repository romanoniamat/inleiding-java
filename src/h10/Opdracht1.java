package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {
    boolean firstNumber;
    int maxInput;
    int minInput;
    int userInput;
    TextField tekstvak;
    String sorry;


    @Override
    public void init() {
        maxInput = 0;
        minInput = 0;
        tekstvak = new TextField(10);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);
        firstNumber = true;
        sorry = "";




    }


    @Override
    public void paint(Graphics g) {
        g.drawString("Hoogste getal: " + maxInput, 50, 60);
        g.drawString(sorry, 50, 90);}



    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInputString = tekstvak.getText();
            userInput = Integer.parseInt(userInputString);
            if (firstNumber) {
                firstNumber = false;
                maxInput  = userInput;
                minInput  = userInput;
                repaint();}
            else {
                if (userInput > maxInput) {
                    maxInput = userInput;
                    sorry = "";
                    repaint();
                } else if (userInput < minInput) {
                    minInput = userInput;
                    sorry = "";
                    repaint();
                }
            }
        }
    }
}


