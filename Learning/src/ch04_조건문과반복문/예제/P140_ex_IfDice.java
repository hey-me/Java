package ch04_조건문과반복문.예제;

public class P140_ex_IfDice {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 6) + 1;

		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
//		* Math.random()
//			0.0과 0.1 사이에 속하는 double 타입의 난수 하나를 리턴함.(랜덤한 수)
//			0.0 <= Math.random() < 1.0
//
//		* start 부터 시작하는 n개의 정수 중에서 임의의 정수를 하나 얻기 위한 연산식
//			int num = (int) (Math.random() * n ) + start;	
	}
}
