package ch13_컬렉션프레임워크.예제;

import java.util.*;

public class P581_확인문제7 {

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
		list.add(new Board123("제목1", "내용1"));
		list.add(new Board123("제목2", "내용2"));
		list.add(new Board123("제목3", "내용3"));
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

