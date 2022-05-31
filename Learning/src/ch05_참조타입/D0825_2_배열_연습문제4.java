package ch05_참조타입;

public class D0825_2_배열_연습문제4 {

	public static void main(String[] args) {
//		4. 1~9를 배열에 저장하고 순서를 20번 섞어서 중복되지 않는 3자리 수를 출력
//			int start = int math random *9
//
		int[] numArr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] resultArr = new int[3];

		// 20번 섞기
		for (int i = 0; i < 20; i++) {
			int start = (int) (Math.random() * 9);
			int end = (int) (Math.random() * 9);
			int imsi = numArr[start]; // 배열에 있는 수를 바꾸려면 __변수[인덱스값]
			numArr[start] = numArr[end];
			numArr[end] = imsi;
		}
		//새로운 배열 나열
		for (int j = 0; j < numArr.length; j++) {
			System.out.println(numArr[j]);
		}
		// 앞 3자리를 나열해 3자리수 만들기
		for (int j = 0; j < resultArr.length; j++) {
			System.out.print(numArr[j]);
		}

	}
}
