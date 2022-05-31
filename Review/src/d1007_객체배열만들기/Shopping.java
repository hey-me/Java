package d1007_��ü�迭�����;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("��ǰ ����>> ");
		int n = s.nextInt();		
		Cart[] cart = new Cart[n];
		for (int i = 0; i < cart.length; i++) {
			System.out.print("��ǰ ��>> ");
			String product = s.next();
			System.out.print("����>> ");
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
		System.out.println(product + "�� ������ "+money+"�� �Դϴ�.");
	}
}

