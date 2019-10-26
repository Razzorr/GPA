package gpa;

import java.awt.Color;

import java.awt.Dimension;

import java.awt.Font;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.BorderFactory;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.JTextArea;

import javax.swing.border.Border;

public class gpa implements ActionListener {

	JFrame frame = new JFrame();

	JPanel panel = new JPanel();

	JTextArea tarea = new JTextArea(2, 10);

	// Buttons

	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button0 = new JButton();
	JButton buttonEqual = new JButton();
	JButton buttonCalculate = new JButton();
	JButton buttonClear = new JButton();
	JButton Acedemic = new JButton();
	JButton Honors = new JButton();
	JButton AP = new JButton();

	double number1, number2, result, result1, result2;
	int addc = 0, mulc = 0, divc = 0, subc = 0, square = 0, d = 0, A = 0;
	double gpa=0;
	double r;

	public gpa() {

		frame.setSize(450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("SBHS Unweigthed GPA calculator by Viraj");
		frame.add(panel);
		panel.setBackground(Color.YELLOW);
		Border border = BorderFactory.createLineBorder(Color.BLACK, 4);
		panel.setBorder(border);
		panel.add(tarea);
		tarea.setBackground(Color.WHITE);
		Border border1 = BorderFactory.createLineBorder(Color.BLACK);
		tarea.setBorder(border1);
		Font font = new Font("font", Font.BOLD, 15);
		tarea.setFont(font);
		tarea.setForeground(Color.black);
		tarea.setPreferredSize(new Dimension(400, 410));
		tarea.setLineWrap(true);

		panel.add(buttonClear);
		panel.add(buttonCalculate);
		panel.add(buttonEqual);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		panel.add(Honors);

		button1.setPreferredSize(new Dimension(100, 43));
		button1.setText("A");
		button1.setBackground(Color.ORANGE);

		button2.setPreferredSize(new Dimension(100, 43));
		button2.setText("A-");
		button2.setBackground(Color.ORANGE);

		button3.setPreferredSize(new Dimension(100, 43));
		button3.setText("B+");
		button3.setBackground(Color.ORANGE);

		button4.setPreferredSize(new Dimension(100, 43));
		button4.setText("B");
		button4.setBackground(Color.ORANGE);

		button5.setPreferredSize(new Dimension(100, 43));
		button5.setText("B-");
		button5.setBackground(Color.ORANGE);

		button6.setPreferredSize(new Dimension(100, 43));
		button6.setText("C+");
		button6.setBackground(Color.ORANGE);

		button7.setPreferredSize(new Dimension(100, 43));
		button7.setText("C");
		button7.setBackground(Color.ORANGE);

		button8.setPreferredSize(new Dimension(100, 43));
		button8.setText("C-");
		button8.setBackground(Color.ORANGE);

		button9.setPreferredSize(new Dimension(100, 43));
		button9.setText("D");
		button9.setBackground(Color.ORANGE);

		button0.setPreferredSize(new Dimension(100, 43));
		button0.setText("F");
		button0.setBackground(Color.ORANGE);

		buttonClear.setPreferredSize(new Dimension(133, 43));
		buttonClear.setText("Clear");
		buttonClear.setBackground(Color.ORANGE);

		Acedemic.setPreferredSize(new Dimension(133, 43));
		Acedemic.setText("Acedemic");
		Acedemic.setBackground(Color.ORANGE);

		Honors.setPreferredSize(new Dimension(133, 43));
		Honors.setText("Help");
		Honors.setBackground(Color.ORANGE);

		AP.setPreferredSize(new Dimension(133, 43));
		AP.setText("AP");
		AP.setBackground(Color.ORANGE);

		buttonEqual.setPreferredSize(new Dimension(133, 43));
		buttonEqual.setText("Enter");
		buttonEqual.setBackground(Color.ORANGE);

		buttonCalculate.setPreferredSize(new Dimension(133, 43));
		buttonCalculate.setText("Calculate");
		buttonCalculate.setBackground(Color.ORANGE);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button0.addActionListener(this);
		buttonClear.addActionListener(this);
		buttonCalculate.addActionListener(this);
		buttonEqual.addActionListener(this);
		Honors.addActionListener(this);
	}

	int zz=1;
	
	
	public void actionPerformed(ActionEvent e) {

		Object source = e.getSource();

		
			if (source == button1) {
			
				gpa += 4.00;
				tarea.setText("Gpa "+zz+": 4.00\nCurrent Gpa: "+ gpa);
				zz++;			
			}
			if (source == button2) {
				
				gpa += 3.67;
				tarea.setText("Gpa "+zz+": 3.67\nCurrent Gpa: "+ gpa);
				zz++;	
			}
			if (source == button3) {
			
				gpa += 3.33;
				tarea.setText("Gpa "+zz+": 3.33\nCurrent Gpa: "+ gpa);
				zz++;	
			}
			if (source == button4) {
				
				gpa += 3.00;
				tarea.setText("Gpa "+zz+": 3.00\nCurrent Gpa: "+ gpa);
				zz++;	
			}
			if (source == button5) {
				
				gpa += 2.67;
				tarea.setText("Gpa "+zz+": 2.67\nCurrent Gpa: "+ gpa);
				zz++;	
			}
			if (source == button6) {
			
				gpa += 2.33;
				tarea.setText("Gpa "+zz+": 2.33\nCurrent Gpa: "+ gpa);
				zz++;	
			}
			if (source == button7) {
			
				gpa += 2.00;
				tarea.setText("Gpa "+zz+": 2.00\nCurrent Gpa: "+ gpa);
				zz++;	
			}
			if (source == button8) {
				
				gpa += 1.67;
				tarea.setText("Gpa "+zz+": 1.67\nCurrent Gpa: "+ gpa);
				zz++;	
			}
			if (source == button9) {
			
				gpa += 1.00;
				tarea.setText("Gpa "+zz+": 1.00\nCurrent Gpa: "+ gpa);
				zz++;	
				
			}
			if (source == button0) {
				
				gpa += 0;
				tarea.setText("Gpa "+zz+": 0.00\nCurrent Gpa: "+ gpa);
				zz++;	
				
			}

			if (source == buttonClear) {
				gpa = 0;
				tarea.setText("");
				zz=1;
			}
			
			if(source == buttonEqual) {
				tarea.setText("");
				
			}
			
			if(source == buttonCalculate) {
				tarea.setText("");
				double totalGpa = (gpa*5)/40;
				tarea.setText("Your Unweighted Gpa is "+totalGpa);
			}
			
			if(source == Honors) {
				tarea.setText("This is a GPA caluculator made by Viraj Kulkarni. In this, you will find your unweighted gpa. To find out your weighted"
						+ "gpa which includes honors and ap classes(.5 or 1 addition) go to kviraj223.wix.com/computerprogramingx. To use this"
						+ "gpa calculator, the classes you have are 8, not more, not less and the total credits are 40 which is for this gpa calculator."
						+ "I dont think you have more or less than that, but if you do, my bad and bye. Every class you input will be 5 credits. Now, "
						+ "press the first grade you have. It will show some text with your gpa and current gpa. Don't worry about current gpa, just "
						+ "look at the gpa that is above that. The current gpa is the calculation being made to make sure it's adding properly. Then "
						+ "press enter. Enter a second grade and press enter. Repeat process 8 times, and when you get to your last one, after pressing enter,"
						+ "instead of pressing another grade, press calculate. This will now show your unweighted gpa. If it looks weird, repeat process again"
						+ "but it should work. This is for unweighted, visit website above for the weighted gpa calculator when it comes out. Thank you and bye.");
			}

		}
	
	

	

	public double number_reader() {
		double num1;

		String s;

		s = tarea.getText();

		num1 = Double.valueOf(s);

		return num1;

	}

}
