package _GUI._05_���������Ʈ;

import javax.swing.*;

public class D1108_01_�޴������ {

	/*
	
	*�޴� ����⿡ �ʿ��� ���� ������Ʈ
		JMenuBar : �޴����� ����� �ϴ� ������Ʈ
		JMenu : ����, ���� �� �ϳ��� �޴� ����� �ϴ� ������Ʈ
		JMenuItem : ���� �޴� ���� ���� �� �޴� ������ ������Ʈ
		�и��� : �޴� ������ ������ �и���
		
	*

	
	
	
	 */
	public static void main(String[] args) {
		
		JMenuBar mb = new JMenuBar();
		
		JMenu sMenu = new JMenu("Screen");
		mb.add(sMenu);
		
		sMenu.add(new JMenuItem("Load"));
		sMenu.add(new JMenuItem("Hide"));
		sMenu.add(new JMenuItem("ReShow"));
		sMenu.addSeparator();
		sMenu.add(new JMenuItem("SaveAs"));
		
//		frame.setJMenuBar(mb);
	}

}
