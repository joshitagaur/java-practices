import java.awt.*;

class MyFrame extends Frame
{
	Button btnNorth, btnSouth, btnWest, btnEast, btnCenter;

	TextField aTextField[];
	
	
	MyFrame()
	{
		super("Layout Manager Demo");
		setSize(600,400);
		addWindowListener(new MyWindowAdapter());
		addControls();
		setVisible(true);
	}
	/*
	
	private void addControls()
	{
		btnNorth = new Button("North");
		btnSouth = new Button("South");
		btnWest = new Button("West");
		btnEast = new Button("East");
		btnCenter = new Button("Center");
		
		add(btnCenter);		
		add(btnNorth, BorderLayout.NORTH);
		add(btnSouth, BorderLayout.SOUTH);
		add(btnWest, BorderLayout.WEST);
		add(btnEast, BorderLayout.EAST);		
	}
	*/
	
	
	void addControls()
	{
		FlowLayout fl = new FlowLayout(FlowLayout.RIGHT, 10, 20);
		setLayout(fl);
		aTextField = new TextField[100];
		for (int i = 0; i < aTextField.length; i++)
		{
			aTextField[i] = new TextField("Textbox " + (i+1));
			add(aTextField[i]);
		}
	}
	
	/*
	void addControls()
	{
		GridLayout gl = new GridLayout(10,10,5,5);
		setLayout(gl);
		aTextField = new TextField[100];
		for (int i = 0; i < aTextField.length; i++)
		{
			aTextField[i] = new TextField("Textbox " + (i+1));
			add(aTextField[i]);
		}
	}
	*/
}