import java.awt.*;

class MyFrame extends Frame
{
	MyFrame()
	{
		super("Sample Java Frame");
		//setSize(600,400);
		setSize(new Dimension(600,400));
		
		MyWindowListener mwl = new MyWindowListener();
		addWindowListener(mwl);		//this method is passed an object of such a class which had implemented the WindowListener interface.
		
		
		//setLocation(100,100);
		setLocation(new Point(300,300));
		setVisible(true);
	}
}