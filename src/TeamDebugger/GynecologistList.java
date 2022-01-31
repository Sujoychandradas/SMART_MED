package TeamDebugger;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class GynecologistList extends JFrame {

    JButton login,regi,doc,user;
    JPanel panel1,panel2,panel3;
    JTextField field1;
    JPasswordField field2;
    //    Container cnt  = this.getContentPane();
    JTable table;



    DefaultTableModel model = new DefaultTableModel();

    JLabel label1,label2,label3,label4,label5,label6;
    public GynecologistList()
    {
        setSize(1000,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);
        table = new JTable(model);
        table.setFillsViewportHeight(true);


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

        panel1 = new JPanel();
        panel1.setBounds(0,0,1000,100);
        panel1.setBackground(new Color(15, 158, 234));
        panel1.setLayout(null);
        add(panel1);

        panel2 = new JPanel(new BorderLayout());
        panel2.setBounds(0,100,1000,600);
        panel2.setBackground(new Color(255, 255, 255));
//        panel2.setLayout(new FlowLayout(LEFT));
        add(panel2);
//        panel2.setLayout(null);


        JButton button = new JButton("Back");
        button.setBounds(450,300,100,30);
        button.setFocusable(false);
        panel2.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new DoctorList();
            }
        });

        JTable table = new JTable(model);
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer)table.getDefaultRenderer(Object.class);
        renderer.setHorizontalAlignment( SwingConstants.CENTER );

        //Font Section
        Font font1 = new Font("Mono",3,25);
        Font font2 = new Font("Mono",1,15);
        Font font3 = new Font("Times new Roman",1, 15);
        Font font4 = new Font("Mono",1,25);

        label1 = new JLabel("GYNECOLOGIST");
        label1.setBounds(410,20,300,50);
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setFont(font4);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setFont(font3);
        tableHeader.setBackground(Color.green);

        table.setFont(font3);


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Smart_MED", "root", "");
            PreparedStatement psm = con.prepareStatement("SELECT * FROM Gynecologist");

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
//        sp.setBounds(10,10,800,280);

        panel2.add(sp,BorderLayout.CENTER);
//        panel1.add(sp);

//        add(sp);


        setVisible(true);
    }


}

