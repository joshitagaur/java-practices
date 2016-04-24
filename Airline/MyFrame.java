import java.awt.*;
import java.awt.event.*;
import java.io.*;

class MyFrame extends Frame
{
	Button btnSelect,btnlogin, btnPassenger, btnPayment;
	
	MyFrame()
	{
		super("Airlines booking");
		setSize(1000,600);
		addWindowListener(new MyWindowAdapter());
		addControls();
	
	}
	
	private void addControls()
	{
		setLayout(null);
		int x=30;
		int y=50;
		int z=900;
		int w=25;			
		btnSelect=new Button("Select a flight");
		btnSelect.setSize(z,w);
		btnSelect.setLocation(x,y);
		
		
		btnlogin=new Button("Login/Contact Details");
		btnlogin.setSize(z,w);
		btnlogin.setLocation(x,y+30);
		
		btnPassenger=new Button("Passenger Details");
		btnPassenger.setSize(z,w);
		btnPassenger.setLocation(x,y+60);
		
		btnPayment=new Button("Payment Details");
		btnPayment.setSize(z,w);
		btnPayment.setLocation(x,y+90);
		
		add(btnSelect);
		add(btnlogin);
		add(btnPassenger);
		add(btnPayment);
		
	}
}

