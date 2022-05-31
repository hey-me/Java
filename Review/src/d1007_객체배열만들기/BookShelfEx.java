package d1007_객체배열만들기;

import java.util.Scanner;

public class BookShelfEx {
	
	static Scanner s;
	private Book[] book;
	
	public BookShelfEx() {
		s=new Scanner(System.in);
		System.out.print("책장의 사이즈를 입력하세요 : ");
		book=new Book[s.nextInt()];
	}
	

	public static void main(String[] args) {
		BookShelfEx bs=new BookShelfEx();
		
		for (int i = 0; i < bs.book.length; i++) {
			System.out.println("\n<< "+(i+1)+"번째 책장의 책S정보 입력 >>");
			System.out.print("책 제목 : ");
			String name=s.next();
			System.out.print("책 가격 : ");
			int price=s.nextInt();
			System.out.print("책 종류 : ");
			String category=s.next();
			bs.book[i]=new Book(name, price, category);
			System.out.println(i+1+"번째 책 정보 등록완료!!");
		}
		System.out.println("\n<< "+bs.book.length+"권의 책 정보 등록 >>");
		
		while(true) {
			System.out.print("\n실행작업 선택( 1. 전체정보 출력  2. 전체가격  3. 분류별 출력  4. 종료 : ");
			int select = s.nextInt();
			switch (select) {
			case 1: showAll(bs);break;
			case 2: sumPrice(bs);break;
			case 3: printCategory(bs);break;
			case 4: System.out.println("프로그램을 종료합니다."); return; 
			default: System.out.println("확인 후 다시 입력!!");
			}
		}
	}


	private static void printCategory(BookShelfEx bs) {
		System.out.print("\n검색할 분류 입력 : ");
		String category=s.next();
		int sw=0;
		for (int i = 0; i < bs.book.length; i++) {
			if( bs.book[i].searchCategory(category) ) {
				System.out.println(bs.book[i]);
				sw=1;
			}
		}
		if(sw==0) System.out.println("\n검색된 분류의 책이 없습니다.");
	}


	private static void sumPrice(BookShelfEx bs) {
		int sum=0;
		for (int i = 0; i < bs.book.length; i++) {
			sum+= bs.book[i].getPrice();
		}
		System.out.println("\n책장의 책 가격 합계 : "+sum);
	}


	private static void showAll(BookShelfEx bs) {
		for (int i = 0; i < bs.book.length; i++) {
			bs.book[i].showBook();
		} 
	}

}

class Book{
	private String name;  // 책 제목
	private int price;  // 책가격
	private String category;  // 종류
	
	public Book() {	}
	public Book(String n, int p, String c) {
		name=n; price=p; category=c;
	}
	
	void showBook() {
		System.out.println("\n책 제목 : "+name+" / 책 가격 : "+price+" / 책 분류 : "+category);
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
		return "책 제목 : "+name+" / 책 가격 : "+price+" / 책 분류 : "+category;
	}
	
}
