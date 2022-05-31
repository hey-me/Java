package ch06_클래스;

public class D0902_4_ex6_로또 {

	public static void main(String[] args) {
		// 1~45 정수 45개 초기화
		// calc 메소드에서 2000번 섞어서 6개의 중복되지 않은 ㄴ숫자 리턴
		// 메인에서 6개 숫자 출력

		int[] ar = new int[45];
		int[] br = new int[6];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = i + 1;
		}
		br = calc(ar);

		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i] + " ");
		}
	}

	private static int[] calc(int[] ar) {
		int[] br = new int[6];
		for (int i = 0; i < 2000; i++) {
			int start = (int) (Math.random() * ar.length);
			int end = (int) (Math.random() * ar.length);
			int imsi = ar[start];
			ar[start] = ar[end];
			ar[end] = imsi;
		}

		System.arraycopy(ar, 0, br, 0, br.length);

		return br;
	}

}
