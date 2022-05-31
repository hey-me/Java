package ch04_조건문과반복문;

public class P155_do_while문 {

	public static void main(String[] args) {
		
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
		
		int cnt = 0;
		for (int n = 0; n <= 50; n++) {
			
			if (n%2==0) {
				cnt++;
				continue;
			} 
			System.out.println(n);
		}
		System.out.println(cnt);;
		
		
		
	}

}
