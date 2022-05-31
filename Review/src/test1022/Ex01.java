package test1022;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
//		1. 점심 메뉴 4가지를 입력받아 ArrayList에 저장하고 모두 출력한 후 가장 긴 이름을 출력
		ArrayList<String> al=new ArrayList<String>();
		Scanner s=new Scanner(System.in);
		System.out.println("점심 메뉴 4가지를 입력하세요.");
		for (int i = 0; i < 4; i++) {
			System.out.print(i+1+"번째: ");
			al.add(s.next());	
		}
		String str=""; //김치찌개, 백반, 햄버거, 담양식숯불고기
		for (int i = 0; i < al.size(); i++) {
			if(str.length()<al.get(i).length())
				str=al.get(i);
		}
		System.out.println(str);
		
		
		
		
	}

}
