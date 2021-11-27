package com.javaSwing;

import javax.swing.*;
import java.awt.*;
public class NewWindow {

	JFrame frame = new JFrame();
	JLabel label = new JLabel("Hello");
	NewWindow(){
		label.setBounds(0,0,100,50);
		label.setFont(new Font(null,Font.PLAIN,25));
		
		frame.add(label);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
}
