package test0930;

public class Ex1 {

	public static void main(String[] args) {
//		1번
//		ColorTV myTV=new ColorTV(32,1024);
//		myTV.printProperty();
//		
//		2번
		IPTV iptv=new IPTV("192.1.1.2",32,2048);
		
		iptv.printProperty();
	}

}
class TV{
	private int size;
	public TV(int size) {	this.size=size;	}
	protected int getSize() {	return size;	}
}

class ColorTV extends TV{
//	아래 아무것도 없을 때 에러나는 이유:클래스를 만들면 기본적으로 디폴트생성자가 있는데
//	생성자안에는 super();이게 생략되어있는데 상위클래스에는 매개변수가 없는 디폴트 생성자가 없어서
	int color;	//자기클래스의 필드는 자기클래스생성자에서 초기화시켜야함
	public ColorTV(int size, int color) {
		super(size);
		this.color=color;
	}
	public void printProperty(){
		System.out.println(getSize()+"인치 "+ color+"컬러");
//		super(size)가 안되는 이유:return이 없기 때문에
	}
}

class IPTV extends TV{
	int color;
	String address;
	IPTV(int size){
		super(size);
	}
	IPTV( String address, int size, int color){
		super(size);
		this.color=color;
		this.address=address;
	}
	void printProperty() {
//		System.out.println("나의 IPTV는 "+ address+" 주소의 "+getSize()+" 인치 "+color+" 컬러");
		System.out.print("나의 IPTV는 "+ address+" 주소의 ");
		ColorTV ctv=new ColorTV(getSize(),color);
		ctv.printProperty();
	}
}
