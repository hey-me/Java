package d0827;

public class D0827_Test_9 {

	public static void main(String[] args) {

		int[] ar = new int[60];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 200 + 1);
		}
		int max = ar[0], min = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (max < ar[i]) {
				max = ar[i];
			}
			if (min > ar[i]) {
				min = ar[i];
			}
		}

		System.out.println("�ִ� : " + max);
		System.out.println("�ּڰ� : " + min);

	}

}
