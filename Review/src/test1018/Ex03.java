package test1018;

public class Ex03 {

	public static void main(String[] args) {
//면적이 같으면 같은 인스턴스로 봄
		Rect a=new Rect(2,3);
		Rect b=new Rect(3,2);
		Rect c=new Rect(3,4);
		if( a.equals(b) ) { System.out.println("a와 b는 같은 Rect"); }
		if( a.equals(c) ) { System.out.println("a와 c는 같은 Rect"); }
		if( b.equals(c) ) { System.out.println("b와 c는 같은 Rect"); }
		
//		실행결과: a와 b는 같은 Rect
//		equals 메소드를 오버라이딩 할 때는 hashcode메소드도 같이 오버라이딩 하는게 좋다
	}

}

class Rect{
	int width,height;
	Rect(int width, int height){
		this.width=width;
		this.height=height;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rect) {
			Rect r=(Rect)obj;
		if( r.width*r.height==this.width*this.height){
			return true;
			}
		}
			return false;
		}
}