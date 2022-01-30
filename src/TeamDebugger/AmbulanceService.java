package TeamDebugger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AmbulanceService extends JFrame{

    JPanel panel1,panel2;
    JLabel title, title1;
    JButton b1,b2,back;

    AmbulanceService(){

        setSize(700,550);
        setDefaultCloseOperation(3);
        setLayout(null);
        setLocationRelativeTo(null);

        Font f = new Font("Mono",3,30);
        Font f1 = new Font("Mono",3,20);
        Font f2 = new Font("Mono",3,15);

        panel1 = new JPanel();
        panel1.setBounds(0,0,900,700);
        panel1.setBackground(new Color(15, 158, 234));
        add(panel1);
        panel1.setLayout(null);


        panel2 = new JPanel();
        panel2.setBounds(165,100,500,350);
        panel2.setBackground(new Color(255, 255, 255));
        panel2.setLayout(null);
        panel1.add(panel2);

        title = new JLabel("Get Ambulance Service");
        title.setBounds(80,20,400,30);
        title.setFont(f);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setForeground(Color.black);
        panel2.add(title);

        title1 = new JLabel("** Ambulance  available in the Hospital: ");
        title1.setBounds(60,110,420,30);
        title1.setFont(f1);
        title1.setHorizontalAlignment(JLabel.CENTER);
        title1.setForeground(Color.DARK_GRAY);
        panel2.add(title1);

        b1 = new JButton("AC");
        b1.setBounds(80,180,170,30);
        b1.setFont(f1);
        b1.setFocusable(false);
        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.DARK_GRAY);
        panel2.add(b1);

        b2 = new JButton("Non-AC ");
        b2.setBounds(310,180,170,30);
        b2.setFont(f1);
        b2.setFocusable(false);
        b2.setBackground(Color.red);
        b2.setForeground(Color.WHITE);
        panel2.add(b2);

        back = new JButton("back");

        back.setBounds(370,280,80,30);
        back.setBackground(Color.blue);
        back.setForeground(Color.WHITE);
        back.setFont(f2);
        back.setFocusable(false);
        panel2.add(back);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();

            }
        });













        setVisible(true);



    }
}