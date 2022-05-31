package ch06_클래스.d1005_객체배열;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("인원수>>");
		int n = scanner.nextInt();
		Phone p[] = new Phone[n];
		for (int i = 0; i < p.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈칸없이 입력)>>");
			String name = scanner.next();
			String tel = scanner.next();
			p[i] = new Phone(name, tel);

			if (i == n - 1) {
				System.out.println("저장되었습니다...\n");

			}
		}
		boolean is = true;
		String search;
		while (is) {
			int imsi = -1;
			System.out.print("검색할 이름>>\n");
			search = scanner.next();
			if (search.equals("그만")) {
				System.out.println("종료");
				System.exit(0);
			}
			for (int i = 0; i < p.length; i++) {
				if (p[i].getName().equals(search)){
					System.out.println(search + "의 번호는 " + p[i].getTel() + " 입니다.");
					imsi = i;
				}
			}
			if (imsi == -1) {
				System.out.println(search + "이 없습니다.");
			}
		}
	}
}

class Phone {
	private String name, tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}