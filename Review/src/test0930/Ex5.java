package test0930;

public class Ex5 {

	public static void main(String[] args) {
	
//		5번
//		ColorPoint cp= new ColorPoint(5,5,"YELLOW");
//		System.out.println(cp);
//		cp.setXY(10,20);
//		cp.setColor("RED");
//		String str=cp.toString();
//		System.out.println(str+"입니다.");
		
//		6번
//		ColorPoint zeroPoint=new ColorPoint();
//		System.out.println(zeroPoint.toString()+"입니다.");
//		
//		ColorPoint cp2=new ColorPoint(10,10);
//		cp2.setXY(5, 5);
//		cp2.setColor("RED");
//		System.out.println(cp2.toString()+"입니다. ");
//		
		
//		7번
//		Point3D p=new Point3D(1,2,3);
//		System.out.println(p.toString()+"입니다.");
//		p.moveUp(); //z축 위쪽으로 이동
//		System.out.println(p.toString()+"입니다.");
//		p.moveDown();
//		p.move(10, 10);
//		System.out.println(p+"입니다. ");
//		
//		p.move(100,200,300);
//		System.out.println(p.toString()+"입니다. ");

//		8번
		PositivePoint p= new PositivePoint();
		System.out.println(p);
		p.move(10,10);
		System.out.println(p.toString()+"입니다");
		
		p.move(-5,5);
		System.out.println(p.toString()+"입니다.");
		
		PositivePoint p2=new PositivePoint(-10,-10);
		System.out.println(p2.toString()+"입니다");
		
		
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
		return color + "색의 (" + getX() + ", " + getY() + ")의 점";
		
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
		return "("+getX()+", "+getY()+", "+z+")의 점";
	}
	
}

class PositivePoint extends Point{
	PositivePoint(){
		super(0,0);
//		this(0,0);	//내가한거
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
//			} 내가한거
	}

	public String toString() {
		return "("+getX()+", "+getY()+")의 점";
	}
	
	
}