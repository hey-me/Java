package ch07_상속.d0923_클래스;

public class Ex01 {

	public static void main(String[] args) {

		Tv2 t = new Tv2();

	}
}

class  Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수

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