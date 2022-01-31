package TeamDebugger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URI;

public class LoginAdmin extends JFrame {

    JButton login,regi,doc,user;
    JPanel panel1,panel2,panel3;
    JTextField field1;
    JPasswordField field2;

    JLabel label1,label2,label3,label4,label5,label6;
    public LoginAdmin()
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



        panel3 = new JPanel();
        panel3.setBounds(360,15,220,30);
        panel3.setBackground(new Color(15, 158, 234));
        panel3.setLayout(null);
        panel2.add(panel3);

        user = new JButton("Customer");
        user.setBounds(10,2,110,25);
        user.setFocusable(false);
        user.setBackground(new Color(15, 158, 234));
//        doc.setForeground(new Color(15, 158, 234));
        panel3.add(user);

        user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LoginAsCustomer();
            }
        });

        doc = new JButton("Doctor");
        doc.setBounds(105,2,110,25);
        doc.setFocusable(false);
        doc.setBackground(new Color(15, 158, 234));
        panel3.add(doc);



        doc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LoginAsDoctor();
            }
        });


        //Font Section
        Font font1 = new Font("Mono",3,25);
        Font font2 = new Font("Mono",1,15);
        Font font3 = new Font("Times new Roman",1, 15);


        label1 = new JLabel("Login As a Admin");
        label1.setBounds(100,90,400,30);
        label1.setFont(font1);
        label1.setHorizontalAlignment(JLabel.CENTER);
        panel2.add(label1);


        label2 = new JLabel();
        label2.setBounds(20, 180, 200, 300);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("/home/sujoy/Desktop/code/Smart-MED/Files/Admin.jpeg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
        label2.setIcon(imageIcon);
        panel1.add(label2);


        label2 = new JLabel("User Name      :");
        label2.setBounds(100,180,200,40);
//        label2.setBorder(new LineBorder(new Color(206, 212, 218),2));
        label2.setFont(font2);
        panel2.add(label2);




        label3 = new JLabel("Password        :");
        label3.setBounds(100,280,200,40);
//        label2.setBorder(new LineBorder(new Color(206, 212, 218),2));
        label3.setFont(font2);
        panel2.add(label3);

        field1 = new JTextField("User Name *");
        field1.setBounds(250,180,250,40);
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

        field2 = new JPasswordField();
        field2.setBounds(250,280,250,40);
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
            }
        });



        login = new JButton("Login");
        login.setBounds(400,370,100,40);
        login.setBackground(new Color(2, 98, 204));
        login.setForeground(Color.WHITE);
        login.setFocusable(false);
        login.setFont(font3);
        panel2.add(login);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = field1.getText();
                String pass = String.valueOf(field2.getPassword());

                if (userName.equals("Sujoy") && pass.equals("1234")){
                    JOptionPane.showMessageDialog(null,"Login Successful");
                    dispose();
                    try {
                        final URI url = new URI("http://localhost/phpmyadmin/index.php?route=/database/structure&server=1&db=Smart_MED");
                        if(Desktop.isDesktopSupported()){
                        Desktop desktop = Desktop.getDesktop();
                        try{
                            desktop.browse(url);

                        }
                        catch (Exception ex){
                            System.out.println(ex);
                        }
                    }
                    else{
                        System.out.println("ERROR!");
                    }
                }catch (Exception ex){
                    System.out.println(ex);
                }
            }

            }
        });





       setVisible(true);
    }
}

