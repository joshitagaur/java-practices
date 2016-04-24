import java.awt.*;

class MyFrame extends Frame
{
	MyFrame()
	{
		super("Sample Java Frame");
		
		//setSize(600,400);
		Dimension d = new Dimension(600,300);
		setSize(d);
		
		//setUndecorated(true);
		//setResizable(false);
		//setBackground(Color.RED);
		
		//setLocation(100,100);
		Point p = new Point(300,300);
		setLocation(p);
		
		
		
		MyWindowListener mwl = new MyWindowListener();
		addWindowListener(mwl);
		
		
		setVisible(true);		
		
	}
}