package _GUI._05_���������Ʈ;

public class D1109_11_���� {
/*
 	*JTabbedPane
		���� �г��� ��ġ�� �Ͽ� ������ �����ϵ��� �����ϴ� ��

 	*������
	-JTabbedPane()
	-JTabbedPane(int tabPlacement)
		tabPlacement : JTabbedPane.TOP, JTabbedPane.BOTTOM, JTabbedPane.LEFT, JTabbedPane.RIGHT

	*���� �ֿ� �޼ҵ� 
	
	1)�� ����� ���ҿ� ���̱�
		-void addTab(String title, Component comp)
		title : ���� �̸�, comp : ���� �����ϴ� ������Ʈ
			ex)
			JTabbedPane pane = new JTabbedPane(JTabbedPane.LEFT);
			pane.addTab("tab1", new JLabel(new ImageIcon("images/img1.jpg")));
			pane.addTab("tab2", new JLabel(new ImageIcon("images/img2.jpg")));
			pane.addTab("tab3", new MyPanel());
			add(pane);

	2)���ҿ� ���� ���� ����
		int getTabCount() - ���ҿ� ���� ���� ���� ����
		
	3)���� ���õ� ��
		int getSelectedIndex()
		Component getSelectedComponent()
		
	4)�� ����
		void remove(Component comp)
		void remove(int index)
		void removeTabAt(int index)
		
	5)�� ��ġ ����
		void setTabPlacement(int tabPlacement)

	

 */
	public static void main(String[] args) {

	}

}
