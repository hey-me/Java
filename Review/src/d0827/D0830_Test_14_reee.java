package d0827;

public class D0830_Test_14_reee {

	public static void main(String[] args) {
//		14. 1차원 배열 30개에 1~1000 사이의 랜덤값을 저장하고 출력하세요.
//	    배열에 저장된 값 중에서 1등~5등의 데이터 값과 저장된 위치값(index)를
//	    출력하세요.

		int[] ar = new int[30];
		int[] rank = new int[30];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 1000 + 1);
		}
		for (int i = 0; i < ar.length; i++) {
			int cnt = 1;
			for (int j = 0; j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					cnt++;
				}
			}
			rank[i] = cnt;
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (rank[j] == i) {
					System.out.println("데이터값 : " + ar[j] + ", 위치값 : " + j);
				}
			}

		}

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (ar[j] < ar[i]) {
					int imsi = ar[j];
					ar[j] = ar[i];
					ar[i] = imsi;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

	}

}
