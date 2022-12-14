import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

/*WAP to create one registration form for students to enter their name, roll no, regd no, stream, branch, semester, gender, hobbies, email id and phone number using JLabel, JTextField, JCheckBox, JRadioButton, JComboBox, JButton for submit and reset Button? */

class RegistrationForm extends JFrame implements ActionListener, ItemListener {
    private Container c;
    private JLabel lName, lEmail, lPhone, lRoll, lRegd, lStream, lBranch, lSemester, lGender, lHobbies;
    private JTextField tName, tEmail, tPhone, tRoll, tRegd, tStream, tBranch;
    private JComboBox cbBranch;
    private JComboBox cbSemester;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup genbg;
    private JCheckBox hb1, hb2, hb3, hb4;
    private JButton sub;
    private JButton reset;
    private JLabel res;

    String name, roll, regd, stream, branch, semester, gender, email, phone;
    String hob = " ";

    RegistrationForm() {
        setTitle("Registration Form");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);

        // Name form field
        lName = new JLabel("Name");
        lName.setSize(100, 20);
        lName.setLocation(100, 100);
        c.add(lName);

        tName = new JTextField();
        tName.setSize(190, 20);
        tName.setLocation(200, 100);
        c.add(tName);

        // Roll Number form field
        lRoll = new JLabel("Roll No");
        lRoll.setSize(100, 20);
        lRoll.setLocation(100, 150);
        c.add(lRoll);

        tRoll = new JTextField();
        tRoll.setSize(190, 20);
        tRoll.setLocation(200, 150);
        c.add(tRoll);

        // regd Number form field
        lRegd = new JLabel("Registration No");
        lRegd.setSize(100, 20);
        lRegd.setLocation(100, 200);
        c.add(lRegd);

        tRegd = new JTextField();
        tRegd.setSize(190, 20);
        tRegd.setLocation(200, 200);
        c.add(tRegd);

        // stream form field
        lStream = new JLabel("Stream");
        lStream.setSize(100, 20);
        lStream.setLocation(100, 250);
        c.add(lStream);

        tStream = new JTextField();
        tStream.setSize(190, 20);
        tStream.setLocation(200, 250);
        c.add(tStream);

        // branch form filed
        lBranch = new JLabel("Select Branch");
        lBranch.setBounds(100, 300, 100, 20);
        c.add(lBranch);

        cbBranch = new JComboBox<String>();
        cbBranch.setBounds(250, 300, 100, 30);
        cbBranch.addItem("MCA");
        cbBranch.addItem("BTCH");
        cbBranch.addItem("DIPLOMA");
        cbBranch.addItem("MTECH");
        cbBranch.addActionListener(this);
        c.add(cbBranch);

        // semester form field
        lSemester = new JLabel("Choose Semester");
        lSemester.setBounds(100, 350, 150, 20);
        c.add(lSemester);


        cbSemester = new JComboBox<>();
        cbSemester.addItem("First Semester");
        cbSemester.addItem("Second Semester");
        cbSemester.addItem("Third Semester");
        cbSemester.addItem("Fourth Semester");
        cbSemester.setBounds(250, 350, 100, 20);
        cbSemester.addActionListener(this);
        c.add(cbSemester);

        // gender
        lGender = new JLabel("Gender");
        lGender.setBounds(100, 400, 100, 20);
        c.add(lGender);

        male = new JRadioButton("Male");
        male.setBounds(200, 400, 100, 20);
        male.setSelected(false);
        female = new JRadioButton("Female");
        female.setBounds(270, 400, 100, 20);
        female.setSelected(true);
        c.add(male);
        c.add(female);

        genbg = new ButtonGroup();
        genbg.add(male);
        genbg.add(female);

        // hobbies
        lHobbies = new JLabel("Hobbies");
        lHobbies.setBounds(100, 450, 100, 20);
        c.add(lHobbies);

        hb1 = new JCheckBox("Watching Movies");
        hb1.setBounds(200, 450, 150, 20);
        hb1.addItemListener(this);
        hb2 = new JCheckBox("Playing Cricket");
        hb1.addItemListener(this);
        hb2.setBounds(350, 450, 150, 20);
        hb2.addItemListener(this);
        hb3 = new JCheckBox("Listening Songs");
        hb3.setBounds(200, 500, 150, 20);
        hb3.addItemListener(this);
        hb4 = new JCheckBox("Travelling");
        hb4.setBounds(350, 500, 100, 20);
        hb4.addItemListener(this);
        c.add(hb1);
        c.add(hb2);
        c.add(hb3);
        c.add(hb4);

        // email
        lEmail = new JLabel("Email ID");
        lEmail.setBounds(100, 550, 150, 20);
        c.add(lEmail);
        tEmail = new JTextField();
        tEmail.setBounds(200, 550, 150, 20);
        c.add(tEmail);
        // phone
        lPhone = new JLabel("Phone Number");
        lPhone.setBounds(100, 600, 150, 20);
        c.add(lPhone);
        tPhone = new JTextField();
        tPhone.setBounds(200, 600, 150, 20);
        c.add(tPhone);

        // submit button
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setBounds(150, 700, 150, 20);
        sub.addActionListener(this);

        c.add(sub);
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(150, 20);
        reset.setLocation(400, 700);
        reset.addActionListener(this);
        c.add(reset);
        setSize(1500, 1000);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            name = tName.getText();
            roll = tRoll.getText();
            regd = tRegd.getText();
            stream = tStream.getText();
            branch = (String) cbBranch.getSelectedItem();
            semester = (String) cbSemester.getSelectedItem();
            gender = male.isSelected() ? "Male" : "Female";
            email = tEmail.getText();
            phone = tPhone.getText();
            new DisplayFormDetails(this);
            setVisible(false);
        }
        if (e.getSource() == reset) {
            tName.setText("");
            tRoll.setText("");
            tBranch.setText("");
            tEmail.setText("");
            tRegd.setText("");
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == hb1) {
            hob = hob + hb1.getText() + "\n";
        }
        if (e.getSource() == hb2) {
            hob = hob + ", " + hb2.getText() + "\n";
        }
        if (e.getSource() == hb3) {
            hob = hob + ", " + hb3.getText();
        }
        if (e.getSource() == hb4) {
            hob = hob + hb4.getText();
        }
    }

}

public class Assignment14 {
    public static void main(String[] args) {

        new RegistrationForm();
    }
}
