package d0827;

public class Test_6 {

	public static void main(String[] args) {

		int[] ar = new int[30];
		int sum = 0;

		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 70 + 1);
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		System.out.println();
		System.out.println("гу╟Х : " + sum);
	}

}
