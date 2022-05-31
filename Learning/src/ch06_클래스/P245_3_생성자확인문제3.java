package ch06_클래스;

public class P245_3_생성자확인문제3 {
	Board b1 = new Board(null, null);
	Board b2 = new Board(null, null, null);
	Board b3 = new Board(null, null, null, null);
	Board b4 = new Board(null, null, null, null, 0);
}

//중복되는 코드 없게 해주기. this()코드 사용하여 다른 생성자를 호출
class Board {
	String title;
	String content;
	String writer;
	String data;
	int hitcount;

	Board(String title, String content) {
//		this.title = title;
//		this.content = content;
//		this.writer = "로그인한 회원아이디";
//		this.data = "현재 컴퓨터 날짜";
//		this.hitcount = 0;
		this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);
	}

	Board(String title, String content, String writer) {
//		this.title = title;
//		this.content = content;
//		this.writer = writer;
//		this.data = "현재 컴퓨터 날짜";
//		this.hitcount = 0;
		this(title, content, writer, "현재 컴퓨터 날짜", 0);
	}

	Board(String title, String content, String writer, String date) {
//		this.title = title;
//		this.content = content;
//		this.writer = writer;
//		this.data = date;
//		this.hitcount = 0;
		this(title, content, writer, date, 0);
	}

	Board(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.data = date;
		this.hitcount = hitcount;
	}
}
