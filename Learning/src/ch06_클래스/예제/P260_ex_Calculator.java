package ch06_클래스.예제;

public class P260_ex_Calculator {

	public static void main(String[] args) {
		
		P260_ex_Calculator myCalc = new P260_ex_Calculator();
		myCalc.execute();
		
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}

	void execute() {
		double result = avg(7, 10);
		println("실행결과 : " + result);
	}

	void println(String message) {
		System.out.println(message);
	}

}
