import java.awt.*;

class MyFrame extends Frame
{
	Label l1, l2, l3;
	
	MyFrame()
	{
		super("Sample Java Frame");
		setSize(600,400);
		setResizable(false);
		//setBackground(Color.YELLOW);
		//setUndecorated(true);
		addWindowListener(new MyWindowAdapter());
		addControls();
	}	
		
	private void addControls()
	{
		setLayout(null);
		
		l1 = new Label();
		l2 = new Label("Sample Label Control");
		l3 = new Label("Again a Label", Label.RIGHT);
		
		l1.setText("Label Control");
		
		l1.setSize(200,20);
		l2.setSize(l1.getSize());
		l3.setSize(l1.getSize());
		
		int x = 20;
		int y = 40;
		
		l1.setLocation(x,y);
		l2.setLocation(x, y + 40);
		l3.setLocation(x, y + 80);
		
		add(l1);
		add(l2);
		add(l3);
		
		l1.setBackground(Color.BLUE);
		l2.setBackground(Color.MAGENTA);
		l3.setBackground(Color.CYAN);
		
		l2.setForeground(Color.WHITE);
		l3.setForeground(Color.BLUE);
		
		l2.setAlignment(Label.CENTER);
		l1.setText(l3.getText());
		
		l3.setEnabled(false);
	}
}