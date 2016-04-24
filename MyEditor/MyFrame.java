import java.awt.*;
import java.io.*;
import java.awt.event.*;

class MyFrame extends Frame implements TextListener, ActionListener
{
	TextArea txteditor;
	MenuBar menubar;
	Menu mnuFile;
	MenuItem itmNew, itmOpen, itmSave, itmSaveas, itmExit;
	
	boolean saved;
	String fileName;
	
	MyFrame()
	{
		super("My Editor");
		sizeAndPlaceFrame();
		
		addWindowListener(new MyWindowAdapter());
		saved=true;
		fileName=null;
		
		addMenu();
		addControls();
	}
	
	private void sizeAndPlaceFrame()
	{
		Dimension scrSize=Toolkit.getDefaultToolkit().getScreenSize();
		int width=(int)(scrSize.width*0.8f);
		int height=(int)(scrSize.height*0.8f);
		int x=(scrSize.width-width)/2;
		int y=	(scrSize.height-height)/2;
		setBounds(x,y,width,height);
	}
	
	private void addControls()
	{
		txteditor=new TextArea();
		txteditor.addTextListener(this);
		add(txteditor);
	}
	
	private void addMenu()
	{
		menubar=new MenuBar();
		mnuFile=new Menu("File");
		
		itmNew=new MenuItem("New");
		itmOpen=new MenuItem("Open");
		itmSave=new MenuItem("Save");
		itmSaveas=new MenuItem("Save as");
		itmExit=new MenuItem("Exit");
		
		mnuFile.add(itmNew);
		mnuFile.add(itmOpen);
		mnuFile.addSeparator();
		mnuFile.add(itmSave);
		mnuFile.add(itmSaveas);
		mnuFile.addSeparator();
		mnuFile.add(itmExit);
		
		for (int i = 0; i < mnuFile.getItemCount(); i++)
		mnuFile.getItem(i).addActionListener(this);
			
		menubar.add(mnuFile);
		setMenuBar(menubar);

	}
	
	public void textValueChanged(TextEvent te)
	{
		saved=false;
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==itmExit)
		{
			System.exit(0);
		}
		if(ae.getSource()==itmSave)
		saveFile();
		
		if(ae.getSource()==itmSaveas)
			saveAsFile();
	}
	
	private boolean saveFile()
	{
		boolean flag = false;
		if (fileName == null)
		{
			FileDialog fd = new FileDialog(this,"My Editor-Save",FileDialog.SAVE);
			fd.setVisible(true);
			if (fd.getFile() != null)
			{
				fileName = fd.getDirectory() + fd.getFile();
			}
			fd.dispose();
		}
		
		if (fileName != null)
		{
		
			try
			{
				FileOutputStream fos = new FileOutputStream(fileName);
				String matter = txteditor.getText();
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
	
	private void saveAsFile()
	{
		boolean flag;
		if(saved==true)
			flag=true;
			
			else
				saveFile();
	}
}