package test1005;

public class Ex01 {

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32); // LG���� ���� 2017�� 65��ġ
		myTV.show();
	}

}

class TV{
	String com;
	int y;
	int size;
	TV(String com, int y, int size){
		this.com=com;
		this.y=y;
		this.size=size;
	}
	void show() {
		System.out.println(com+"���� ���� "+y+"���� "+size+"��ġ TV");
	}
}