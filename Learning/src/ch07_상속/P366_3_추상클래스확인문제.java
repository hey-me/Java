package ch07_���;

public class P366_3_�߻�Ŭ����Ȯ�ι��� {

//		1. O, O, O, X
//		2. O, O, O, X

	//3.
	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FildDownloadServlet());
	}

	static void method(HttpServlet10 servlet) {
		servlet.service();
	}

}

abstract class HttpServlet10 {
	abstract void service();
}

class LoginServlet extends HttpServlet10 {
	@Override
	void service() {
		System.out.println("�α����մϴ�.");
	}
}

class FildDownloadServlet extends HttpServlet10 {
	@Override
	void service() {
		System.out.println("���� �ٿ�ε��մϴ�.");
	}
}