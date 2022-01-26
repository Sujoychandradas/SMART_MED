package TeamDebugger;


import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

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
        field1.setBorder(new LineBorder(new Color(15, 158, 234),3));
        panel2.add(field1);

        field2 = new JTextField("Last Name *");
        field2.setBounds(50,170,200,40);
        field2.setBorder(new LineBorder(new Color(15, 158, 234),3));
        panel2.add(field2);

        setVisible(true);
    }
}
