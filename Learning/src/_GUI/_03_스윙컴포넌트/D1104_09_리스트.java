package _GUI._03_����������Ʈ;

public class D1104_09_����Ʈ {
/*	
	 *JList<E> 
		-����Ʈ ������Ʈ��?
			���� ���� �������� ����Ʈ �������� �����ְ� �����ϴ� ������Ʈ
			JComboBox<E>�� �⺻������ ���� ���
			JScrollPane�� JList<E>�� �����Ͽ� ��ũ�� ����
	
		-JList<E>
			JDK7���� ���׸� ����Ʈ�� �ٲ�
			<E>�� ������ Ÿ���� ��ü�� �����ϴ� ����Ʈ
	
	*������
		JList<E>()
		JList<E>(Vector listData)  ���ͷκ��� �������� ���޹޴� ����Ʈ
		JList<E>(Object [] listData)
		
		
	*����Ʈ ���� ���
		1. ��ü �迭�� ������ ����
			String [] fruits= {"apple", "banana", "kiwi", "mango", "pear", "peach", 
						"berry", "strawberry", "blackberry"};
			JList<String> strList = new JList<String>(fruits);

		2. Vector�� ������ ����
			Vector v = new Vector();
			v.add("apple");
			v.add("banana");
			v.add("kiwi"); 
			JList<String> vList = new JList<String>(v);

		3. �� JList ������Ʈ�� �����ϰ� setListData()�� ������ ����
			ImageIcon [] images = {
				new ImageIcon("images/icon1.png"), 	
				new ImageIcon("images/icon2.png"),  
				new ImageIcon("images/icon3.png"),  
				new ImageIcon("images/icon4.png")
			};
			JList<ImageIcon> imageList = new JList<ImageIcon>();
			imageList.setListData(images);
			
		4. ��ũ�� ����
			JList<String> scrollList = new JList<String>(fruits);
			new JScrollPane(scrollList);

**����Ʈ�� ������ ����
	 *JList<E>�� Ư¡
		JList<E>(Vector listData)�� JList<E>(Object [] listData)�� 
		����Ʈ�� �����ǰ� ���� ���ͳ� �迭�� �����ص� ����Ʈ ���� �ȵ�
		
		-����Ʈ�� �����ϴ� ������ ���
			JList<E>�� setListData()�� ȣ��
		-����Ʈ�� ������ ���ͳ� �迭�� ���� �޾��ִ� ���
			Vector<String> v = new Vector<String>();
			v.add("Ȳ����");
			v.add("���繮");
			JList<String> nameList = new JList<String>(v);

			// ���� v�� �����ϰ�, ���� v�� ����Ʈ�� �ٽ� �ޱ�
			v.add("�賲��");
			nameList.setListData(v);

*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
