package ch04_���ǹ����ݺ���;

public class P155_for_if���� {

	public static void main(String[] args) {

//		6. �� ���� �ֻ����� ������ �� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϼ���.
//		��) ù ��° �ֻ��� : 1, �� ��° �ֻ��� : 5  .. 2,4 .. 3,3

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 6)
					System.out.println(i + ", " + j);
			}
		}

//		7. 2x + 4y = 10�� ��� �ظ� ���ϼ���. X�� Y�� �����̰� ������ 0~10�̴�.

		for (int a = 0; a <= 10; a++) {
			for (int b = 0; b <= 10; b++) {
				if (2 * a + 4 * b == 10) 
					System.out.println("x = " + a + ", y = " + b);
			}
		}
		
			
	}
}
