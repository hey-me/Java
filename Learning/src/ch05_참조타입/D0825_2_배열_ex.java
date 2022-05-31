package ch05_참조타입;
import java.util.Scanner;
public class D0825_2_배열_ex {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int[] a = new int[5];

		for (int i = 0; i < a.length; i++) {
			System.out.print(i + 1 + "번째 숫자 입력");
			a[i] = s.nextInt();
		}

		int sum = 0, avg = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / a.length);

		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("최댓값 : " + max);
		int min = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("최솟값 : " + min);

	}

}
