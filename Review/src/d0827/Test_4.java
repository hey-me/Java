package d0827;

public class Test_4 {

	public static void main(String[] args) {

		double[] ar = new double[20];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = Math.random() * 10;
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}
