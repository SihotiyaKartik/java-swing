package com.javaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class menuBar extends JFrame implements ActionListener {

	JMenuItem loaditem = new JMenuItem("load");
	JMenuItem saveitem = new JMenuItem("save");
	JMenuItem exititem = new JMenuItem("exit");
	menuBar(){
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		JMenuBar menubar = new JMenuBar();
		
		JMenu filemenu = new JMenu("file");
		JMenu editmenu = new JMenu("edit");
		JMenu helpmenu = new JMenu("help");
		
		
		
		loaditem.addActionListener(this);
		saveitem.addActionListener(this);
		exititem.addActionListener(this);

		filemenu.add(loaditem);
		filemenu.add(saveitem);
		filemenu.add(exititem);
		
		
		menubar.add(filemenu);
		menubar.add(editmenu);
		menubar.add(helpmenu);
		this.setJMenuBar(menubar);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==loaditem) {
			System.out.println("load item");
		}
		if(e.getSource()==saveitem) {
			System.out.println("save item");
		}
		if(e.getSource()==exititem) {
			System.out.println("exit item");
		}
		
	}
	
}
