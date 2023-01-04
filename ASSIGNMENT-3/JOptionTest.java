import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.*;

class AddTwoNumber extends JFrame implements Runnable {
    //Container c;
    Thread t1; //t2, t3;

    AddTwoNumber() {
        t1 = new Thread(this);
        //t2 = new Thread(this);
        //t3 = new Thread(this);
        try {
            t1.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void performAction() {
        System.out.println("AddTwoNumber.performAction()");
        String num1 = JOptionPane.showInputDialog("Enter the first number");
        String num2 = JOptionPane.showInputDialog("Enter the second number");
        int result = Integer.parseInt(num1) + Integer.parseInt(num2);
        int action = JOptionPane.showConfirmDialog(null,"Sum is " + result);
        // JOptionPane.showMessageDialog(c, "Sum if "+result);
    }

    @Override
    public void run() {
        System.out.println("AddTwoNumber.run()");
       performAction();

    }
}

public class JOptionTest {
    public static void main(String[] args) {
        new AddTwoNumber();
    }
}
