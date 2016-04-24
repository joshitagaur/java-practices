import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class MyFrame extends Frame implements ItemListener, MouseListener, MouseMotionListener, ActionListener
{
	MenuBar menubar;
	Menu mnuShape, mnuColor;
	CheckboxMenuItem mnuLine, mnuRectangle, mnuOval;
	CheckboxMenuItem mnuRed, mnuGreen, mnuBlue, mnuMagenta, mnuYellow, mnuCyan, mnuBlack;	
		
	MenuItem itmSave, itmOpen;
	
	String currentShape;
	Color color;
	
	boolean dragMode;
	
	int downX, downY, oldX, oldY, oldWidth, oldHeight;
	
	
	
	ArrayList<Shape> shapes = new ArrayList<Shape>();
	
	MyFrame()
	{
		super("My Paint");
		setSize(800,600);
		addWindowListener(new MyWindowAdapter());
		addMouseListener(this);
		addMouseMotionListener(this);
		setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		addMenu();
		
		currentShape = "line";
		color = Color.BLACK;
		dragMode = false;				
	}
	
	private void addMenu()
	{
		menubar = new MenuBar();
		
		mnuShape = new Menu("Shape");
		
		mnuLine = new CheckboxMenuItem("Line",true);
		mnuRectangle = new CheckboxMenuItem("Rectangle",false);
		mnuOval = new CheckboxMenuItem("Oval",false);
		
		mnuLine.addItemListener(this);
		mnuRectangle.addItemListener(this);
		mnuOval.addItemListener(this);		
		
		mnuShape.add(mnuLine);
		mnuShape.add(mnuRectangle);
		mnuShape.add(mnuOval);
		
		
		itmSave = new MenuItem("Save");
		itmSave.addActionListener(this);
		
		mnuShape.addSeparator();
		mnuShape.add(itmSave);
		
		itmOpen = new MenuItem("Open");
		itmOpen.addActionListener(this);
		
		mnuShape.add(itmOpen);
		
		
		
		mnuColor = new Menu("Color");
		
		mnuRed 		= new CheckboxMenuItem("Red",false);
		mnuGreen 	= new CheckboxMenuItem("Green",false);
		mnuBlue 	= new CheckboxMenuItem("Blue",false);
		mnuMagenta 	= new CheckboxMenuItem("Magenta",false);
		mnuYellow 	= new CheckboxMenuItem("Yellow",false);
		mnuCyan 	= new CheckboxMenuItem("Cyan",false);
		mnuBlack 	= new CheckboxMenuItem("Black",true);
		
		mnuRed.addItemListener(this);
		mnuGreen.addItemListener(this);
		mnuBlue.addItemListener(this);
		mnuMagenta.addItemListener(this);
		mnuYellow.addItemListener(this);
		mnuCyan.addItemListener(this);
		mnuBlack.addItemListener(this);
		
		mnuColor.add(mnuRed);
		mnuColor.add(mnuGreen);
		mnuColor.add(mnuBlue);
		mnuColor.add(mnuMagenta);
		mnuColor.add(mnuYellow);
		mnuColor.add(mnuCyan);
		mnuColor.add(mnuBlack);
		
		
		menubar.add(mnuShape);
		menubar.add(mnuColor);
		
		setMenuBar(menubar);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		CheckboxMenuItem cbmi = (CheckboxMenuItem)ie.getSource();
		
		//System.out.println(cbmi.getParent());
		
		
		if (cbmi.getParent().toString().contains("Shape"))
		{
			mnuLine.setState(false);
			mnuRectangle.setState(false);
			mnuOval.setState(false);
			
			if (cbmi == mnuLine)
				currentShape = "line";
			else if (cbmi == mnuRectangle)
				currentShape = "rectangle";
			else if (cbmi == mnuOval)
				currentShape = "oval";
					
		}
		else if (cbmi.getParent().toString().contains("Color"))
		{
			mnuRed.setState(false);
			mnuGreen.setState(false);
			mnuBlue.setState(false);
			mnuMagenta.setState(false);
			mnuYellow.setState(false);
			mnuCyan.setState(false);
			mnuBlack.setState(false);
			
			if (cbmi == mnuRed)
				color = Color.RED;
			else if (cbmi == mnuGreen)
				color = Color.GREEN;
			else if (cbmi == mnuBlue)
				color = Color.BLUE;
		}
		cbmi.setState(true);
	}
	
	
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	
	public void mouseMoved(MouseEvent me){}
	
		
	public void mousePressed(MouseEvent me)
	{
		downX = me.getX();
		downY = me.getY();
		
	}
	
	public void mouseDragged(MouseEvent me)
	{
		int x = me.getX();
		int y = me.getY();
		
		Graphics g = getGraphics();
		g.setXORMode(getBackground());
		g.setColor(color);
		if (currentShape.equals("line"))
		{
			if (dragMode)
				g.drawLine(downX, downY, oldX, oldY);
				
			g.drawLine(downX, downY, x, y);
		}
		else if (currentShape.equals("rectangle") || currentShape.equals("oval"))
		{
			int width = x - downX;
			int height = y - downY;
			x = downX;
			y = downY;
			
			if (width < 0)
			{
				width *= -1;
				x = me.getX();
				//x = downX - width;
			}
			if (height < 0)
			{
				height *= -1;
				y = me.getY();
				//y = downY - height;
			}
			
			if (dragMode)
			{
				if (currentShape.equals("rectangle"))
					g.drawRect(oldX, oldY, oldWidth, oldHeight);
				else
					g.drawOval(oldX, oldY, oldWidth, oldHeight);
			}
				
			
			if (currentShape.equals("rectangle"))
				g.drawRect(x, y, width, height);
			else
				g.drawOval(x, y, width, height);
			
			oldWidth = width;
			oldHeight = height;
		}
		dragMode = true;
		oldX = x;
		oldY = y;
	}
	
	public void mouseReleased(MouseEvent me)
	{
		int x, y;
		x = me.getX();
		y = me.getY();
		if (currentShape.equals("line"))
		{			
			Line line = new Line(downX, downY, x, y, color);
			shapes.add(line);			
		}
		else if (currentShape.equals("rectangle") || currentShape.equals("oval"))
		{
			int width = x - downX;
			int height = y - downY;
			x = downX;
			y = downY;
			if (width < 0)
			{
				width *= -1;
				x = downX - width;
			}
			if (height < 0)
			{
				height *= -1;
				y = downY - height;
			}
			if (currentShape.equals("rectangle"))
			{			
				Rectangle r = new Rectangle(x, y, width, height, color);
				shapes.add(r);
			}
			else 
			{
				Oval o = new Oval(x, y, width, height, color);
				shapes.add(o);
			}							
		}
		repaint();
		oldX = 0;
		oldY = 0;
		dragMode = false;
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == itmSave)
		{
			try
			{
				FileOutputStream fos = new FileOutputStream("c:\\MyFolder\\MyDrawing.shp");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(shapes);
				oos.flush();
				oos.close();
				fos.flush();
				fos.close();
				System.out.println("file saved...");
			}
			catch (IOException exp)
			{
			}
		}
		else if (ae.getSource() == itmOpen)
		{
			try
			{
				FileInputStream fis = new FileInputStream("c:\\MyFolder\\MyDrawing.shp");
				ObjectInputStream ois = new ObjectInputStream(fis);
				shapes = (ArrayList<Shape>) ois.readObject();
				repaint();
			}
			catch (ClassNotFoundException exp)
			{
			}
			catch (IOException exp)
			{				
			}
		}
	}
	
	
	public void paint(Graphics g)
	{
		for (int i = 0; i < shapes.size(); i++)
		{
			Shape shp = shapes.get(i);
			shp.draw(g);
		}
	}
}