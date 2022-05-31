package codeUp;

import java.util.Scanner;

public class C1500_인삼택배 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("인삼밭 크기 k");
		int k = s.nextInt();
		System.out.print("택배가 오는데 걸리는 날짜 n");
		int n = s.nextInt();
		int[] kk = new int[k * k];

		for (int i = 0; i < k; i++) {
			System.out.println(i + 1 + "번째 인삼밭 정보 입력");
			kk[i] = s.nextInt();
		}
		//.......
	}

}
