package d0827;

public class D0830_Test_14 {

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
			rank[i] = 1;

			for (int j = 0; j < rank.length; j++) {
				if (ar[j] > ar[i]) {
					rank[i]++;
				}
			}
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (rank[j] == i) {
					System.out.println(i + "등 - 데이터값 : " + ar[j] + ", 위치값 : " + j);
				}
			}
		}

	}
}
