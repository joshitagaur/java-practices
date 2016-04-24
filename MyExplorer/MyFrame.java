import java.awt.event.*;
import java.awt.*;
import java.io.*;

class MyFrame extends Frame implements TextListener, ActionListener, Runnable
{
	Panel topPanel;
	Label lblAddress;
	TextField txtFolder;
	Button btnExplore;
	
	TextArea txtContent;
	Thread t;
	
	MyFrame()
	{
		super("My Explorer");
		setSize(600,400);
		addWindowListener(new MyWindowAdapter());
		addControls();
	}
	
	
	private void addControls()
	{
		topPanel = new Panel();
		lblAddress = new Label("Address");
		
		txtFolder = new TextField(40);
		txtFolder.addTextListener(this);
		
		btnExplore = new Button("Explore");
		btnExplore.setEnabled(false);
		btnExplore.addActionListener(this);
		
		topPanel.add(lblAddress);
		topPanel.add(txtFolder);
		topPanel.add(btnExplore);
		
		txtContent = new TextArea();
		txtContent.setEditable(false);
		
		
		add(topPanel, BorderLayout.NORTH);
		add(txtContent, BorderLayout.CENTER);
	}
	
	public void textValueChanged(TextEvent te)
	{
		String str = txtFolder.getText().trim();
		boolean flag = str.length() > 0;
		
		if (flag)
		{
			File file = new File(str);
			flag = file.isDirectory();
		}
		
		btnExplore.setEnabled(flag);
	}
	
	private void exploreFolder(File dir, int level)
	{
		String indent = "";
		for (int i = 1; i <= level; i++)
			indent += "          ";
			
		//first display folder names
		File aContent[] = dir.listFiles();
		for (File f : aContent)
			if (f.isDirectory())
			{
				txtContent.append(indent + f.getName().toUpperCase() + "\n");
				exploreFolder(f,level+1);
			}
			
		//next display the file names
		for (File f : aContent)
			if (f.isFile())
				txtContent.append(indent + f.getName().toLowerCase() + "\n");
				
		txtContent.append("\n");				
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == btnExplore)
		{
			if (t == null)
			{				
				t = new Thread(this);
				t.start();				
			}
		}
	}
	
	public void run()
	{
		String str = txtFolder.getText().trim();
		File dir = new File(str);
		txtContent.setText("");
		txtContent.setText(dir.getName() + "\n");		
		exploreFolder(dir, 1);
	}
}