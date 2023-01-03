//WAP to create smiley face and Start using Applet

import java.applet.*;
import java.awt.*;
public class Assignment10 extends Applet{
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(80, 70, 150, 150);
 
        // Ovals for eyes
        // with black color filled
        g.setColor(Color.WHITE);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);
 
        // Arc for the smile
        g.drawArc(130, 180, 50, 20, 180, 180);
    }
}
