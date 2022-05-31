package ch05_참조타입;

public class D0826_Ex_6 {

	public static void main(String[] args) {

		int[] ar = new int[45];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = i + 1;
		}

		int[] lotto = new int[6];
		int firstIndex, lastIndex;
		int imsi;
		int[] tong = new int[45];
		int[] star = new int[45];

		for (int j = 0; j < 2000; j++) { // 몇 번을 통계를 낼까? 2000번
			for (int i = 0; i < ar.length; i++) { // i< 까지? === 몇 번 섞을지!
				firstIndex = (int) (Math.random() * ar.length); // 45대신 ar.length 써주기
				lastIndex = (int) (Math.random() * ar.length);
				imsi = ar[firstIndex];
				ar[firstIndex] = ar[lastIndex];
				ar[lastIndex] = imsi;
			}
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = ar[i];
			}

//		for (int i = 0; i < lotto.length; i++) {
//			System.out.println(i + 1 + "번째 숫자 : " + lotto[i]);
//		}

//		2000번 돌린거 통계
			for (int i = 0; i < lotto.length; i++) {
				tong[lotto[i] - 1]++;
			}
		}
//		for (int i = 0; i < tong.length; i++) {
//			System.out.println(i + 1 + "의 개수는 " + tong[i]);
//		}

//		40으로 나눈 몫을 *로 출력
		for (int i = 0; i < tong.length; i++) {
			star[i] = tong[i] / 40;
			System.out.print(i + 1 + "의 개수 : " + star[i] + "개 ");
			for (int j = 0; j < star[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
