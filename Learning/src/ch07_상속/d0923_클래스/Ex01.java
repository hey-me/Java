package ch07_���.d0923_Ŭ����;

public class Ex01 {

	public static void main(String[] args) {

		Tv2 t = new Tv2();

	}
}

class  Product {
	int price; // ��ǰ�� ����
	int bonusPoint; // ��ǰ���� �� �����ϴ� ���ʽ�����

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product2 {
	
	Tv() {
		super(0);
	}
	

	public String toString() {
		return "Tv";
	}
}