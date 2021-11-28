package com.javaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class colorChooser extends JFrame implements ActionListener {

	JButton button;
	JLabel label;
	
	colorChooser(){
		this.setLayout(new FlowLayout());
		
		button  = new JButton("Pick a color");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setText("some text");
		label.setFont(new Font("MV Boli",Font.PLAIN,25));
		label.setOpaque(true);
		
		this.add(button);
		this.add(label);
		this.pack(); 
		
		
		this.setVisible(true);
		}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==button) {
			JColorChooser color = new JColorChooser();
			Color c = JColorChooser.showDialog(null,"adasdads",Color.black); 
			label.setBackground(c);
		}
		
	}

}
