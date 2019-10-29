package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht8 extends Applet{

    public void init(){
    }

    public void paint(Graphics g){
        int x = 500;
        int y = 500;
        int width = 2;
        int height = 2;

        for (int teller = 0; teller <100; teller++){

            g.drawOval(x, y, width, height);
            x -= 5;
            y -= 5;
            width += 10;
            height += 10;
        }
    }
}
