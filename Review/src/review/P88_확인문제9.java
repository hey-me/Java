package review;

public class P88_확인문제9 {

	public static void main(String[] args) {

		// 연산을 수행해서 int타입 result변수에 9가 저장되도록 코드를 작성

		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";

		int result = (int) var1 + (int) var2 * 2 + (int) var3 + (int) Double.parseDouble(var4);
		//Double.parseDouble() => String을 숫자로 
		//계산 모두 했을 때 double인데 int로 입력하려니 오류남. => 모두 int로 바꿔줌.
		// int result= (int) (var1+(int)var2+var3+Double.parseDouble(var4));
		// int result= (int)(var1+var2+var3+ (int)Double.parseDouble(var4));

		// int var5= (int)Double.parseDouble(var4)+5;

		System.out.println(result);
//		System.out.println(var5);

	}

}
