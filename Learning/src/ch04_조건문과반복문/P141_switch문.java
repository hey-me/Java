package ch04_���ǹ����ݺ���;

public class P141_switch�� {

	public static void main(String[] args) {

//	**	switch
//		������ � ���� ���°��� ���� ���๮ ����
//		if���� �ڵ尡 ����

//		switch (key-����) {
//			case value1: {
//			���๮1
//			}
//			case value2: {
//			���๮2
//			break;
//			}
//		}
//		���๮3

//		ex)
		int ran = (int) (Math.random() * 10) + 1;
		System.out.println("���� �ֻ��� �� : " + ran);

		switch (ran) {
		case 1: // ran = 1 �϶�
			System.out.println("�ֻ����� ���� 1�̴�.");
			break; // break�� ��� �� ���� ��� ran=1�̸� case1,2,3,4,5 ��� ���. ran=2�̸� 1�����ϰ� 2,3,4,5 ���.
		case 2: // ran = 2 �϶�
			System.out.println("�ֻ����� ���� 2�̴�.");
			break;
		case 3:
			System.out.println("�ֻ����� ���� 3�̴�.");
			break;
		case 4:
			System.out.println("�ֻ����� ���� 4�̴�.");
			break;
		case 5:
			System.out.println("�ֻ����� ���� 5�̴�.");
			break;

		default: // (�� ���̽��� ��� �������� �ʾ��� ��)
			System.out.println("�ֻ��� ���� 6�̴�.");
			break;
		}
	}
}
