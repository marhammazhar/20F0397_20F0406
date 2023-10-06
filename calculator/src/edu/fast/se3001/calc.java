package edu.fast.se3001;

import java.awt.*;
import java.awt.event.*;
public class calc extends Frame implements ActionListener{
 
	Label lb11,lb12,lb13;
	TextField txt1,txt2,txt3;
	Button btn1,btn2;
	
	
	public calc() {
		lb11 = new Label ("num1");
		lb12 = new Label ("num 2");
		lb13 = new Label ("result");
		
		txt1= new TextField (10);
		txt2= new TextField (10);
		txt3= new TextField (10);
		
		btn1 = new Button("Add");
		btn2 = new Button ("Sub");
		
		add(lb11);
		add(txt1);
		
		add(lb12);
		add(txt2);
		
		add(lb13);
		add(txt3);
		
		add(btn1);
		add(btn2);
		
		setSize(200,200);
		setLocation(300,300);
		
		setLayout(new FlowLayout ());
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
        Double a, b, c;
		String x;
       a= Double.parseDouble(txt1.getText());
       b= Double.parseDouble(txt2.getText());
       x=e.getActionCommand();
      if(x=="ADD") {
       c = a + b;
       txt3.setText(c + "");
	}
      if(x=="SUBTRACT") {
    	  c= a - b;
    	  txt3.setText(c + "");
      }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
calc calculator = new calc();
calculator.setVisible(true);
	}

}
