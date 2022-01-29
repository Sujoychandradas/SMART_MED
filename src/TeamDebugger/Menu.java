package TeamDebugger;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {

    JButton login,regi,doc,user;
    JPanel panel1,panel2,panel3;
    JTextField field1;
    JPasswordField field2;

    JLabel label1,label2,label3,label4,label5,label6;
    public Menu()
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


        //Font Section
        Font font1 = new Font("Mono",3,25);
        Font font2 = new Font("Mono",1,15);
        Font font3 = new Font("Times new Roman",1, 15);


        setVisible(true);
    }
}


