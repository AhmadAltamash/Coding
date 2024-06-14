import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
class register extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1;
	
	register()
	{
		l1 = new JLabel("Reg.ID: ");
		l2 = new JLabel("Name: ");
		l3 = new JLabel("Course(Session): ");
		l4 = new JLabel("City: ");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		b1 = new JButton("SUBMIT");
		
		setLayout(null);
		l1.setBounds(50,40,50,30);
		t1.setBounds(200,40,50,30);
		l2.setBounds(50,90,50,30);
		t2.setBounds(200,90,130,30);
		l3.setBounds(50,140,130,30); 
		t3.setBounds(200,140,130,30);
		l4.setBounds(50,190,50,30);
		t4.setBounds(200,190,130,30);
		b1.setBounds(160,230,100,30);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(b1);
		b1.addActionListener(this);
		setTitle("Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			
			if(t1.getText().isEmpty() ||t2.getText().isEmpty()||t3.getText().isEmpty()||t4.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(this, "Please, Enter id/name/course/city Respectively");
			}
			else
			{
				try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","7488");
				Statement stmn = cn.createStatement();
				String sql = "insert into Regform values("+t1.getText()+",'"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"')";
				int rs;
				rs = stmn.executeUpdate(sql);
				JOptionPane.showMessageDialog(this,"Details Submitted");
				cn.close();
				}
				catch(SQLException se)
				{
					JOptionPane.showMessageDialog(this, se.getMessage());
				}
				catch(ClassNotFoundException cnf)
				{
					JOptionPane.showMessageDialog(this, cnf.getMessage());
				}
			}
		}
	}
}
class registerationform
{
	public static void main(String arg[])
	{
		register rg = new register();
		rg.setBounds(40,40,600,700);
		rg.setVisible(true);
	}
}