package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StaffViewer extends JFrame{

	public StaffViewer() {

		DefaultTableModel model= new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Age");
		model.addColumn("Phonenumber");
		model.addColumn("Workhour");

		JTable table = new JTable(model); //���̺� ����
		JScrollPane sp = new JScrollPane(table); //��ũ�ѹٰ� �ʿ��ϹǷ�  ���̺� ����
		
		this.add(sp);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}