package ch06_Ŭ����;

public class P267_4_�޼ҵ�Ȯ�ι���1_3 {

	public static void main(String[] args) {
/*
		 
	1. 	���ϰ��� ���� �޼ҵ�� ���� Ÿ���� void�� �ؾ� �Ѵ�. 
		���� Ÿ���� �ִ� �޼ҵ�� ���ϰ��� �����ϱ� ���� �ݵ�� ���ϰ��� �־���Ѵ�. 
		�Ű����� ������ �� ��� ...�� �̿��ؼ� �Ű� ������ ������ �� �ִ�. 
		���� �̸��� �޼ҵ带 ������ �����ϴ� ���� �޼ҵ�����ε��̶�� �Ѵ�.
		  
	2. O, X, O, O
		  
	3.
*/

		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if (result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("hong");
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
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
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}

}
