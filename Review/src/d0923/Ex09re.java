package d0923;

public class Ex09re {
	public static void main(String args[]) {
		Buyer5 b = new Buyer5();
		b.buy(new Tv5());
		b.buy(new Computer5());
		b.buy(new Tv5());
		b.buy(new Audio5());
		b.buy(new Computer5());
		b.buy(new Computer5());
		b.buy(new Computer5());
		b.summary();
	}
}

class Buyer5 {
	int money = 1000;
	Product5[] cart = new Product5[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product배열 cart에 사용될 index

	void buy(Product5 p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
		} else {
			money -= p.price;
			add(p);
		}
	}

	void add(Product5 p) {
		if (i >= cart.length) {
			Product5[] newCart = new Product5[(cart.length * 2)];
			System.arraycopy(cart, 0, newCart, 0, i);
			cart = newCart;
		}
		cart[i] = p;
		i++;
	}

	void summary() {
		int summary = 0;
		String list = "구입한 물건 : ";
		for (int i = 0; i < cart.length; i++) {
			list += cart[i] + ", ";
			summary += cart[i].price;
		}
		System.out.println(list);
		System.out.println("사용한 금액 : " + summary);
		System.out.println("남음 금액 : " + money);
	}
}

class Product5 {
	int price; // 제품의 가격

	Product5(int price) {
		this.price = price;
	}
}

class Tv5 extends Product5 {
	Tv5() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer5 extends Product5 {
	Computer5() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio5 extends Product5 {
	Audio5() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}
