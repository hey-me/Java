package d1007_객체배열만들기;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("상품 개수>> ");
		int n = s.nextInt();		
		Cart[] cart = new Cart[n];
		for (int i = 0; i < cart.length; i++) {
			System.out.print("상품 명>> ");
			String product = s.next();
			System.out.print("가격>> ");
			int money = s.nextInt();
			cart[i] = new Cart(product, money);
		}
		for (int i = 0; i < cart.length; i++) {
			cart[i].show();
		}
	}
}

class Cart {
	private String product;
	private int money;
	public Cart(String product, int money) {
		this.product = product; this.money = money; }
	public String getProduct() {
		return product;
	}
	public int getMoney() {
		return money;
	}
	void show () {
		System.out.println(product + "의 가격은 "+money+"원 입니다.");
	}
}

