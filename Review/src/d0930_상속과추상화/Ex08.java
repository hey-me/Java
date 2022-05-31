package d0930_상속과추상화;

public class Ex08 {

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		System.out.println(p);
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		p.move(-5, 5);
		System.out.println(p.toString() + "입니다.");
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}
}

class PositivePoint extends Point {

	public PositivePoint() {
		super(0, 0);
	}

	public PositivePoint(int x, int y) {
		super(x, y);  //생성자에서 super나 this는 가장 윗줄에만 가능
		if (x<0 || y<0) {
			move(0, 0);
		}
	}

	@Override
	protected void move(int x, int y) {
		if (x < 0 || y < 0) {
			return;
		}
		super.move(x, y);
	}

	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + ")의 점";
	}
}