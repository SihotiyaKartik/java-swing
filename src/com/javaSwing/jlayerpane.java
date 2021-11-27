package com.javaSwing;

import javax.swing.*;

import java.awt.*;
public class jlayerpane {

	jlayerpane(){
		
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.RED);
		label1.setBounds(50,50,200,200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.GREEN);
		label2.setBounds(100,100,200,200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.BLUE);
		label3.setBounds(150,150,200,200);
		
		
		JLayeredPane layer = new JLayeredPane();
		layer.setBounds(0,0,600,600);
		layer.add(label1,JLayeredPane.DEFAULT_LAYER);
		layer.add(label2,JLayeredPane.DRAG_LAYER);
		layer.add(label3);
		
		JFrame frame = new JFrame();
		frame.setSize(600,600);
		frame.add(layer);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
}
