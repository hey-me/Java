package d0930_��Ӱ��߻�ȭ;

public class Ex08 {

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		System.out.println(p);
		p.move(10, 10);
		System.out.println(p.toString() + "�Դϴ�.");
		p.move(-5, 5);
		System.out.println(p.toString() + "�Դϴ�.");
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "�Դϴ�.");
	}
}

class PositivePoint extends Point {

	public PositivePoint() {
		super(0, 0);
	}

	public PositivePoint(int x, int y) {
		super(x, y);  //�����ڿ��� super�� this�� ���� ���ٿ��� ����
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
		return "(" + getX() + "," + getY() + ")�� ��";
	}
}