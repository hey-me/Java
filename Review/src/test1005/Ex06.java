package test1005;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Circle2 c[] = new Circle2[3];
		for (int i = 0; i < c.length; i++) {
			System.out.print("x,y,radius >>");
			double x = s.nextDouble();
			double y = s.nextDouble();
			int radius = s.nextInt();
			c[i] = new Circle2(x, y, radius);
		}
		System.out.print("가장 면적이 큰 원은 ");
//		for (int j = 0; j < c.length; j++) {
//			for (int k = j+1; k < c.length; k++) {
//			if(c[j].big()<c[k].big()) {
//				c[k].show();
//			}
//		}
//		}

		Circle2 maxn = c[0];
		for (int i = 1; i < c.length; i++) {
			if (maxn.getRadius() <= c[i].getRadius()) {
				maxn = c[i];
			}
		}
		maxn.show();
	}

}

class Circle2 {
	private double x, y;
	private int radius;

	public Circle2(double x, double y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}

	double big() {
		return radius * radius * Math.PI;
	}

	int getRadius() {
		return radius;
	}
}

//반지름*반지름*3.14