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
	Product5[] cart = new Product5[3]; // ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0; // Product�迭 cart�� ���� index

	void buy(Product5 p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� " + p + "��/�� �� �� �����ϴ�.");
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
		String list = "������ ���� : ";
		for (int i = 0; i < cart.length; i++) {
			list += cart[i] + ", ";
			summary += cart[i].price;
		}
		System.out.println(list);
		System.out.println("����� �ݾ� : " + summary);
		System.out.println("���� �ݾ� : " + money);
	}
}

class Product5 {
	int price; // ��ǰ�� ����

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
