package ch04_조건문과반복문;

public class P141_switch문 {

	public static void main(String[] args) {

//	**	switch
//		변수가 어떤 값을 갖는가에 따라 실행문 선택
//		if보다 코드가 간결

//		switch (key-변수) {
//			case value1: {
//			실행문1
//			}
//			case value2: {
//			실행문2
//			break;
//			}
//		}
//		실행문3

//		ex)
		int ran = (int) (Math.random() * 10) + 1;
		System.out.println("랜덤 주사위 값 : " + ran);

		switch (ran) {
		case 1: // ran = 1 일때
			System.out.println("주사위의 값이 1이다.");
			break; // break를 모두 안 적을 경우 ran=1이면 case1,2,3,4,5 모두 출력. ran=2이면 1제외하고 2,3,4,5 출력.
		case 2: // ran = 2 일때
			System.out.println("주사위의 값이 2이다.");
			break;
		case 3:
			System.out.println("주사위의 값이 3이다.");
			break;
		case 4:
			System.out.println("주사위의 값이 4이다.");
			break;
		case 5:
			System.out.println("주사위의 값이 5이다.");
			break;

		default: // (위 케이스에 모두 만족하지 않았을 때)
			System.out.println("주사위 값이 6이다.");
			break;
		}
	}
}
