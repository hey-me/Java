package ch06_Ŭ����;

public class D0902_4_ex5_��� {

	public static void main(String[] args) {
		// 1~100 ���� 30�� �ʱ�ȭ
		// calc �޼ҵ忡�� 50 �̻��� ���

		int[] num = new int[30];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100 + 1);
		}
//		calc(num);  // void. calc�޼ҵ忡�� �ٷ� ����Ҷ� �̷��� ����.
		System.out.println(calc(num));
	}

	private static int calc(int[] num) {
		
		int sum = 0, cnt = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 50) {
				sum += num[i];
				cnt++;
			}
		}
//		System.out.println(sum / cnt);  //void�� �� ���·� �ٷ� ����ص� �ǰ�, int Ÿ������ �ٲٰ� �����ϰ� ����ص� ��.
		return sum / cnt;
	}

}
