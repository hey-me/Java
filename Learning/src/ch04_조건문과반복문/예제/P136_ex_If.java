package ch04_조건문과반복문.예제;

public class P136_ex_If {

	public static void main(String[] args) {

		int score = 93;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}

		if (score < 90)
			System.out.println("점수가 90보다 작습니다.");
		System.out.println("등급은 B입니다.");
	}

}
