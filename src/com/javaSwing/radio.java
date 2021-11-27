package com.javaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class radio extends JFrame implements ActionListener {

	JRadioButton radio1;
	JRadioButton radio2;
	JRadioButton radio3;
	
	radio(){
		//this.setSize(500,500);
		this.setLayout(new FlowLayout());
		this.pack();
		
		 radio1 = new JRadioButton("first");
		 radio2 = new JRadioButton("second");
		 radio3 = new JRadioButton("third");
		 radio1.addActionListener(this);
		 radio2.addActionListener(this);
		 radio3.addActionListener(this);
		 
		 
		ButtonGroup button = new ButtonGroup();
		button.add(radio1);
		button.add(radio2);
		button.add(radio3);
		
		
		this.add(radio1);
		this.add(radio2);
		this.add(radio3);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==radio1) {
			System.out.println("radio 1");
		}
		if(e.getSource()==radio2) {
			System.out.println("radio 2");
		}
		if(e.getSource()==radio3) {
			System.out.println("radio 3");
		}
		
	}
	
}
