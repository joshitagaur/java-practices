import java.awt.*;
import java.awt.event.*;

/*

				Window
				
		Frame			Dialog
						
		MyFrame			MyDialog

 */


class MyDialog extends Dialog implements ActionListener
{
	private Label lblMsg;
	private MyFrame parent;
	private Button btnYes, btnNo, btnCancel;
	private Panel buttonPanel;
	
	private int choice;
	
	static int YES, NO, CANCEL;
	
	static 
	{
		YES = 1;
		NO = 2;
		CANCEL = 3;
	}
	
	MyDialog(MyFrame parent)
	{
		super(parent, "Just A Minute",true);
		this.parent = parent;
		setSize(300,100);
		centerFrame();	
		addWindowListener(new MyWindowAdapter());
		addControls();
		choice = CANCEL;
	}
	
	private void centerFrame()
	{		
		int x = (parent.getSize().width - getSize().width) / 2;
		int y = (parent.getSize().height - getSize().height) / 2;
		x += parent.getLocation().x;
		y += parent.getLocation().y;
		setLocation(x,y);
	}
	
	private void addControls()
	{
		lblMsg = new Label("Would You Like To Save This Document ?", Label.CENTER);
		add(lblMsg);
		
		btnYes = new Button("Yes");
		btnNo = new Button("No");
		btnCancel = new Button("Cancel");
		
		buttonPanel = new Panel();
		buttonPanel.setLayout(new GridLayout(1,3));
		buttonPanel.add(btnYes);
		buttonPanel.add(btnNo);
		buttonPanel.add(btnCancel);
		
		add(buttonPanel, BorderLayout.SOUTH);
		
		btnYes.addActionListener(this);
		btnNo.addActionListener(this);
		btnCancel.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == btnYes)
			choice = YES;
		else if (ae.getSource() == btnNo)
			choice = NO;
		else if (ae.getSource() == btnCancel)
			choice = CANCEL;
		setVisible(false);
	}
	
	int getChoice()
	{
		return choice;
	}
}