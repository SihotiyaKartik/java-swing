package com.javaSwing;

import javax.swing.*;
import java.awt.*;


public class progress {

	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar();
	
	progress(){
		
		bar.setValue(0);
		bar.setBounds(0,0,400,50);
		bar.setStringPainted(true);
		bar.setFont(new Font("MV Boli",Font.PLAIN,30));
		bar.setForeground(Color.red);		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
		
	}
	
	public void fill() {
		int count = 0;
		while(count <= 100) {
			bar.setValue(count);
			try {
				Thread.sleep(50);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			count += 1;
		}
		bar.setString("done");
	}
}
