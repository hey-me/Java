package _GUI._05_고급컴포넌트;

public class D1109_11_탭팬 {
/*
 	*JTabbedPane
		여러 패널을 겹치게 하여 공간을 공유하도록 지원하는 팬

 	*생성자
	-JTabbedPane()
	-JTabbedPane(int tabPlacement)
		tabPlacement : JTabbedPane.TOP, JTabbedPane.BOTTOM, JTabbedPane.LEFT, JTabbedPane.RIGHT

	*탭팬 주요 메소드 
	
	1)탭 만들어 탭팬에 붙이기
		-void addTab(String title, Component comp)
		title : 탭의 이름, comp : 탭을 구성하는 컴포넌트
			ex)
			JTabbedPane pane = new JTabbedPane(JTabbedPane.LEFT);
			pane.addTab("tab1", new JLabel(new ImageIcon("images/img1.jpg")));
			pane.addTab("tab2", new JLabel(new ImageIcon("images/img2.jpg")));
			pane.addTab("tab3", new MyPanel());
			add(pane);

	2)탭팬에 붙은 탭의 개수
		int getTabCount() - 탭팬에 붙은 탭의 개수 리턴
		
	3)현재 선택된 탭
		int getSelectedIndex()
		Component getSelectedComponent()
		
	4)탭 삭제
		void remove(Component comp)
		void remove(int index)
		void removeTabAt(int index)
		
	5)탭 위치 변경
		void setTabPlacement(int tabPlacement)

	

 */
	public static void main(String[] args) {

	}

}
