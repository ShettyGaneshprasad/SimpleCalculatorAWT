package calculator;

import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener 
{
	Frame f = new Frame();

	Label lfn = new Label("First Number");
	Label lsn = new Label("Second Number");
	Label lres = new Label("Result");

	TextField t1 = new TextField();
	TextField t2 = new TextField();
	TextField t3 = new TextField();

	Button badd = new Button("Addition");
	Button bsub = new Button("Subtraction");
	Button bdiv = new Button("Division");
	Button bmul = new Button("Multiplication");
	Button bcancel = new Button("Cancel");

	Calculator() 
	{
		f.setLayout(new GridLayout(8, 2, 20, 10));
		f.setSize(650, 650);
		f.setVisible(true);
		// giving coordinates
		f.add(lfn);
		f.add(t1);
		f.add(lsn);
		f.add(t2);
		f.add(lres);
		f.add(t3);
		f.add(badd);
		f.add(bsub);
		f.add(bdiv);
		f.add(bmul);
		f.add(bcancel);

		badd.addActionListener(this);
		bsub.addActionListener(this);
		bdiv.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		bcancel.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e)
	{
		int n1 = Integer.parseInt(t1.getText());
		int n2 = Integer.parseInt(t2.getText());

		if (e.getSource() == badd) 
		{
			t3.setText(String.valueOf(n1 + n2));
		}
		if (e.getSource() == bsub) 
		{
			t3.setText(String.valueOf(n1 - n2));
		}
		if (e.getSource() == bmul) 
		{
			t3.setText(String.valueOf(n1 * n2));
		}
		if (e.getSource() == bdiv) {
			t3.setText(String.valueOf(n1 / n2));
		}
		if (e.getSource() == bcancel) {
			System.exit(0);
		}
	}

	public static void main(String[] args) 
	{
		new Calculator();
	}

}
