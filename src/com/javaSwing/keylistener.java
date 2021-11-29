package com.javaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keylistener extends JFrame implements KeyListener {

	JLabel label;
	keylistener(){
		this.setSize(500,500);
		this.setLayout(null);
		this.addKeyListener(this);
		
		label  = new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		
		this.add(label);
		this.setVisible(true);
		
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyChar()) {
		case 'w':label.setLocation(label.getX() - 10,label.getY());
				break;
		case 'a':label.setLocation(label.getX(),label.getY() - 10);
				break;
		case 's':label.setLocation(label.getX(),label.getY() + 10);
				break;
		case 'd':label.setLocation(label.getX() + 10,label.getY());
				break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
