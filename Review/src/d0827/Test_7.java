package d0827;

public class Test_7 {

	public static void main(String[] args) {

		int[] ar = new int[50];
		int cnt = 0;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 100 + 1);
			if (ar[i] >= 50) {
				cnt++;
			}
		}
		System.out.println("50이상인 수의 개수 : " + cnt);

	}

}
