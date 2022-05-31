package ch13_�÷��������ӿ�ũ.����;

import java.util.*;

public class P581_Ȯ�ι���7 {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board123> list = dao.getBoardList();
		for (Board123 board : list) {
			System.out.println(board.getTitle() + "-"+ board.getContent());
		}
	}

}

class BoardDao {
	String title;
	String content;
	public BoardDao() {
	}

	public List<Board123> getBoardList() {
		List<Board123> list= new ArrayList<Board123>();
		list.add(new Board123("����1", "����1"));
		list.add(new Board123("����2", "����2"));
		list.add(new Board123("����3", "����3"));
		return list;
	}
	
}
class Board123 {
	private String title;
	private String content;
	
	public Board123(String title,String content) {
		this.title = title; this.content = content;
	}
	
	String getTitle () {
		return title;
	}
	String getContent () {
		return content;
	}
	
}

