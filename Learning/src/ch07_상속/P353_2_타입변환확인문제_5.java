package ch07_���;

public class P353_2_Ÿ�Ժ�ȯȮ�ι���_5 {

	public static void main(String[] args) {

		Controller controller = new Controller();
		controller.setService(new MemberService());
		controller.service.login();

		controller.setService(new AService());
		controller.service.login();

	}

}

class Controller {
	MemberService service;

	void setService(MemberService service) {
		this.service = service;
	}
}

class Service {
	void login() {
		System.out.println("�α���");
	}
}

class MemberService extends Service {
	void login() {
		System.out.println("��� �α���");
	}
}

class AService extends MemberService {
	void login() {
		System.out.println("A �α���");
	}
}