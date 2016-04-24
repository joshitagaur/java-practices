import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements KeyListener
{
	TextField t1;
	
	MyFrame()
	{
		super("Sample Java Frame");
		setSize(600,400);
		setResizable(false);
		addWindowListener(new MyWindoeAdapter());
		addControls();
		
	}
	
	public void addControls()
	{
		
		t1=new TextField();
		t1.setSize(100,20);
		t1.setLocation(80,40);
		
		setLayout(null);
		add(t1);
		t1.addTextListener(this);
	}
	
	public void keyPressed(KeyEvent ke){}
	public void keyReleased(KeyEvent ke){}
		
	{
		
		
		
		String s1=t1.getText();
		int count=0;
		byte aByte[]=new byte[count];
		
		
		aByte=s1.getBytes();
		for(int i=0;i<aByte.length;i++)
		{
			count+=1;
			
		}
		
		for(int i=0;i<aByte.length;i++)
		{
			
			if(aByte[i]==32)
				if(aByte[i+1]>=97&&aByte[i+1]<=127)
				{
					aByte[i+1]-=32;
				}
		}
		
		
		String s2= new String(aByte);
		System.out.println(s2);
				
		
		
		
	}

}