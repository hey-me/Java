package baekJoon;

import java.util.Scanner;

public class B배열_3052_xx {

	public static void main(String[] args) {
//		두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
//		예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
//		수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
//		그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
//		첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.

		Scanner scanner = new Scanner(System.in);
		int[] a = new int[10];
		int cntArr = 0;
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.print(i + 1 + "번째 수 입력");
			a[i] = scanner.nextInt();
//			a[i] = i + 1;
		}

		int[] na = new int[10];
		for (int i = 0; i < a.length; i++) {
			na[i] = a[i] % 42;
		}

		for (int i = 0; i < na.length; i++) {
			for (int j = i + 1; j < na.length; j++) {
				if (na[i] == na[j]) {
					cntArr++;
				}
			}
			if (cntArr == 0) {
				cnt++;
			}
		}

//		for (int i = 0; i < na.length; i++) {
//			System.out.println(na[i]);
//		}
		System.out.println(cnt);

	}

}
