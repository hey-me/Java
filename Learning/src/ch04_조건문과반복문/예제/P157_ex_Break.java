package ch04_조건문과반복문.예제;

public class P157_ex_Break {

	public static void main(String[] args) {

		while (true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if (num==6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}	

}
