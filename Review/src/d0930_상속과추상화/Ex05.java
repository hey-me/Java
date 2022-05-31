package d0930_상속과추상화;

public class Ex05 {

	public static void main(String[] args) {
		ColorPoint5 cp = new ColorPoint5(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
		System.out.println(cp+ "입니다."); // toString 메소드는 참조변수만 적어도 출력됨
	}
}

class Point {
	private int x, y;
	public Point (int x, int y) {this.x = x; this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x = x; this.y = y;}
}

class ColorPoint5 extends Point {
	private String color;
	
	public ColorPoint5(int x, int y, String color) {
		super(x, y);
		this.color = color; }
	
	void setXY(int x, int y) {
		move(x, y); 
	}
	void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return color+ "색의 ("+getX()+","+getY()+")의 점";
	}
}