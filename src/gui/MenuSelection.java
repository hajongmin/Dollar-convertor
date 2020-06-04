package gui;

 

import java.awt.BorderLayout;

 

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

 

import Listener.ButtonAddListener;

import Listener.ButtonViewListener;

 

public class MenuSelection extends JPanel { //JFrame -> JPanel 변경

	

	WindowFrame frame;

	

	public MenuSelection(WindowFrame frame) {

		

		this.frame = frame;  //맨처음에 시작되는게 나의 프레임에 넘어온 프레임을 넣어줌

		

		this.setLayout(new BorderLayout()); //기본 디폴트값은 flowLayout인데 거기서 border로 바꿔줌

		

		JPanel panel1 = new JPanel();   

		JPanel panel2 = new JPanel();   

		JLabel label = new JLabel("MenuSelection");  

		

		JButton button1 = new JButton("Add Staff");

		JButton button2 = new JButton("Delete Staff");

		JButton button3 = new JButton("Edit Staff");

		JButton button4 = new JButton("View Staff");

		JButton button5 = new JButton("Exit Program");

		

		button1.addActionListener(new ButtonAddListener(frame));

		button4.addActionListener(new ButtonViewListener(frame));

		

		panel1.add(label);

		panel2.add(button1);

		panel2.add(button2);

		panel2.add(button3);

		panel2.add(button4);

		panel2.add(button5);

		

		this.add(panel1, BorderLayout.NORTH ); //panel 에 panel은 추가가능

		this.add(panel2, BorderLayout.CENTER);

		

		

	}

}