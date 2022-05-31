package ch06_클래스.d0910_객체지향_;

public class dfdffs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		
		
		for (int i = 0; i < 10000; i++) {
			int start = (int) (Math.random() * arr.length);
			int end = (int) (Math.random() * arr.length);
			int imsi = arr[start];
			arr[start] = arr[end];
			arr[end] = imsi;

		}
		System.out.println(java.util.Arrays.toString(arr));
	}

}
