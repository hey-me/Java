package ch06_Å¬·¡½º;

public class D0903_4_ex3 {

	public static void main(String[] args) {

		Dd dd = new Dd();
		int[] ar = new int[10];
		ar = dd.chooseNum();

		ar = dd.ascSort(ar);
		for (int a : ar) {
			System.out.print(a + " ");
		}
		System.out.println();

		ar = dd.desSort(ar);
		for (int a : ar) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}

class Dd {

	int[] chooseNum() {
		int[] ar = new int[30];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 45) + 1;
		}
		return ar;
	}

	int[] ascSort(int[] ar) {
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					int imsi = ar[j];
					ar[j] = ar[i];
					ar[i] = imsi;
				}
			}
		}
		return ar;
	}

	int[] desSort(int[] ar) {
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					int imsi = ar[j];
					ar[j] = ar[i];
					ar[i] = imsi;
				}
			}
		}
		return ar;
	}

}