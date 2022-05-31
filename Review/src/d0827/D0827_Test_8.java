package d0827;

public class D0827_Test_8 {

	public static void main(String[] args) {

		int[] ar = new int[100];
		int sum = 0, cnt = 0;

		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 50 + 1);
			if (ar[i] >= 30) {
				sum += ar[i];
				cnt++;
			}
		}
		System.out.println("ЦђБе : " + sum / cnt);
	}

}
