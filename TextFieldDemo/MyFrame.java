import java.awt.*;


class MyFrame extends Frame
{
	TextField t1, t2, t3, t4;
	MyFrame()
	{
		super("Sample Java Frame");
		setSize(600,400);
		setResizable(false);
		addWindowListener(new MyWindowAdapter());
		addControls();
	}
	
	private void addControls()
	{
		int x = 10;
		int y = 40;
		
		setLayout(null);
		
		t1 = new TextField();
		t2 = new TextField("Sample Text Field");
		t3 = new TextField(10);
		t4 = new TextField("Sample Text Field Control",50);
		
		t1.setSize(200,20);
		t2.setSize(200,20);
		t3.setSize(200,20);
		t4.setSize(200,20);
		
		t1.setLocation(x,y);
		y += t1.getSize().height + 20;
		
		t2.setLocation(x,y);
		y += t1.getSize().height + 20;
		
		t3.setLocation(x,y);
		y += t1.getSize().height + 20;
		
		t4.setLocation(x,y);
		y += t1.getSize().height + 20;
		
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		
		
		t1.setText("TextField Control...");
		
		t2.setEditable(false);
		System.out.println(t2.isEditable());
		t4.setEnabled(false);
		
		t1.setEchoChar('#');
		System.out.println(t1.echoCharIsSet());
	}
}
