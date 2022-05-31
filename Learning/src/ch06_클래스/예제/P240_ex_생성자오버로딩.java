package ch06_클래스.예제;

public class P240_ex_생성자오버로딩 {

	public static void main(String[] args) {

		P239_ex_생성자선택 car1 = new P239_ex_생성자선택();
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println();

		P239_ex_생성자선택 car2 = new P239_ex_생성자선택();
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();

		P239_ex_생성자선택 car3 = new P239_ex_생성자선택();
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();

		P239_ex_생성자선택 car4 = new P239_ex_생성자선택();
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();

	}

}

class P239_ex_생성자선택 {
/*
	public P239_ex_생성자선택(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	} 마우스 오른쪽, source - generate...using field
	*/

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	P239_ex_생성자선택() {

	}

	P239_ex_생성자선택(String model) {
		this.model = model;
	}

	P239_ex_생성자선택(String model, String color) {
		this.model = model;
		this.color = color;
	}

	P239_ex_생성자선택(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
