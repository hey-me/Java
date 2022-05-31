package review;

import java.util.Scanner;

public class P99_확인문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);

		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String name2 = a.next();
		System.out.print("2. 주민번호 앞 6자리: ");
		int num3 = a.nextInt();
		System.out.print("3. 전화번호: ");
		a.nextLine();
		int tel1 = a.nextInt();
		System.out.print("-");
		int tel2 = a.nextInt();
		System.out.print("-");
		int tel3 = a.nextInt();
		//String num4 = a.next();
		
				

		System.out.println("[입력한 내용]");
		System.out.println("1. 이름: "+name2);
		System.out.println("2. 주민번호 앞 6자리: "+num3);
		//System.out.println("3. 전화번호: "+num4);
		System.out.printf("3. 전화번호: %1$03d-%2$3d-%3$4d", tel1, tel2, tel3);
		
		
	}


}