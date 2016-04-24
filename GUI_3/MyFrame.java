import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame implements ActionListener
{
	TextField t1;
	Button btnadd;
	List lstSample1,lstSample2;
	
	String s1;
	
	MyFrame()
	{
		
	
		super("My Frame");
		setSize(800,600);
		setResizable(false);
		addWindowListener(new WindowListener());
		addControls();
		
	
	}
	
	
	
	
	private void addControls()
	{
	
		t1=new TextField();
		t1.setSize(200,20);
		t1.setLocation(20,70);
		setLayout(null);
		add(t1);
		
		btnadd=new Button("Add");
		btnadd.setSize(30,20);
		btnadd.setLocation(185,100);
		add(btnadd);
			
		lstSample1=new List(15);
		lstSample1.setSize(200,400);
		lstSample1.setLocation(230,70);	
		add(lstSample1);
		
		lstSample2=new List(15);
		lstSample2.setSize(200,400);
		lstSample2.setLocation(440,70);
		add(lstSample2);
		
		t1.addActionListener(this);
		btnadd.addActionListener(this);
		lstSample1.addActionListener(this);
		
		lstSample2.addActionListener(this);
	}
	
	
	
	private String getNewString()
	{
		String s1= t1.getText();
		return s1;
	}
	
	private void sameString()
	{
		String s1=t1.getText().toLowerCase().trim();
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource()==btnadd)
		{
			
			lstSample1.add(getNewString());
			
		}
		
		if(ae.getSource()==lstSample1)
		{
			
			int i=lstSample2.getItemCount();
			System.out.println(i);
			int index1= lstSample1.getSelectedIndex();
			String s2=lstSample1.getSelectedItem();
			
			 if(index1!=-1&&i<=4)
			{
			
				lstSample1.remove(index1);
				lstSample2.add(s2);
			}	
			
				
		}
		
		if(ae.getSource()==lstSample2)
		{
			
			
			int index2= lstSample2.getSelectedIndex();
			String s3=lstSample2.getSelectedItem();
			if(index2!=-1)
			{
					
					lstSample2.remove(index2);
				
					lstSample1.add(s3);
				
			}	
		}
		
	}
	
	
	
}


