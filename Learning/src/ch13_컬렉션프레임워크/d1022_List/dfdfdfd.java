package ch13_컬렉션프레임워크.d1022_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dfdfdfd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 점심 메뉴 4가지를 입력받아 ArrayList에 저장하고 모두 출력한 후 가장 긴 이름을 출력

		Scanner s = new Scanner(System.in);

		List<String> list = new ArrayList<>();
		while (true) {
			try {
				label: while (true) {
					System.out.println("4가지 점심 메뉴 입력 (,,,)");
					String str = s.nextLine();
					str = str.trim();
					String[] ar = str.split(",");
					for (int i = 0; i < ar.length; i++) {
						ar[i] = ar[i].trim();
					}
					if (ar.length != 4) {
						throw new IndexOutOfBoundsException();
					}
					for (int i = 0; i < ar.length; i++) {
						for (int j = 0; j < ar.length; j++) {
							if (ar[i].valueOf(ar[i].charAt(j)).matches("[ㄱ-ㅎㅏ-ㅣ가-힣]")) {
								break;
							} else {
								System.out.println("한글로 입력하세요");
								continue label;
							}
						}
					}
					for (int i = 0; i < ar.length; i++) {
						list.add(ar[i]);
					}
				}
			} catch (IndexOutOfBoundsException e) {
				System.out.println("4개 입력하세요");
			}
			break;
		}
		int f = list.get(0).length();
//		String l = list.get(0);
		int index = 0;

//		for (int i = 0; i < list.size(); i++) {
//			if (f < list.get(i).length()) {
//			f = list.get(i).length();
//			index = i;
////		l = list.get(i);
//		}
//	}
//		System.out.println(l + "," + f + "글자");
		System.out.println(list.get(index) + "," + list.get(index).length() + "글자");
		

	}

}
