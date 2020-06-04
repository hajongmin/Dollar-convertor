package gui;

 

import java.awt.Panel;

 

import javax.swing.JFrame;

import javax.swing.JPanel;

 

public class WindowFrame extends JFrame{ //멀티프레임을 하는것이 별로 좋은것이 아니라서 바꾼거임

 

	MenuSelection Menuselection; //추가

	StaffAdder staffadder;

	StaffViewer staffviewer;

	

	public WindowFrame() {

		

		this.Menuselection = new MenuSelection(this); //추가

		this.staffadder = new StaffAdder(this);

		this.staffviewer = new StaffViewer(this);

		

		this.setSize(500,300); 

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		

	

		this.setupPanel(Menuselection);	

//		this.setupPanel(staffadder);		

//		this.setupPanel(staffviewer);

		

		this.setVisible(true);

	}

	

	public void setupPanel(JPanel panel) { //추가

		this.getContentPane().removeAll();

		this.getContentPane().add(panel);

		this.revalidate();

		this.repaint();

		

	}

	

	public MenuSelection getMenuselection() { //추가

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
