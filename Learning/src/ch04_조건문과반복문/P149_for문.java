package ch04_조건문과반복문;

public class P149_for문 {

	public static void main(String[] args) {

//	*	
		for (int d = 0; d <= 5; d++) {
			System.out.println(d + "화이팅");
		} // true이므로 출력, 후 t++... true가 아닐때 까지 반복
			// System.out.println(d); 이거 왜 오류??... for안에서 d를 초기화했기때문에 for괄호 안에서만!

		int i, sum = 0;
		for (i = 0; i <= 10; i++) { // i=2 / i=3... i=10
			System.out.println(i);
			// 짝수만! if(i%2==0) { sum = sum + i }
			sum = sum + i; // sum = 1 / +2 / +3... +10
		} // 홀수 따로 계산! odd를 변수선언하고 else { odd +=i}
		System.out.println("1부터 10까지 합 : " + sum);

//	*	
		int a, even = 0, odd = 0;
		for (int n = 0; n <= 100; n++) {
			odd += 1;
			n++;
			even = even + n;
		}
		System.out.println("1부터 100까지 짝수의 합 : " + even);
		System.out.println("1부터 100까지 홀수의 합 : " + odd);
		
//	**	1부터 100까지 더하기~~
//		int i = 1, sum = 0;
//		for (  ;  ;  ) {
//			sum+=i++;
//			if(i>100)
//			break;
//		}
//		System.out.println(sum);
	}

}
