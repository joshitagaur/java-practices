import java.awt.*;
import java.awt.event.*;
import java.io.*;

class MyFrame extends Frame implements ComponentListener, TextListener, ActionListener, FilenameFilter, ItemListener
{
	Panel leftPanel;
	Label lblFolder;
	TextField txtFolder;
	Button btnExplore;
	List lstImage;
	MyCanvas mc;
	Checkbox chkSlideShow;
	
	MyFrame()
	{
		super("Image Explorer");
		
		addComponentListener(this);
		addWindowListener(new MyWindowAdapter());
		
		addControls();
		centerAndPlaceWindow();				
		setVisible(true);
		
		txtFolder.setText("G:\\Wallpapers\\Closeups");
		btnExplore.setEnabled(true);
	}
	
	private void centerAndPlaceWindow()
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
		
		leftPanel = new Panel();
		leftPanel.setBackground(new Color(240,240,240));				
		leftPanel.setSize(350,getSize().height);
		leftPanel.setLocation(0,0);
		add(leftPanel);
		
		leftPanel.setLayout(null);
		int x, y;
		
		x = 15;
		y = 40;
		int width = 320;
		
		lblFolder = new Label("Explore Folder");
		lblFolder.setSize(width,20);
		lblFolder.setLocation(x,y);
		leftPanel.add(lblFolder);
		
		y += 20 + 5;
		
		txtFolder = new TextField();
		txtFolder.setSize(lblFolder.getSize());
		txtFolder.setLocation(x,y);
		leftPanel.add(txtFolder);
		txtFolder.addTextListener(this);
		
		y += 20 + 5;
		
		btnExplore = new Button("Explore");
		btnExplore.setSize(100,24);
		btnExplore.setLocation(x + width - btnExplore.getSize().width, y);
		leftPanel.add(btnExplore);
		btnExplore.setEnabled(false);
		btnExplore.addActionListener(this);
		
		y += 24 + 5;
		
		lstImage = new List();		
		lstImage.setLocation(x,y);
		lstImage.setSize(width, 20);
		lstImage.addItemListener(this);
		leftPanel.add(lstImage);
		
		chkSlideShow = new Checkbox("Slide Show");
		chkSlideShow.setSize(width, 20);
		leftPanel.add(chkSlideShow);
		
		y = 30;
		x = leftPanel.getSize().width;
		
		mc = new MyCanvas();
		mc.setLocation(x,y);
		add(mc);						
	}
	
	
	public void componentMoved(ComponentEvent ce){}
	public void componentShown(ComponentEvent ce){}
	public void componentHidden(ComponentEvent cd){}
	public void componentResized(ComponentEvent ce)		
	{
		leftPanel.setSize(leftPanel.getSize().width, getSize().height);
		lstImage.setSize(lstImage.getSize().width, leftPanel.getSize().height - lstImage.getLocation().y - 40);
		
		int x = lstImage.getLocation().x;
		int y = lstImage.getLocation().y + lstImage.getSize().height + 5;
		chkSlideShow.setLocation(x,y);						
		mc.setSize(getSize().width - leftPanel.getSize().width, getSize().height);
	}
	
	public void textValueChanged(TextEvent te)
	{
		String str = txtFolder.getText().trim();
		boolean flag = str.length() > 0;
		if (flag)
		{
			File dir = new File(str);
			flag = dir.isDirectory();
		}
		btnExplore.setEnabled(flag);
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == btnExplore)		
		{
			String path = txtFolder.getText().trim();
			File dir = new File(path);			
			File aFile[] = dir.listFiles(this);
			lstImage.removeAll();
			for (File f : aFile)
				lstImage.add(f.getAbsolutePath());
		}		
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		if (ie.getSource() == lstImage)
		{
			if (lstImage.getSelectedIndex() != -1)
			{				
				String fileName = lstImage.getSelectedItem();
				mc.showImage(fileName);
			}
		}
	}
	
	
	public boolean accept(File dir, String fileName)
	{
		fileName = fileName.toLowerCase();
		if (fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") || fileName.endsWith(".gif") || fileName.endsWith(".png"))
			return true;
		return false;
				
	}
}