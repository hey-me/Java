package d1005_클래스객체배열;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c[] = new Circle[3];
		for (int i = 0; i < c.length; i++) {
			System.out.println("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x, y, radius);
		}
//		Circle large = c[0];
//		for (int i = 0; i < c.length; i++) {
//			for (int j = i+1; j < c.length; j++) {
//				if(c[i].getRadius() < c[j].getRadius()) {
//					large = c[j];
//				}
//			}
//		}
		
		Circle large = c[0];
		for (int i = 0; i < c.length; i++) {
			if(c[i].getRadius() > large.getRadius() ) {
				large = c[i];
			}
		}
		System.out.print("가장 면적이 큰 원은 ");
		large.show();
		scanner.close();
	}
}

class Circle {
	private double x, y;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x; this.y = y; this.radius = radius;
	}
	public void show() {
		System.out.println("("+ x + ","+y+")"+radius);
	}
	public int getRadius () {
		return radius;
	}
	public void area() {
		System.out.println("("+ x + ","+y+")"+radius);
	}
}