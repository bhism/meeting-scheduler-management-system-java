
package msms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class adi implements ActionListener
{
    JFrame f;
    JLabel l,l1,l2,l3,l4,l5,l6;
    JTextField t,t1,t2,t3;
    JButton b,b1;
    Choice z;
    public adi()
    {
       f= new JFrame("MEETING SCHEDULER MANAGEMENT SYSYEM");
       f.setLayout(null);
       
       
       l= new JLabel("ADD");
       l.setBounds(60,30,400,40);
       l.setFont(new Font("serif",Font.BOLD,40));
       f.add(l);
                
        l1= new JLabel("Date");
        t =new JTextField();
        l1.setBounds(60,100,200,30);
        t.setBounds(150,100,200,30);
        f.add(l1);
        f.add(t);
		
        l2=new JLabel("Time");
        t1 =new JTextField();
        t1.setText("00:00");
        l2.setBounds(60,140,200,30);
        t1.setBounds(150,140,200,30);
        f.add(l2);
        f.add(t1);
        z = new Choice();
        z.add("AM");
        z.add("PM");
        
        z.setBounds(350,140,100,20) ;
       
        z.setBackground(Color.BLACK);
        z.setForeground(Color.WHITE);
        f.add(z);
		
        l3=new JLabel("LOCATION");
        t2 =new JTextField();
        l3.setBounds(60,180,200,30);
        t2.setBounds(150,180,200,30);
        f.add(l3);
        f.add(t2);

        l4 =new JLabel("REASON");
        t3 =new JTextField();
        l4.setBounds(60,220,200,30);
        t3.setBounds(150,220,200,60);
        f.add(l4);
        f.add(t3);
		
        b = new JButton("add");
        b.setBounds(250,300,100,20);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.addActionListener(this);
        f.add(b);
        b1 = new JButton("back");
        b1.setBounds(150,300,100,20);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        f.add(b1);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("msms\\icon\\11.jpg"));
        Image i5 = i4.getImage().getScaledInstance(500 ,400, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l6 = new JLabel(i6);
        l6.setBounds(0,0,500 ,400);
        f.add(l6);
        
		
               
		
	
                f.setVisible(true);
        	f.setSize(500 ,400);
        	f.setBackground(Color.red);
        	f.setResizable(false);
                f.setLayout(null);
        	f.setLocation(500,100);
        	f.getContentPane().setBackground(Color.pink);
        	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
    }
   
     public void actionPerformed(ActionEvent ae)
    {
        
            String n =t.getText(); //date
            String a =t1.getText(); //time
            String s =t2.getText(); //location
            String g= z.getSelectedItem(); //ap/pm
            String o =t3.getText(); //reason
           
            conn c1 = new conn();
        
        if(ae.getSource()==b1)
    	{
            f.setVisible(false);
            new details();
    	}
        if(ae.getSource()==b)
        {
        
        try
        {
            
            c1.s.executeUpdate("insert into meeting values('"+n+"','"+a+"','"+s+"','"+g+"','"+o+"')");
            JOptionPane.showMessageDialog(null, "data is entered");
            f.setVisible(false);
            new adi();
        } catch (SQLException ex) 
        {
            
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "enter unique data");
            f.setVisible(false);
            new adi();
        }
        }
        
              
            
    }
            
    
    

    
    public static void main(String[] args) 
    {
        
      adi n =new adi();
    }
    
}
