import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.*;
import java.awt.event.*;
/*WAP to create one application for colour recognition for kids in which kids will chose button that shows colour name like RED,BLUE, etc. and after clicking on button background colour of window will change as per colour name? */

class ColourApp extends JFrame implements ActionListener{
    private JButton red,blue,green,cyan;
    private Container container;

    public ColourApp(){
        setTitle("ColourApp");
        setLayout(null);
        container=getContentPane();
        red=new JButton("RED");
        red.setBounds(150,100,100,100);
        red.addActionListener(this);
        container.add(red);

        blue=new JButton("BLUE");
        blue.setBounds(150,200,100,100);
        blue.addActionListener(this);
        container.add(blue);

        green=new JButton("GREEN");
        green.setBounds(250,100,100,100);
        green.addActionListener(this);
        container.add(green);

        cyan=new JButton("CYAN");
        cyan.setBounds(250,200,100,100);
        cyan.addActionListener(this);
        container.add(cyan);

        setVisible(true);
        setSize(500,500);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource()==red) {
            container.setBackground(Color.RED);
       }
       if (e.getSource()==blue) {
        container.setBackground(Color.BLUE);
       }
       if (e.getSource()==green) {
        container.setBackground(Color.GREEN);
       }
       if (e.getSource()==cyan) {
        container.setBackground(Color.CYAN);
       }
        
    }
    
}

public class Assignment15 {
    public static void main(String[] args) {
        new ColourApp();
    }
}
