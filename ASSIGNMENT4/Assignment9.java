
/*WAP to print your name and scroll and blink your name using Applet and multithreading?
 */
import java.applet.Applet;
import java.awt.Graphics;

import java.applet.*;
import java.awt.*;

public class Assignment9 extends Applet implements Runnable {
    String name = "Kriti";
    int x = 100;
    int y = 100;

    public void init() {
        Thread t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString(name, x, y);

    }

    @Override
    public void run() {
        Boolean scroll = true;
        while (true) {
            repaint();
            try {
                if (scroll) {
                    if (x < 600) {
                        x = x + 5;
                    } else {
                        scroll = false;
                    }

                } else {
                    if (x > 0) {
                        x -= 5;
                    } else {
                        scroll = true;
                    }

                }
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }

    }

}