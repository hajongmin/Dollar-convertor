package gui;

 

import java.util.Vector;

 

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.JScrollPane;

import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;

 

import Manager.StaffManager;

import Staff.StaffInput;

 

public class StaffViewer extends JPanel{ //JFrame -> JPanel 변경

 

	WindowFrame frame;

	StaffManager staffmanager;

	

	public StaffViewer(WindowFrame frame,StaffManager staffmanager) {

		

		this.frame = frame;

		this.staffmanager = staffmanager;

		

		System.out.println("***" + staffmanager.size() + "***");//추가

		

		DefaultTableModel model= new DefaultTableModel();

		model.addColumn("Name");

		model.addColumn("Age");

		model.addColumn("Phonenumber");

		model.addColumn("Workhour");

		

		for(int i = 0 ; i < staffmanager.size(); i++) {

			Vector row = new Vector();

			StaffInput si =staffmanager.get(i);

			row.add(si.getName());

			row.add(si.getAge());

			row.add(si.getPhonenumber());

			row.add(si.getWorkhour());

			model.addRow(row);

		}

		

		

		JTable table = new JTable(model); //테이블 생성

		JScrollPane sp = new JScrollPane(table); //스크롤바가 필요하므로  테이블 넣음

		

		this.add(sp);

	}

}