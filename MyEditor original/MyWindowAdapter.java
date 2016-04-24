import java.awt.*;
import java.awt.event.*;
class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		Window win = (Window) we.getSource();
		if (win instanceof MyFrame)
			System.exit(0);
		else if (win instanceof MyDialog)
			win.setVisible(false);
	}
}