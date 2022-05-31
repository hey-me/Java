package baekJoon;

public class B배열_2562 {

	public static void main(String[] args) {

		int[] ar = new int[9];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 100 + 1);
		}

		int max = 0;
		int rank[] = new int[9];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (ar[j] > ar[i]) {
					rank[i]++;
				}
			}
		}

		for (int i = 0; i < rank.length; i++) {
			if (rank[i] == 0) {
				System.out.println(i + 1 + "번째 값, " + ar[i]);
			}
		}

	}

}
