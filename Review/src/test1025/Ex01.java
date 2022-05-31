package test1025;
import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
//		1. (¿µ¾î, ÇÑ±Û) ´Ü¾î¸¦ ½ÖÀ¸·Î HashMap¿¡ ÀúÀåÇÏ°í ¿µ¾î·Î ÇÑ±ÛÀ» °Ë»öÇÏ´Â ÇÁ·Î±×·¥À» ÀÛ¼ºÇØº¸¼¼¿ä. "exit"¸¦ ÀÔ·ÂÇÏ¸é Á¾·áµÇµµ·Ï ÇÏ¼¼¿ä.
		Map<String, String> map=new HashMap<String, String>();
		Scanner s=new Scanner(System.in);
//		¿¹¿Ü¹ß»ıÀ»ÇÏ·Á¸é throw, ¿¹¿Ü¸¦ ´øÁö·Á¸é throws
		String eng=null; String kor=null;
		here1:
		while(true) {
		System.out.print("¿µ¾î¸¦ ÀÔ·Â: ");
		eng=s.nextLine();
		if(eng.equals("±×¸¸")){break;}
		for (int i = 0; i < eng.length(); i++) {
			if(String.valueOf(eng.charAt(i)).matches("[a-zA-z]")){
			}else {
				System.out.println("¿µ¾î¸¸ ÀÔ·ÂÇÏ¼¼¿ä");
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
				System.out.println("ÇÑ±Û¸¸ ÀÔ·ÂÇÏ¼¼¿ä");
				continue here2;
				}
			}
			map.put(eng, kor);
			continue here1;
		}
		
		}
		
	
		Set<String> set=map.keySet();
		Iterator<String> iterator=set.iterator();
		String result=iterator.next();
		while(true) {
			
			System.out.print("°Ë»öÇÒ ¿µ¾î¸¦ ÀÔ·Â: ");
			String key=s.next();
			
			if(key.equals("stop")) {
				System.out.println("Á¾·áÇÕ´Ï´Ù.");
				break;
			}
			if(key.equals(result)) {	//containsKey¸¦ ÀÌ¿ë°¡´É map.contains(key)
				
				String value=map.get(key);
				System.out.println(key+"¿¡ ÇØ´çÇÏ´Â ÇÑ±ÛÀº: "+value);
			}else {
				System.out.println("ÇØ´çÇÏ´Â ´Ü¾î°¡ ¾ø½À´Ï´Ù.");
			}
		}
		
		

	}

}
