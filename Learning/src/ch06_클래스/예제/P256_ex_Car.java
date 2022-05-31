package ch06_Ŭ����.����;

public class P256_ex_Car {

	public static void main(String[] args) {

		Car myCar = new Car();

		myCar.setGas(5);

		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("����մϴ�.");
			myCar.run();
		}

		if (myCar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �ֽ��ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���");
		}
	}

}

class Car {
	int gas;

	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ� : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("����ϴ�.(gas�ܷ� : " + gas + ")");
				return;
			}
		}
	}

}
