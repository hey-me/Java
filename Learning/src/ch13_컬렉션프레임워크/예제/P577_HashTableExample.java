package ch13_컬렉션프레임워크.예제;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class P577_HashTableExample {

	public static void main(String[] args) {

		Map<String, String> map = new Hashtable<String, String>();

		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("아이디와 비번 입력");
			System.out.print("아이디 : ");
			String id = scanner.next();
			System.out.print("비번 : ");
			String pa = scanner.next();
			System.out.println();

			if (map.containsKey(id)) {
				if (map.get(id).equals(pa)) {
					System.out.println("로그인되었습니다");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("아이디가 존재하지 않습니다");
			}

		}
	}

}
