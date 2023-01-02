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
        btn = new JButton("Ok");
        btn.setBounds(50, 50, 150, 150);
        label = new JLabel();
        setLayout(new FlowLayout());
        add(label);
        add(btn);
        setSize(200, 200);
        setVisible(true);
    }

    @Override
    public void run() {
        while (true) {

            try {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                btn.setText(LocalTime.now().format(dtf));
                t.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }
}

public class Assignment13 {
    public static void main(String[] args) {
        new DigitalClock();
    }
}
