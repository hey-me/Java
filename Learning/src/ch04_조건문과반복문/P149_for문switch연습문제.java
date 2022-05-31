package ch04_조건문과반복문;

import java.util.Scanner;

public class P149_for문switch연습문제 {

	public static void main(String[] args) {

//		1. for문을 이용하여 알파벳 대문자를 순서대로 출력하세요
//		
//		char i = 'A';
//		for (i = 'A'; i <= 'Z'; i++) {
//			System.out.println(i);
//		}
//		
//		
//		2. 국어, 영어, 수학 점수를 Scanner 클래스를 이용하여 입력받고 평균을 계산한 후 switch문을 이용하여 학점을 계산하세요
//		-학점은 평균이 90이상 A 80이상 70 60 나머지 F
		Scanner s = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요.");
		int kor = s.nextInt();
		System.out.print("영어 점수를 입력하세요.");
		int eng = s.nextInt();
		System.out.print("수학 점수를 입력하세요.");
		int mat = s.nextInt();
//		???
//		???
		int avg = (kor + eng + mat)/3;
		int grade = avg/10;
		System.out.print("당신의 학점은 ");
		switch (grade) {
		case 9: case 10: 
			System.out.print("A");
			break;
		case 8: 
			System.out.print("B");
			break;
		case 7: 
			System.out.print("C");
			break;
		case 6: 
			System.out.print("D");
			break;
		default:
			System.out.print("F");
			break;
		}
		System.out.println("입니다.");
//
//		3. 1부터 50까지 숫자를 가로로 순서대로 출력하세요 한줄에 8개
		int cnt = 0; 
		for ( int i = 1; i <=50 ; i++) {
//			System.out.print(i+" "); // 아랫줄과 같음.
			System.out.printf("%3d", i);
			cnt++;
			
			if(cnt%8==0) {
			System.out.println();
			}
		}
//			****cnt를 사용하지 않을때 
		for ( int i = 1; i <=50 ; i++) {
//			System.out.print(i+" "); // 아랫줄과 같음.
			System.out.printf("%3d", i);
			if(i%8==0) {
			System.out.println();
			}
		}
		
		
//		4. 구구단의 단을 Scanner로 입력받고 입력받은 단을 역순으로 출력하세요
//		-입력받은 수 : 5
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("단을 입력 : ");
//		int dan = scanner.nextInt();
//		
//		for (int i = 9; i > 0; i--) {
//			System.out.printf("%d * %d = %d\n", dan, i, dan*i );
//		}

		

		
		
	}
	
}
