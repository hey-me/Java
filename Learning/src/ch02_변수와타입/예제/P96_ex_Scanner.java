package ch02_변수와타입.예제;

import java.util.Scanner;

public class P96_ex_Scanner {

	public static void main(String[] args) 
	throws Exception {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while (true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \""+inputData+"\"");
			if (inputData.equals("q")) {
				break;
			}
			
		}

		System.out.println("종료");
		
	}

}
