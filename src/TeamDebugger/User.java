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
    JTextField field1,field2,field3,field4,field5;
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
        panel2.setBounds(250,100,650,500);
        panel2.setBackground(new Color(255, 255, 255));
        panel2.setLayout(null);
        panel1.add(panel2);

        field1 = new JTextField("First Name *");
        field1.setBounds(50,100,200,40);
        field1.setBorder(new LineBorder(new Color(206, 212, 218),2));
        panel2.add(field1);

        field1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                field1.setText("");
                field1.setBorder(new LineBorder(new Color(15, 158, 234),3));
            }

            @Override
            public void focusLost(FocusEvent e) {
                field1.setBorder(new LineBorder(new Color(206, 212, 218),2));

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

            }
        });

        field4 = new JTextField("Confirm Password *");
        field4.setBounds(50,340,200,40);
        field4.setBorder(new LineBorder(new Color(206, 212, 218),2));
        panel2.add(field4);
//        field4.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                field4.setText("");
//                field4.setBorder(new LineBorder(new Color(15, 158, 234),3));
//            }
//        });
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
        setVisible(true);
    }
}
