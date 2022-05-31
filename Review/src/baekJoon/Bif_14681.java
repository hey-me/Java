package baekJoon;

import java.util.Scanner;

public class Bif_14681 {

	public static void main(String[] args) {

//		흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다.
//		예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다.
//		점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.
//		점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오.
//		단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
		Scanner s = new Scanner(System.in);
		System.out.print("x : ");
		int x = s.nextInt();
		System.out.print("y : ");
		int y = s.nextInt();

		if (x > 0 && y > 0) {
			System.out.println(1);
		}
		if (x < 0 && y > 0) {
			System.out.println(2);
		}
		if (x < 0 && y < 0) {
			System.out.println(3);
		}
		if (x > 0 && y < 0) {
			System.out.println(4);
		}

	}

}
