package test1018;

public class Ex01_02 {

	public static void main(String[] args) {
//1번
//		Point p=new Point(2, 3);
//		System.out.println( p );	//Point(2, 3)
	
//2번
		Point a=new Point(2, 3);
		Point b=new Point(2, 3);
		Point c=new Point(3, 4);

//		a와 b는 같은 점
		if(a==b) {
		System.out.println("a==b");
		}
		if( a.equals(b) ) {
		System.out.println("a와 b는 같은 점");
		}
		if( a.equals(c) ) {
		System.out.println("a와 c는 같은 점");
		}
	}

}
class Point{
	int x, y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "Point("+x+", "+y+")";
	}
//	public boolean equals(Point p) {
//		if((this.x==p.x)&&(this.y==p.y))
//			return true;
//		else { return false;
//		}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point p=(Point)obj;
			if((this.x==p.x)&&(this.y==p.y))
				return true;
		}	return false;
	}
	
//	equals 메소드를 오버라이딩 할 때는 hashcode메소드도 같이 오버라이딩 하는게 좋다
	@Override
	public int hashCode() {
		
		return x+y;
	}
}
