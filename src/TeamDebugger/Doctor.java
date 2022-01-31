package TeamDebugger;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;

public class Doctor extends JFrame {

    JButton login, regi, doc, user;
    JPanel panel1, panel2, panel3;
    JTextField field1, field2, field3, field4, field5, field6, field7;
    JComboBox box1;

    JRadioButton button1, button2;
    JLabel label1, label2, label3, label4, label5, label6;

    public Doctor() {
        setSize(900, 710);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);
//        setBackground(new Color(15, 158, 234));
//        setPreferredSize(new Dimension(300,400));

        panel1 = new JPanel();
        panel1.setBounds(0, 0, 900, 700);
        panel1.setBackground(new Color(15, 158, 234));
        add(panel1);
        panel1.setLayout(null);


        panel2 = new JPanel();
        panel2.setBounds(250, 100, 600, 500);
        panel2.setBackground(new Color(255, 255, 255));
        panel2.setLayout(null);
        panel1.add(panel2);


        panel3 = new JPanel();
        panel3.setBounds(360, 15, 220, 30);
        panel3.setBackground(new Color(15, 158, 234));
        panel3.setLayout(null);
        panel2.add(panel3);

        user = new JButton("Customer");
        user.setBounds(10, 2, 110, 25);
        user.setFocusable(false);
        user.setBackground(new Color(15, 158, 234));
//        doc.setForeground(new Color(15, 158, 234));
        panel3.add(user);

        user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new User();
            }
        });

        doc = new JButton("Doctor");
        doc.setBounds(105, 2, 110, 25);
        doc.setFocusable(false);
        doc.setBackground(new Color(255, 255, 255));
        panel3.add(doc);


        //Font Section
        Font font1 = new Font("Mono", 3, 20);
        Font font2 = new Font("Mono", 1, 15);
        Font font3 = new Font("Times new Roman", 1, 15);


        label1 = new JLabel("Apply As a Doctor");
        label1.setBounds(100, 60, 400, 30);
        label1.setFont(font1);
        label1.setHorizontalAlignment(JLabel.CENTER);
        panel2.add(label1);


        field1 = new JTextField("User Name *");
        field1.setBounds(50, 120, 200, 40);
        field1.setBorder(new LineBorder(new Color(206, 212, 218), 2));
        field1.setFont(font2);
        panel2.add(field1);

        field1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                field1.setText("");
                field1.setBorder(new LineBorder(new Color(15, 158, 234), 3));
            }

            @Override
            public void focusLost(FocusEvent e) {
                field1.setBorder(new LineBorder(new Color(206, 212, 218), 2));
                if (field1.getText().equals("")) {
                    field1.setText("User Name *");
                } else {
                    field1.getText();
                }
            }
        });

        field2 = new JTextField("Full Name *");
        field2.setBounds(50, 200, 200, 40);
        field2.setFont(font2);
        field2.setBorder(new LineBorder(new Color(206, 212, 218), 2));
        panel2.add(field2);

        field2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                field2.setText("");
                field2.setBorder(new LineBorder(new Color(15, 158, 234), 3));
            }

            @Override
            public void focusLost(FocusEvent e) {
                field2.setBorder(new LineBorder(new Color(206, 212, 218), 2));
                if (field2.getText().equals("")) {
                    field2.setText("Full Name *");
                } else {
                    field2.getText();
                }
            }
        });

        field3 = new JTextField("Email *");
        field3.setBounds(50, 280, 200, 40);
        field3.setFont(font2);
        field3.setBorder(new LineBorder(new Color(206, 212, 218), 2));
        panel2.add(field3);

        field3.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                field3.setText("");
                field3.setBorder(new LineBorder(new Color(15, 158, 234), 3));
            }

            @Override
            public void focusLost(FocusEvent e) {
                field3.setBorder(new LineBorder(new Color(206, 212, 218), 2));
                if (field3.getText().equals("")) {
                    field3.setText("Email *");
                } else {
                    field3.getText();
                }
            }
        });

        field4 = new JTextField("Phone *");
        field4.setBounds(50, 360, 200, 40);
        field4.setFont(font2);
        field4.setBorder(new LineBorder(new Color(206, 212, 218), 2));
        panel2.add(field4);

        field4.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                field4.setText("");
                field4.setBorder(new LineBorder(new Color(15, 158, 234), 3));
            }

            @Override
            public void focusLost(FocusEvent e) {
                field4.setBorder(new LineBorder(new Color(206, 212, 218), 2));
                if (field4.getText().equals("")) {
                    field4.setText("Phone *");
                } else {
                    field4.getText();
                }
            }
        });


        field5 = new JTextField("Password *");
        field5.setBounds(330, 120, 200, 40);
        field5.setFont(font2);
        field5.setBorder(new LineBorder(new Color(206, 212, 218), 2));
        panel2.add(field5);

        field5.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                field5.setText("");
                field5.setBorder(new LineBorder(new Color(15, 158, 234), 3));
            }

            @Override
            public void focusLost(FocusEvent e) {
                field5.setBorder(new LineBorder(new Color(206, 212, 218), 2));
                if (field5.getText().equals("")) {
                    field5.setText("Password *");
                } else {
                    field5.getText();
                }
            }
        });

        field6 = new JTextField("Confirm Password *");
        field6.setBounds(330, 200, 200, 40);
        field6.setFont(font2);
        field6.setBorder(new LineBorder(new Color(206, 212, 218), 2));
        panel2.add(field6);

        field6.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                field6.setText("");
                field6.setBorder(new LineBorder(new Color(15, 158, 234), 3));
            }

            @Override
            public void focusLost(FocusEvent e) {
                field6.setBorder(new LineBorder(new Color(206, 212, 218), 2));
                if (field6.getText().equals("")) {
                    field6.setText("Confirm Password *");
                } else {
                    field6.getText();
                }
            }
        });

//        field7 = new JTextField("Please Select Your Security Question *");
//        field7.setBounds(330,260,200,40);
//        field7.setBorder(new LineBorder(new Color(206, 212, 218),2));
//        panel2.add(field7);
//
//        field7.addFocusListener(new FocusListener() {
//            @Override
//            public void focusGained(FocusEvent e) {
//                field7.setText("");
//                field7.setBorder(new LineBorder(new Color(15, 158, 234),3));
//            }
//
//            @Override
//            public void focusLost(FocusEvent e) {
//                field7.setBorder(new LineBorder(new Color(206, 212, 218),2));
//                if (field7.getText().equals(""))
//                {
//                    field7.setText("Please Select Your Security Question *");
//                }
//                else
//                {
//                    field7.getText();
//                }
//            }
//        });

        String type[] = {"Medicine", "Cardiologists", "Gastroenterologists", "Psychiatrists", "Neurologists", "Dermatologists"};
        box1 = new JComboBox(type);
        box1.setRenderer(new MyComboBoxRenderer("Specialist"));
        box1.setFont(font2);
        box1.setSelectedIndex(-1);

        box1.setBorder(new LineBorder(new Color(206, 212, 218), 2));
        //box1.setBounds(330,260,200,40);
        box1.setBounds(330, 360, 200, 40);
        box1.setBackground(Color.WHITE);
        panel2.add(box1);

        box1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                box1.setBorder(new LineBorder(new Color(15, 158, 234), 3));
            }

            @Override
            public void focusLost(FocusEvent e) {
                box1.setBorder(new LineBorder(new Color(206, 212, 218), 2));
            }
        });

        field7 = new JTextField("Age *");
        field7.setBounds(330, 280, 200, 40);
        field7.setFont(font2);
        field7.setBorder(new LineBorder(new Color(206, 212, 218), 2));
        panel2.add(field7);

        field7.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                field7.setText("");
                field7.setBorder(new LineBorder(new Color(15, 158, 234), 3));
            }

            @Override
            public void focusLost(FocusEvent e) {
                field7.setBorder(new LineBorder(new Color(206, 212, 218), 2));
                if (field7.getText().equals("")) {
                    field7.setText("Age *");
                } else {
                    field7.getText();
                }
            }
        });

        button1 = new JRadioButton("Male");
        button1.setBounds(50, 420, 100, 40);
        button1.setBackground(Color.WHITE);
        button1.setFont(font2);
        button1.setFocusable(false);
        panel2.add(button1);


        button2 = new JRadioButton("Female");
        button2.setBounds(150, 420, 200, 40);
        button2.setFont(font2);
        button2.setBackground(Color.WHITE);
        button2.setFocusable(false);
        panel2.add(button2);

        ButtonGroup button3 = new ButtonGroup();
        button3.add(button1);
        button3.add(button2);


        label2 = new JLabel();
        label2.setBounds(80, 150, 100, 100);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("/home/sujoy/Desktop/code/Smart-MED/Files/Welcome.jpeg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        label2.setIcon(imageIcon);
        panel1.add(label2);

        Font font4 = new Font("inherit", 3, 25);
        label3 = new JLabel("Welcome");
        label3.setFont(font4);
        label3.setBounds(65, 250, 150, 50);
        label3.setForeground(Color.WHITE);
        panel1.add(label3);


        Font font5 = new Font("inherit", 1, 15);
        label4 = new JLabel("<html><pre><br>    You are 30 seconds <br><br> away from register here.<br><br>       Good Luck! </pre></html>");
        label4.setBounds(20, 300, 250, 100);
        label4.setForeground(Color.WHITE);
        label4.setFont(font5);
        panel1.add(label4);


        login = new JButton("Login");
        login.setBounds(70, 520, 100, 40);
        login.setFont(font3);
        login.setFocusable(false);
        login.setBackground(Color.WHITE);
        panel1.add(login);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LoginAsDoctor();
            }
        });

        regi = new JButton("Apply");
        regi.setBounds(430, 420, 100, 40);
        regi.setBackground(new Color(2, 98, 204));
        regi.setFont(font3);
        regi.setFocusable(false);
        regi.setForeground(Color.WHITE);
        panel2.add(regi);

        regi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = field1.getText();
                String fullName = field2.getText();
                String email = field3.getText();
                String phone = field4.getText();
                String Pass = field5.getText();
                String conPass = field6.getText();
                String age = field7.getText();
                String gender = null;

                // System.out.println(email);

                String nameRegex = "^[a-zA-Z0-9.]+$";
                String emailRegex = "^[a-z0-9]+@[a-z]+.[a-z]+$";
                String mobileRegex = "(\\+88)?-?01[3-9]\\d{8}";
                String passRegex = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$$%&*()]).{6,20}";
                String ageRegex = "^\\S[0-3]{0,2}$";

                if(button1.isSelected())
                {
                    gender = "Male";
                }else if(button2.isSelected())
                {
                    gender = "Female";
                }

                if (!Pattern.matches(nameRegex, userName)) {
                    JOptionPane.showMessageDialog(null, "Only use character and number!!");
                } else if (!Pattern.matches(emailRegex, email)) {
                    JOptionPane.showMessageDialog(null, "Invalid Data!!");
                } else if (!Pattern.matches(passRegex, Pass)) {
                    JOptionPane.showMessageDialog(null, "Invalid pass!!,1 digit,1lower,1 upper,1 special char,length 6-20");
                } else if (!conPass.equals(Pass)) {
                    JOptionPane.showMessageDialog(null, "pass And conPass are not same!!");
                } else if (!Pattern.matches(mobileRegex, phone)) {
                    JOptionPane.showMessageDialog(null, "Invalid phone no!!");
                } else if (!Pattern.matches(ageRegex, age)) {
                    JOptionPane.showMessageDialog(null, "Please Insert valid age!!");
                } else {
                    ConnectionProvider db = new ConnectionProvider();
                    String queryInsert = "INSERT INTO `DoctorReg`(`Username`, `Fullname`, `Email`, `Phone`, `Password`, `Age`, `Gender`) VALUES ('"+userName+"','"+fullName+"','"+email+"','"+phone+"','"+Pass+"','"+age+"','"+gender+"')";
                    db.RegisterDoc(queryInsert);
                }

            }
        });

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