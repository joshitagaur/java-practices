import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.*;



class MyFrame extends Frame implements ItemListener, MouseListener, MouseMotionListener, ActionListener
{
	MenuBar menubar;
	Menu mnuFile;
	MenuItem itmSave, itmOpen;
	
	Menu mnuShape;
	CheckboxMenuItem itmLine, itmBox, itmOval;
	
	int downX, downY, oldX, oldY;
	
	private String currentShape;
	private Color color;
	
	private ArrayList<Shape> shapes;
	
	MyFrame()
	{
		super("My Draw");
		setSize(800,600);
		addWindowListener(new MyWindowAdapter());
		addMouseListener(this);
		addMouseMotionListener(this);
		setCursor(Cursor.CROSSHAIR_CURSOR);
		addMenu();
		setVisible(true);
		currentShape = "line";
		color = Color.BLACK;
		shapes = new ArrayList<Shape>();
	}
	
	private void addMenu()
	{
		menubar = new MenuBar();
		
		mnuFile = new Menu("File");
		itmSave = new MenuItem("Save");
		itmOpen = new MenuItem("Open");
		
		itmSave.addActionListener(this);
		itmOpen.addActionListener(this);
		
		mnuFile.add(itmSave);
		mnuFile.add(itmOpen);
		
		menubar.add(mnuFile);
			
		
		mnuShape = new Menu("Shape");
		
		itmLine = new CheckboxMenuItem("Line",true);
		itmBox = new CheckboxMenuItem("Box");
		itmOval = new CheckboxMenuItem("Oval");
		
		itmLine.setShortcut(new MenuShortcut(KeyEvent.VK_L));
		itmBox.setShortcut(new MenuShortcut(KeyEvent.VK_B));
		itmOval.setShortcut(new MenuShortcut(KeyEvent.VK_O));
		
		itmLine.addItemListener(this);
		itmBox.addItemListener(this);
		itmOval.addItemListener(this);
		
		mnuShape.add(itmLine);
		mnuShape.add(itmBox);
		mnuShape.add(itmOval);
		
		menubar.add(mnuShape);
		
		setMenuBar(menubar);
		
	}
	
	
	public void itemStateChanged(ItemEvent ie)
	{
		CheckboxMenuItem mi = (CheckboxMenuItem)ie.getSource();
		//System.out.println(mi.getParent());
		
		if (mi.getParent().toString().contains("Shape"))
		{
			for (int i = 0; i < mnuShape.getItemCount(); i++)
			{
				CheckboxMenuItem itm = (CheckboxMenuItem) mnuShape.getItem(i);
				itm.setState(itm == mi);				
			}
			if (mi == itmLine)
				currentShape = "line";
			else if (mi == itmBox)
				currentShape = "box";
			else if (mi == itmOval)
				currentShape = "oval";
		}				
	}
		
	public void mouseClicked(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
		
	public void mouseMoved(MouseEvent me){}
	
	
	
	public void mousePressed(MouseEvent me)
	{
		
		downX = me.getX();
		downY = me.getY();
		oldX = downX;
		oldY = downY;
	}
	
	public void mouseDragged(MouseEvent me)
	{
		Graphics g = getGraphics();
		g.setXORMode(getBackground());
		
		int x = me.getX();
		int y = me.getY();
		
		if (currentShape.equals("line"))
		{
			g.setColor(color);
			g.drawLine(downX, downY, oldX, oldY);
			g.drawLine(downX, downY, x, y);
		}
		
		oldX = x;
		oldY = y;
	}
	
	public void mouseReleased(MouseEvent me)
	{
		int x = me.getX();
		int y = me.getY();
			
		if (currentShape.equals("line"))			
		{
			Line line = new Line(downX, downY, x, y, color);			
			shapes.add(line);
		}
		repaint();
		
		
	}
	
	
	public void paint(Graphics g)
	{
		for (int i = 0; i < shapes.size(); i++)
		{
			Shape shp = shapes.get(i);
			shp.draw(g);
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == itmSave)
		{
			try
			{
				FileOutputStream fos = new FileOutputStream("mydraw.shp");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(shapes);
				oos.close();
				fos.close();
			}
			catch (IOException exp)
			{
				
				
			}
			
		}
		else if (ae.getSource() == itmOpen)
		{
			try
			{
				FileInputStream fis = new FileInputStream("mydraw.shp");
				ObjectInputStream ois = new ObjectInputStream(fis);
				shapes = (ArrayList<Shape>) ois.readObject();
				ois.close();
				fis.close();
				repaint();
			}
			catch (IOException exp)
			{								
			}
			catch (ClassNotFoundException exp){}
		}
	}
}