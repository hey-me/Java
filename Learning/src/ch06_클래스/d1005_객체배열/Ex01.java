package ch06_Ŭ����.d1005_��ü�迭;

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
		System.out.println(a + "���� ���� " + b+ "���� " + c + "��ġ TV" );
	}
}