package ch06_클래스;

public class D0903_4_ex4 {

	public static void main(String[] args) {

		Ggggg gg = new Ggggg();
		int[] ar = new int[5];
		ar = gg.ar();
		gg.br(ar);
	}

}

class Ggggg {
	int[] ar() {
		int[] ar = new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 100 + 1);
			System.out.print(ar[i] + " ");
		}
		return ar;
	}

	void br(int[] ar) {
		int max = ar[0];
		int index = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
				index = i;
			}
		}
		System.out.println();
		System.out.println("최댓값 : " + max);
		System.out.println("인덱스값 : " + index);
	}

}