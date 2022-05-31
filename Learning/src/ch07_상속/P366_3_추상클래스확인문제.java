package ch07_상속;

public class P366_3_추상클래스확인문제 {

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
		System.out.println("로그인합니다.");
	}
}

class FildDownloadServlet extends HttpServlet10 {
	@Override
	void service() {
		System.out.println("파일 다운로드합니다.");
	}
}