package test0927;

public class Ex01 {

	public static void main(String[] args) {
		Circle c=new Circle(new Point(3,5),3.4);
		System.out.println(c.getPosition());
		Rectangle r=new Rectangle(new Point(5,3),4,6);
		System.out.println(r.getPosition());
		System.out.println(r.isSquare()); 
		Shape[] arr = { new Circle(5.0), new Rectangle(3,4), new Circle(1) };
//		�迭���� ������ Ŭ������ �ν��Ͻ��� ����?����� �� �ִ�.
		 System.out.println( "������ �� : " + sumArea(arr) );
	}
	
	static double sumArea(Shape[]arr) {
		double sum=0;
		
		for (int i = 0; i < arr.length; i++) {//��������.�ν��Ͻ�? ���� �ش��ҵ��� ���Ҽ��ִ�?
			sum+=arr[i].calcArea();
		}
		return sum;
	}

}

	abstract class Shape {
		Point p;
		
		Shape() {
			this(new Point(0,0));	
			}
		
		Shape(Point p) {	
			this.p = p; 
			}
		
		abstract double calcArea(); // ������ ������ ����ؼ� ��ȯ�ϴ� �޼���
		
		Point getPosition() { return p; }
		
		void setPosition(Point p) { this.p = p; }
		}
		
class Point {
	int x;
	int y;
	Point() { this(0,0); }
	Point(int x, int y) { this.x=x; this.y=y; }
	public String toString() { return "["+x+","+y+"]"; }
}

class Circle extends Shape{
	double r;
	Circle(){
		
	}
	Circle(double r){
		
		this.r=r;	//�ڱ�Ŭ������ �ʵ尪���ʱ�ȭ ��ӹ޾����� �θ�Ŭ������ �ʵ嵵 �ʱ�ȭ�Ҽ��־����-�޼ҵ��ϳ�������
	}
	Circle(Point p, double r){
		super(p);
		this.r=r;
	}
	
	@Override
	double calcArea() {
		double a=r*r*Math.PI;
		return a;
	}
	
}

class Rectangle extends Shape{
	double width,height;
	
	public Rectangle() {
		
	}
	Rectangle(double width, double height){
		this.width=width;
		this.height=height;
	}
	Rectangle(Point p, double width, double height){
		super(p);
		this.width=width;
		this.height=height;
	}
	
	@Override
	double calcArea() {
		return width*height;
	}
	
	boolean isSquare() {
			return width==height;
	}
	
}



