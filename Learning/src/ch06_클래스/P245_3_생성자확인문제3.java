package ch06_Ŭ����;

public class P245_3_������Ȯ�ι���3 {
	Board b1 = new Board(null, null);
	Board b2 = new Board(null, null, null);
	Board b3 = new Board(null, null, null, null);
	Board b4 = new Board(null, null, null, null, 0);
}

//�ߺ��Ǵ� �ڵ� ���� ���ֱ�. this()�ڵ� ����Ͽ� �ٸ� �����ڸ� ȣ��
class Board {
	String title;
	String content;
	String writer;
	String data;
	int hitcount;

	Board(String title, String content) {
//		this.title = title;
//		this.content = content;
//		this.writer = "�α����� ȸ�����̵�";
//		this.data = "���� ��ǻ�� ��¥";
//		this.hitcount = 0;
		this(title, content, "�α����� ȸ�����̵�", "���� ��ǻ�� ��¥", 0);
	}

	Board(String title, String content, String writer) {
//		this.title = title;
//		this.content = content;
//		this.writer = writer;
//		this.data = "���� ��ǻ�� ��¥";
//		this.hitcount = 0;
		this(title, content, writer, "���� ��ǻ�� ��¥", 0);
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
