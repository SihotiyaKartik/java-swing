package com.javaSwing;

import javax.swing.*;
import java.awt.*;

public class joptionpane {

	joptionpane(){
		
		//OptionPane.showMessageDialog(null, "MEssage", "title", JOptionPane.PLAIN_MESSAGE);
		
		
		//JOptionPane.showMessageDialog(null, "MEssage", "title", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "MEssage", "title", JOptionPane.ERROR_MESSAGE);
		//JOptionPane.showMessageDialog(null, "MEssage", "title", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "MEssage", "title", JOptionPane.WARNING_MESSAGE);
		//int ans = JOptionPane.showConfirmDialog(null, "Hey ther","Title",JOptionPane.YES_NO_CANCEL_OPTION);
		//System.out.println(ans);
		String[] list = {"first","second","third"};
		//String name = JOptionPane.showInputDialog("Name: ?");
		JOptionPane.showOptionDialog(null, "msg2", "msg1", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, list, 0);
		
	}
	
}
