package ch04_조건문과반복문.예제;

public class P155_ex_WhileSumFrom1To100 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		int i = 1;
		while (i<=100) {
			sum +=i;
			i++;
		}
		System.out.println("1~"+ (i-1)+ "합 : "+ sum);
	}

}
