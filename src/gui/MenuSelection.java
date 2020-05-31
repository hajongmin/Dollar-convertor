package gui;

 

import java.awt.BorderLayout;

 

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

 

public class MenuSelection extends JFrame { //JFrame 을 상속받는 MenuSelection 클래스

	

	public MenuSelection() {

		this.setSize(300,300); //프레임 싸이즈

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //'x'를 누르면 프로그램 종료

	

		JPanel panel1 = new JPanel();   

		JPanel panel2 = new JPanel();   

		JLabel label = new JLabel("MenuSelection");  

		

		JButton button1 = new JButton("Add Staff");

		JButton button2 = new JButton("Delete Staff");

		JButton button3 = new JButton("Edit Staff");

		JButton button4 = new JButton("View Staff");

		JButton button5 = new JButton("Exit Program");

		

		panel1.add(label);

		panel2.add(button1);

		panel2.add(button2);

		panel2.add(button3);

		panel2.add(button4);

		panel2.add(button5);

		

		this.add(panel1, BorderLayout.NORTH ); 

		this.add(panel2, BorderLayout.CENTER);

		this.setVisible(true);

		

	}

}