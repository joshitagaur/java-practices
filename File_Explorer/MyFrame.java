import java.awt.*;
import java.awt.event.*;

import java.io.*;

class MyFrame extends Frame implements TextListener, ActionListener
{
	Panel topPanel;
	Label lblAddress;
	TextField txtFolder;
	Button btnExplore;
	
	TextArea txtContent;
	
	MyFrame()
	{
		super("Explorer");
		setSize(600,400);
		addWindowListener(new MyWindowAdapter());
		addControls();
	}
	
	private void addControls()
	{
		lblAddress = new Label("Address");
		
		txtFolder = new TextField(40);
		txtFolder.addTextListener(this);
		
		btnExplore = new Button("Explore");
		btnExplore.setEnabled(false);
		btnExplore.addActionListener(this);
		
		topPanel = new Panel();
		
		topPanel.add(lblAddress);
		topPanel.add(txtFolder);
		topPanel.add(btnExplore);
		
		add(topPanel, BorderLayout.NORTH);
		
		txtContent = new TextArea();
		txtContent.setEditable(false);
		add(txtContent);
				
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
		txtContent.setText("");
		String path = txtFolder.getText().trim();
		File dir = new File(path);
		
		/*
		String aContent[] = dir.list();
		for (String f : aContent)
			System.out.println(f);
		*/
		
		File aContent[] = dir.listFiles();
		for (File f : aContent)	
			if (f.isDirectory())
			{
			
				//System.out.println(f.getName().toUpperCase());
				txtContent.append(f.getName().toUpperCase() + "\n");
				
			}
				
				
		for (File f : aContent)	
			if (f.isFile())
				//System.out.println(f.getName().toLowerCase());
				txtContent.append(f.getName().toLowerCase() + "\n");
						
	}
}