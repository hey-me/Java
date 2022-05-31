package ch04_조건문과반복문.예제;

public class P144_ex_SwitchString {

	public static void main(String[] args) {

		String position = "과장";

		switch (position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
			break;
		}
	}

}
