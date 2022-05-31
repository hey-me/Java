package ch10_예외.d1013;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int random = (int) (Math.random() * 100 + 1);
		int cnt = 0;
		while (true) {
			try {
				System.out.println("1과 100사이의 값을 입력하세요");
				int n1 = s.nextInt();
				if (n1 < random) {
					cnt++;
					throw new IndexOutOfBoundsException();
				}
				if (n1 > random ) {
					cnt++;
					throw new NumberFormatException();
				}
				if (n1 == random) {
					System.out.println("맞췄습니다.");
					System.out.println("시도횟수는 " + cnt + "번입니다");
					System.exit(0);
				}

			} 
//			catch (IndexOutOfBoundsException e) {
//				System.out.println("더 큰 수를 입력하세요");
//			} catch (NumberFormatException e) {
//				System.out.println("더 작은 수를 입력하세요");
//			}
			catch (Exception e) {
				cnt++;
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요");
				s.next();
			}
		}
	}

}
