package d0827;

import java.util.Iterator;

public class D0827_Test_13_re {

	public static void main(String[] args) {

//		13. -2000 ~ 2000 사이의 랜덤 값 20개를 배열에 저장하고 각 값의 순위를 구하여 출력하세요.(순위를 구하는 배열 생성해서 작성)
//		<<출력>>
//		1번째 값 : 000, 순위 : 00
//		2번째 값 : 000, 순위 : 00
//		3번째 값 : 000, 순위 : 00
//	13++. 13번 문제에서 순위를 * 로 표시하세요.
//		  - 1등이면 * 20개 출력, 2등이면 * 19개 출력, 20등이면 * 1개 출력
//		<<출력>>
//		1번째 값 : 000, 순위 : (1등)********************
//		2번째 값 : 000, 순위 : (20등)*
//		3번째 값 : 000, 순위 : (6등)***************
//	*13
		int[] ar = new int[20];
		int[] cnt = new int[20];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 4001 - 2000);
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					int imsi = ar[i];
					ar[i] = ar[j];
					ar[j] = imsi;

				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(i + 1 + "번째 값 : " + ar[i] + ", 순위 : " + (i + 1));
//	*13++		
			for (int j = ar.length; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
