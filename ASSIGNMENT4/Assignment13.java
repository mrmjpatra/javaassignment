import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*WAP to create digital clock using swing and multithreading? */
class DigitalClock extends JFrame implements Runnable {
    Thread t;
    JButton btn;
    JLabel label;

    DigitalClock() {
        t = new Thread(this);
        t.start();
        setTitle("Digital Clock");
        btn = new JButton();
        btn.setBounds(50, 50, 150, 150);
        label = new JLabel("Time");
       
        label.setBounds(40, 50, 100, 150);
        setLayout(new FlowLayout());
        add(label);
        add(btn);
        setSize(400, 400);
        setVisible(true);
    }

    @Override
    public void run() {
        while (true) {
            try {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                LocalTime time = LocalTime.now();
                btn.setText(LocalTime.now().format(dtf));
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

public class Assignment13 {
    public static void main(String[] args) {
        new DigitalClock();
    }
}
