package com.javaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class checkbox extends JFrame implements ActionListener{

	JButton button;
	JCheckBox check;
	
	checkbox(){
		this.setSize(600,600);
		this.setLayout(new FlowLayout());
		
		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);
		
		check = new JCheckBox();
		check.setText("I am Kartik");
		check.setFocusable(false);
		check.setFont(new Font("Consolas",Font.PLAIN,30));
		
		this.add(button);
		this.add(check);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println(check.isSelected());
		}
		
	}
	
}
