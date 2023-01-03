/*  WAP to find summation, subtraction, multiplication, division, modulus and power of 2 numbers 
using swing and event handling?*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class CalculatorS extends JFrame implements ActionListener
{
    Container cn;
    JLabel n1,n2,r;
    JTextField t1,t2,tr;
    JButton sum,sub,mul,div,mod,pow;

    public CalculatorS()
    {
        cn=getContentPane();
        setTitle("Calculator");
        setLayout(null);

        //For First Number
        n1=new JLabel("Enter First Number :");
        n1.setBounds(100,100,200,30);
        cn.add(n1);
        t1=new JTextField();
        t1.setBounds(300,100,100,30);
        cn.add(t1);

        //For Second Number
        n2=new JLabel("Enter First Number :");
        n2.setBounds(100,150,200,30);
        cn.add(n2);
        t2=new JTextField();
        t2.setBounds(300,150,100,30);
        cn.add(t2);

        //For Result
        r=new JLabel("Result");
        r.setBounds(100,200,300,30);
        cn.add(r);
        tr=new JTextField();
        tr.setBounds(300,200,100,30);
        cn.add(tr);

        //For Button
        sum=new JButton("Sum");
        sum.setBounds(100,250,70,30);
        sum.addActionListener(this);
        cn.add(sum);

        sub=new JButton("Sub");
        sub.setBounds(180,250,70,30);
        sub.addActionListener(this);
        cn.add(sub);

        mul=new JButton("Mul");
        mul.setBounds(260,250,70,30);
        mul.addActionListener(this);
        cn.add(mul);

        div=new JButton("Div");
        div.setBounds(340,250,70,30);
        div.addActionListener(this);
        cn.add(div);

        mod=new JButton("Mod");
        mod.setBounds(420,250,70,30);
        mod.addActionListener(this);
        cn.add(mod);

        pow=new JButton("Pow");
        pow.setBounds(500,250,70,30);
        pow.addActionListener(this);
        cn.add(pow);

        setSize(800,500);
        setVisible(true);
    }

   
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==sum) {
            String s1=t1.getText();
            String s2=t2.getText();
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            t1.setText("");
            t2.setText("");
            tr.setText((a+b)+"");
        }
        if (e.getSource()==sub) {
            String s1=t1.getText();
            String s2=t2.getText();
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            t1.setText("");
            t2.setText("");
            tr.setText((a-b)+"");
        }
        if (e.getSource()==mul) {
            String s1=t1.getText();
            String s2=t2.getText();
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            t1.setText("");
            t2.setText("");
            tr.setText((a*b)+"");
        }
        if (e.getSource()==div) {
            String s1=t1.getText();
            String s2=t2.getText();
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            t1.setText("");
            t2.setText("");
            tr.setText((a/b)+"");
        }
        if (e.getSource()==pow) {
            String s1=t1.getText();
            String s2=t2.getText();
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            long p=1;
            for(int i=1;i<=b;i++)
            {
                p=p*a;
            }
            t1.setText("");
            t2.setText("");
            tr.setText(p+"");
        }
        if (e.getSource()==mod) {
            String s1=t1.getText();
            String s2=t2.getText();
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            t1.setText("");
            t2.setText("");
            tr.setText((a%b)+"");
        }
        

    }

}
public class Test
{
    public static void main(String[] args) 
    {
        new CalculatorS();
    }
}