package TeamDebugger;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Bkash extends JFrame {

    JPanel panel1,panel2,panel3;
    JLabel label1,label2,label3,label4,label5,label6;
    JTextField field1,field2;
    JCheckBox box1;
    JButton processed,closed;
    public Bkash()
    {
        setSize(400,500);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(3);

        Font font1 = new Font("Mono",3,25);
        Font font2 = new Font("Mono",1,20);
        Font font3 = new Font("Times new Roman",1, 20);
        Font font4 = new Font("Times new Roman",1, 18);
        Font font5 = new Font("Times new Roman",1, 13);
        Font font6 = new Font("arial",Font.PLAIN,15);

        panel1 = new JPanel();
        panel1.setBounds(0,0,400,100);
        panel1.setBackground(new Color(226, 20, 111));
        panel1.setLayout(null);
        add(panel1);

        panel2 = new JPanel();
        panel2.setBounds(0,105,400,400);
        panel2.setBackground(new Color(226, 20, 111));
        panel2.setLayout(null);
        add(panel2);


        label1 = new JLabel("<html><pre>Merchant: SMART-MED</pre></html>");
        label1.setForeground(Color.WHITE);
        label1.setBounds(80,40,250,50);
        label1.setFont(font3);
        panel2.add(label1);

        label2 = new JLabel("<html><pre>  Amount: BDT</pre><html>");
        label2.setForeground(Color.WHITE);
        label2.setBounds(100,80,200,50);
        label2.setFont(font3);
        panel2.add(label2);

        field1 = new JTextField("500");
        field1.setForeground(Color.WHITE);
        field1.setBounds(270,80,30,50);
        field1.setEditable(false);
        field1.setBackground(new Color(226, 20, 111));
        field1.setBorder(null);
        field1.setFont(font3);
        panel2.add(field1);


        label2 = new JLabel("<html><pre>Your Bkash account number</pre> </htm>");
        label2.setBounds(60,150,300,30);
        label2.setFont(font4);
        label2.setForeground(Color.WHITE);
        panel2.add(label2);


        field2 = new JTextField("e.g 01XXXXXXXXX");
        field2.setHorizontalAlignment(JTextField.CENTER);
        field2.setBounds(100,190,200,30);
        field2.setFont(font6);
        field2.setBackground(Color.WHITE);
        field2.setBorder(new LineBorder(new Color(206, 212, 218), 2));
        panel2.add(field2);

        field2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent focusEvent) {
                field2.setText("");
            }

            @Override
            public void focusLost(FocusEvent focusEvent) {
                field2.setText("e.g 01XXXXXXXXX");
            }
        });

        box1 = new JCheckBox("<html><pre>I agree to the <u>terms and conditions</u>");
        box1.setBounds(40,240,330,30);
        box1.setForeground(Color.WHITE);
        box1.setBackground(new Color(226, 20, 111));
        box1.setFocusable(false);
        box1.setFont(font5);
        panel2.add(box1);



        processed = new JButton("PROCEED");
        processed.setBounds(50,290,140,30);
        processed.setBackground(new Color(226 , 20, 111));
        processed.setForeground(Color.WHITE);
        processed.setFocusable(false);
        processed.setFont(font5);
        panel2.add(processed);

        processed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(box1.isSelected())
                {
                    JOptionPane.showMessageDialog(null,"Payment Successful, Please Check Your Phone for Confirmation.");
                    dispose();
                    new Menu();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Please Select our terms and Conditions.");
                }
            }
        });

        closed = new JButton("CLOSE");
        closed.setBounds(220,290,140,30);
        closed.setBackground(new Color(226 , 20, 111));
        closed.setFont(font5);
        closed.setForeground(Color.WHITE);
        closed.setFocusable(false);
        panel2.add(closed);

        closed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Menu();
            }
        });

        label3 = new JLabel();
        label3.setBounds(10, 10, 380, 80);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("/home/sujoy/Desktop/code/Smart-MED/Files/bkash_payment_logo.png").getImage().getScaledInstance(380, 80, Image.SCALE_DEFAULT));
        label3.setIcon(imageIcon);
        panel1.add(label3);


        setVisible(true);

    }
}
