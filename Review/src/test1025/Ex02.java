package test1025;

import java.util.*;

public class Ex02 {
	static Scanner s;
	static Map<String, String> map=new HashMap<String, String>();
	public static void main(String[] args) {

//		2. 1¹ø ¹®Á¦¸¦ È®ÀåÇÏ¿© »ç¿ëÀÚ°¡ ´Ü¾îÀÇ ½Ö(¿µ¾î, ÇÑ±Û)À» Ãß°¡ÇÒ ¼ö ÀÖµµ·Ï ±â´ÉÀ» Ãß°¡ÇØ¼­ ÀÛ¼ºÇØº¸¼¼¿ä.
		s=new Scanner(System.in);
		point1:
		while(true) {
		System.out.print("´Ü¾î¸¦ ÀÔ·ÂÇÏ½Ã°Ú½À´Ï±î?(Y/N)");
		String answer=s.next();
		if(answer.equals("Y")) {
		input();
		}else if(answer.equals("N")){
			break;
		}else {
			System.out.println("Àß¸ø ÀÔ·ÂÇß½À´Ï´Ù.");
			continue point1;
		}
		}
		point2:
		while(true) {
		System.out.print("Ãß°¡ÇÒ ´Ü¾î°¡ ÀÖ½À´Ï±î?(Y/N)");
		String answer2=s.next();
		if(answer2.equals("Y")) {
			input();
		}else if(answer2.equals("N")){
			search();
			break;
		}else {
			System.out.println("Àß¸ø ÀÔ·ÂÇß½À´Ï´Ù.");
			continue point2;
		}
		}
		

	}
	static void input() {
		s=new Scanner(System.in);
		String eng; String kor=null;
		here1:
		while(true) {
		System.out.print("¿µ¾î¸¦ ÀÔ·Â: ");
		eng=s.nextLine();
		if(eng.equals("±×¸¸")){break;}
		for (int i = 0; i < eng.length(); i++) {
			if(String.valueOf(eng.charAt(i)).matches("[a-zA-Z]")){
			}else {
				System.out.println("¿µ¾î·Î ÀÔ·ÂÇÏ¼¼¿ä");
				continue here1;
			}
			
		}
		
		
		here2:
		while(true) {
		System.out.print("ÇØ¼® ÀÔ·Â: ");
		kor=s.nextLine();
		if(kor.equals("±×¸¸")) {break;}
			for (int i = 0; i < kor.length(); i++) {
			if(String.valueOf(kor.charAt(i)).matches("[¤¡-¤¾¤¿-¤Ó°¡-ÆR]")){
			}else {
				System.out.println("ÇÑ±Û·Î ÀÔ·ÂÇÏ¼¼¿ä");
				continue here2;
				}
			}
			map.put(eng, kor);
			continue here1;
		}
		
		}
	}
	static void search() {
		Set<String> set=map.keySet();
		Iterator<String> iterator=set.iterator();
		while(true) {
			String result=iterator.next();
			System.out.print("°Ë»öÇÒ ¿µ¾î¸¦ ÀÔ·Â: ");
			String key=s.next();
			
			if(key.equals("stop")) {
				System.out.println("Á¾·áÇÕ´Ï´Ù.");
				System.exit(0);
			}
			if(key.equals(result)) {
				String value=map.get(key);
				System.out.println(key+"¿¡ ÇØ´çÇÏ´Â ÇÑ±ÛÀº: "+value);
			}else {
				System.out.println("ÇØ´çÇÏ´Â ´Ü¾î°¡ ¾ø½À´Ï´Ù.");
			}
		}
	}

}
