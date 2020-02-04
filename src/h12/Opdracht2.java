package h12;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {
    Button knop[];

    public void init() {
        knop = new Button[25];

        for (int teller = 0; teller < knop.length; teller++) {
            knop [teller] = new Button("OK");
            add(knop[teller]);
        }
    }
}
