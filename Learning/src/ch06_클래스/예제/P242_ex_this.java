package ch06_Ŭ����.����;

public class P242_ex_this {

	public static void main(String[] args) {

		P242_Car car1 = new P242_Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();

		P242_Car car2 = new P242_Car("�ڰ���");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();

		P242_Car car3 = new P242_Car("�ڰ���", "����");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();

		P242_Car car4 = new P242_Car("�ý�", "����", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}
}

class P242_Car {

	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;

	P242_Car() {
	}

	P242_Car(String model) {
		this(model, "����", 250);
	}

	P242_Car(String model, String color) {
		this(model, color, 250);
	}

	P242_Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}