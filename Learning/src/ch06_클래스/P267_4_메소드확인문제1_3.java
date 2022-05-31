package ch06_클래스;

public class P267_4_메소드확인문제1_3 {

	public static void main(String[] args) {
/*
		 
	1. 	리턴값이 없는 메소드는 리턴 타입을 void로 해야 한다. 
		리턴 타입이 있는 메소드는 리턴값을 지정하기 위해 반드시 리턴값이 있어야한다. 
		매개값의 개수를 모를 경우 ...을 이용해서 매개 변수를 선언할 수 있다. 
		같은 이름의 메소드를 여러개 선언하는 것을 메소드오버로딩이라고 한다.
		  
	2. O, X, O, O
		  
	3.
*/

		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if (result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}

	}
}

class MemberService {

	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}

	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

}
