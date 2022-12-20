import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Win1 extends JFrame implements ActionListener{
    Container cn;
    JLabel t1;
    JButton jb1;

    public Win1(){
        cn = getContentPane();
        setTitle("Window 1");
        setLayout(null);
        cn.setBackground(Color.RED);
        t1 = new JLabel("You are in First Window");
        t1.setForeground(Color.WHITE);
        t1.setBounds(250,100,300,50);
        cn.add(t1);
        jb1 = new JButton("Go to 2nd Window");
        jb1.setBounds(200,200,250,30);
        jb1.addActionListener(this);
        cn.add(jb1);

        setSize(1000,1000);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==jb1){
            setVisible(false);
            new Win2();
        }
    }
}
class WindowToWindow{
    public static void main(String args[]){
        new Win1();
    }
}