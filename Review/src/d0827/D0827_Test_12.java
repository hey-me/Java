package d0827;

public class D0827_Test_12 {

	public static void main(String[] args) {

		int[] ar = new int[45];
		int[] lotto = new int[6];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = i + 1;
		}

		for (int j = 0; j < 5; j++) {
			System.out.print(j + 1 + "번째 로또 번호는 : ");
			for (int i = 0; i < 500; i++) {
				int st = (int) (Math.random() * ar.length);
				int ed = (int) (Math.random() * ar.length);
				int imsi = ar[st];
				ar[st] = ar[ed];
				ar[ed] = imsi;
			}
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = ar[i];
			}
			for (int c = 0; c < lotto.length; c++) {
				System.out.print(lotto[c] + " ");

			}
			System.out.println();
		}

	}

}
