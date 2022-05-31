package ch04_조건문과반복문;

public class D0817_2_반복문 {

	public static void main(String[] args) {

//		반복문 : for문, while문, do-while문, break문
//		
//		for ( 1 초기화식 ;  2 조건식 ;  4 증감식 ) {
//			 3실행문.. 조건식이 true일때	;
//		}...중괄호가 반복영역
//		
		for (int i = 0; i < args.length; i++) {
			System.out.println("홧팅");	//실행문
		}
//		
		for (int d = 0; d <= 5; d++) {
			System.out.println(d+"화이팅");
		}  //true이므로 출력, 후 t++... true가 아닐때 까지 반복
		//System.out.println(d);  이거 왜 오류??... for안에서 d를 초기화했기때문에 for괄호 안에서만! 
		
//		위와 동일
//		int i;
//		for (i = 0 , ㅡㅡㅡ, ㅡㅡㅡ)
		
	//	1부터 100까지 더하기~~
		int i = 1, sum = 0;
		for (  ;  ;  ) {
			sum+=i++;
			if(i>100)
				break;
		}
		System.out.println(sum);
//___________________________________________		
//		break없으면 무한 반복
		for ( ; ; ) {
			System.out.println("무한반복");
			break; //for문 반복 그만!!
		}
		
//		10번 반복 실행
		int n = 1;
		for ( ; n<=10 ; ) {   //조건 안 적어도 되넹 
			System.out.println(n+"무한반복");
			n++;
		}
		
//		while문 10번 반복
		int t = 1;
		while (t<=10) {
			System.out.println(t+"반복숭아");
			t++;
		}
		
//		do-while문
		int w = 1;
		do {
			System.out.println(w+"광주");
			w++;
		} while (w<=5);
		//=> 1부터 5까지 실행함 w=6이면 1번만 실행하고 while실행 안함.
		

//		조건이 true 일때 while문을 끝내려면!
		int p = 8;
		while (true) {
			System.out.println(p+"오잇");
			p++;
			
			if (p>10) 				
				break;
		}
//				
//				
//				
	}

}
