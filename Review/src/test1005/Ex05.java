//package test1005;
//
//import java.util.Scanner;
//
//public class Ex05 {
//
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		Circle c[]=new Circle[3];
//		for (int i = 0; i < c.length; i++) {
//		System.out.print("x,y,radius >>");	
//			double x=s.nextDouble();
//			double y=s.nextDouble();
//			int radius=s.nextInt();
//			c[i]= new Circle(x,y,radius);
//		}
//		for (int j = 0; j < c.length; j++) {
//			c[j].show();
//		}
//		
//	}
//
//}
//
//class Circle{
//	private double x, y;
//	private int radius;
//	public Circle(double x, double y, int radius) {
//		super();
//		this.x = x;
//		this.y = y;
//		this.radius = radius;
//	}
//	public void show() {
//		System.out.println("("+x+","+y+")"+radius);
//	}
//}

//반지름*반지름*3.14