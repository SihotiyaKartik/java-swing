package com.javaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class launchpage implements ActionListener{

	JFrame frame = new JFrame();
	JButton button  = new JButton("Click Me");
	
	launchpage(){
	
		button.setBounds(100,150,200,50);
		button.setFocusable(false);
		button.addActionListener(this);
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.add(button);
		frame.setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			frame.dispose();
			NewWindow window = new NewWindow();
			
		}
	}
	
}
