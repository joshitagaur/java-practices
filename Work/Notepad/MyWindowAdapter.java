import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		if (we.getSource() instanceof MyFrame)
			System.exit(0);
		else if (we.getSource() instanceof MyDialog)
		{
			MyDialog md = (MyDialog)we.getSource();
			md.setVisible(false);
		}
	}
}