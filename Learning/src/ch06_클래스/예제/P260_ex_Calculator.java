package ch06_Ŭ����.����;

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
		println("������ : " + result);
	}

	void println(String message) {
		System.out.println(message);
	}

}
