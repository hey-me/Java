package ch13_컬렉션프레임워크.d1026_Map;

import java.util.*;

public class Ex02__ {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Map<String, String> map = new HashMap<String, String>();
		map.put("apple", "사과");
		map.put("mellon", "메론");
		map.put("pear", "배");

		int n = 0;
		boolean is = true;
		while (is) {
			try {
				System.out.print("1. 단어 입력 2. 단어 검색");
				n = scanner.nextInt();
				if (n == 1 || n == 2) {
					while (true) {
						switch (n) {
						case 1:
							System.out.print("영어 입력");
							String en = scanner.next();
							if (en.equals("exit")) {
								System.out.println("시스템 종료");
								System.exit(0);
							}
							System.out.print("단어 뜻 입력");
							String ko = scanner.next();
							if (ko.equals("exit")) {
								System.out.println("시스템 종료");
								System.exit(0);
							}
							map.put(en, ko);
							break;

						case 2:
							while (true) {
								System.out.print("영어 단어 입력");
								String str = scanner.next();
								if (str.equals("exit")) {
									System.out.println("시스템 종료");
									System.exit(0);
								}
								if (map.get(str) == null) {
									System.out.println("등록된 단어가 없습니다.");
								} else {
									System.out.println(map.get(str));
								}
							}
						}
					}
				} else {
					System.out.println("1과 2 중에 입력");
				}

			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요");
				scanner.next();
			}
		}

	}
}

//	}
