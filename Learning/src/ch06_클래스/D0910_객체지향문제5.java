package ch06_Ŭ����;

public class D0910_��ü���⹮��5 {

	public static void main(String[] args) {

		Ex5 ex5 = new Ex5();
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));
		int[] result = ex5.shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}

class Ex5 {

	int[] shuffle(int[] arr) {
		for (int i = 0; i < 100; i++) {
			int start = (int) (Math.random() * arr.length);
			int end = (int) (Math.random() * arr.length);
			int imsi = arr[start];
			arr[start] = arr[end];
			arr[end] = imsi;
		}
		return arr;
	}

}