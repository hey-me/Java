package _GUI._05_���������Ʈ;

public class D1108_03_���� {
/*  *JToolBar
		(1):���ٸ� ������ ������Ʈ
			-���� ������Ʈ�� ���� �� �ִ� �����̳�
			-��ư�̳� �̹��� �� ��� ������Ʈ�� �����Ͽ� �̵��� �޴�ó�� ���
		(2)������ ���
			-�� �� Ȥ�� �� ���θ� ǥ��
		(3)���ٰ� �����Ǵ� ��ġ
			-���ٴ� BorderLayout ��ġ �����ڸ� ���� �����̳ʿ��� ����
				��(NORTH), ��(SOUTH), ��(WEST), ��(EAST) ���� �𼭸� �� ���� ����
			-������� �巡�׿� ���� ���� 4 ���� ��ġ�� �̵� ���� ����
			-������� �巡�׿� ���� �������� ���̾�α� ���·� �������� ������ �� ����
			-������� �巡�׿� ���� �̵��� �Ұ����ϰ� �� �� ����

  	*���� ����� ����
		1. JToolBar ��ü ����
			JToolBar toolBar = new JToolBar("Kitae Menu");

		2. ������Ʈ�� JToolBar�� ����
			toolBar.add(new JButton("New")); // ��ư ����
			toolBar.addSeparator(); // �и� ���� ����
			toolBar.add(new JTextField("text field")); // �ؽ�Ʈ�ʵ� ����

		3. JToolBar ������Ʈ�� �����̳ʿ� ��ġ
			�����̳ʴ� BorderLayout ��ġ ������
			
			// �����̳��� NORTH�� ���ٸ� �����Ѵ�.
			container.add(toolBar, BorderLayout.NORTH); 

			
	*���� ����
		(1)���� ������
			-JToolBar()
			-JToolBar(String title)
				:���ٰ� �����쿡�� ������ ���� ���������� ������ �� ������ Ÿ��Ʋ�� title ���ڿ� ����
		(2)���� �巡�� ���ϰ� �����ϴ� ���
			-JToolBar.setFloatable(boolean b)
				:b�� true�̸� �巡���Ͽ� �̵� ������ ����, false�̸� ������ �ڵ��� �������� �巡�� �Ұ���(�̵� �Ұ���)
		(3)���ٿ� separator ����
			-JToolBar.addSeparator()

  		
  	
  
  
  
  
 */
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
