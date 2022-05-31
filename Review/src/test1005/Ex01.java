package test1005;

public class Ex01 {

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32); // LG에서 만든 2017년 65인치
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
		System.out.println(com+"에서 만든 "+y+"년형 "+size+"인치 TV");
	}
}