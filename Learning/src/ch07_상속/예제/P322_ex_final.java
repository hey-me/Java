package ch07_���.����;
public class P322_ex_final {
	public static void main(String[] args) {
	}}

//final ��� �Ұ���
final class Member {}
class VeryImportantPerson // extends Member{} final�� ��� �Ұ���
{}

//final ������ �Ұ���
class Car {
	int speed;
	void speedUp() {
		speed += 1;
	}
	void stop() {
		System.out.println("���� ����");
		speed = 0;
	}
}

class SportCar extends Car {
	@Override
	void speedUp() {
		speed += 10;
	}
	
	//�Ұ�.. final�޼ҵ�� �ȵ�.
	@Override 
	void stop() {
		System.out.println("������ī�� ����");
		speed = 0;
	}
}