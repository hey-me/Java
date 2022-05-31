package test1005;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		MonthSchedule april = new MonthSchedule(30); // 4월달의 할 일
		april.run();
	}
}

class Day {

	private String work; // 하루의 할 일을 나타내는 문자열

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	} // work에 대한 게터세터

	public void show() {
		if (work == null)
			System.out.println("없습니다."); // 같은 클래스의 필드는 접근제한자가 있어도 마음대로 쓸 수 있음
		else
			System.out.println(work + "입니다.");
	}

}

class MonthSchedule {
	Day[] day; // Day타입의 배열 선언만 한 상태, 생성X
	int i = 0;
	Scanner s = new Scanner(System.in);

	public MonthSchedule(int d) {
		day = new Day[d]; // 배열생성.주소만 생성된 상태. 배열요소에는 아무것도 없음 null값이 있는게 아니라 초기화X

		for (int i = 0; i < day.length; i++) {
			day[i] = new Day();
		}
	}

	void input() {
		System.out.print("날짜(1~30)?");
		int d = s.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String str = s.next();
		day[d - 1].set(str); // day[d-1]은 day타입의 참조변수 역할. 그래서 day를 쓰고 . 을 쓰면 Day의 인스턴스사용 가능
	}

	void view() {
		System.out.print("날짜(1~30)?");
		int d = s.nextInt();
		System.out.print(d + "일의 할일은 ");
		day[d - 1].show();
	}

	void finish() {
		System.out.println("프로그램을 종료합니다.");

	}

	void run() {
		System.out.println("이번달 스케쥴 프로그램");

		while (true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3)>> ");
			int n = s.nextInt();
			switch (n) {
			case 1:
				input();
				break;

			case 2:
				view();
				break;

			case 3:
				finish();
				System.exit(0);
			}
		}
	}
}