package ch05_����Ÿ��.����;

public class P198_ex_AdvancedFor {

	public static void main(String[] args) {

		int[] scores = { 95, 71, 84, 93, 87 };

		int sum = 0;
		for (int score : scores) { // ������ �迭�� �ִ� ���� �ϳ��� ������ score�� ����. 	for(������ �� : ������ ��)
			sum += score;
		}
		System.out.println("���� ����=" + sum);

		double avg = (double) sum / scores.length;
		System.out.println("���� ���=" + avg);
	}

}
