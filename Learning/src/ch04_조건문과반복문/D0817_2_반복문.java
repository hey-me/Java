package ch04_���ǹ����ݺ���;

public class D0817_2_�ݺ��� {

	public static void main(String[] args) {

//		�ݺ��� : for��, while��, do-while��, break��
//		
//		for ( 1 �ʱ�ȭ�� ;  2 ���ǽ� ;  4 ������ ) {
//			 3���๮.. ���ǽ��� true�϶�	;
//		}...�߰�ȣ�� �ݺ�����
//		
		for (int i = 0; i < args.length; i++) {
			System.out.println("ȱ��");	//���๮
		}
//		
		for (int d = 0; d <= 5; d++) {
			System.out.println(d+"ȭ����");
		}  //true�̹Ƿ� ���, �� t++... true�� �ƴҶ� ���� �ݺ�
		//System.out.println(d);  �̰� �� ����??... for�ȿ��� d�� �ʱ�ȭ�߱⶧���� for��ȣ �ȿ�����! 
		
//		���� ����
//		int i;
//		for (i = 0 , �ѤѤ�, �ѤѤ�)
		
	//	1���� 100���� ���ϱ�~~
		int i = 1, sum = 0;
		for (  ;  ;  ) {
			sum+=i++;
			if(i>100)
				break;
		}
		System.out.println(sum);
//___________________________________________		
//		break������ ���� �ݺ�
		for ( ; ; ) {
			System.out.println("���ѹݺ�");
			break; //for�� �ݺ� �׸�!!
		}
		
//		10�� �ݺ� ����
		int n = 1;
		for ( ; n<=10 ; ) {   //���� �� ��� �ǳ� 
			System.out.println(n+"���ѹݺ�");
			n++;
		}
		
//		while�� 10�� �ݺ�
		int t = 1;
		while (t<=10) {
			System.out.println(t+"�ݺ�����");
			t++;
		}
		
//		do-while��
		int w = 1;
		do {
			System.out.println(w+"����");
			w++;
		} while (w<=5);
		//=> 1���� 5���� ������ w=6�̸� 1���� �����ϰ� while���� ����.
		

//		������ true �϶� while���� ��������!
		int p = 8;
		while (true) {
			System.out.println(p+"����");
			p++;
			
			if (p>10) 				
				break;
		}
//				
//				
//				
	}

}
