package ch04_조건문과반복문;

public class P154_while문 {

	public static void main(String[] args) {

//		break없으면 무한 반복
		for ( ; ; ) {
			System.out.println("무한반복");
			break; //for문 반복 그만!!
		}
		
//		10번 반복 실행
		int n = 1;
		for ( ; n<=10 ; ) {   //조건 안 적어도 되넹 
			System.out.println("무한반복");
			n++;
		}
		
//		while문
		int t = 1;
		while (t<=10) {
			System.out.println(t+"반복숭");
			t++;
		}
		
		
	}

}
