
package msms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.lang.Thread;

public class Msms implements ActionListener
{
    JFrame f1;
    JLabel l1,l2,l4;
    JButton b,b1;
    public Msms()
    {
        f1 =new JFrame("MEETING SCHEDULER MANAGEMENT SYSYEM");
        f1.setLayout(null);
        l1 = new JLabel("MEETING SCHEDULER MANAGEMENT SYSYEM");
        l1.setBackground(Color.yellow);
        l1.setForeground(Color.BLACK);
        l1.setBounds(40,10,1200,100);
        l1.setFont( new Font("serif",Font.BOLD,40));
        f1.add(l1);
        l4=new JLabel("WELCOME");
        l4.setFont( new Font("serif",Font.BOLD,40));
        l4.setForeground(Color.DARK_GRAY);
        l4.setBounds(500,230,1200,100);
        f1.add(l4);
        
        
        

        b = new JButton("  LOGIN  ");
        b1 = new JButton(" SIGN UP ");
        b.setBounds(300,600,300,70);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setFont(new Font("serif",Font.BOLD,20));
        b.addActionListener(this);
        f1.add(b);
        b1.setBounds(650,600,300,70);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("serif",Font.BOLD,20));
        b1.addActionListener(this);
        f1.add(b1);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("msms\\icon\\11.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1200,700);
        f1.add(l3);
        f1.setVisible(true);
      	f1.setSize(1200 ,700);
      	f1.setBackground(Color.red);
      	f1.setResizable(false);
      	f1.setLayout(null);
      	f1.setLocation(200,100);
      	f1.getContentPane().setBackground(Color.WHITE);
      	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*while(true)
        {
        	l4.setVisible(false);
        	try
        	{
        	Thread.sleep(500);
        	}
        	catch(Exception e) {}
        	l4.setVisible(true);
        	try
        	{
        	Thread.sleep(500);
        	}
        	catch(Exception e){}	
        }*/
     
    }
    public void actionPerformed(ActionEvent ae)
    {
    	if(ae.getSource()==b)
    	{
    		f1.setVisible(false);
    		new login();
    	}
        if(ae.getSource()==b1)
    	{
    		f1.setVisible(false);
    		new signup();
    	}
    }

    
    public static void main(String[] args) {
        
       Msms f =new Msms();
    }
    
}
