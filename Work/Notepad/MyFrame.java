import java.awt.*;
import java.awt.event.*;
import java.io.*;

class MyFrame extends Frame implements TextListener, ActionListener
{
	TextArea txtEditor;
	MenuBar menubar;
	Menu mnuFile, mnuSample;
	MenuItem itmNew, itmOpen, itmSave, itmSaveAs, itmExit;
	
	String fileName;
	boolean saved;
	
	MyFrame()
	{
		super("My Notepad");
		addWindowListener(new MyWindowAdapter());
		sizeAndPlaceFrame();
		addControls();
		addMenu();
		saved = true;
		fileName = null;
	}
	
	private void sizeAndPlaceFrame()
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
		txtEditor = new TextArea();
		txtEditor.addTextListener(this);
		//add(txtEditor, BorderLayout.CENTER);
		add(txtEditor);
	}
	
	private void addMenu()
	{
		menubar = new MenuBar();
		
		mnuFile = new Menu("File");
		
		itmNew = new MenuItem("New", new MenuShortcut(KeyEvent.VK_N));
		itmOpen = new MenuItem("Open");
		itmSave = new MenuItem("Save", new MenuShortcut(KeyEvent.VK_S));
		itmSaveAs = new MenuItem("Save As");
		itmExit = new MenuItem("Exit",new MenuShortcut(KeyEvent.VK_X, true));
		
		itmOpen.setShortcut(new MenuShortcut(KeyEvent.VK_O));
		
		mnuFile.add(itmNew);
		mnuFile.add(itmOpen);
		mnuFile.addSeparator();
		mnuFile.add(itmSave);
		mnuFile.add(itmSaveAs);
		mnuFile.addSeparator();
		mnuFile.add(itmExit);
		
		
		for (int i = 0; i < mnuFile.getItemCount(); i++)
			mnuFile.getItem(i).addActionListener(this);
		
		
		/*
		mnuSample = new Menu("Sample");
		
		mnuSample.add(new MenuItem("Option1"));
		mnuSample.add(new MenuItem("Option2"));
		mnuSample.add(new MenuItem("Option3"));
		mnuSample.add(new MenuItem("Option4"));
		*/
		
		
		
		menubar.add(mnuFile);
		setMenuBar(menubar);
			
	}
	
	
	private boolean saveFile()
	{
		boolean flag = false;
		if (fileName == null)
		{
			FileDialog fd = new FileDialog(this,"My Noteapd - Save File",FileDialog.SAVE);
			fd.setVisible(true);
			if (fd.getFile() != null)
			{
				fileName = fd.getDirectory() + fd.getFile();
			}
			fd.dispose();
		}
		
		if (fileName != null)
		{
			//here code to actually save the file...
			try
			{
				FileOutputStream fos = new FileOutputStream(fileName);
				String matter = txtEditor.getText();
				byte aByte[] = matter.getBytes();
				fos.write(aByte);
				fos.close();
				saved = true;
				flag = true;
			}
			catch (IOException exp){flag = false;}			
		}
		
		return flag;
	}
	
	private void openFile()
	{
		FileDialog fd = new FileDialog(this,"My Notepad - Open File",FileDialog.LOAD);
		fd.setVisible(true);
		if (fd.getFile() != null)
		{
			try
			{
				fileName = fd.getDirectory() + fd.getFile();
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
	
	private boolean continueAction()
	{
		boolean flag = false;
		if (saved)
			flag = true;
		else
		{
			MyDialog md = new MyDialog(this);
			md.setVisible(true);
			int choice = md.getChoice();
			if (choice == MyDialog.YES)
				flag = saveFile();
			else if (choice == MyDialog.NO)
				flag = true;
			else if (choice == MyDialog.CANCEL)
				flag = false;
			md.dispose();
		}
		return flag;
	}
	
	public void textValueChanged(TextEvent te)
	{
		saved = false;
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == itmSave)
			saveFile();
		else if (ae.getSource() == itmOpen)
		{
			if (continueAction())
				openFile();
		}
		else if (ae.getSource() == itmExit)
		{
			if (continueAction())
				System.exit(0);
		}
		else if (ae.getSource() == itmNew)
		{
			if (continueAction())
			{			
				txtEditor.setText("");
				fileName = null;
				saved = true;
			}
		}
		else if (ae.getSource() == itmSaveAs)
		{
			String temp = fileName;
			fileName = null;
			if (!saveFile())
				fileName = temp;
		}
	}
	
	
}