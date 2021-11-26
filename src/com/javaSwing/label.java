package com.javaSwing;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;


public class label extends JFrame{
	
	
	label(){
		JLabel label = new JLabel();
		label.setText("Hello World");
		
		ImageIcon image = new ImageIcon("src\\img.png");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(100,200,50));
		label.setFont(new Font("MV Boli",Font.PLAIN,20));
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0,0,350,350);
		
		
		this.setSize(500,500);
		this.setLayout(null);
		this.setVisible(true);
		this.add(label);
		
	}
	
}
