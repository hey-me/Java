package ch07_상속;

public class P353_2_타입변환확인문제_5 {

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
		System.out.println("로그인");
	}
}

class MemberService extends Service {
	void login() {
		System.out.println("멤버 로그인");
	}
}

class AService extends MemberService {
	void login() {
		System.out.println("A 로그인");
	}
}