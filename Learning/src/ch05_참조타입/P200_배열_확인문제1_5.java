package ch05_참조타입;

public class P200_배열_확인문제1_5 {

	public static void main(String[] args) {

//	1번.	2	
//	2번.	3
//	3번.	3, 5

//	4번.	
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		// 작성위치
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		//
		System.out.println("max = " + max);

//	5번.	
		int[][] array2 = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		double avg = 0.0;
		// 작성위치
		int cnt = 0;
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				sum += array2[i][j];
				cnt++;
			}
		}
		avg = (double) sum / cnt;
		//
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
	}

}
