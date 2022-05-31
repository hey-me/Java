package ch06_클래스.d1005_객체배열;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30); // 4월달의 할 일
		april.run();
	}
}

class Day {
	private String work  ; // 하루의 할 일을 나타내는 문자열
	public void set(String work) {this.work = work;}
	public String get() {return work;}
	public void show() {
		if (work == null)
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}

class MonthSchedule {
	
	Scanner scanner = new Scanner(System.in);
	private Day day[];
	
	public MonthSchedule(int dday) {
		day =new Day [dday];
		for (int i = 0; i < day.length; i++) {  //인스턴스 생성 해주기.
			day[i] = new Day();
		}
	}
	
	public void input(){
		System.out.print("날짜(1~30)");
		int d = scanner.nextInt();
		System.out.print("할일(빈칸없이입력)");
		String text = scanner.next();
		day[d-1].set(text);
	}
	public void view(){
		System.out.print("날짜(1~30)");
		int d = scanner.nextInt();
		System.out.print(d+"일의 할 일은 ");
		day[d-1].show();
	}
	public void finish(){
		System.out.println("프로그램을 종료합니다");
		System.exit(0);
	}
	public void run() {
		System.out.print("이번달 스케쥴 관리 프로그램\n");
		while (true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int num = scanner.nextInt();
			if(num ==1) {
				input();
			}
			if(num ==2) {
				view();
			}
			if(num ==3) {
				finish();
				break;
			}
		}
	}
	
}
