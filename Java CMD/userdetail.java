import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
class detail extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;
	
	detail()
	{
		l1= new JLabel("Username: ");
		l2= new JLabel("Password: ");
		t1= new JTextField();
		t2= new JPasswordField();
		b1= new JButton("Submit User's Detail");
		b2= new JButton("Open LogIn Page");
		
		setLayout(null);
		l1.setBounds(30,40,150,40);
		t1.setBounds(180,40,150,40);
		l2.setBounds(30,100,150,40);
		t2.setBounds(180,100,150,40);
		b1.setBounds(100,180,200,30);
		b2.setBounds(350,180,200,30);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setTitle("User Deails");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String pass = new String(t2.getPassword());
			if(t1.getText().isEmpty() || pass.isEmpty())
				{
					JOptionPane.showMessageDialog(this, "Please, Enter Username and Password Respectively");
				}
			else
			{	
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","7488");
					Statement st = con.createStatement();
					String sql="insert into user_detail values ('" + t1.getText() + "','" + pass + "')";
					int rs;
					rs=st.executeUpdate(sql);
					JOptionPane.showMessageDialog(this,"Submitted");	
					con.close();
				}
				catch(SQLException se)
				{
					JOptionPane.showMessageDialog(this, se.getMessage());
				}
				catch(ClassNotFoundException cnfe)
				{
					JOptionPane.showMessageDialog(this, "Try Again");
				}
			}
		}
		else if(ae.getSource()==b2)
		{
			page pg = new page();
			pg.setBounds(50,50,600,500);
			pg.setVisible(true);
			setVisible(false);
		}
	}
}
class userdetail
{
	public static void main(String arg[])
	{
		detail dd= new detail();
		dd.setBounds(40,40,650,400);
		dd.setVisible(true);
	}
}