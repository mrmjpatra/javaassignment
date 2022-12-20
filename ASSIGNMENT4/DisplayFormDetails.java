import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;
import java.awt.*;

public class DisplayFormDetails extends JFrame implements ActionListener{
    private JLabel name, rollNo, regdNo, email, phone, semester, branch, stream, gender, hobbies;
    Container container;
    private JButton back;

    DisplayFormDetails(RegistrationForm form) {
        System.out.println(form.hob);
        setTitle("Form Details");
        setLayout(null);
        container = getContentPane();
        setSize(500, 1300);
        setVisible(true);
        name = new JLabel();
        name.setBounds(100, 50, 300, 30);
        rollNo = new JLabel();
        rollNo.setBounds(100, 100, 300, 30);
        regdNo = new JLabel();
        regdNo.setBounds(100, 150, 300, 30);
        email = new JLabel();
        email.setBounds(100, 200, 300, 30);
        phone = new JLabel();
        phone.setBounds(100, 250, 300, 30);
        semester = new JLabel();
        semester.setBounds(100, 300, 300, 30);
        branch = new JLabel();
        branch.setBounds(100, 350, 300, 30);
        stream = new JLabel();
        stream.setBounds(100, 400, 300, 30);
        gender = new JLabel();
        gender.setBounds(100, 450, 200, 30);

        hobbies = new JLabel();
        hobbies.setBounds(100, 500, 800, 100);
        back=new JButton("Back");
        back.setBounds(100,600,100,30);
        back.addActionListener(this);
        try {
            System.out.println(form.name);
            name.setText("Name : "+form.name);
            rollNo.setText("Roll No : "+form.roll);
            regdNo.setText("Regd. No. : "+form.regd);
            email.setText("Email Id: "+form.email);
            phone.setText("Phone Number : "+form.phone);
            stream.setText("Stream : "+form.stream);
            branch.setText(" Branch: "+form.branch);
            semester.setText("Semester : "+form.semester);
            gender.setText("Gender : "+form.gender);
            hobbies.setText("Hobbies : "+form.hob);

        } catch (Exception e) {
            e.printStackTrace();
        }

        container.add(name);
        container.add(phone);
        container.add(email);
        container.add(rollNo);
        container.add(regdNo);
        container.add(stream);
        container.add(branch);
        container.add(semester);
        container.add(gender);
        container.add(hobbies);
        container.add(back);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back) {
            new RegistrationForm();
            setVisible(false);
        }
        
    }
}
