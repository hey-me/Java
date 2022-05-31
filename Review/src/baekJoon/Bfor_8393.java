package baekJoon;

import java.util.Scanner;

public class Bfor_8393 {

	public static void main(String[] args) {

//		두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//		입력
//		첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		Scanner s = new Scanner(System.in);
		System.out.print("n : ");
		int n = s.nextInt();
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
