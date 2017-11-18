package calciAWT;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.*;

import javax.swing.JFrame;

class cal extends JFrame{ 
	int ch;
	double num,ans;
	
	JTextField tf;
	JButton one;
	JButton two;
	JButton three;
	JButton four;
	JButton five;
	JButton six;
	JButton seven;
	JButton eight;
	JButton nine;
	JButton ce;
	JButton c;
	JButton add;
	JButton sub;
	JButton mul;
	JButton div;
	JButton dot;
	JButton equal;
	
	Actt actu = new Actt();
	Backy l = new Backy();
	Cleary clr = new Cleary();
	Add ad = new Add();
	Equ eq = new Equ();
	Sub s = new Sub();
	Mul m = new Mul();
	Div d = new Div();
	Zer zery = new Zer();
	
	cal()
	{
		tf = new JTextField();
		tf.setBounds(20,50,280,30);
		
		JButton ce = new JButton("CE");
		ce.setBounds(20,110,135,30);
		
		JButton c = new JButton("C");
		c.setBounds(160,110,65,30);
		
		JButton add = new JButton("+");
		add.setBounds(235,110,65,30);
		
		JButton seven = new JButton("7");
		seven.setBounds(20,150,65,30);
		
		JButton eight = new JButton("8");
		eight.setBounds(90,150,65,30);
		
		JButton nine = new JButton("9");
		nine.setBounds(160,150,65,30);
		
		JButton sub = new JButton("-");
		sub.setBounds(235,150,65,30);
		
		JButton four = new JButton("4");
		four.setBounds(20,190,65,30);
		
		JButton five = new JButton("5");
		five.setBounds(90,190,65,30);
		
		JButton six = new JButton("6");
		six.setBounds(160,190,65,30);
		
		JButton mul = new JButton("*");
		mul.setBounds(235,190,65,30);
		
		JButton one = new JButton("1");
		one.setBounds(20,230,65,30);
		
		JButton two = new JButton("2");
		two.setBounds(90,230,65,30);
		
		JButton three = new JButton("3");
		three.setBounds(160,230,65,30);
		
		JButton div = new JButton("/");
		div.setBounds(235,230,65,30);
		
		JButton zero = new JButton("0");
		zero.setBounds(20,270,65,30);
		
		JButton dot = new JButton(".");
		dot.setBounds(90,270,65,30);
		
		JButton equal = new JButton("=");
		equal.setBounds(160,270,140,30);
		
		JButton back = new JButton("Backspace");
		back.setBounds(20,310,280,30);
		
		add(back);
		add(equal);
		add(dot);
		add(zero);
		add(div);
		add(three);
		add(two);
		add(one);
		add(mul);
		add(six);
		add(five);
		add(four);
		add(sub);
		add(nine);
		add(eight);
		add(seven);
		add(add);
		add(c);
		add(ce);
		add(tf);
		
		zero.addActionListener(actu);
		one.addActionListener(actu);
		two.addActionListener(actu);
		three.addActionListener(actu);
		four.addActionListener(actu);
		five.addActionListener(actu);
		six.addActionListener(actu);
		seven.addActionListener(actu);
		eight.addActionListener(actu);
		nine.addActionListener(actu);
		dot.addActionListener(actu);
		back.addActionListener(l);
		c.addActionListener(clr);
		add.addActionListener(ad);
		equal.addActionListener(eq);
		sub.addActionListener(s);
		mul.addActionListener(m);
		div.addActionListener(d);
		ce.addActionListener(zery);
		
		setSize(350,400);
		setLayout(null);
		setVisible(true);
		addWindowListener(new WindowAdapter()
		{	
				public void windowClosing(WindowEvent e)
				{
					dispose();
				}
		
		});
		

	}
	
	class Actt  implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			tf.setText(tf.getText() + e.getActionCommand());								
		}
	}
	
	class Backy implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			int length = tf.getText().length();
			int number = tf.getText().length()-1;
			String store;
			
			if(length > 0)
			{
				StringBuilder back = new StringBuilder(tf.getText());
				back.deleteCharAt(number);
				store = back.toString();
				tf.setText(store);
			}

		}
	}
	
	class Cleary implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			tf.setText("");
			
		}
	}
	
	public void calcu(){
		switch(ch){
		case 1 : ans = num + Double.parseDouble(tf.getText());
				 tf.setText(Double.toString(ans));
				 break;
				 
		case 2 : ans = num - Double.parseDouble(tf.getText());
				 tf.setText(Double.toString(ans));
				 break;
				 
		case 3 : ans = num * Double.parseDouble(tf.getText());
				 tf.setText(Double.toString(ans));
				 break;
				 
		case 4 : ans = num / Double.parseDouble(tf.getText());
				 tf.setText(Double.toString(ans));
				 break;
		}
	}
	
	
	
	class Add implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			num = Double.parseDouble(tf.getText());
			ch = 1;
			tf.setText("");
		}
	
	}
	
	class Sub implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			num = Double.parseDouble(tf.getText());
			ch = 2;
			tf.setText("");
		}
	}
	
	class Mul implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			num = Double.parseDouble(tf.getText());
			ch = 3;
			tf.setText("");
		}
	}
	
	class Div implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			num = Double.parseDouble(tf.getText());
			ch = 4;
			tf.setText("");
		}
	}
	
	class Equ implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			calcu();
		}
	}
	
	class Zer implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			tf.setText("0");
		}
	}
	
}



public class Calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cal c = new cal();
		//c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
