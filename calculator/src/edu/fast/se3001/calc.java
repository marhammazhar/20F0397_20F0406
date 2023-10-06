package edu.fast.se3001;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc extends Frame implements ActionListener {

    Label lb11, lb12, lb13;
    TextField txt1, txt2, txt3;
    Button btnAdd, btnSubtract, btnMultiply;

    public calc() {
        lb11 = new Label("num1");
        lb12 = new Label("num 2");
        lb13 = new Label("result");

        txt1 = new TextField(10);
        txt2 = new TextField(10);
        txt3 = new TextField(10);

        btnAdd = new Button("Add");
        btnSubtract = new Button("Subtract");
        btnMultiply = new Button("Multiply");

        add(lb11);
        add(txt1);

        add(lb12);
        add(txt2);

        add(lb13);
        add(txt3);

        add(btnAdd);
        add(btnSubtract);
        add(btnMultiply);

        setSize(200, 200);
        setLocation(300, 300);

        setLayout(new FlowLayout());

        btnAdd.addActionListener(this);
        btnSubtract.addActionListener(this);
        btnMultiply.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Double a, b, c;
        String x;
        a = Double.parseDouble(txt1.getText());
        b = Double.parseDouble(txt2.getText());
        x = e.getActionCommand();

        if (x.equals("Add")) {
            c = a + b;
            txt3.setText(c + "");
        } else if (x.equals("Subtract")) {
            c = a - b;
            txt3.setText(c + "");
        } else if (x.equals("Multiply")) {
            c = a * b;
            txt3.setText(c + "");
        }
    }

    public static void main(String[] args) {
        calc calculator = new calc();
        calculator.setVisible(true);
    }
}
