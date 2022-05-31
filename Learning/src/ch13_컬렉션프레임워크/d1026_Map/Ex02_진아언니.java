package ch13_ÄÃ·º¼ÇÇÁ·¹ÀÓ¿öÅ©.d1026_Map;

import java.util.*;

public class Ex02_Áø¾Æ¾ğ´Ï {

	public static void main(String[] args) {

//		      1. (¿µ¾î, ÇÑ±Û) ´Ü¾î¸¦ ½ÖÀ¸·Î HashMap¿¡ ÀúÀåÇÏ°í ¿µ¾î·Î ÇÑ±ÛÀ» °Ë»öÇÏ´Â ÇÁ·Î±×·¥À» ÀÛ¼ºÇØº¸¼¼¿ä. "exit"¸¦ ÀÔ·ÂÇÏ¸é Á¾·áµÇµµ·Ï ÇÏ¼¼¿ä.
		Map<String, String> map = new HashMap<String, String>();
		Scanner s = new Scanner(System.in);

		String eng;
		String kor = null;
		boolean is = true;
		here1: while (true) {

			System.out.print("¿µ¾î¸¦ ÀÔ·Â: ");
			eng = s.nextLine();
			if (eng.equals("±×¸¸")) {
				break;
			}
			boolean t = true;
			for (int i = 0; i < eng.length(); i++) {
				if (String.valueOf(eng.charAt(i)).matches("[a-zA-z]")) {
					t = true;
				} else {
					System.out.println("¿µ¾î·Î ÀÔ·ÂÇÏ¼¼¿ä");
					t = false;
					break;
				}
			}
			if (t == false) {
				continue;
			}

			here2: while (true) {
				for (int y = 0; y < 1; y++) {
					System.out.print("ÇØ¼® ÀÔ·Â: ");
					kor = s.nextLine();
					if (kor.equals("±×¸¸")) {
						break;
					}
					for (int i = 0; i < kor.length(); i++) {
						if (String.valueOf(kor.charAt(i)).matches("[¤¡-¤¾¤¿-¤Ó°¡-ÆR]")) {
							t = true;
						} else {
							System.out.println("ÇÑ±Û·Î ÀÔ·ÂÇÏ¼¼¿ä");
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
			System.out.print("°Ë»öÇÒ ¿µ¾î¸¦ ÀÔ·Â: ");
			String key = s.next();
			String value = map.get(key);
			if (key.equals("stop")) {
				System.out.println("Á¾·áÇÕ´Ï´Ù.");
				break;
			}
			if (key != map.get(key)) {
				System.out.println("ÇØ´çÇÏ´Â ´Ü¾î°¡ ¾ø½À´Ï´Ù.");
			} else {
				System.out.println(key + "¿¡ ÇØ´çÇÏ´Â ÇÑ±ÛÀº: " + value);
			}
		}

	}

}
