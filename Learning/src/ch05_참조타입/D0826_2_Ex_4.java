package ch05_참조타입;

public class D0826_2_Ex_4 {
	public static void main(String[] args) {

//	*1	ar배열에 1~45숫자 넣기
		int[] ar = new int[45];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = i + 1;
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.println(i + 1 + "번째 숫자 : " + ar[i]);
		}

//	*2	1~45숫자에서 6개의 랜덤 값 뽑기 - 중복된 값이 나올 수 있다는 단점이 있음.
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			int index = (int) (Math.random() * 45);
			lotto[i] = ar[index];
		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.println(i + 1 + "번째 숫자 : " + lotto[i]);
		}

//	*3	중복 없이 추출
		int firstIndex, lastIndex;
		int imsi;
		for (int i = 0; i < ar.length; i++) { // i< 까지? === 몇 번 섞을지!
			firstIndex = (int) (Math.random() * ar.length); // 45대신 ar.length 써주기
			lastIndex = (int) (Math.random() * ar.length);
			imsi = ar[firstIndex];
			ar[firstIndex] = ar[lastIndex];
			ar[lastIndex] = imsi;
		}
		//lotto 배열에 안 넣고 한번에 하려면.
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(i + 1 + "번째 숫자 : " + ar[i]);
		}
		
//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = ar[i];
//		}
//
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.println(i + 1 + "번째 숫자 : " + lotto[i]);
//		}

	}

}
