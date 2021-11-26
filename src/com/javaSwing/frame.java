package com.javaSwing;

import javax.swing.*;
import java.awt.*;

public class frame extends JFrame {

	frame(){
		this.setTitle("Java Swing");//title of frame window
		this.setSize(500,500);//set dimension of frame
		this.setResizable(false);//prevent frame from being resized
		this.setVisible(true);//makes frame visible
		this.getContentPane().setBackground(new Color(200,100,100));//set background Color
		
		ImageIcon image = new ImageIcon();//creating imageIcon
		this.setIconImage(image.getImage());//change icon of frame
		
		}

}
