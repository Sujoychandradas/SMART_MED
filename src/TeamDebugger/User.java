package TeamDebugger;


import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class User extends JFrame {

    JButton login,regi,doc,user;
    JPanel panel1,panel2,panel3;
    JTextField field1,field2,field3,field4,field5,field6,field7,field8;
    JLabel label1,label2;
    public User()
    {
        setSize(900,710);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);
//        setBackground(new Color(15, 158, 234));
//        setPreferredSize(new Dimension(300,400));

        panel1 = new JPanel();
        panel1.setBounds(0,0,900,700);
        panel1.setBackground(new Color(15, 158, 234));
        add(panel1);
        panel1.setLayout(null);


        panel2 = new JPanel();
        panel2.setBounds(250,100,600,500);
        panel2.setBackground(new Color(255, 255, 255));
        panel2.setLayout(null);
        panel1.add(panel2);

        field1 = new JTextField("First Name *");
        field1.setBounds(50,100,200,40);
        field1.setBorder(new LineBorder(new Color(206, 212, 218),2));
        panel2.add(field1);

//        Font font1 = new Font()
        label1 = new JLabel("Apply As a Doctor");
        label1.setBounds(100,50,400,30);
        panel2.add(label1);

        field1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                field1.setText("");
                field1.setBorder(new LineBorder(new Color(15, 158, 234),3));
            }

            @Override
            public void focusLost(FocusEvent e) {
                field1.setBorder(new LineBorder(new Color(206, 212, 218),2));
                if (field1.getText().equals(""))
                {
                    field1.setText("First Name *");
                }
                else
                {
                    field1.getText();
                }
            }
        });

        field2 = new JTextField("Last Name *");
        field2.setBounds(50,180,200,40);
        field2.setBorder(new LineBorder(new Color(206, 212, 218),2));
        panel2.add(field2);

        field2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                field2.setText("");
                field2.setBorder(new LineBorder(new Color(15, 158, 234),3));
            }

            @Override
            public void focusLost(FocusEvent e) {
                field2.setBorder(new LineBorder(new Color(206, 212, 218),2));
                if (field2.getText().equals(""))
                {
                    field2.setText("Last Name *");
                }
                else
                {
                    field2.getText();
                }
            }
        });

        field3 = new JTextField("Password *");
        field3.setBounds(50,260,200,40);
        field3.setBorder(new LineBorder(new Color(206, 212, 218),2));
        panel2.add(field3);

        field3.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                field3.setText("");
                field3.setBorder(new LineBorder(new Color(15, 158, 234),3));
            }

            @Override
            public void focusLost(FocusEvent e) {
                field3.setBorder(new LineBorder(new Color(206, 212, 218),2));
                if (field3.getText().equals(""))
                {
                    field3.setText("Password *");
                }
                else
                {
                    field3.getText();
                }
            }
        });

        field4 = new JTextField("Confirm Password *");
        field4.setBounds(50,340,200,40);
        field4.setBorder(new LineBorder(new Color(206, 212, 218),2));
        panel2.add(field4);

        field4.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                field4.setText("");
                field4.setBorder(new LineBorder(new Color(15, 158, 234),3));
            }

            @Override
            public void focusLost(FocusEvent e) {
                field4.setBorder(new LineBorder(new Color(206, 212, 218),2));
                if (field4.getText().equals(""))
                {
                    field4.setText("Confirm Password *");
                }
                else
                {
                    field4.getText();
                }
            }
        });





        field5 = new JTextField("Your Email *");
        field5.setBounds(330,100,200,40);
        field5.setBorder(new LineBorder(new Color(206, 212, 218),2));
        panel2.add(field5);

        field5.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                field5.setText("");
                field5.setBorder(new LineBorder(new Color(15, 158, 234),3));
            }

            @Override
            public void focusLost(FocusEvent e) {
                field5.setBorder(new LineBorder(new Color(206, 212, 218),2));
                if (field5.getText().equals(""))
                {
                    field5.setText("Your Email ");
                }
                else
                {
                    field5.getText();
                }
            }
        });

        field6 = new JTextField("Your Phone *");
        field6.setBounds(330,180,200,40);
        field6.setBorder(new LineBorder(new Color(206, 212, 218),2));
        panel2.add(field6);

        field6.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                field6.setText("");
                field6.setBorder(new LineBorder(new Color(15, 158, 234),3));
            }

            @Override
            public void focusLost(FocusEvent e) {
                field6.setBorder(new LineBorder(new Color(206, 212, 218),2));
                if (field6.getText().equals(""))
                {
                    field6.setText("Your Phone *");
                }
                else
                {
                    field6.getText();
                }
            }
        });

        field7 = new JTextField("Please Select Your Security Question *");
        field7.setBounds(330,260,200,40);
        field7.setBorder(new LineBorder(new Color(206, 212, 218),2));
        panel2.add(field7);

        field7.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                field7.setText("");
                field7.setBorder(new LineBorder(new Color(15, 158, 234),3));
            }

            @Override
            public void focusLost(FocusEvent e) {
                field7.setBorder(new LineBorder(new Color(206, 212, 218),2));
                if (field7.getText().equals(""))
                {
                    field7.setText("Please Select Your Security Question *");
                }
                else
                {
                    field7.getText();
                }
            }
        });

        field8 = new JTextField("Enter Your Answer *");
        field8.setBounds(330,340,200,40);
        field8.setBorder(new LineBorder(new Color(206, 212, 218),2));
        panel2.add(field8);

        field8.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                field8.setText("");
                field8.setBorder(new LineBorder(new Color(15, 158, 234),3));
            }

            @Override
            public void focusLost(FocusEvent e) {
                field8.setBorder(new LineBorder(new Color(206, 212, 218),2));
                if (field8.getText().equals(""))
                {
                    field8.setText("Enter Your Answer *");
                }
                else
                {
                    field8.getText();
                }
            }
        });
        setVisible(true);
    }
}
