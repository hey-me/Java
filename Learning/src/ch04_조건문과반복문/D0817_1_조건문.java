package ch04_���ǹ����ݺ���;

public class D0817_1_���ǹ� {

	public static void main(String[] args) {

//	*	if ���ǽĿ� �� �� �ִ� ��� 
//			-true / false ���� �����ϴ� �����
//			-boolean Ÿ�� ����
//		
//		���ǽ��� true�϶��� if ��� ����
//		���ǽ��� false�϶��� else ��� ����

//	*	if-else if-else��
//		���ǽ��� �������� if��

		// * if //
		int a = 10, b = 0;

		if (a >= 11) {
			a++;
		}
		b = b + a;
//				���� ����
//				if (a>=11)
//					a++;   �ϳ��� ������ ��� �߰�ȣ�� �������� �ʾƵ� ��.
//					b=b+a;
		System.out.println(a);
		System.out.println(b);

		// * if-else //
		int c = 10, d = 0;
		d = c % 2;
		String result = "";

		if (c == 0) {
			result = "¦��";
		} else {
			result = "Ȧ��";
		}
		System.out.println(result);

		// * if-else if-else // 4���� ���๮�� ��� if�� �ȿ� �����Ƿ� �ϳ��� ���� => ���ù��̴�~
		int score = 75;
		if (score >= 80) {
			System.out.println("����� A�Դϴ�.");
		} else if (score >= 80) {
			System.out.println("����� B�Դϴ�.");
		} else if (score >= 70) {
			System.out.println("����� C�Դϴ�.");
		} else {
			System.out.println("����� F�Դϴ�.");
		}

		// * Math.random() .....Math.PI(���̰�)..Math.E(e��)
//			0.0�� 0.1 ���̿� ���ϴ� double Ÿ���� ���� �ϳ��� ������.(������ ��)
//			0.0 <= Math.random() < 1.0

		// start ���� �����ϴ� n���� ���� �߿��� ������ ������ �ϳ� ��� ���� �����
//				int num = (int) (Math.random() * n ) + start;	

//			ex) 1~10������ ����
//				0.0 *10 <=        Math.random() * 10	< 1.0 *10
//				(int)0.0<= (int) (Math.random() * 10)   < (int)10.0
//				0+1		<= (int) (Math.random() * 10) + 1 < 10+1
//				1		<= (int) (Math.random() * 10) + 1 < 11
//			ex) �ֻ��� ��ȣ (1~6)
//				int num = (int) (Math.random() * 6) + 1;
	}

}
