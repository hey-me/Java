package ch06_Ŭ����.����;

public class P265_ex_Calculator {

	public static void main(String[] args) {
		CalculatorExample myCalcu = new CalculatorExample();

		double result1 = myCalcu.areaRectangle(10);

		double result2 = myCalcu.areaRectangle(10, 20);

		System.out.println("���簢�� ���� : " + result1);
		System.out.println("���簢�� ���� : " + result2);

	}

}

class CalculatorExample {

	double areaRectangle(double width) {
		return width * width;
	}

	double areaRectangle(double width, double height) {
		return width * height;
	}
}