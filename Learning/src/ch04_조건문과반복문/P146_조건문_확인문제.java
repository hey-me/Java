package ch04_���ǹ����ݺ���;

public class P146_���ǹ�_Ȯ�ι��� {

	public static void main(String[] args) {

//	*	1 - if, switch
//		
//	*	2 - o,o,o,x
//	
//	*	3 - ����� B�Դϴ�.
		int score = 85;
		System.out.print("����� ");
		if (score < 70) {
			System.out.print("D");
		} else if (score < 80) {
			System.out.print("C");
		} else if (score < 90) {
			System.out.print("B");
		} else {
			System.out.print("A");
		}
		System.out.println("�Դϴ�.");

//	*	4 - � ������ ���ϼ���?
//			���ȸ�� ������ ������ �� �ֽ��ϴ�.
//			�Ϲ�ȸ�� ������ ������ �� �ֽ��ϴ�.
//			�����մϴ�.
		System.out.println("� ������ ���ϼ���?");
		char grade = 'C';
		switch (grade) {
			case 'A': case 'a': System.out.println("VVIP ������ ������ �� �ֽ��ϴ�.");
			case 'B': case 'b': System.out.println("VIP ������ ������ �� �ֽ��ϴ�.");break;
			case 'C': case 'c': System.out.println("��� ȸ�� ������ ������ �� �ֽ��ϴ�.");
			case 'D': case 'd': System.out.println("�Ϲ� ȸ�� ������ ������ �� �ֽ��ϴ�.");break;
			default:System.out.println("������ �����ϴ�.");
			}
		System.out.println("�����մϴ�.");
	}

}
