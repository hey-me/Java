package baekJoon;

public class BÇÔ¼ö_4673_ {

	public static void main(String[] args) {

		int[] n = new int[10000];
		for (int i = 0; i < n.length; i++) {
			n[i] = i;
		}
		int[] b = new int[10000];
//		int[] c = new int[10000];
//		int[] d = new int[10000];

		for (int i = 0; i < n.length; i++) {
			if (n[i] >= 0 && n[i] < 10) {
				b[i] = i + i;
			}
			if (n[i] >= 10 && n[i] < 100) {
				b[i] = i + i / 10 + i % 10;
			}
			if (n[i] >= 100 && n[i] < 1000) {
				b[i] = i + i / 100 + i / 10 + i % 10;
			}
			if (n[i] >= 1000 && n[i] < 10000) {
				b[i] = i + i / 1000 + i / 100 + i / 10 + i % 10;
			}

		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] <= 10000) {
//				System.out.println(b[i]);
			}
		}

	}

}
