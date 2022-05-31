package ch04_조건문과반복문;

public class D0819_ex {

	public static void main(String[] args) {

//	**	홀짝
		int num, even = 0, odd = 0;

		for (int i = 1; i <= 20; i++) {
			num = (int) (Math.random() * 100) + 1; // 1~100
			if (num % 2 == 0) {
				System.out.println("짝수" + num);
				even++;
			} else {
				System.out.println("홀수" + num);
				odd++;
			}
//			System.out.println(num + " ");
		}
		System.out.println("짝수 : " + even + "번");
		System.out.println("홀수 : " + odd + "번");

//	**	4의배수
		int num2, even2 = 0, odd2 = 0;

		for (int j = 1; j <= 100; j++) {
			num2 = (int) (Math.random() * 100) + 1;
			System.out.print(num2+" ");
			if (num2 % 4 == 0) 
				even2++;	
			}
		System.out.println("\n4의 배수의 개수 : "+ even2);
		
		
		
//	**	4와 6의 공배수
	 
		int tt = 0;
		for (int u = 1; u <=1000; u++) {
			if (u%4==0 || u%6==0) {
				System.out.println(u);
				tt++;
			}
		}
		System.out.println("개수 : "+tt);
	
	
	}
}

