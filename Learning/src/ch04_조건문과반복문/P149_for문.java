package ch04_���ǹ����ݺ���;

public class P149_for�� {

	public static void main(String[] args) {

//	*	
		for (int d = 0; d <= 5; d++) {
			System.out.println(d + "ȭ����");
		} // true�̹Ƿ� ���, �� t++... true�� �ƴҶ� ���� �ݺ�
			// System.out.println(d); �̰� �� ����??... for�ȿ��� d�� �ʱ�ȭ�߱⶧���� for��ȣ �ȿ�����!

		int i, sum = 0;
		for (i = 0; i <= 10; i++) { // i=2 / i=3... i=10
			System.out.println(i);
			// ¦����! if(i%2==0) { sum = sum + i }
			sum = sum + i; // sum = 1 / +2 / +3... +10
		} // Ȧ�� ���� ���! odd�� ���������ϰ� else { odd +=i}
		System.out.println("1���� 10���� �� : " + sum);

//	*	
		int a, even = 0, odd = 0;
		for (int n = 0; n <= 100; n++) {
			odd += 1;
			n++;
			even = even + n;
		}
		System.out.println("1���� 100���� ¦���� �� : " + even);
		System.out.println("1���� 100���� Ȧ���� �� : " + odd);
		
//	**	1���� 100���� ���ϱ�~~
//		int i = 1, sum = 0;
//		for (  ;  ;  ) {
//			sum+=i++;
//			if(i>100)
//			break;
//		}
//		System.out.println(sum);
	}

}
