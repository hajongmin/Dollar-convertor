package gui;

 

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.JScrollPane;

import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;

 

public class StaffViewer extends JPanel{ //JFrame -> JPanel ����

 

	WindowFrame frame;

	

	public StaffViewer(WindowFrame frame) {

		

		this.frame = frame;

		

		DefaultTableModel model= new DefaultTableModel();

		model.addColumn("Name");

		model.addColumn("Age");

		model.addColumn("Phonenumber");

		model.addColumn("Workhour");

		

		

		JTable table = new JTable(model); //���̺� ����

		JScrollPane sp = new JScrollPane(table); //��ũ�ѹٰ� �ʿ��ϹǷ�  ���̺� ����

		

		this.add(sp);

	}

}