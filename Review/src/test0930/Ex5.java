package test0930;

public class Ex5 {

	public static void main(String[] args) {
	
//		5��
//		ColorPoint cp= new ColorPoint(5,5,"YELLOW");
//		System.out.println(cp);
//		cp.setXY(10,20);
//		cp.setColor("RED");
//		String str=cp.toString();
//		System.out.println(str+"�Դϴ�.");
		
//		6��
//		ColorPoint zeroPoint=new ColorPoint();
//		System.out.println(zeroPoint.toString()+"�Դϴ�.");
//		
//		ColorPoint cp2=new ColorPoint(10,10);
//		cp2.setXY(5, 5);
//		cp2.setColor("RED");
//		System.out.println(cp2.toString()+"�Դϴ�. ");
//		
		
//		7��
//		Point3D p=new Point3D(1,2,3);
//		System.out.println(p.toString()+"�Դϴ�.");
//		p.moveUp(); //z�� �������� �̵�
//		System.out.println(p.toString()+"�Դϴ�.");
//		p.moveDown();
//		p.move(10, 10);
//		System.out.println(p+"�Դϴ�. ");
//		
//		p.move(100,200,300);
//		System.out.println(p.toString()+"�Դϴ�. ");

//		8��
		PositivePoint p= new PositivePoint();
		System.out.println(p);
		p.move(10,10);
		System.out.println(p.toString()+"�Դϴ�");
		
		p.move(-5,5);
		System.out.println(p.toString()+"�Դϴ�.");
		
		PositivePoint p2=new PositivePoint(-10,-10);
		System.out.println(p2.toString()+"�Դϴ�");
		
		
	}

}

class Point {
	private int x, y;
	
	Point(int x, int y){ this.x=x; this.y=y; }

	public int getX() {		return x;	}
	public int getY() {		return y;	}
	protected void move(int x, int y) {	this.x=x; this.y=y;	}

}

class ColorPoint extends Point{
	String color="BLACK";
	
	ColorPoint() {
		this(0,0);
	}
	ColorPoint(int x, int y){
		super(x,y);
	}
	ColorPoint(int x, int y, String color){
		super(x,y);
		this.color=color;
	}
	void setXY(int i, int j){
		super.move(i,j);
	}
	void setColor(String str){
		this.color=str;
	}
	public String toString() {
		return color + "���� (" + getX() + ", " + getY() + ")�� ��";
		
	}
}

class Point3D extends Point{
	int z;
	Point3D(int x, int y, int z){
		super(x,y);
		this.z=z;
	}
	void moveUp() {
		this.z++;
	}
	void moveDown() {
		this.z--;
	}
	void move(int x, int y, int z) {
		super.move(x, y);
		this.z=z;
	}
	public String toString() {
		return "("+getX()+", "+getY()+", "+z+")�� ��";
	}
	
}

class PositivePoint extends Point{
	PositivePoint(){
		super(0,0);
//		this(0,0);	//�����Ѱ�
	}
	
	PositivePoint(int x, int y){
		super(x,y);
		
		if(x<0||y<0){
			this.move(0, 0);
		}
		
	}
	
	@Override
	protected void move(int x, int y) {
		if(x<0||y<0) {
		return ;
		}
		super.move(x, y);
//		if(x>=0&&y>=0) {
//			super.move(x, y);
//			} �����Ѱ�
	}

	public String toString() {
		return "("+getX()+", "+getY()+")�� ��";
	}
	
	
}