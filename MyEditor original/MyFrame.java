import java.awt.*;
import java.awt.event.*;
import java.io.*;

class MyFrame extends Frame implements ActionListener, TextListener
{
	MenuBar menubar;
	Menu mnuFile;
	MenuItem itmNew, itmOpen, itmSave, itmSaveAs, itmExit;
	
	Menu mnuFaltu;
	MenuItem itmOption1, itmOption2, itmOption3;
	
	TextArea txtEditor;	
		
	String fileName;
	boolean saved;
	
	MyFrame()
	{
		super("My Editor");
		planSizeAndLocation();
		addWindowListener(new MyWindowAdapter());
		addMenu();
		addControls();
		saved = true;
	}
	
	private void planSizeAndLocation()
	{
		Toolkit tk = Toolkit.getDefaultToolkit();		
		Dimension scrSize = tk.getScreenSize();
		int width = (int)(scrSize.width * 0.8f);
		int height = (int)(scrSize.height * 0.8f);
		int x = (scrSize.width - width) / 2;
		int y = (scrSize.height - height) / 2;
		
		/*
		setSize(width,height);
		setLocation(x,y);
		*/
		setBounds(x,y,width,height);
	}
	
	private void addMenu()
	{
		menubar = new MenuBar();
		
		mnuFile = new Menu("File");
		
		itmNew = new MenuItem("New");
		itmOpen = new MenuItem("Open", new MenuShortcut(KeyEvent.VK_O));
		itmSave = new MenuItem("Save", new MenuShortcut(KeyEvent.VK_S));
		itmSaveAs = new MenuItem("Save As");
		itmExit = new MenuItem("Exit", new MenuShortcut(KeyEvent.VK_X, true));
		
		
		itmNew.setShortcut(new MenuShortcut(KeyEvent.VK_N));
		
		mnuFile.add(itmNew);
		mnuFile.add(itmOpen);
		mnuFile.addSeparator();
		mnuFile.add(itmSave);
		mnuFile.add(itmSaveAs);
		mnuFile.addSeparator();
		mnuFile.add(itmExit);
		
		
		for (int i = 0 ; i < mnuFile.getItemCount(); i++)
			mnuFile.getItem(i).addActionListener(this);
		
		menubar.add(mnuFile);
		
		/*
		mnuFaltu = new Menu("Faltu");
		
		itmOption1 = new MenuItem("Option 1");
		itmOption2 = new MenuItem("Option 2");
		itmOption3 = new MenuItem("Option 3");
		
		mnuFaltu.add(itmOption1);
		mnuFaltu.add(itmOption2);
		mnuFaltu.add(itmOption3);
		
		mnuFile.add(mnuFaltu);
		*/				
		setMenuBar(menubar);
	}
	
	private void addControls()
	{
		txtEditor = new TextArea();
		add(txtEditor);
		txtEditor.addTextListener(this);
	}
	
	private boolean saveFile()
	{
		boolean flag = false;
		
		if (fileName == null)
		{
			FileDialog fd = new FileDialog(this,"My Editor - Save File",FileDialog.SAVE);
			fd.setVisible(true);
			
			if (fd.getFile() != null)
				fileName = fd.getDirectory() + fd.getFile();
				
			fd.dispose();						
		}
		
		if (fileName != null)
		{
			String matter = txtEditor.getText();
			byte aByte[] = matter.getBytes();
			try
			{
				FileOutputStream fos = new FileOutputStream(fileName);
				fos.write(aByte);
				fos.close();
				flag = true;
				saved = true;
			}
			catch (IOException exp)
			{
				flag = false;
			}			
		}				
		return flag;
	}
	
	
	private void openFile()
	{
		FileDialog fd = new FileDialog(this,"My Editor - Open File",FileDialog.LOAD);
		fd.setVisible(true);
		
		if (fd.getFile() != null)
		{
			fileName = fd.getDirectory() + fd.getFile();
			
			try
			{
				FileInputStream fis = new FileInputStream(fileName);
				int fileSize = fis.available();
				byte aByte[] = new byte[fileSize];
				fis.read(aByte);
				fis.close();
				String matter = new String(aByte);
				txtEditor.setText(matter);
				saved = true;
			}
			catch (IOException exp){}				
		}						
		fd.dispose();				
	}
	
	public void textValueChanged(TextEvent te)
	{
		saved = false;	
	}
	
	
	boolean continueAction()
	{
		boolean flag = saved;
		if (!saved)
		{
			MyDialog md = new MyDialog(this);
			md.setVisible(true);
			int choice = md.getChoice();
			if (choice == md.YES)
				flag = saveFile();
			else if (choice == md.NO)
				flag = true;
			else if (choice == md.CANCEL)
				flag = false;
		}
		return flag;
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == itmExit)
		{
			if (continueAction())
				System.exit(0);			
		}
			
		else if (ae.getSource() == itmSave)
			saveFile();
		else if (ae.getSource() == itmOpen)
			openFile();
		else if (ae.getSource() == itmNew)
		{
			txtEditor.setText("");
			txtEditor.requestFocus();
			saved = true;
			fileName = null;
		}				
	}
}

/*
 
 InputStream		the stream that brings data towards the program
 OutputStream		the stream that takes data away from the program
 
 
 
 InputStream	-->		FileInputStream
 OutputStream	-->		FileOutputStream
 
 
 **/