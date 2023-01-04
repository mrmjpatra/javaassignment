import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.*;

 class JOptionTest1 extends JFrame {
    Container cn;
    JOptionTest1(){
        setTitle("Frame");
        setSize(1000,1000);
        // setLayout(null);
        setVisible(true);
        cn=getContentPane();
        String s1=JOptionPane.showInputDialog(cn, "Enter thefirst number") ;       
        String s2=JOptionPane.showInputDialog(cn, "Enter the second number") ;       
        int result=Integer.parseInt(s1)+Integer.parseInt(s2);
        JOptionPane.showMessageDialog(cn, "Sum of two number is "+result);
        JOptionPane.showConfirmDialog(cn, "Do you agree");
    }
}
public class Test{
    public static void main(String[] args) {
        JOptionTest1 obj=new JOptionTest1();
    }
}


