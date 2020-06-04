package Listener;

 

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

 

import javax.swing.JButton;

 

import gui.StaffAdder;

import gui.StaffViewer;

import gui.WindowFrame;

 

public class ButtonAddListener implements ActionListener {

 

	

	WindowFrame frame;

	

	public ButtonAddListener(WindowFrame frame) {

		this.frame = frame;

	}

 

	@Override

	public void actionPerformed(ActionEvent e) {

		JButton b = (JButton) e.getSource();

		System.out.println(b.getText());

		StaffAdder viewer = frame.getStaffadder(); //ButtonViewListener와 이부분만 다르다.

		frame.setupPanel(viewer);

 

	}

 

}