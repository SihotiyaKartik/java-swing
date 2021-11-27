package com.javaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener {

	
	JButton button;
	JTextField txtfield;
	myFrame(){
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Submit");
		button.addActionListener(this);
		
		txtfield = new JTextField();
		txtfield.setPreferredSize(new Dimension(200,40));
		
		txtfield.setFont(new Font("Consolas",Font.PLAIN,30));
		txtfield.setBackground(Color.black);
		txtfield.setForeground(Color.RED);
		txtfield.setText("username");
		
		
		this.add(button);
		this.add(txtfield);
		this.pack();
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println("welocme " + txtfield.getText());
		}
	}
	
}
