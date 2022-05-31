package ch06_클래스;

public class D0910_객체지향문제3_1 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		// p와 (2,2)의 거리
		System.out.println(p.getDistance(2, 2));
	}

}

class MyPoint {

	int x;
	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	double getDistance(int x, int y) {
		return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
	}

}