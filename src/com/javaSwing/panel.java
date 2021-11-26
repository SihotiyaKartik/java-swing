package com.javaSwing;

import javax.swing.*;
import java.awt.*;


public class panel {

	panel(){
		//ImageIcon image = new ImageIcon("src//img.png");
		
		
		
		JLabel label = new JLabel();
		label.setText("Hello");
		label.setBounds(0,0,50,50);
		//label.setVerticalAlignment(JLabel.BOTTOM); 
		//label.setVerticalAlignment(JLabel.BOTTOM);
		
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0,0,150,150);
		redPanel.setLayout(null);
		
		
		//redPanel.setLayout(new BorderLayout());
		
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(150,0,150,150);
		
		JPanel gPanel = new JPanel();
		gPanel.setBackground(Color.green);
		gPanel.setBounds(0,150,300,150);
		
		JFrame frame = new JFrame();
		frame.setLayout(null);
		frame.setSize(600,600);
		frame.setVisible(true);
		redPanel.add(label);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(gPanel);
		
	}
	
}
