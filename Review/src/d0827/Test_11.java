package d0827;

public class Test_11 {

	public static void main(String[] args) {

		int[] ar = new int[30];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = i + 1;
		}

		for (int i = 0; i < 500; i++) {
			int start = (int) (Math.random() * ar.length);
			int end = (int) (Math.random() * ar.length);
			int imsi = ar[start];
			ar[start] = ar[end];
			ar[end] = imsi;
		}
		for (int j = 0; j < ar.length; j++) {
			System.out.print(ar[j] + " ");
		}
	}

}
