package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht2 extends Applet{
    public void init(){
        setSize(500,500);

    }
    public void paint(Graphics g){
        int x = 20;
        int y = 20;
        int width = 40;
        int height = 20;

        tekenRodeMuur(g, x, y, width, height);


    }
    void tekenRodeMuur(Graphics g, int x, int y, int width, int height){
        for (int i = 0; i < 6; i++) {
            x = 20;
            for (int j = 0; j < 8; j++) {
                g.setColor(Color.RED);
                g.fillRect(x, y, width, height);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, width, height);
                x += width;
            }
            y += height;
        }
    }
}
