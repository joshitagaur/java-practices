import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
	Panel c1, c2, c3, c4, c5, c6, mainPanel, buttonPanel;
	Button btn1, btn2, btn3, btn4, btn5, btn6;
	Button btnFirst, btnPrevious, btnNext, btnLast;
	CardLayout cl;
	
	MyFrame()
	{
		super("Card Layout Demo");
		setSize(600,400);
		setResizable(false);
		addWindowListener(new MyWindowAdapter());
		addControls();
		setVisible(true);
	}
	
	private void addControls()
	{
		buttonPanel = new Panel();
		
		btn1 = new Button("Card 1");
		btn2 = new Button("Card 2");
		btn3 = new Button("Card 3");
		btn4 = new Button("Card 4");
		btn5 = new Button("Card 5");
		btn6 = new Button("Card 6");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		
		buttonPanel.add(btn1);
		buttonPanel.add(btn2);
		buttonPanel.add(btn3);
		buttonPanel.add(btn4);
		buttonPanel.add(btn5);
		buttonPanel.add(btn6);
		
		add(buttonPanel, BorderLayout.NORTH);
		
		cl = new CardLayout();
		
		mainPanel = new Panel();
		mainPanel.setLayout(cl);
		
		c1 = new Panel();
		c2 = new Panel();
		c3 = new Panel();
		c4 = new Panel();
		c5 = new Panel();
		c6 = new Panel();
		
		c1.setBackground(Color.RED);
		c2.setBackground(Color.GREEN);
		c3.setBackground(Color.BLUE);
		c4.setBackground(Color.YELLOW);
		c5.setBackground(Color.MAGENTA);
		c6.setBackground(Color.CYAN);
		
		
		mainPanel.add("card1",c1);
		mainPanel.add("card2",c2);
		mainPanel.add("card3",c3);
		mainPanel.add("card4",c4);
		mainPanel.add("card5",c5);
		mainPanel.add("card6",c6);
		
		add(mainPanel, BorderLayout.CENTER);
		

		btnFirst = new Button("First");			
		btnPrevious = new Button("Previous");
		btnNext = new Button("Next");
		btnLast = new Button("Last");
		
		btnFirst.addActionListener(this);
		btnPrevious.addActionListener(this);
		btnNext.addActionListener(this);
		btnLast.addActionListener(this);
		
		buttonPanel.add(btnFirst);
		buttonPanel.add(btnPrevious);
		buttonPanel.add(btnNext);
		buttonPanel.add(btnLast);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == btn1)
			cl.show(mainPanel, "card1");
		else if (ae.getSource() == btn2)
			cl.show(mainPanel, "card2");
		else if (ae.getSource() == btn3)
			cl.show(mainPanel, "card3");
		else if (ae.getSource() == btn4)
			cl.show(mainPanel, "card4");
		else if (ae.getSource() == btn5)
			cl.show(mainPanel, "card5");
		else if (ae.getSource() == btn6)
			cl.show(mainPanel, "card6");
		else if (ae.getSource() == btnFirst)
			cl.first(mainPanel);
		else if (ae.getSource() == btnPrevious)
			cl.previous(mainPanel);
		else if (ae.getSource() == btnNext)
			cl.next(mainPanel);
		else if (ae.getSource() == btnLast)
			cl.last(mainPanel);
	}
}