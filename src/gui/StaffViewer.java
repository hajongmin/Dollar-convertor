package gui;

 

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.JScrollPane;

import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;

 

public class StaffViewer extends JPanel{ //JFrame -> JPanel 변경

 

	WindowFrame frame;

	

	public StaffViewer(WindowFrame frame) {

		

		this.frame = frame;

		

		DefaultTableModel model= new DefaultTableModel();

		model.addColumn("Name");

		model.addColumn("Age");

		model.addColumn("Phonenumber");

		model.addColumn("Workhour");

		

		

		JTable table = new JTable(model); //테이블 생성

		JScrollPane sp = new JScrollPane(table); //스크롤바가 필요하므로  테이블 넣음

		

		this.add(sp);

	}

}