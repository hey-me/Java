package _GUI._05_고급컴포넌트;

import javax.swing.*;

public class D1108_01_메뉴만들기 {

	/*
	
	*메뉴 만들기에 필요한 스윙 컴포넌트
		JMenuBar : 메뉴바의 기능을 하는 컴포넌트
		JMenu : 파일, 편집 등 하나의 메뉴 기능을 하는 컴포넌트
		JMenuItem : 파일 메뉴 내에 저장 등 메뉴 아이템 컴포넌트
		분리선 : 메뉴 아이템 사이의 분리선
		
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
