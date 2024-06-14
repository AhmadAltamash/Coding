import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class page extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;
	
	page()
	{
		l1= new JLabel("Username: ");
		l2= new JLabel("Password: ");
		t1= new JTextField();
		t2= new JPasswordField();
		b1= new JButton("Login");
		
		setLayout(null);
		l1.setBounds(30,40,150,40);
		t1.setBounds(180,40,150,40);
		l2.setBounds(30,100,150,40);
		t2.setBounds(180,100,150,40);
		b1.setBounds(100,180,80,30);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		b1.addActionListener(this);
		setTitle("Login Page");
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
					String sql="insert into Logdb values ('" + t1.getText() + "','" + pass + "')";
					int rs;
					rs=st.executeUpdate(sql);

					JOptionPane.showMessageDialog(this,"Login Successfull");	
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
	}
}	
/*class loginpage
{
	public static void main(String arg[])
	{
		page pg = new page();
		pg.setBounds(50,50,600,500);
		pg.setVisible(true);
	}
}*/

