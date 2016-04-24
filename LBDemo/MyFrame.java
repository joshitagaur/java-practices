import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class MyFrame extends Frame implements ActionListener, ItemListener
{
	List lstSample;
	Random r;
	
	Button populateList, clearList, itemCount, selectRandom, selectedIndex, selectedItem, printAll, removeSelected;
	
	MyFrame()
	{
		super("List box demo");
		setSize(600,500);
		setResizable(false);
		addWindowListener(new MyWindowAdapter());
		r = new Random();
		addControls();		
		setVisible(true);
	}
	
	private void addControls()
	{
		//setLayout(null);
		setLayout(new FlowLayout());
		//lstSample = new List();
		lstSample = new List(10);
		/*
		lstSample.setSize(200,400);
		lstSample.setLocation(10,40);
		*/
		add(lstSample);
		
		/*
		for (int i = 1; i <= 100; i++)
		{
			//System.out.println(getRandomString());
			lstSample.add(getRandomString());
		}
		*/					
			
		lstSample.addItemListener(this);
		lstSample.addActionListener(this);
		
		populateList = new Button("Populate List");
		add(populateList);
		populateList.addActionListener(this);
		
		clearList = new Button("Clear List");
		add(clearList);
		clearList.addActionListener(this);
		
		itemCount = new Button("Item Count");
		add(itemCount);
		itemCount.addActionListener(this);
		
		selectRandom = new Button("Select Random");
		add(selectRandom);
		selectRandom.addActionListener(this);
		
		selectedIndex = new Button("Selected Index");
		add(selectedIndex);
		selectedIndex.addActionListener(this);
		
		selectedItem = new Button("Selected Item");
		add(selectedItem);
		selectedItem.addActionListener(this);							
			
		printAll = new Button("Print All");
		add(printAll);
		printAll.addActionListener(this);
		
		removeSelected = new Button("Remove Selected");
		add(removeSelected);
		removeSelected.addActionListener(this);
	}
	
	private int getWordCount()
	{
		return (1 + r.nextInt(3));
	}
	
	private String getRandomString()
	{
		int wordCount = getWordCount();
		String str = "";
		
		for (int i = 1; i <= wordCount; i++)
		{
			int length = 4 + r.nextInt(5);
			String word = "";
			for (int j = 1; j <= length; j++)
			{
				word += (char)(97 + r.nextInt(26));
			}
			str += word + " ";
		}
		return str.trim();
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		if (ie.getSource() == lstSample)
		{
			System.out.println(lstSample.getSelectedIndex());
			System.out.println(lstSample.getSelectedItem());
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == populateList)
		{
			for (int i = 1; i <= 100; i++)
				lstSample.add(getRandomString());
		}
		else if (ae.getSource() == clearList)
			lstSample.removeAll();
		else if (ae.getSource() == itemCount)
			System.out.println(lstSample.getItemCount());
		else if (ae.getSource() == selectRandom)
		{
			int index = r.nextInt(lstSample.getItemCount());
			lstSample.select(index);
		}
		else if (ae.getSource() == selectedIndex)
			System.out.println(lstSample.getSelectedIndex());	//if no item happen to be selected in list box, then getSelectedIndex() method would return -1.
		else if (ae.getSource() == selectedItem)
			System.out.println(lstSample.getSelectedItem());
		else if (ae.getSource() == printAll)
		{
			for (int i = 0; i < lstSample.getItemCount(); i++)
				System.out.println("Item " + i + " : " + lstSample.getItem(i));
		}
		else if (ae.getSource() == removeSelected)
		{
			if (lstSample.getSelectedIndex() != -1)
				lstSample.remove(lstSample.getSelectedIndex());
		}
		else if (ae.getSource() == lstSample)
		{
			int index = lstSample.getSelectedIndex();
			if (index != -1)
				lstSample.remove(index);
		}
	}
}