package msms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class details implements ActionListener 
{
    JFrame f;
    JLabel l,l1,l3;
    JButton b,b1,b4;//b2,b3;
    
    public details()
    {
        f =new JFrame("MEETING SCHEDULER MANAGEMENT SYSYEM");
        f.setLayout(null);
        f.setBackground(Color.WHITE);
        
        
        
        l = new JLabel("CHOOSE YOUR OPTION");
        l.setBackground(Color.WHITE);
        l.setForeground(Color.RED);
        l.setFont(new Font("serif",Font.BOLD,40));
        l.setBounds(10,10,700,100);
        
        b = new JButton("ADD");
        b.setBounds(200,150,250,40);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.addActionListener(this);
        f.add(b);
        
        b1 = new JButton("DELETE");
        b1.setBounds(200,200,250,40);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        
       /* b2 = new JButton("VIEW");
        b2.setBounds(200,250,250,40);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        
        b3 = new JButton("UPDATE");
        b3.setBounds(200,300,250,40);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);*/
        
        b4 = new JButton("close    ");
        b4.setBounds(80,380,500,40);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        f.add(b4);
        
        
        f.add(b1);
       // f.add(b2);
       // f.add(b3);
        f.add(l);
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("msms\\icon\\11.jpg"));
        Image i5 = i4.getImage().getScaledInstance(700 ,450, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l3 = new JLabel(i6);
        l3.setBounds(0,0,700 ,450);
        f.add(l3);

        f.setVisible(true);
      	f.setSize(700 ,450);
      	f.setBackground(Color.red);
      	f.setResizable(false);
      	f.setLayout(null);
      	f.setLocation(200,100);
      	f.getContentPane().setBackground(Color.WHITE);
      	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent ae)
    {
    	if(ae.getSource()==b)
    	{
    		f.setVisible(false);
    		new addlog();
    	}
        if(ae.getSource()==b1)
    	{
    		f.setVisible(false);
    		new de ();
    	}
       /* if(ae.getSource()==b2)
    	{
    		f.setVisible(false);
    		new view();
    	}*/
       /* if(ae.getSource()==b3)
    	{
    		f.setVisible(false);
    		new update();
    	}*/
        if(ae.getSource()==b4)
        {
            f.setVisible(false);
            new login();
        }
        
    }
  
  
  	public static void main(String args[])
  	{
  		details f =new details();
      	
  	}
}
