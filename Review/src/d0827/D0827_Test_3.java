package d0827;

public class D0827_Test_3 {

	public static void main(String[] args) {

		int[] ar = new int[100];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 45 + 1);
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}
