package ch04_���ǹ����ݺ���;

public class P134_if�� {

	public static void main(String[] args) {

		// if //
		int a = 10, b = 0;

		if (a >= 11) {
			a++;
		}
		b = b + a;
//		���� ����
//		if (a>=11)
//			a++;   �ϳ��� ������ ��� �߰�ȣ�� �������� �ʾƵ� ��.
//			b=b+a;
		System.out.println(a);
		System.out.println(b);

		
		// if-else //
		int c = 10, d = 0;
		d = c % 2;
		String result = "";

		if (c == 0) {
			result = "¦��";
		} else {
			result = "Ȧ��";
		}
		System.out.println(result);

		
		// if-else if-else // 4���� ���๮�� ��� if�� �ȿ� �����Ƿ� �ϳ��� ���� => ���ù��̴�~
		int score = 75;
		if (score >= 80) {
			System.out.println("����� A�Դϴ�.");
		} else if (score >= 80) {
			System.out.println("����� B�Դϴ�.");
		} else if (score >=70)	{
			System.out.println("����� C�Դϴ�.");
		} else	{
			System.out.println("����� F�Դϴ�.");
		}
		
		//	Math.random()
//			0.0�� 0.1 ���̿� ���ϴ� double Ÿ���� ���� �ϳ��� ������.(������ ��)
//			0.0 <= Math.random() <0
	}
}
