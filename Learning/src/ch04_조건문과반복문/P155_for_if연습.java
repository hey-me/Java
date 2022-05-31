package ch04_조건문과반복문;

public class P155_for_if연습 {

	public static void main(String[] args) {

//		6. 두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하세요.
//		예) 첫 번째 주사위 : 1, 두 번째 주사위 : 5  .. 2,4 .. 3,3

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 6)
					System.out.println(i + ", " + j);
			}
		}

//		7. 2x + 4y = 10의 모든 해를 구하세요. X와 Y는 정수이고 범위는 0~10이다.

		for (int a = 0; a <= 10; a++) {
			for (int b = 0; b <= 10; b++) {
				if (2 * a + 4 * b == 10) 
					System.out.println("x = " + a + ", y = " + b);
			}
		}
		
			
	}
}
