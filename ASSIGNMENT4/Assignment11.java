/*WAP to move a ball in a straight line left to right horizontally using Applet and multithreading? */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Assignment11 extends Applet implements Runnable{
    int x=200;
    @Override
    public void init() {
        Thread t=new Thread(this);
        t.start();
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawOval(x, 200, 150, 150);
        g.fillPolygon(null);
    }
    @Override
    public void run() {
      while (true) {
        repaint();
        try {
            if (x<=600) {
                x+=10;
            }else if (x>600) {
                x-=10;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
      }
        
    }
}
