
package msms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class de implements ActionListener{
    JFrame f;
    JLabel l,l2,l6;
    JTextField t;
    JButton b,b1;
    Choice z;
    public de()
    {
            f= new JFrame("MEETING SCHEDULER MANAGEMENT SYSYEM");
            f.setLayout(null);
		l2=new JLabel("Time");
                t =new JTextField();
                t.setText("00:00");
                l2.setBounds(60,140,200,30);
                t.setBounds(150,140,200,30);
                f.add(l2);
                f.add(t);
                z = new Choice();
                z.add("AM");
                z.add("PM");
                z.setBounds(350,140,100,20) ;
       
                z.setBackground(Color.BLACK);
                z.setForeground(Color.WHITE);
                f.add(z);
		
        
                 b = new JButton("Delete");
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
            
            c1.s.executeUpdate("delete from meeting where time='"+n+"'");
            JOptionPane.showMessageDialog(null, "data is deleted");
            f.setVisible(false);
            new details();
        } catch (SQLException ex) 
        {
            
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "enter unique data");
            f.setVisible(false);
            new de();
        }
        }
        
              
            
    }
            
   

    
    public static void main(String[] args) 
    {
        
      de n =new de();
    }
    
}
