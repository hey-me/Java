package ch04_���ǹ����ݺ���;

public class P155_do_while�� {

	public static void main(String[] args) {
		
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
		
		int cnt = 0;
		for (int n = 0; n <= 50; n++) {
			
			if (n%2==0) {
				cnt++;
				continue;
			} 
			System.out.println(n);
		}
		System.out.println(cnt);;
		
		
		
	}

}
