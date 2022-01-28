package TeamDebugger;


import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class User extends JFrame {

    JButton login,regi,doc,user;
    JPanel panel1,panel2,panel3;
    JTextField field1,field2,field3,field4,field5,field6,field7,field8;
    JComboBox box1;

    JRadioButton button1, button2;
    JLabel label1,label2,label3,label4,label5,label6;
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
        panel1.setLayout(null);
        add(panel1);



        panel2 = new JPanel();
        panel2.setBounds(250,100,600,500);
        panel2.setBackground(new Color(255, 255, 255));
        panel2.setLayout(null);
        panel1.add(panel2);



        panel3 = new JPanel();
        panel3.setBounds(360,15,220,30);
        panel3.setBackground(new Color(15, 158, 234));
        panel3.setLayout(null);
        panel2.add(panel3);

        user = new JButton("Customer");
        user.setBounds(10,2,110,25);
        user.setFocusable(false);
        user.setBackground(new Color(255, 255, 255));
//        user.setBackground(new Color(15, 158, 234));;
        panel3.add(user);


        doc = new JButton("Doctor");
        doc.setBounds(100,2,110,25);
        doc.setFocusable(false);
        doc.setBackground(new Color(15, 158, 234));;
        panel3.add(doc);

        doc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Doctor();
            }
        });



        //Font Section
        Font font1 = new Font("Mono",3,20);
        Font font2 = new Font("Mono",1,15);
        Font font3 = new Font("Times new Roman",1, 15);


        label1 = new JLabel("Register As a Customer");
        label1.setBounds(100,60,400,30);
        label1.setFont(font1);
        label1.setHorizontalAlignment(JLabel.CENTER);
        panel2.add(label1);


        field1 = new JTextField("User Name *");
        field1.setBounds(50,120,200,40);
        field1.setBorder(new LineBorder(new Color(206, 212, 218),2));
        field1.setFont(font2);
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
                if (field1.getText().equals(""))
                {
                    field1.setText("User Name *");
                }
                else
                {
                    field1.getText();
                }
            }
        });

        field2 = new JTextField("First Name *");
        field2.setBounds(50,200,200,40);
        field2.setFont(font2);
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
                    field2.setText("First Name *");
                }
                else
                {
                    field2.getText();
                }
            }
        });

        field3 = new JTextField("Last Name *");
        field3.setBounds(50,280,200,40);
        field3.setFont(font2);
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
                    field3.setText("Last Name *");
                }
                else
                {
                    field3.getText();
                }
            }
        });

        field4 = new JTextField("Email *");
        field4.setBounds(50,360,200,40);
        field4.setFont(font2);
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
                    field4.setText("Email *");
                }
                else
                {
                    field4.getText();
                }
            }
        });





        field5 = new JTextField("Phone *");
        field5.setBounds(330,120,200,40);
        field5.setFont(font2);
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
                    field5.setText("Phone *");
                }
                else
                {
                    field5.getText();
                }
            }
        });

        field6 = new JTextField("Password *");
        field6.setBounds(330,200,200,40);
        field6.setFont(font2);
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
                    field6.setText("Password *");
                }
                else
                {
                    field6.getText();
                }
            }
        });

        field8 = new JTextField("Confirm Password *");
        field8.setBounds(330,280,200,40);
        field8.setFont(font2);
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
                    field8.setText("Confirm Password *");
                }
                else
                {
                    field8.getText();
                }
            }
        });

        field7 = new JTextField("Age *");
        field7.setBounds(330,360,200,40);
        field7.setBorder(new LineBorder(new Color(206, 212, 218),2));
        field7.setFont(font2);
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
                    field7.setText("Age *");
                }
                else
                {
                    field7.getText();
                }
            }
        });

//        String type[] = {"Medicine","Cardiologists","Gastroenterologists","Psychiatrists","Neurologists","Dermatologists"};
//        box1 = new JComboBox(type);
//        box1.setRenderer(new MyComboBoxRenderer("Specialist"));
//        box1.setFont(font2);
//        box1.setSelectedIndex(-1);
//
//        box1.setBorder(new LineBorder(new Color(206, 212, 218),2));
//        //box1.setBounds(330,260,200,40);
//        box1.setBounds(330,360,200,40);
//        box1.setBackground(Color.WHITE);
//        panel2.add(box1);
//
//        box1.addFocusListener(new FocusListener() {
//            @Override
//            public void focusGained(FocusEvent e) {
//
//                box1.setBorder(new LineBorder(new Color(15, 158, 234),3));
//            }
//
//            @Override
//            public void focusLost(FocusEvent e) {
//                box1.setBorder(new LineBorder(new Color(206, 212, 218),2));
//            }
//        });



        button1 = new JRadioButton("Male");
        button1.setBounds(50,420,100,40);
        button1.setBackground(Color.WHITE);
        button1.setFont(font2);
        button1.setFocusable(false);
        panel2.add(button1);


        button2 = new JRadioButton("Female");
        button2.setBounds(150,420,200,40);
        button2.setFont(font2);
        button2.setBackground(Color.WHITE);
        button2.setFocusable(false);
        panel2.add(button2);




        label2 = new JLabel();
        label2.setBounds(80,150,100,100);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("/home/sujoy/Documents/EEE  ANS/chapter-4/WhatsApp Image 2022-01-27 at 3.01.10 PM.jpeg").getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
        label2.setIcon(imageIcon);
        panel1.add(label2);

        Font font4 = new Font("inherit",3,25);
        label3 = new JLabel("Welcome");
        label3.setFont(font4);
        label3.setBounds(65,250,150,50);
        label3.setForeground(Color.WHITE);
        panel1.add(label3);


        Font font5 = new Font("inherit",1,15);
        label4 = new JLabel("<html><pre><br>    You are 30 seconds <br><br> away from register here.<br><br>       Good Luck! </pre></html>");
        label4.setBounds(20,300,250,100);
        label4.setForeground(Color.WHITE);
        label4.setFont(font5);
        panel1.add(label4);


        login = new JButton("Login");
        login.setBounds(70,520,100,40);
        login.setFont(font3);
        login.setFocusable(false);
        login.setBackground(Color.WHITE);
        panel1.add(login);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LoginAsCustomer();
            }
        });

        regi = new JButton("Register");
        regi.setBounds(430,420,100,40);
        regi.setBackground(new Color(2, 98, 204));
        regi.setFont(font3);
        regi.setFocusable(false);
        regi.setForeground(Color.WHITE);
        panel2.add(regi);


        setVisible(true);
    }


    class MyComboBoxRenderer extends JLabel implements ListCellRenderer {
        private String _title;

        public MyComboBoxRenderer(String title) {
            _title = title;
        }

        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean hasFocus) {
            if (index == -1 && value == null)
                setText(_title);
            else
                setText(value.toString());
            return this;
        }
    }
}
