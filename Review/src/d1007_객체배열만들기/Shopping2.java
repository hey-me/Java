package d1007_객체배열만들기;

import java.util.Scanner;

public class Shopping2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("물건 개수");
		int n = s.nextInt();
		Cart0 cart[] = new Cart0[n];
		for (int i = 0; i < cart.length; i++) {
			System.out.print("물건 이름");
			cart[i].setProduct(s.next());
			System.out.print(cart[i].getProduct()+"의 가격");
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