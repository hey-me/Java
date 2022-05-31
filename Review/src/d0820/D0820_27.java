package d0820;

public class D0820_27 {

	public static void main(String[] args) {

		int num = 0, sum = 0;

		for (int i = 1; i <= 200; i++) {
			if (i % 3 == 0) {
				num++;
				sum += i;
			}
		}
		double avg = (double) sum / num;
		System.out.printf("%.2f", avg);

	}

}
