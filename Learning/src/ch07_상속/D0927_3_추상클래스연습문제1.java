package ch07_���;

abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0, 0));}

	Shape(Point p) {
		this.p = p;}

	abstract double calcArea(); // ������ ������ ����ؼ� ��ȯ�ϴ� �޼���

	Point getPosition() {
		return p;}

	void setPosition(Point p) {
		this.p = p;}
}

class Point {
	int x;
	int y;

	Point() {
		this(0, 0);}

	Point(int x, int y) {
		this.x = x;
		this.y = y;}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}

class Circle extends Shape {
	double r;

	public Circle() {}

	Circle(double r) {
		this.r = r;}

	Circle(Point p, double r) {
//		super(p);
		this.r = r;}

	@Override
	double calcArea() {
		return r * r * Math.PI;}
}

class Rectangle extends Shape {
	double width;
	double height;

	public Rectangle() {}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;}

	Rectangle(Point p, double width, double height) {
		super(p);
		this.width = width;
		this.height = height;}

	@Override
	double calcArea() {
		return width * height;}

	boolean isSquare() {
		if (width == height) {
			System.out.println("���簢��");
			return true;
		} else {
			System.out.println("���簢�� �ƴ�.");
			return false;
		}

	}

}

public class D0927_3_�߻�Ŭ������������1 {

	static double sumArea(Shape[] arr) {
		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].calcArea();
		}
		return sum;
	}
	
	

	public static void main(String[] args) {
		Circle c = new Circle(new Point(3, 5), 3.4);
		System.out.println(c.getPosition());

		Rectangle r = new Rectangle(new Point(5, 3), 4, 3);
		System.out.println(r.getPosition());
		
		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
		System.out.println("������ �� : " + sumArea(arr));

	}
}
