package d1007_��ü�迭�����;

import java.util.Scanner;

public class Shopping2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���� ����");
		int n = s.nextInt();
		Cart0 cart[] = new Cart0[n];
		for (int i = 0; i < cart.length; i++) {
			System.out.print("���� �̸�");
			cart[i].setProduct(s.next());
			System.out.print(cart[i].getProduct()+"�� ����");
			cart[i].setPrice(s.nextInt());
		}
		
		
	}
}

class Cart0 {
	String product;
	int price;

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	void show() {
		System.out.println();
	}

}