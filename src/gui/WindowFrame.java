package gui;

 

import java.awt.Panel;

 

import javax.swing.JFrame;

import javax.swing.JPanel;

 

import Manager.StaffManager;

 

public class WindowFrame extends JFrame{ //��Ƽ�������� �ϴ°��� ���� �������� �ƴ϶� �ٲ۰���

	

	StaffManager staffmanager; //�߰�

	MenuSelection Menuselection;

	StaffAdder staffadder;

	StaffViewer staffviewer;

	

	public WindowFrame(StaffManager staffmanager) {

		this.staffmanager = staffmanager; //�߰�

		this.Menuselection = new MenuSelection(this);

		this.staffadder = new StaffAdder(this);

		this.staffviewer = new StaffViewer(this, this.staffmanager);

		

		

		this.setSize(500,300); 

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		this.setupPanel(Menuselection);	

		

		this.setVisible(true);

	}

	

	public void setupPanel(JPanel panel) { 

		this.getContentPane().removeAll(); 

		this.getContentPane().add(panel); 

		this.revalidate();

		this.repaint();

		

	}

	

	public MenuSelection getMenuselection() { 

		return Menuselection;

	}

 

	public void setMenuselection(MenuSelection menuselection) {

		Menuselection = menuselection;

	}

 

	public StaffAdder getStaffadder() {

		return staffadder;

	}

 

	public void setStaffadder(StaffAdder staffadder) {

		this.staffadder = staffadder;

	}

 

	public StaffViewer getStaffviewer() {

		return staffviewer;

	}

 

	public void setStaffviewer(StaffViewer staffviewer) {

		this.staffviewer = staffviewer;

	}

 

	

 

}