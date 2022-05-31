package ch14_입출력스트림.예제;

import java.util.*;

public class P637_ProductStorage {

	public static void main(String[] args) {
		ProductStorage productStorage = new ProductStorage();
		productStorage.showMenu();
	}
}

class ProductStorage {
	private List<Product> list = new ArrayList<Product>();
	private Scanner s = new Scanner(System.in);
	private int counter;

	void showMenu() {
		while (true) {
			System.out.println("-----------------------");
			System.out.println("1. 등록 | 2. 목록 | 3. 종료");
			System.out.println("-----------------------");

			System.out.println("선택 : ");
			String str = s.nextLine();
			switch (str) {
			case "1":
				registerProduct();
				break;
			case "2":
				showProducts();
				break;
			case "3":
				return; // 프로그램종료
			}
		}
	}

	void registerProduct() {
		try {
			Product product = new Product();
			product.setPno(++counter);

			System.out.println("상품명: ");
			product.setName(s.nextLine());
			System.out.println("가격: ");
			product.setPrice(Integer.parseInt(s.nextLine()));
			System.out.println("재고: ");
			product.setStock(Integer.parseInt(s.nextLine()));

			list.add(product);
		} catch (Exception e) {
			System.out.println("등록에러: " + e.getMessage());
		}
	}

	void showProducts() {
		for (Product p : list) {
			System.out.println(p.getPno() + "\t" + p.getName() + "\t" + p.getPrice() + "\t" + p.getStock());
		}
	}
}

class Product {
	private int pno;
	private String name;
	private int price;
	private int stock;

	public int getPno() {	return pno;}
	public void setPno(int pno) {this.pno = pno;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
	public int getStock() {	return stock;}
	public void setStock(int stock) {this.stock = stock;}
}
