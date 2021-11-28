package com.javaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class comboBox extends JFrame implements ActionListener{

	JComboBox combo;
	comboBox(){
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		String[] str = {"first","second","third"};
		combo = new JComboBox(str);
		combo.addActionListener(this);
		
		
		
		this.add(combo);
		this.pack();
		this.setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==combo) {
			System.out.println(combo.getSelectedItem());
		}
	}
	
}
