package test1018;

public class Ex03 {

	public static void main(String[] args) {
//������ ������ ���� �ν��Ͻ��� ��
		Rect a=new Rect(2,3);
		Rect b=new Rect(3,2);
		Rect c=new Rect(3,4);
		if( a.equals(b) ) { System.out.println("a�� b�� ���� Rect"); }
		if( a.equals(c) ) { System.out.println("a�� c�� ���� Rect"); }
		if( b.equals(c) ) { System.out.println("b�� c�� ���� Rect"); }
		
//		������: a�� b�� ���� Rect
//		equals �޼ҵ带 �������̵� �� ���� hashcode�޼ҵ嵵 ���� �������̵� �ϴ°� ����
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