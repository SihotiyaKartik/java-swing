package com.javaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class fileChooser extends JFrame implements ActionListener {

	JButton button;
	
	fileChooser(){
		this.setLayout(new FlowLayout());
		
		button = new JButton("Select file");
		button.addActionListener(this);
		
		this.add(button);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			JFileChooser file = new JFileChooser();
			int response = file.showOpenDialog(null);
			if(response == JFileChooser.APPROVE_OPTION) {
				File f = new File(file.getSelectedFile().getAbsolutePath());
				System.out.println(f);
			}
		}
	}

}
