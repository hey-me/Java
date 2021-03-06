package ch13_컬렉션프레임워크.d1026_Map;

import java.util.*;

public class Ex02_진아언니 {

	public static void main(String[] args) {

//		      1. (영어, 한글) 단어를 쌍으로 HashMap에 저장하고 영어로 한글을 검색하는 프로그램을 작성해보세요. "exit"를 입력하면 종료되도록 하세요.
		Map<String, String> map = new HashMap<String, String>();
		Scanner s = new Scanner(System.in);

		String eng;
		String kor = null;
		boolean is = true;
		here1: while (true) {

			System.out.print("영어를 입력: ");
			eng = s.nextLine();
			if (eng.equals("그만")) {
				break;
			}
			boolean t = true;
			for (int i = 0; i < eng.length(); i++) {
				if (String.valueOf(eng.charAt(i)).matches("[a-zA-z]")) {
					t = true;
				} else {
					System.out.println("영어로 입력하세요");
					t = false;
					break;
				}
			}
			if (t == false) {
				continue;
			}

			here2: while (true) {
				for (int y = 0; y < 1; y++) {
					System.out.print("해석 입력: ");
					kor = s.nextLine();
					if (kor.equals("그만")) {
						break;
					}
					for (int i = 0; i < kor.length(); i++) {
						if (String.valueOf(kor.charAt(i)).matches("[ㄱ-ㅎㅏ-ㅣ가-힣]")) {
							t = true;
						} else {
							System.out.println("한글로 입력하세요");
							t = false;
							break;
						}
						if (t == false) {
							break here2;
						}
					}

				}
			}
			map.put(eng, kor);
		}

		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.print("검색할 영어를 입력: ");
			String key = s.next();
			String value = map.get(key);
			if (key.equals("stop")) {
				System.out.println("종료합니다.");
				break;
			}
			if (key != map.get(key)) {
				System.out.println("해당하는 단어가 없습니다.");
			} else {
				System.out.println(key + "에 해당하는 한글은: " + value);
			}
		}

	}

}
