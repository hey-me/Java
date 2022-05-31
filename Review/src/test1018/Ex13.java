package test1018;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
		StringBuffer sb=new StringBuffer();
		int []index=new int[26];
		while(true) {
			String str=s.nextLine();
			String str2=str.toUpperCase();
			if(str2.indexOf(";")!=-1) {
				sb.append(str2.substring(0, str2.indexOf(";")));
				break;
			}
			//->중간에 세미콜론 들어간경우
			if(str2.equals(";"))
				break;
			sb.append(str2);
		}
			for (int i = 0; i < sb.length(); i++) {
				if(sb.charAt(i)>='A'&&sb.charAt(i)<='Z') {
					index[sb.charAt(i)-'A']++;
				}
			}
			for (int i = 0; i < index.length; i++) {
				System.out.print((char)('A'+i));
				for (int j = 0; j < index[i]; j++) {
					System.out.print("-");
				}
				System.out.println();
			}
		
		
					
		
	}

}
