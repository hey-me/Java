package d0910;

public class D0910_객체지향문제3 {

	public static void main(String[] args) {
		Ex3 e3 = new Ex3();
		System.out.println(e3.getDistance(1, 1, 2, 2));
	}

}

class Ex3 {

	double x;
	double y;
	double x1;
	double y1;

	double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
	}

}
