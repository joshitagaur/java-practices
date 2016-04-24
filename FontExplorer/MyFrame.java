import java.awt.event.*;
import java.awt.*;

class MyFrame extends Frame implements Runnable, ItemListener
{
	List lstFont;
	Thread t;
	MyFrame()
	{
		super("Font Explorer");
		setSize(600,400);
		setResizable(false);
		addWindowListener(new MyWindowAdapter());
		addControls();
		t = new Thread(this);
		t.start();
	}
	
	private void addControls()
	{
		setLayout(null);
		lstFont = new List();
		lstFont.setSize(200,350);
		lstFont.setLocation(10,40);
		lstFont.addItemListener(this);
		add(lstFont);
	}
	
	public void run()
	{
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String aFont[] = ge.getAvailableFontFamilyNames();
		for(String font : aFont)
			lstFont.add(font);
	}
	
	public void paint(Graphics g)
	{
		if (lstFont.getSelectedIndex() != -1)
		{
			String font = lstFont.getSelectedItem();
			Font f = new Font(font,Font.PLAIN,50);
			g.setFont(f);
			
			g.drawString(font,225,200);
		}
	}
	
	/*
	public void update(Graphics g)
	{
		super.update(g);
		paint(g);
	}
	*/
	
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
}