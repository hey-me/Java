package ch06_Ŭ����.����;

public class P227_ex_Car {

	public static void main(String[] args) {

		CarExample1 myCar = new CarExample1();

		System.out.println("����ȸ�� : " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("���� : " + myCar.color);
		System.out.println("�ְ�ӵ� : " + myCar.maxSpeed);
		System.out.println("����ӵ� : " + myCar.speed);

		myCar.speed = 60;
		System.out.println("������ �ӵ� : " + myCar.speed);
	}

}

class CarExample1 {

	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxSpeed = 350;
	int speed;
}