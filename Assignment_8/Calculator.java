package assignment8;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

enum Operation {
 	ADD, SUBTRACT, MULTIPLY, DIVIDE
 }


public class Calculator extends JFrame{

	public static final String ZERO = "0", ONE = "1", TWO = "2", THREE = "3", FOUR = "4", FIVE = "5", SIX = "6", SEVEN = "7", EIGHT = "8", NINE = "9";
	private JTextField resultTextField;
	private JButton add, subtract, multiply, divide, compute, clear;

 	private JButton numbers[];
 	private Font font;

 	String num;
 	String temp;
 	String sign;
 	int first;
 	int second; 

 	boolean frst = true;
 	boolean setFirst = true;
 	boolean setSecond = false;
 	
 	Operation o;
 	
 	
 	public static void main(String[] args) {
 		Calculator c = new Calculator();
 	}
 	
 	public Calculator() {
 		createComponents();
 		setLayout();
 		addComponents();
 		numAddBehaviors();
 		operationAddBehavior();
 		computeAddBehavior();
		clearAddBehavior();
 		
 	}

 	private void numAddBehaviors() {
 	
 		NumberListener nl = new NumberListener();
 		numbers[0].addActionListener(nl);
 		numbers[1].addActionListener(nl);
 		numbers[2].addActionListener(nl);
 		numbers[3].addActionListener(nl);
 		numbers[4].addActionListener(nl);
 		numbers[5].addActionListener(nl);
 		numbers[6].addActionListener(nl);
 		numbers[7].addActionListener(nl);
 		numbers[8].addActionListener(nl);
 		numbers[9].addActionListener(nl);
 		
 		
 	}
 	
 	private void operationAddBehavior() {

 		OperationListener ol = new OperationListener();
 		add.addActionListener(ol);
 		subtract.addActionListener(ol);
 		multiply.addActionListener(ol);
 		divide.addActionListener(ol);
 	}

 	private void computeAddBehavior() {
 		ComputeListener cl = new ComputeListener();
		compute.addActionListener(cl);
 	}
	
 	private void clearAddBehavior() {
 		ClearListener clr = new ClearListener();
 		clear.addActionListener(clr);
 		display();
 	}
 	
 	private void display() {
 		setSize(600, 600);
 		setVisible(true);

 	}

 	private void addComponents() {
 		Container c = getContentPane();
 		c.add(resultTextField);

 		JPanel panel = new JPanel();
 		panel.add(add);
 		panel.add(subtract);
 		panel.add(multiply);
 		panel.add(divide);
 		c.add(panel);

 		panel = new JPanel();
 		panel.add(compute);
 		panel.add(clear);
 		c.add(panel);

 		JPanel p = new JPanel();
 		p.add(numbers[1]);
 		p.add(numbers[2]);
 		p.add(numbers[3]);
 		p.add(numbers[4]);

 		c.add(p);

 		p = new JPanel();
 		p.add(numbers[5]);
 		p.add(numbers[6]);
 		p.add(numbers[7]);
 		p.add(numbers[8]);

 		c.add(p);

 		p = new JPanel();
 		p.add(numbers[9]);
 		p.add(numbers[0]);

 		c.add(p);

 	}

 	private void setLayout() {
 		GridLayout gl = new GridLayout(6, 1);
 		Container c = this.getContentPane();
 		c.setLayout(gl);

 	}

 	private void createComponents() {
 		font = new Font("TimesRoman", Font.PLAIN, 36);
 		resultTextField = new JTextField(10);
 		resultTextField.setFont(font);

 		add = new JButton("+");
 		add.setFont(font);
 		subtract = new JButton("-");
 		subtract.setFont(font);
 		multiply = new JButton("x");
 		multiply.setFont(font);
 		divide = new JButton("/");
 		divide.setFont(font);
 		compute = new JButton("=");
 		compute.setFont(font);
 		clear = new JButton("C");
 		clear.setFont(font);

 		numbers = new JButton[10];
 		for (int i = 0; i < 10; i++) {
 			numbers[i] = new JButton(i + "");
 			numbers[i].setFont(font);
 		}

 	}
 	
public class NumberListener implements ActionListener{
 		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == numbers[0]) {
				num = ZERO;
			}
			if(e.getSource() == numbers[1]) {
				num = ONE;
			}
			if(e.getSource() == numbers[2]) {
				num = TWO;
			}
			if(e.getSource() == numbers[3]) {
				num = THREE;
			}
			if(e.getSource() == numbers[4]) {
				num = FOUR;
			}
			if(e.getSource() == numbers[5]) {
				num = FIVE;
			}
			if(e.getSource() == numbers[6]) {
				num = SIX;
			}
			if(e.getSource() == numbers[7]) {
				num = SEVEN;
			}
			if(e.getSource() == numbers[8]) {
				num = EIGHT;
			}
			if(e.getSource() == numbers[9]) {
				num = NINE;
			}
			if(setFirst)
			{
				setFirstNum();
			}
			if(setSecond)
			{
				setSecondNum();
			}
			
		}
 	}	

	private void setFirstNum() {
		if(frst == true)
		{
			resultTextField.setText(num);
			temp = num;
			frst = false;
	 		first = Integer.parseInt(temp);
		}
		else
		{
			resultTextField.setText(temp + num);
			temp = temp+num;
	 		first = Integer.parseInt(temp);
	 			
	 	}
		
	}
 	
	private void setSecondNum() {
		if(frst == true)
		{
			resultTextField.setText(num);
			temp = num;
			frst = false;
			second = Integer.parseInt(temp);
		}
		else
		{
			resultTextField.setText(temp + num);
			temp = temp+num;
			second = Integer.parseInt(temp);
		}
	}
	
 	public class OperationListener implements ActionListener{
 		
 		
 		@Override
 			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == add) {
 					o = Operation.ADD;
 					sign = "+";
 				}
 				if (e.getSource() == subtract) {
 					o = Operation.SUBTRACT;
 					sign = "-";
 				}
 				if (e.getSource() == multiply) {
 					o = Operation.MULTIPLY;
 					sign = "*";
 				}
 				if (e.getSource() == divide) {
 					o = Operation.DIVIDE;
 					sign = "/";
 				}
 				resultTextField.setText(sign);
 				frst = true;
 				temp ="";
 				num = "";
 				setFirst = false;
 				setSecond = true;
 			}
 			
 	}

 	public class ComputeListener implements ActionListener{
 		
 		@Override
 			public void actionPerformed(ActionEvent e) {
 				int result = 0;
 				if(e.getSource() == compute) {
 				if (o == Operation.ADD) {
 					result = first + second;
 				}
 				if (o == Operation.SUBTRACT) {
 					result = first - second;
 				}
 				if (o == Operation.DIVIDE) {
 					result = first / second;
 				}
 				if (o == Operation.MULTIPLY) {
 					result = first * second;
 				}
 				}
 				resultTextField.setText(result + "");
 				
 			}
 	
 	}
 	
 	public class ClearListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			resultTextField.setText("  ");
			first = 0;
			second = 0;
			frst = true;
			setFirst = true;
			setSecond = false;
			temp ="";
			num = "";
		}
 		
 	}
 	
 	
}
