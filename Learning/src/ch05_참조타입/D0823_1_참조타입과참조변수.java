package ch05_����Ÿ��;
public class D0823_1_����Ÿ�԰��������� {
	public static void main(String[] args) {
//	**	�޸�
//		- ROM : �б�����
//		- RAM : �ֱ����ġ(�ֹ߼�-ȭ�鿡 ��Ÿ���� ������)
//		=> ���� �����ġ (C:) (���ֹ߼�)        ===== ���������ġ���� �ֱ����ġ�� Loading.
//		+ JVM(Java Virtual Machine) Ŭ���������� ��������.
//		+ �޸𸮸� �� ������ ����. 
//		+ int a = 10 =>a��� �ּҿ� 10�̶�� ���� ����. (int�̹Ƿ� 4byte�� ����)
//		===>>>> ����Ÿ���� �� ���� �ּҸ� ������. (a�� ����)
		int a = 10; // ������ ������ 10�̶�� ���� ���� //�⺻������
		String name = "ȫ�浿"; // ����Ÿ�Ժ����� name�̶�� �ּҸ� ���� //�������� (���������� 4byte)

//	**	���������� ==, != ����
//		�ּҸ� ���ϴ� ��. (��x)
//		String �� ����..
		String name1 = "ȫ";
		String name2 = "ȫ";
		System.out.println(name1 == name2);
//		���� �ּҸ� ���ϹǷ� False�� ���;� ������ String�� ���� ���ڿ��� �� �� �������� �ʰ� �״�� ������. ���� True�� ����.
		String name3 = new String("ȫ");
		String name4 = new String("ȫ");
		System.out.println(name3 == name4);
//		False ... new�� �߱⶧���� ���� �����̶� ������ ���� ����.
//		���� ������ ��������� �ּҴ� �ٸ�. ���� False.

//		null �� �ƹ��͵� ������ ������ ����.   		Scanner s = null; int a = s.nextInt();
//		name2 = null; 					=>	s�� �ƹ��͵� �����Ƿ� ���� �Ұ�.. ����

		System.out.println(name3 == name4); // �ּ�. new�� ����Ǿ� ���� �ּҰ� �ٸ��Ƿ� False
		System.out.println(name3.equals(name4)); // ��. .. new�� ���� �Ǿ��ִ��� ���� �����Ƿ� True
	}

}
