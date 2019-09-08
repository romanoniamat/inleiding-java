package h04;

import java.awt.*;
import java.applet.*;

public class praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        // lijn
        g.drawLine(20, 30, 150, 30);
        g.drawString("lijn", 75, 45);
        // rechthoek
        g.drawRect(20, 50, 130, 75);
        g.drawString("rechthoek", 60, 140);
        // afgeronde rechthoek
        g.drawRoundRect(20, 150, 130, 75, 10, 10);
        g.drawString("afgeronde rechthoek", 30, 240);
        // gevulde ovaal
        g.setColor(Color.MAGENTA);
        g.fillArc(160, 150, 130, 75, 90, 400);
        g.setColor(Color.black);
        // gevulde rechthoek met ovaal
        g.drawString("gevulde ovaal", 185, 240);
        g.drawOval(350, 150, 75, 75);
        g.drawString("cirkel", 370, 240);
        g.setColor(Color.magenta);
        g.fillRect(160, 50, 130, 75);
        g.setColor(Color.black);
        g.drawOval(160,50 , 130, 75);
        g.drawString("gevulde rechthoek met ovaal", 160, 140);
        // taartpunt met ovaal eromheen
        g.setColor(Color.magenta);
        g.fillArc(310, 50, 155, 80, 0, 45);
        g.setColor(Color.black);
        g.drawOval(315,50 , 150, 75);
        g.drawString("taartpunt met ovaal eromheen", 325, 140);





    }
}