package TeamDebugger;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {

    JPanel panel1, panel2, panel3;
    JLabel title,title1, label2,label3,label4;
    JButton b1,b2,b3,b4,b5,b6,back;


    public Menu()
    {
        setSize(900,710);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);
//        setBackground(new Color(15, 158, 234));
//        setPreferredSize(new Dimension(300,400));

        //Font Section
        Font font1 = new Font("Mono",3,25);
        Font font2 = new Font("Mono",1,15);
        Font font3 = new Font("Times new Roman",1, 22);
        Font font4 = new Font("Mono",1,15);


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


        panel3 = new JPanel();
        panel3.setBounds(0,0,600,100);
        panel3.setBackground(Color.ORANGE);
        panel3.setLayout(null);
        panel2.add(panel3);

        label2 = new JLabel();
        label2.setBounds(80, 300, 100, 100);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("/home/sujoy/Desktop/code/Smart-MED/Files/menu.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        label2.setIcon(imageIcon);
        panel1.add(label2);







//        title = new JLabel("Menu");
//        title.setBounds(100,20,400,30);
//        title.setFont(font1);
//        title.setHorizontalAlignment(JLabel.CENTER);
//        title.setForeground(Color.black);
//        panel2.add(title);

        title1 = new JLabel("Our Services");
        title1.setBounds(150,20,350,60);
        title1.setFont(font3);
        title1.setHorizontalAlignment(JLabel.CENTER);
        title1.setForeground(Color.DARK_GRAY);
        panel3.add(title1);

        b1 = new JButton("DoctorList");
        b2 = new JButton("Appointment");
        b3 = new JButton("Ambulance");
        b4 = new JButton("Logout");



        b1.setBounds(200,180,200,30);
        b1.setFont(font4);
        b1.setHorizontalAlignment(JButton.CENTER);
        b1.setFocusable(false);
        b1.setBackground(Color.blue);
        b1.setForeground(Color.WHITE);
        panel2.add(b1);


        b2.setBounds(200,230,200,30);
        b2.setFont(font4);
        b2.setFocusable(false);
        b2.setBackground(Color.blue);
        b2.setForeground(Color.WHITE);
        panel2.add(b2);


        b3.setBounds(200,280,200,30);
        b3.setFont(font4);
        b3.setFocusable(false);
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.WHITE);
        panel2.add(b3);


        b4.setBounds(200,330,200,30);
        b4.setFont(font4);
        b4.setFocusable(false);
        b4.setBackground(Color.BLUE);
        b4.setForeground(Color.WHITE);
        panel2.add(b4);






        //Doctorlist
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new DoctorList();

            }
        });
        //getAppointment
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new GetAppointment();

            }
        });
        //getAmbulance

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new AmbulanceService();
            }
        });
        //logout

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LoginAsCustomer();
            }
        });










        setVisible(true);
    }
}


