
package msms;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;




public class signup  implements ActionListener
{
    
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField t1,t4,t3,t5,t6,t7;
    JPasswordField t2;
    JButton b,b1;
    Choice z;
    
    public signup()
    {
       
        f = new JFrame("MEETING SCHEDULER MANAGEMENT SYSYEM");
        l1 = new JLabel("User Name");
        l2 = new JLabel("Full name");
        l5 = new JLabel("Password");
        l6 = new JLabel("Birth Date");
        l7 = new JLabel("Gender");
        l8 =new JLabel("Mobile No.");
        l9 =new JLabel("Adderess");
        
        
        
        
        t1 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();
        t7 = new JTextField();
        t2 = new JPasswordField();
        b = new JButton("Next");
        b1 =new JButton("Back");
        z = new Choice();
        z.add("male");
        z.add("female");
        
        z.setBounds(250,545,200,30);
        z.setFont(new Font("serif",Font.BOLD,25));
        z.setBackground(Color.BLACK);
        z.setForeground(Color.WHITE);
        f.add(z);
        
      
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("msms\\icon\\2.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l3 = new JLabel(i3);
        l3.setBounds(500,20,100,100);
        f.add(l3);
        
        
        l1.setForeground(Color.BLACK);
        l1.setBounds(80,145,200,30);
        l1.setFont(new Font("serif",Font.BOLD,25));
        f.add(l1);
        l2.setBounds(80,245,200,30);
        l2.setFont(new Font("serif",Font.BOLD,25));
        f.add(l2);
        t1.setBounds(250,145,200,30);
        t1.setFont(new Font("serif",Font.BOLD,20));
        f.add(t1);
        t3.setBounds(250,245,200,30);
        t3.setFont(new Font("serif",Font.BOLD,20));
        f.add(t3);
        
        l5.setBounds(80,345,200,30);
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("serif",Font.BOLD,25));
        f.add(l5);
        t2.setBounds(250,345,200,30);
        f.add(t2);
          
        l6.setBounds(80,445,200,30);
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("serif",Font.BOLD,25));
        f.add(l6);
        t4.setBounds(250,445,200,25);
        t4.setFont(new Font("serif",Font.BOLD,20));
        f.add(t4);
          
        l7.setBounds(80,545,200,30);
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("serif",Font.BOLD,25));
        f.add(l7);
        
        
        l8.setBounds(550,145,300,30);
        l8.setFont(new Font("serif",Font.BOLD,25));      
        l9.setForeground(Color.BLACK);
        f.add(l8);
        t6.setBounds(700,145,200,30);
        f.add(t6);
        
        l9.setBounds(550,245,300,30);
        l9.setFont(new Font("serif",Font.BOLD,25));       
        l9.setForeground(Color.BLACK);
        f.add(l9);
        t7.setBounds(700,245,400,50);
        t7.setFont(new Font("serif",Font.BOLD,20));
        f.add(t7);
        
        b.setBounds(750,545,300,45);
        b.setFont(new Font("serif",Font.BOLD,30));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.addActionListener(this);
        f.add(b);
        b1.setBounds(750,645,300,45);
        b1.setFont(new Font("serif",Font.BOLD,30));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        f.add(b1);
        
        
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("msms\\icon\\11.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1200,900 , Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l4 = new JLabel(i6);
        l4.setBounds(0,0,1200,900);
        f.add(l4);
        
       
        f.setBackground(Color.WHITE);
        f.setLayout(null);
        f.setSize(1200,800);
        f.setResizable(false);
        f.setLocation(400,100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
 
    
    public void actionPerformed(ActionEvent ae)
    {
        
            String n =t1.getText(); //username
            String a =t3.getText(); //fullname
            String s =t4.getText(); //birth date
            String g= z.getSelectedItem(); //gender
            String o =t2.getText(); //password
            String e =t6.getText(); // mobile no
            String p =t7.getText(); // address    
            conn c1 = new conn();
        
        if(ae.getSource()==b1)
    	{
            f.setVisible(false);
            new Msms();
    	}
        if(ae.getSource()==b)
        {
        
        try
        {
            
            c1.s.executeUpdate("insert into login values('"+n+"','"+a+"','"+s+"','"+g+"','"+o+"','"+e+"','"+p+"')");
            JOptionPane.showMessageDialog(null, "data is entered");
            f.setVisible(false);
            new Msms();
        } catch (SQLException ex) 
        {
            
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "enter unique data");
            f.setVisible(false);
            new Msms();
        }
        }
        
              
            
    }
            
    
    
        
    
    
            
                
    

    public static void main(String[] args) 
    {
        
      signup sn =new signup();
    }
}
    
    

   


