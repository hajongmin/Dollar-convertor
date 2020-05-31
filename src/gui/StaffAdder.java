package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class StaffAdder extends JFrame {

	public StaffAdder() {

		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout()); //springlayout 형태로 만들어줌

		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING); // 오른쪽 또는 왼쪽으로 붙여서 배치를 하기 위해 트레일링을 넣어줌
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName); //textfield를 위한 label
		panel.add(labelName);
		panel.add(fieldName);

		JLabel labelAge = new JLabel("Age: ", JLabel.TRAILING); //
		JTextField fieldAge = new JTextField(10);
		labelAge.setLabelFor(fieldAge);
		panel.add(labelAge);
		panel.add(fieldAge);

		JLabel labelPhonenumber = new JLabel("Phonenumber: ", JLabel.TRAILING); //
		JTextField fieldPhonenumber = new JTextField(10);
		labelPhonenumber.setLabelFor(fieldPhonenumber);
		panel.add(labelPhonenumber);
		panel.add(fieldPhonenumber);

		JLabel labelWorkhour = new JLabel("Workhour: ", JLabel.TRAILING); //
		JTextField fieldWorkhour = new JTextField(10);
		labelWorkhour.setLabelFor(fieldWorkhour);
		panel.add(labelWorkhour);
		panel.add(fieldWorkhour);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));

		SpringUtilities.makeCompactGrid(panel, 5 , 2, 6, 6, 6, 6); //panel, 칸(세로), 칸(가로), x위치, y위치

		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
