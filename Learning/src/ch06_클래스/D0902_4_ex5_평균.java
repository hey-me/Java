package ch06_클래스;

public class D0902_4_ex5_평균 {

	public static void main(String[] args) {
		// 1~100 정수 30개 초기화
		// calc 메소드에서 50 이상의 평균

		int[] num = new int[30];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100 + 1);
		}
//		calc(num);  // void. calc메소드에서 바로 출력할때 이렇게 적기.
		System.out.println(calc(num));
	}

	private static int calc(int[] num) {
		
		int sum = 0, cnt = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 50) {
				sum += num[i];
				cnt++;
			}
		}
//		System.out.println(sum / cnt);  //void로 한 상태로 바로 출력해도 되고, int 타입으로 바꾸고 리턴하고 출력해도 됨.
		return sum / cnt;
	}

}
