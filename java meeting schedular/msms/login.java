
package msms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class login implements ActionListener 
{
    JFrame f;
    JLabel l1 ,l2,l3,l4;
    JTextField t1;
    JPasswordField t2;
    JButton b,b1;
    public login()
    {
       
        f = new JFrame("MEETING SCHEDULER MANAGEMENT SYSYEM");
        l1 = new JLabel("username");
        l2 = new JLabel("password");
        t1 = new JTextField();
        t2 = new JPasswordField();
        b = new JButton("Login");
        b1 = new JButton("Back");
       
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("msms\\icon\\2.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l3 = new JLabel(i3);
        l3.setBounds(200,20,100,100);
        f.add(l3);
        
        
        
        l1.setBackground(Color.white);
        l1.setBounds(65,145,100,30);
        l1.setFont(new Font("serif",Font.BOLD,20));
        f.add(l1);
        l2.setBounds(65,245,100,30);
        l2.setFont(new Font("serif",Font.BOLD,20));
        f.add(l2);
        t1.setBounds(160,150,200,25);
        f.add(t1);
        t2.setBounds(160,250,200,25);
        f.add(t2);
        
        b.setBounds(100,350,120,50);
        b.setFont(new Font("serif",Font.BOLD,15));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.addActionListener(this);
        f.add(b);
        
        b1.setBounds(230,350,120,50);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        f.add(b1);
        
        
        
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("msms\\icon\\11.jpg"));
        Image i5 = i4.getImage().getScaledInstance(500,500, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l4 = new JLabel(i6);
        l4.setBounds(0,0,500,500);
        f.add(l4);
        
      
        f.setBackground(Color.WHITE);
        f.setLayout(null);
        f.setSize(500,500);
        f.setLocation(600,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    
    public void actionPerformed(ActionEvent ae){

        try{
            conn c1 = new conn();
            String u = t1.getText();
            String v = t2.getText();
           
            
           
            ResultSet rs = c1.s.executeQuery("select * from login where username='"+u+"' and password='"+v+"'");
           
            if(rs.next())
            {
            new details().f.setVisible(true);
            f.setVisible(false);
            }
            if(ae.getSource()==b1)
            {
                f.setVisible(false);
                new  Msms();
            }
           
        else
        {
            //JOptionPane.showMessageDialog(null, "wrong entry");
            f.setDefaultCloseOperation(JFrame.ABORT);
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    public static void main(String[] arg){
        login l = new login();
    }
}
      