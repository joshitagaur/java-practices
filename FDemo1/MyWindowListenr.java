import java.awt.event.*;

/*
class MyWindowListener implements WindowListener
{
	public void windowOpened(WindowEvent we){}
	public void windowClosed(WindowEvent we){}
	
	public void windowActivated(WindowEvent we){}
	public void windowDeactivated(WindowEvent we){}
	
	public void windowIconified(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}                                                                                                                                      
	
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}	
}
*/

class MyWindowListener extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}