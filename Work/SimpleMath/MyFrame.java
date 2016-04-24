import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener, TextListener, KeyListener, FocusListener
{
	private Label l1, l2, l3;
	private TextField t1, t2, t3;
	private Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnExit;
	private char operator;
		
	MyFrame()
	{
		super("Simple Math");
		setSize(400,225);
		setLocation(400,400);
		setResizable(false);
		addWindowListener(new MyWindowAdapter());
		addControls();
		enableDisableButtons(false);
	}
	
	private void addControls()
	{
		int lblWidth = 120;
		int txtWidth = 200;
		int btnWidth = 80;
		int hgap = 5;
		int vgap = 5;
		
		setLayout(null);
		
		//create and set the size of GUI controls..
		l1 = new Label("First Number");
		l1.setSize(lblWidth, 20);
		
		l2 = new Label("Second Number");
		l2.setSize(lblWidth, 20);
		
		l3 = new Label("Result");
		l3.setSize(l1.getSize());
		
		t1 = new TextField();
		t1.setSize(txtWidth, 20);
		
		t2 = new TextField();
		t2.setSize(t1.getSize());
		
		t3 = new TextField();
		t3.setSize(t1.getSize());
		t3.setEditable(false);
		
		btnAdd = new Button("Add");
		btnAdd.setSize(btnWidth, 24);
		
		btnSubtract = new Button("Subtract");
		btnSubtract.setSize(btnAdd.getSize());
		
		btnMultiply = new Button("Multiply");
		btnMultiply.setSize(btnAdd.getSize());
		
		btnDivide = new Button("Divide");
		btnDivide.setSize(btnAdd.getSize());
		
		btnExit = new Button("Exit");
		btnExit.setSize(btnAdd.getSize());
		
		//place the controls in the frame		
		int temp = (getSize().width - (lblWidth + hgap + txtWidth)) / 2;
		int x = temp;
		int y = 35;
		
		l1.setLocation(x,y);
		add(l1);
		
		x += lblWidth + hgap;
		
		t1.setLocation(x,y);
		add(t1);
		
		x = temp;
		y += 20 + vgap;
		
		
		l2.setLocation(x,y);
		add(l2);
		
		x += lblWidth + hgap;
		
		t2.setLocation(x,y);
		add(t2);
		
		
		y += 20 + 20;		
		x = (getSize().width - (4 * btnWidth + 3 * hgap))/2;
	
		btnAdd.setLocation(x,y);
		add(btnAdd);
		x += btnWidth + hgap;
		
		btnSubtract.setLocation(x,y);
		add(btnSubtract);
		x += btnWidth + hgap;
		
		btnMultiply.setLocation(x,y);
		add(btnMultiply);
		x += btnWidth + hgap;
		
		btnDivide.setLocation(x,y);
		add(btnDivide);
		
	
		x = temp;
		y += 24 + 20;
		
		l3.setLocation(x,y);
		add(l3);
		
		x += lblWidth + hgap;
		
		t3.setLocation(x,y);
		add(t3);
		
		x = (getSize().width - btnWidth) / 2;
		y += 20 + 20;
		
		btnExit.setLocation(x,y);
		add(btnExit);			
			
			
		btnAdd.addActionListener(this);
		btnSubtract.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnDivide.addActionListener(this);
		btnExit.addActionListener(this);
		
		t1.addTextListener(this);
		t2.addTextListener(this);
		
		t1.addKeyListener(this);
		t2.addKeyListener(this);
		
		t1.addFocusListener(this);
		t2.addFocusListener(this);
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == btnExit)
		{
			System.exit(0);
			return;
		}
		else if (ae.getSource() == btnAdd)
			operator = '+';
		else if (ae.getSource() == btnSubtract)
			operator = '-';
		else if (ae.getSource() == btnMultiply)
			operator = '*';
		else if (ae.getSource() == btnDivide)
			operator = '/';
		
		computeResult();	
			
	}
	
	public void textValueChanged(TextEvent te)
	{
		boolean flag = false;
		try
		{
			float n1 = Float.parseFloat(t1.getText());
			float n2 = Float.parseFloat(t2.getText());
			flag = true;
		}
		catch (NumberFormatException exp)
		{
			flag = false;
		}
		finally
		{
			enableDisableButtons(flag);
		}
	}
	
	private void computeResult()
	{
		float n1 = Float.parseFloat(t1.getText());
		float n2 = Float.parseFloat(t2.getText());
		float n3 = 0;
		
		if (operator == '+')
			n3 = n1 + n2;
		else if (operator == '-')
			n3 = n1 - n2;
		else if (operator == '*')
			n3 = n1 * n2;
		else if (operator == '/')
			n3 = n1 / n2;
		
		t3.setText(String.valueOf(n3));
	}
	
	private void enableDisableButtons(boolean flag)
	{
		btnAdd.setEnabled(flag);
		btnSubtract.setEnabled(flag);
		btnMultiply.setEnabled(flag);
		btnDivide.setEnabled(flag);
	}
	
	
	public void keyPressed(KeyEvent ke)
	{
	}
	
	public void keyTyped(KeyEvent ke)
	{		
		int av = (int) ke.getKeyChar();
		//System.out.println(av);
		if (!(av >= 48 && av <= 57))
		{
			if (av == 46)
			{
				TextField tf = (TextField) ke.getSource();
				if (tf.getText().contains("."))
					ke.setKeyChar((char)0);
			}
			else
				ke.setKeyChar((char)0);
		}
		
	}
	
	public void keyReleased(KeyEvent ke)
	{
	}
	
	public void focusGained(FocusEvent fe)
	{
		TextField tf = (TextField) fe.getSource();
		tf.selectAll();
		tf.setBackground(Color.YELLOW);
	}
	
	public void focusLost(FocusEvent fe)
	{
		TextField tf = (TextField) fe.getSource();
		tf.setBackground(Color.WHITE);
	}
}