import java.awt.*;
import java.awt.event.*;

class MyDialog extends Dialog implements ActionListener
{
	private Window parent;
	private Label lblMsg1, lblMsg2;
	private Button btnYes, btnNo, btnCancel;	
	private Panel msgPanel, buttonPanel;
	private int choice;
	
	static int YES, NO, CANCEL;
	
	static 
	{
		YES = 1;
		NO = 2;
		CANCEL = 3;
	}
	
	
	MyDialog(Window parent)
	{
		super(parent,"Just A Minute",Dialog.ModalityType.APPLICATION_MODAL);		
		this.parent = parent;
		setSize(300,100);
		setResizable(false);
		addWindowListener(new MyWindowAdapter());
		addControls();
		placeDialog();
		choice = CANCEL;
	}		
		
		
	private void addControls()
	{
		msgPanel = new Panel();
		msgPanel.setLayout(new GridLayout(2,1));
		
		lblMsg1 = new Label("Current Document Is Not Saved...!", Label.CENTER);
		lblMsg2 = new Label("Would You Like To Save The Current Document ?", Label.CENTER);
		
		msgPanel.add(lblMsg1);
		msgPanel.add(lblMsg2);
		
		add(msgPanel);
		
		
		buttonPanel = new Panel();
		buttonPanel.setLayout(new GridLayout(1,3));
		
		btnYes = new Button("Yes");
		btnNo = new Button("No");
		btnCancel = new Button("Cancel");
		
		buttonPanel.add(btnYes);
		buttonPanel.add(btnNo);
		buttonPanel.add(btnCancel);
		
		add(buttonPanel, BorderLayout.SOUTH);
		
		btnYes.addActionListener(this);
		btnNo.addActionListener(this);
		btnCancel.addActionListener(this);		
		
	}		
		
	private void placeDialog()
	{		
		int x = ((parent.getSize().width - getSize().width) / 2) + parent.getLocation().x;
		int y = ((parent.getSize().height - getSize().height) / 2) + parent.getLocation().y;
		setLocation(x,y);
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


