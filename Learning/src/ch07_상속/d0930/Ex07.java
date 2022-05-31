package ch07_상속.d0930;
public class Ex07 {

	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		System.out.println(p.toString() + "입니다.");
		p.moveUp();
		System.out.println(p.toString() + "입니다.");
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		p.move(100, 200, 300);
		System.out.println(p.toString() + "입니다.");
	}
}
class Point3D extends Point {

	private int z;
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
//	public void move(int x, int y) {
//		super.move(x, y);
//	}
	public void move(int x, int y, int z) {
		super.move(x, y); this.z = z; //super 안해도 되는데 명시적으로 표시해준것.
	}
	public void moveUp() {
		z++;
	}
	public void moveDown() {
		z--;
	}
	@Override
	public String toString() {
		return "("+getX()+","+getY()+","+z+")의 점";
	}
}