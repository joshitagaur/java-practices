import java.awt.*;
import java.awt.event.*;
import java.io.*;

class MyFrame extends Frame implements ComponentListener, ActionListener, TextListener, FilenameFilter, ItemListener, Runnable
{
	Label lblFolder;
	TextField txtFolder;
	Button btnExplore;
	List lstImage;
	MyCanvas mc;
	Checkbox chkSlideShow;
	boolean slideShow;
	Thread t;
	
	MyFrame()
	{
		super("My Image Explorer");
		planSizeAndLocation();
		addWindowListener(new MyWindowAdapter());
		addComponentListener(this);
		addControls();		
	}
	
	private void planSizeAndLocation()
	{
		Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)(scrSize.width * 0.8f);
		int height = (int)(scrSize.height * 0.8f);
		int x = (scrSize.width - width) / 2;
		int y = (scrSize.height - height) / 2;
		setBounds(x,y,width,height);		
	}
	
	private void addControls()
	{
		setLayout(null);
		
		int x, y, lblWidth, vgap;
		
		x = 20;
		y = 40;
		lblWidth = 300;
		vgap = 5;
		
		lblFolder = new Label("Folder");
		lblFolder.setSize(lblWidth, 20);
		lblFolder.setLocation(x,y);
		add(lblFolder);
		
		y += 20 + vgap;
		
		txtFolder = new TextField();
		txtFolder.setSize(lblFolder.getSize());
		txtFolder.setLocation(x,y);
		txtFolder.addTextListener(this);
		txtFolder.setText("G:\\Wallpapers\\100_Architecture_Around_the_World_Wallpapers_1280_X_1024\\100 Architecture Around the World Wallpapers 1280 X 1024\\Wallpapers");
		add(txtFolder);
		
		y += 20 + vgap;
		
		btnExplore = new Button("Explore");
		btnExplore.setSize(100,24);
		btnExplore.setLocation(x + lblWidth - btnExplore.getSize().width, y);
		//btnExplore.setEnabled(false);
		btnExplore.addActionListener(this);
		add(btnExplore);
		
		y += 24 + vgap;
		
		lstImage = new List();
		lstImage.setSize(lblWidth, getSize().height - y - 40);
		lstImage.setLocation(x,y);
		lstImage.addItemListener(this);
		add(lstImage);
		
		y += lstImage.getSize().height + vgap;
		
		chkSlideShow = new Checkbox("Slide Show");
		chkSlideShow.setSize(lblWidth, 20);
		chkSlideShow.setLocation(x,y);
		chkSlideShow.addItemListener(this);
		add(chkSlideShow);
		
		
		mc = new MyCanvas();
		x = lblFolder.getLocation().x + lblFolder.getSize().width + 20;
		y = lblFolder.getLocation().y;
		int width = getSize().width - x - 20;
		int height = getSize().height - y - 20;
		mc.setBounds(x,y,width,height);
		add(mc);
	}
	
	public void componentMoved(ComponentEvent ce){}
	public void componentShown(ComponentEvent ce){}
	public void componentHidden(ComponentEvent ce){}
	public void componentResized(ComponentEvent ce)
	{
		int x = lstImage.getLocation().x;
		int y = lstImage.getLocation().y;
		int width = lstImage.getSize().width;
		int height = getSize().height - y - 40;
		lstImage.setBounds(x,y,width,height);
		
		y = lstImage.getLocation().y + height + 5;
		chkSlideShow.setLocation(x,y);
		
		
		x = lblFolder.getLocation().x + lblFolder.getSize().width + 20;
		y = lblFolder.getLocation().y;
		width = getSize().width - x - 20;
		height = getSize().height - y - 20;
		mc.setBounds(x,y,width,height);
		add(mc);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		if (ie.getSource() == lstImage)
		{
			if (lstImage.getSelectedIndex() != -1)
			{
				String imageFileName = lstImage.getSelectedItem();
				mc.showImage(imageFileName);
			}
		}
		else if (ie.getSource() == chkSlideShow)
		{
			slideShow = chkSlideShow.getState();
			if (slideShow)
			{
				t = new Thread(this);
				t.start();
			}
		}
	}

	public void textValueChanged(TextEvent te)	
	{
		if (te.getSource() == txtFolder)
		{
			String path = txtFolder.getText().trim();
			boolean flag = path.length() > 0;
			if (flag)
			{
				File dir = new File(path);
				flag = dir.isDirectory();
			}
			btnExplore.setEnabled(flag);
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == btnExplore)
		{
			String path = txtFolder.getText().trim();
			File dir = new File(path);
			File aContent[] = dir.listFiles(this);
			lstImage.removeAll();
			for(File f : aContent)
				lstImage.add(f.getAbsolutePath());
		}
	}
	
	
	public boolean accept(File dir, String fileName)
	{
		fileName = fileName.toLowerCase();
		if (fileName.endsWith(".jpg") || fileName.endsWith(".png") || fileName.endsWith(".gif") || fileName.endsWith("*.jpeg"))
			return true;
		return false;
	}
	
	public void run()
	{
		if (lstImage.getItemCount() > 0)
		{
			int index = lstImage.getSelectedIndex() == -1 ? 0 : lstImage.getSelectedIndex();
			while (slideShow)
			{
				String fileName = lstImage.getItem(index);
				mc.showImage(fileName);
				try
				{
					Thread.sleep(3000);
				}
				catch (InterruptedException exp){}
				index++;
				if (index >= lstImage.getItemCount())
					index = 0;
			}
		}
		else
			chkSlideShow.setState(false);
	}
}