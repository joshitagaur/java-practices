import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener
{
	Checkbox c1, c2, c3, c4;
	CheckboxGroup cbg1;
	
	
	MyFrame()
	{	
		super("Radio Button Demo");
		setSize(500,300);
		setResizable(false);
		addWindowListener(new MyWindowAdapter());
		addControls();
	}
	
	private void addControls()
	{
		setLayout(new FlowLayout());
		cbg1 = new CheckboxGroup();
		
		c1 = new Checkbox("DOS", cbg1,false);
		c2 = new Checkbox("Windows XP", cbg1, false);
		c3 = new Checkbox("Windows 7", cbg1, false);
		c4 = new Checkbox("Windows 8", true, cbg1);
		
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{	
		Checkbox cb = cbg1.getSelectedCheckbox();
		System.out.println("You selected : " + cb.getLabel());
	}
}



/*
class MyFrame extends Frame implements ItemListener
{
	Choice cbo;
	MyFrame()
	{
		super("Combobox Demo");
		setSize(500,300);
		setResizable(false);
		addWindowListener(new MyWindowAdapter());
		addControls();
	}
	
	private void addControls()
	{
		setLayout(new FlowLayout());
		
		cbo = new Choice();
		
		for (int i = 65; i <= 90; i++)
		{
			String str = "" + (char)i;
			//cbo.add(str);
			cbo.insert(str, 0);
		}
		cbo.addItemListener(this);
		add(cbo);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		if (ie.getSource() == cbo)
		{
			if (cbo.getSelectedIndex() == -1)
				System.out.println("Nothing is selected...");
			else
			{
				System.out.println("Index of selected item : " + cbo.getSelectedIndex());
				System.out.println("Selected Item : " + cbo.getSelectedItem());
			}
		}
	}	
}
*/