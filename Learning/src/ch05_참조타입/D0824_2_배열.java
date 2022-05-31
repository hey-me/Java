package ch05_참조타입;
import java.util.Scanner;
public class D0824_2_배열 {
	public static void main(String[] args) {
//	**	배열 : 같은 타입의 데이터를 연속된 공간에 나열, 각 데이터에 인덱스를 부여한 자료구조
//		== 번지(주소) 비교
//		.equals(); 문자열 비교
		int[] a = new int[5];
//		int a[]
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		System.out.println(a[2]); // 30

		for (int i = 0; i < a.length; i++) {
			a[i] = (i + 1) * 10;
			System.out.println(a[i]);
		}
		
//	** 스캐너로 계속 입력하기 - 합계, 평균 구하기
		Scanner s = new Scanner(System.in);
		System.out.print("입력");
		int ar[] = new int[5];

		for (int i = 0; i < ar.length; i++) {
			System.out.print(i + 1 + "번째 숫자 입력");
			ar[i] = s.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / ar.length);

//	**	최댓값, 최솟값 구하기
		int max = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		System.out.println("최댓값은 " + max);
		int min = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
			}
		}
		System.out.println("최솟값은 " + min);

	}
}
