import java.awt.*;
import java.applet.*;



public class Applet1 extends Applet
{
	String str;
	TextField t1, t2, t3;
	Button btnSum;
	
	AudioClip ac;
	
	public void init()
	{
		setBackground(Color.YELLOW);
		//str = "Hello From Java Applet...";
		str = getParameter("msg");
		addControls();
		ac = getAudioClip(getCodeBase(), "sample.wav");
		//str = getCodeBase().toString();
		
		
		/*
		if (ac != null)			
			ac.play();
		else
			str = getCodeBase().toString();
		*/	
	}
	
	public void start()
	{
		ac.play();
	}
	
	public void stop()
	{
		ac.stop();
	}
	
	private void addControls()
	{
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		t3.setEditable(false);
		btnSum = new Button("Sum");
		
		add(t1);
		add(t2);
		add(btnSum);
		add(t3);
		
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.drawString(str, 100, 100);
	}
}