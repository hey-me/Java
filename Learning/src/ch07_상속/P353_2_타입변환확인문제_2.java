package ch07_���;

public class P353_2_Ÿ�Ժ�ȯȮ�ι���_2 {

	public static void main(String[] args) {

		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;

		snowTire.run();
		tire.run();
		
	}
}

class Tire {
	void run() {
		System.out.println("�Ϲ� Ÿ�̾ �������ϴ�.");
	}
}

class SnowTire extends Tire {
	@Override
	void run() {
		System.out.println("����� Ÿ�̾ �������ϴ�.");
	}
}
