import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*WAP to find summation, subtraction, multiplication, division, modulus and power of 2 numbers using swing and event handling? */
import java.awt.*;
import java.awt.event.*;
class Calculator extends JFrame implements ActionListener{
    private Container cn;
    private JButton add,sub,mul,div,modulus,power;
    private JLabel num1,num2,result;
    private JTextField tnum1,tnum2,tresult;
  
    Calculator(){
        setTitle("Calculator");
        setLayout(null);
        cn=getContentPane();

        tresult=new JTextField();
        //First Label
        num1=new JLabel("Enter First Number");
        num1.setBounds(100,100,200,20);
        cn.add(num1);
        //first textfield
        tnum1=new JTextField();
        tnum1.setBounds(300,100,100,20);
        cn.add(tnum1);
        //second label
        num2=new JLabel("Enter Second Number");
        num2.setBounds(100,150,200,20);
        cn.add(num2);

         //second textfield
         tnum2=new JTextField();
         tnum2.setBounds(300,150,100,20);
         cn.add(tnum2);

         //result label
         result=new JLabel("Result");
         result.setBounds(100,200,100,20);
         cn.add(result);

         //resutl textfield
         tresult=new JTextField();
         tresult.setBounds(300,200,100,20);
         cn.add(tresult);
        
        //Adding Button

        //Sum button
        add=new JButton("+");
        add.setBounds(150,300,80,50);
        add.addActionListener(this);
        cn.add(add);

        //difference button
        sub=new JButton("-");
        sub.setBounds(250,300,80,50);
        sub.addActionListener(this);
        cn.add(sub);

        //multiplication button
        mul=new JButton("*");
        mul.setBounds(150,350,80,50);
        mul.addActionListener(this);
        cn.add(mul);

        //division button
        div=new JButton("/");
        div.setBounds(250,350,80,50);
        div.addActionListener(this);
        cn.add(div);
        setSize(500,500);
        setVisible(true);

        //module button
        modulus=new JButton("%");
        modulus.setBounds(150,400,80,50);
        modulus.addActionListener(this);
        cn.add(modulus);

        //power button
        power=new JButton("^");
        power.setBounds(250,400,80,50);
        power.addActionListener(this);
        cn.add(power);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==add) {
            int result=Integer.parseInt(tnum1.getText())+Integer.parseInt(tnum2.getText());
            tresult.setText(result+" ");
            tnum1.setText("");
            tnum2.setText("");
            System.out.println(result);
        }
        if (e.getSource()==sub) {
            int result=Integer.parseInt(tnum1.getText())-Integer.parseInt(tnum2.getText());
            tresult.setText(result+" ");
            tnum1.setText("");
            tnum2.setText("");
            System.out.println(result);
        }
        if (e.getSource()==mul) {
            long result=Integer.parseInt(tnum1.getText())*Integer.parseInt(tnum2.getText());
            tresult.setText(result+" ");
            tnum1.setText("");
            tnum2.setText("");
            System.out.println(result);
        }
        if (e.getSource()==div) {
            double result=Integer.parseInt(tnum1.getText())/Integer.parseInt(tnum2.getText());
            tresult.setText(result+" ");
            tnum1.setText("");
            tnum2.setText("");
            System.out.println(result);
        }
        if (e.getSource()==modulus) {
            int result=Integer.parseInt(tnum1.getText())%Integer.parseInt(tnum2.getText());
            tresult.setText(result+" ");
            tnum1.setText("");
            tnum2.setText("");
            System.out.println(result);
        }
        if (e.getSource()==power) {
            tnum2.setText(2+"");
            double result=Math.pow(Integer.parseInt(tnum1.getText()),2);
            tresult.setText(result+" ");
            tnum1.setText("");
            tnum2.setText("");
            System.out.println(result);
        }
    }

}
public class Assignment16 {
    public static void main(String[] args) {
        new Calculator();
    }
}
