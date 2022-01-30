package TeamDebugger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetAppointment extends JFrame {

    JPanel panel1, panel2;
    JLabel title,title1,l1;
    JRadioButton btn1,btn2;
    JButton back,b1,b2,b3,b4,b5,b6;

    GetAppointment(){
        setSize(900,800);
        setDefaultCloseOperation(3);
        setLayout(null);
        setLocationRelativeTo(null);

        Font f = new Font("Mono",3,30);
        Font f1 = new Font("Mono",3,16);
        Font f2 = new Font("Times new Roman",1, 20);


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

        title = new JLabel("Get an Appointment");
        title.setBounds(100,40,400,30);
        title.setFont(f);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setForeground(Color.black);
        panel2.add(title);

        title1 = new JLabel("** Specialization available in the Hospital: ");
        title1.setBounds(40,90,420,30);
        title1.setFont(f1);
        title1.setHorizontalAlignment(JLabel.CENTER);
        title1.setForeground(Color.DARK_GRAY);
        panel2.add(title1);

        b1 = new JButton("Medicine ");
        b1.setBounds(80,180,170,30);
        b1.setFont(f2);
        b1.setFocusable(false);
        b1.setBackground(Color.blue);
        b1.setForeground(Color.WHITE);
        panel2.add(b1);

        b2 = new JButton("Cardiologist ");
        b2.setBounds(350,180,170,30);
        b2.setFont(f2);
        b2.setFocusable(false);
        b2.setBackground(Color.blue);
        b2.setForeground(Color.WHITE);
        panel2.add(b2);

        b3 = new JButton("Gynecologist ");
        b3.setBounds(80,230,170,30);
        b3.setFont(f2);
        b3.setFocusable(false);
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.WHITE);
        panel2.add(b3);

        b4 = new JButton("Neurologist ");
        b4.setBounds(350,230,170,30);
        b4.setFont(f2);
        b4.setFocusable(false);
        b4.setBackground(Color.BLUE);
        b4.setForeground(Color.WHITE);
        panel2.add(b4);


        b5 = new JButton("Dermatologist");
        b5.setBounds(80,280,170,30);
        b5.setFont(f2);
        b5.setFocusable(false);
        b5.setBackground(Color.BLUE);
        b5.setForeground(Color.WHITE);
        panel2.add(b5);


        b6 = new JButton("Psychiatrist");
        b6.setBounds(350,280,170,30);
        b6.setFont(f2);
        b6.setFocusable(false);
        b6.setBackground(Color.BLUE);
        b6.setForeground(Color.WHITE);
        panel2.add(b6);




        back = new JButton("back");

        back.setBounds(390,420,100,40);
        back.setBackground(Color.YELLOW);
        back.setFont(f2);
        back.setForeground(Color.BLACK);
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

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        b6.addActionListener(new ActionListener() {
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