package com.javaSwing;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
public class slider implements ChangeListener {

	JFrame frame;
	JLabel label;
	JPanel panel;
	JSlider slider;
	
	slider(){
		
		frame = new JFrame("Slider");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100,50);//min,max,starting point
		
		slider.setPreferredSize(new Dimension(500,200));
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		slider.setPaintLabels(true);
		slider.setFont(new Font("MV Boli",Font.PLAIN,15));
		slider.setOrientation(SwingConstants.VERTICAL);
		
		label.setText("'C = " + slider.getValue());
		//label.setVerticalTextPosition(JLabel.BOTTOM);
		//label.setVerticalAlignment(JLabel.BOTTOM);
		slider.addChangeListener(this);
		
		
		panel.add(slider);
		panel.add(label);
		//panel.setLayout(new GridBagLayout());
		frame.add(panel);
		
		frame.setSize(500,500);
		//frame.pack();
		//frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		label.setText("'C = " + slider.getValue());
	}
	
}
