package com.javaSwing;

import javax.swing.*;
import java.awt.*;

public class flowlayout {

	flowlayout(){
		JFrame frame = new JFrame();
		frame.setSize(600,600);
		
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,100,0));
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(250,250));
		panel.setBackground(new Color(50,100,150));
		panel.setLayout(new FlowLayout());
		
		
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		
		frame.add(panel);
		frame.setVisible(true);
	}
	
}
