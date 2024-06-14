import java.awt.*;
import java.awt.event.*;
class nfrm extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2;
	
	nfrm()
	{
		l1 =new Label("First Number: ");
		l2 =new Label("Second Number: ");
		l3 =new Label("Addition: ");
		t1 =new TextField();
		t2 =new TextField();
		t3 =new TextField();
		b1 =new Button("Add");
		b2 =new Button("Concat");
		
		setLayout(null);
		l1.setBounds(30,40,150,40);
		t1.setBounds(180,40,150,40);
		l2.setBounds(30,120,150,40);
		t2.setBounds(180,120,150,40);
		l3.setBounds(30,200,150,40);
		t3.setBounds(180,200,150,40);
		b1.setBounds(40,280,50,30);
		b2.setBounds(140,280,50,30);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			int a,b,c;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=a+b;
			t3.setText(""+c);
		}
		else if(ae.getSource()==b2)
		{
			t3.setText(t1.getText()+" "+t2.getText());
		}
	}
}
class myform
{
	public static void main(String arg[])
	{
		nfrm nf = new nfrm();
		nf.setBounds(30,30,800,650);
		nf.setVisible(true);
	}
}