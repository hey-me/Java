package d1007_��ü�迭�����;

import java.util.Scanner;

public class BookShelfEx {
	
	static Scanner s;
	private Book[] book;
	
	public BookShelfEx() {
		s=new Scanner(System.in);
		System.out.print("å���� ����� �Է��ϼ��� : ");
		book=new Book[s.nextInt()];
	}
	

	public static void main(String[] args) {
		BookShelfEx bs=new BookShelfEx();
		
		for (int i = 0; i < bs.book.length; i++) {
			System.out.println("\n<< "+(i+1)+"��° å���� åS���� �Է� >>");
			System.out.print("å ���� : ");
			String name=s.next();
			System.out.print("å ���� : ");
			int price=s.nextInt();
			System.out.print("å ���� : ");
			String category=s.next();
			bs.book[i]=new Book(name, price, category);
			System.out.println(i+1+"��° å ���� ��ϿϷ�!!");
		}
		System.out.println("\n<< "+bs.book.length+"���� å ���� ��� >>");
		
		while(true) {
			System.out.print("\n�����۾� ����( 1. ��ü���� ���  2. ��ü����  3. �з��� ���  4. ���� : ");
			int select = s.nextInt();
			switch (select) {
			case 1: showAll(bs);break;
			case 2: sumPrice(bs);break;
			case 3: printCategory(bs);break;
			case 4: System.out.println("���α׷��� �����մϴ�."); return; 
			default: System.out.println("Ȯ�� �� �ٽ� �Է�!!");
			}
		}
	}


	private static void printCategory(BookShelfEx bs) {
		System.out.print("\n�˻��� �з� �Է� : ");
		String category=s.next();
		int sw=0;
		for (int i = 0; i < bs.book.length; i++) {
			if( bs.book[i].searchCategory(category) ) {
				System.out.println(bs.book[i]);
				sw=1;
			}
		}
		if(sw==0) System.out.println("\n�˻��� �з��� å�� �����ϴ�.");
	}


	private static void sumPrice(BookShelfEx bs) {
		int sum=0;
		for (int i = 0; i < bs.book.length; i++) {
			sum+= bs.book[i].getPrice();
		}
		System.out.println("\nå���� å ���� �հ� : "+sum);
	}


	private static void showAll(BookShelfEx bs) {
		for (int i = 0; i < bs.book.length; i++) {
			bs.book[i].showBook();
		} 
	}

}

class Book{
	private String name;  // å ����
	private int price;  // å����
	private String category;  // ����
	
	public Book() {	}
	public Book(String n, int p, String c) {
		name=n; price=p; category=c;
	}
	
	void showBook() {
		System.out.println("\nå ���� : "+name+" / å ���� : "+price+" / å �з� : "+category);
	}
	
	boolean searchCategory(String ca) {
		if(category.equals(ca)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "å ���� : "+name+" / å ���� : "+price+" / å �з� : "+category;
	}
	
}
