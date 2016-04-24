import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener, TextListener, KeyListener
{
	Label l1, l2, l3;
	TextField t1, t2, t3;
	Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnExit;
	
	MyFrame()
	{
		super("Simple Calculator");
		setSize(350,225);
		setResizable(false);
		addWindowListener(new MyWindowAdapter());
		addControls();
		enableDisableButtons(false);
	}
	
	private void enableDisableButtons(boolean flag)
	{
		btnAdd.setEnabled(flag);
		btnSubtract.setEnabled(flag);
		btnMultiply.setEnabled(flag);
		btnDivide.setEnabled(flag);
	}
	
	private void addControls()
	{
		int x, y, temp;
		
		int lblWidth, txtWidth, btnWidth, hgap, vgap;
		lblWidth = 120;
		txtWidth = 150;
		btnWidth = 80;
		hgap = 5;
		vgap = 5;
		
		setLayout(null);
		
		y = 40;
		temp = (getSize().width - (lblWidth + hgap + txtWidth)) / 2;
		x = temp;
		
		l1 = new Label("First Number");
		l1.setSize(lblWidth, 20);
		l1.setLocation(x,y);
		add(l1);
		
		x += lblWidth + hgap;
		
		t1 = new TextField();
		t1.setSize(txtWidth, 20);
		t1.setLocation(x, y);
		add(t1);
		
		x = temp;
		y += 20 + vgap;
		
		
		l2 = new Label("Second Number");
		l2.setSize(lblWidth, 20);
		l2.setLocation(x,y);
		add(l2);
		
		x += lblWidth + hgap;
		
		t2 = new TextField();
		t2.setSize(txtWidth, 20);
		t2.setLocation(x, y);
		add(t2);
		
		x = temp;
		y += 20 + vgap;
		
		y += 20;
		
		x = (getSize().width - (btnWidth * 4 + hgap * 3)) / 2;
		
		btnAdd = new Button("Add");
		btnAdd.setSize(btnWidth, 24);
		btnAdd.setLocation(x,y);
		add(btnAdd);
		
		x += btnWidth + hgap;
		
		btnSubtract = new Button("Subtract");
		btnSubtract.setSize(btnWidth, 24);
		btnSubtract.setLocation(x,y);
		add(btnSubtract);
		
		x += btnWidth + hgap;
		
		btnMultiply = new Button("Multiply");
		btnMultiply.setSize(btnWidth, 24);
		btnMultiply.setLocation(x,y);
		add(btnMultiply);
		
		x += btnWidth + hgap;
		
		btnDivide = new Button("Divide");
		btnDivide.setSize(btnWidth, 24);
		btnDivide.setLocation(x,y);
		add(btnDivide);
		
		x = temp;
		y += 24 + vgap;		
		y += 20;
		
		
		l3 = new Label("Result");
		l3.setSize(lblWidth, 20);
		l3.setLocation(x,y);
		add(l3);
		
		x += lblWidth + hgap;
		
		t3 = new TextField();
		t3.setSize(txtWidth, 20);
		t3.setLocation(x, y);
		t3.setEditable(false);
		add(t3);
		
		x = (getSize().width - btnWidth) / 2;
		y += 20 + vgap + 10;
		
		btnExit = new Button("Exit");
		btnExit.setSize(btnWidth, 24);
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
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == btnExit)
		{
			System.exit(0);
			return;
		}
		
		float n1 = Float.parseFloat(t1.getText());
		float n2 = Float.parseFloat(t2.getText());
		float n3 = 0;
		
		if (ae.getSource() == btnAdd)
			n3 = n1 + n2;
		else if (ae.getSource() == btnSubtract)
			n3 = n1 - n2;
		else if (ae.getSource() == btnMultiply)
			n3 = n1 * n2;
		else if (ae.getSource() == btnDivide)
			n3 = n1 / n2;
			
		t3.setText(String.valueOf(n3));
		
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
	
	public void keyPressed(KeyEvent ke){}
	public void keyReleased(KeyEvent ke){}
	public void keyTyped(KeyEvent ke)
	{
		int av = (int)ke.getKeyChar();
		if (!(av >= 48 && av <= 57))
		{
			if (av == 46)
			{
				TextField tf = (TextField)ke.getSource();
				if (tf.getText().contains("."))
					ke.setKeyChar((char)0);
			}
			else
				ke.setKeyChar((char)0);
		}
	}
}

