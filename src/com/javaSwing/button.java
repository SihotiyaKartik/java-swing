package com.javaSwing;

import javax.swing.*;

import java.util.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class button extends JFrame implements ActionListener {

	JButton button;
	JLabel label;
	Boolean flag = false;
	
	button(){
		
		ImageIcon imageicon = new ImageIcon("src//img.png");
		Image image = imageicon.getImage();
		Image newimage = image.getScaledInstance(20,20,java.awt.Image.SCALE_SMOOTH);
		imageicon = new ImageIcon(newimage);
		
		ImageIcon labelicon = new ImageIcon("src//img.png");
		
		label = new JLabel();
		label.setIcon(labelicon);
		label.setVisible(flag);
		label.setBounds(300,300,100,100);
		
		button = new JButton();
		button.setBounds(50,50,200,100);
		button.addActionListener(this);
		button.setText("Button");
		button.setFocusable(false);
		button.setIcon(imageicon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Cosmic Sans",Font.BOLD,20));
		button.setForeground(Color.cyan);
		button.setBackground(Color.black);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		this.setSize(600,600);
		this.setVisible(true);
		this.setLayout(null);
		this.add(button);
		this.add(label);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			//System.out.println("a");
			//button.setEnabled(false);
			flag = !flag;
			label.setVisible(flag);
		}
	}
	
}
