package _GUI._05_고급컴포넌트;

import javax.swing.*;

public class D1108_01_메뉴만들기ex extends JFrame {

	public D1108_01_메뉴만들기ex() {
		setTitle("Menu 만들기 예제");
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");
		
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("Exit"));
		
		mb.add(screenMenu);
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		
		setJMenuBar(mb);
	}


	public static void main(String[] args) {
		new D1108_01_메뉴만들기ex();
	}

}
