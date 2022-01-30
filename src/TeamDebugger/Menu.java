package TeamDebugger;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static java.awt.FlowLayout.LEFT;

public class Menu extends JFrame {

    JButton login,regi,doc,user;
    JPanel panel1,panel2,panel3;
    JTextField field1;
    JPasswordField field2;
//    Container cnt  = this.getContentPane();
    JTable table;

    DefaultTableModel model = new DefaultTableModel();

    JLabel label1,label2,label3,label4,label5,label6;
    public Menu()
    {
        setSize(1000,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
//        setLayout(null);
        table = new JTable(model);

//        cnt.setLayout(new FlowLayout(LEFT));
//        setBackground(new Color(15, 158, 234));
//        setPreferredSize(new Dimension(300,400));

        model.addColumn("Doctor ID");
        model.addColumn("Doctor Name");
        model.addColumn("Mobile");
        model.addColumn("City");
        model.addColumn("Age");
        model.addColumn("Gender");
        model.addColumn("Visiting Time");
        model.addColumn("Visiting Day");
        model.addColumn("Specialist");

//        panel1 = new JPanel();
//        panel1.setBounds(0,0,900,700);
//        panel1.setBackground(new Color(15, 158, 234));
//        add(panel1);
//        panel1.setLayout(null);


//        panel2 = new JPanel();
//        panel2.setBounds(250,100,600,500);
//        panel2.setBackground(new Color(255, 255, 255));
////        panel2.setLayout(null);
//        panel1.add(panel2);



        //Font Section
        Font font1 = new Font("Mono",3,25);
        Font font2 = new Font("Mono",1,15);
        Font font3 = new Font("Times new Roman",1, 15);

        table.setFont(font3);


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Smart_MED", "root", "");
            PreparedStatement psm = con.prepareStatement("SELECT * FROM Cardiologist");

            ResultSet rs = psm.executeQuery();

            while (rs.next())
            {
                model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),
                rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)});
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }



        JScrollPane sp = new JScrollPane(table);
//        panel2.add(sp);

        add(sp);


        setVisible(true);
    }
}


