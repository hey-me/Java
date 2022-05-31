package ch07_���.����;

public class P363_ex_animal_�߻�޼ҵ�������� {

	public static void main(String[] args) {

		Dog10 dog = new Dog10();
		Cat10 cat = new Cat10();
		dog.sound();
		cat.sound();
		System.out.println("-------");

		//������ �ڵ� Ÿ�� ��ȯ
		Animal10 animal = null;
		animal = new Dog10();
		animal.sound();
		animal = new Cat10();
		animal.sound();
		System.out.println("-------");
		
		//�޼ҵ��� ������
		animalSound(new Dog10());
		animalSound(new Cat10());
	}

	static void animalSound(Animal10 animal) {
		animal.sound();
	}

}

abstract class Animal10 {
	String kind;

	void breathe() {
		System.out.println("���� ���ϴ�.");
	}

	abstract void sound();
}

class Dog10 extends Animal10 {
	Dog10() {
		this.kind = "������";
	}

	@Override
	void sound() {
		System.out.println("�۸�");
	}
}

class Cat10 extends Animal10 {
	Cat10() {
		this.kind = "������";
	}

	@Override
	void sound() {
		System.out.println("�߿�");
	}
}