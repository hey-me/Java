package d0930_상속과추상화;

public class Ex06 {

	public static void main(String[] args) {
		ColorPoint6 zeroPoint = new ColorPoint6();
		System.out.println(zeroPoint.toString()+"입니다." );
		
		ColorPoint6 cp = new ColorPoint6(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
}

class ColorPoint6 extends Point {
	
	private static String color;
	
	public ColorPoint6(int x, int y) {
		super(x, y);;
	}
	public ColorPoint6() {
		this(0, 0, "BLACK");
	}
	public ColorPoint6(int x, int y, String color) {
		super(x, y);
		setColor(color);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setXY(int x, int y) {
		getX(); getY();
	}
	@Override
	public String toString() {
		return color+ "색의 ("+getX()+","+getY()+")의 점";
	}
}

