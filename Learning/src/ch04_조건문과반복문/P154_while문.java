package ch04_���ǹ����ݺ���;

public class P154_while�� {

	public static void main(String[] args) {

//		break������ ���� �ݺ�
		for ( ; ; ) {
			System.out.println("���ѹݺ�");
			break; //for�� �ݺ� �׸�!!
		}
		
//		10�� �ݺ� ����
		int n = 1;
		for ( ; n<=10 ; ) {   //���� �� ��� �ǳ� 
			System.out.println("���ѹݺ�");
			n++;
		}
		
//		while��
		int t = 1;
		while (t<=10) {
			System.out.println(t+"�ݺ���");
			t++;
		}
		
		
	}

}
