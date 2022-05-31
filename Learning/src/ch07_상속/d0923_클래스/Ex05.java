package ch07_���.d0923_Ŭ����;

class Ex05 {

//	static DanceRobot da = new DanceRobot();
//	static SingRobot si = new SingRobot();
//	static DrawRobot dr = new DrawRobot();
//
//	static void action(Robot robot) {
//		if (robot instanceof DanceRobot) {
//			da.dance();
//		}
//		if (robot instanceof SingRobot) {
//			si.sing();
//		}
//		if (robot instanceof DrawRobot) {
//			dr.draw();
//		}
//	}
	static void action(Robot robot) {
		if (robot instanceof DanceRobot) {
			((DanceRobot) robot).dance();
		}
		if (robot instanceof SingRobot) {
			((SingRobot) robot).sing();
		}
		if (robot instanceof DanceRobot) {
			((DrawRobot) robot).draw();
		}
	}

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
	} // main

}

class Robot {
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("���� ��ϴ�.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("�뷡�� �մϴ�.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}
