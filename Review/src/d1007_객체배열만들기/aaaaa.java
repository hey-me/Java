package d1007_객체배열만들기;

import java.util.Scanner;

public class aaaaa {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("커피 종류 수>>");
		int n = s.nextInt();
		Coffee coffee[] = new Coffee[n];
		
		for (int i = 0; i < coffee.length; i++) {
			coffee[i] = new Coffee();
			System.out.println("커피 이름>>");
			coffee[i].setName(s.next());
			System.out.println("커피 가격>>");
			coffee[i].setPrice(s.nextInt());
			System.out.println("커피에 대한 정보>>");
			coffee[i].setMemo(s.next());
		}
		
		for (int i = 0; i < coffee.length; i++) {
			coffee[i].show();
		}
		
		
	}
}

class Coffee{
	private String name;
	private int price;
	private String memo = null;
	
	public Coffee() {
	this(null, 0, null);}
	public Coffee(String name) {
		this.name = name;}
	public Coffee(String name, int price) {
		this.name = name; this.price = price;}
	public Coffee(String name, int price, String memo) {
		this.name = name; this.price = price; this.memo = memo;}
	public String getName() {
		return name;}
	public void setName(String name) {
		this.name = name;}
	public int getPrice() {
		return price;}
	public void setPrice(int price) {
		this.price = price;}
	public String getMemo() {
		return memo;}
	public void setMemo(String memo) {
		this.memo = memo;}
	void show () {
		System.out.println(name + "커피의 가격은 "+price+"원이고 "+memo+"이다.");
	}
	
}