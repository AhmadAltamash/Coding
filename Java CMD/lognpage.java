import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class page extends JFrame implements ActionListener 
{
    JLabel l1, l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1;

    page() 
	{
        l1 = new JLabel("Username: ");
        l2 = new JLabel("Password: ");
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Login");

        setLayout(null);
        l1.setBounds(30, 40, 150, 40);
        t1.setBounds(180, 40, 150, 40);
        l2.setBounds(30, 100, 150, 40);
        t2.setBounds(180, 100, 150, 40);
        b1.setBounds(100, 180, 80, 30);
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
        if (ae.getSource() == b1) {
            String username = t1.getText();
            String password = new String(t2.getPassword());
            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please, enter both username and password.");
            } else {
                if (authenticate(username, password)) 
				{
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","7488");
					Statement st = con.createStatement();
					String sql="insert into Logdb values ('" + username + "','" + password + "')";
					int rs;
					rs=st.executeUpdate(sql);
					JOptionPane.showMessageDialog(this, "Login Successful");
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
                    // Proceed to the next part of the application
                } 
				else 
				{
                    JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.");
					t1.setText("");
					t2.setText("");
                }
            }
        }
    }
    public static boolean authenticate(String username, String password) 
	{
        String query = "SELECT * FROM user_detail WHERE username = ? AND password = ?";
        try(Connection con = DatabaseConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(query))	
		{
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
class lognpage
{
	public static void main(String aerg[])
	{
		page pg = new page();
	}
}
