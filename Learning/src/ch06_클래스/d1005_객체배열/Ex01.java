package ch06_클래스.d1005_객체배열;

public class Ex01 {

	public static void main(String[] args) {

		TV myTV = new TV ("LG", 2017, 32);
		myTV.show();
	}

}

class TV {
	String a;
	int b, c;
	
	public TV(String a, int b, int c) {this.a = a; this.b = b; this.c = c;}
	
	void show () {
		System.out.println(a + "에서 만든 " + b+ "년형 " + c + "인치 TV" );
	}
}