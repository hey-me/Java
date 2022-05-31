package test0927;

public class Ex01 {

	public static void main(String[] args) {
		Circle c=new Circle(new Point(3,5),3.4);
		System.out.println(c.getPosition());
		Rectangle r=new Rectangle(new Point(5,3),4,6);
		System.out.println(r.getPosition());
		System.out.println(r.isSquare()); 
		Shape[] arr = { new Circle(5.0), new Rectangle(3,4), new Circle(1) };
//		배열에는 구성된 클래스의 인스턴스가 전부?저장될 수 있다.
		 System.out.println( "면적의 합 : " + sumArea(arr) );
	}
	
	static double sumArea(Shape[]arr) {
		double sum=0;
		
		for (int i = 0; i < arr.length; i++) {//참조변수.인스턴스? 쓰면 해당요소들을 더할수있다?
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
		
		abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
		
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
		
		this.r=r;	//자기클래스의 필드값만초기화 상속받았으면 부모클래스의 필드도 초기화할수있어야함-메소드하나더생성
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



