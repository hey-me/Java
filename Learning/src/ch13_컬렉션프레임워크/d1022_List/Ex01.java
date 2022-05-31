package ch13_ÄÃ·º¼ÇÇÁ·¹ÀÓ¿öÅ©.d1022_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

//1. Á¡½É ¸Ş´º 4°¡Áö¸¦ ÀÔ·Â¹Ş¾Æ ArrayList¿¡ ÀúÀåÇÏ°í ¸ğµÎ Ãâ·ÂÇÑ ÈÄ °¡Àå ±ä ÀÌ¸§À» Ãâ·Â

		Scanner s = new Scanner(System.in);

		List<String> list = new ArrayList<>();
		while (true) {
			try {
				label: while (true) {
					System.out.println("4°¡Áö Á¡½É ¸Ş´º ÀÔ·Â (,,,)");
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
							if (ar[i].valueOf(ar[i].charAt(j)).matches("[¤¡-¤¾¤¿-¤Ó°¡-ÆR]")) {
								break;
							} else {
								System.out.println("ÇÑ±Û·Î ÀÔ·ÂÇÏ¼¼¿ä");
								continue label;
							}
						}
					}
					for (int i = 0; i < ar.length; i++) {
						list.add(ar[i]);
					}
					int f = list.get(0).length();
//					String l = list.get(0);
					int index = 0;
					
					
					
//					for (int i = 0; i < list.size(); i++) {
//						if (f < list.get(i).length()) {
//							f = list.get(i).length();
//							index = i;
////							l = list.get(i);
//						}
//					}
//					System.out.println(l + "," + f + "±ÛÀÚ");
					System.out.println(list.get(index)+"," + list.get(index).length()+ "±ÛÀÚ");
					System.exit(f);
				}
			} catch (IndexOutOfBoundsException e) {
				System.out.println("4°³ ÀÔ·ÂÇÏ¼¼¿ä");
			}
		}
	}

}
