package ch13_컬렉션프레임워크.예제;

import java.util.*;

public class P561_VectorExample {

	public static void main(String[] args) {

		List<Board> list = new Vector<Board>();
		list.add(new Board("제목1" , "내용1", "글쓴이1"));
		list.add(new Board("제목2" , "내용2", "글쓴이2"));
		list.add(new Board("제목3" , "내용3", "글쓴이3"));
		list.add(new Board("제목4" , "내용4", "글쓴이4"));
		list.add(new Board("제목5" , "내용5", "글쓴이5"));
		list.remove(2);
		list.remove(3);
		
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(i+"번째 "+ "subject" + board.subject );
			System.out.println(i+"번째 "+ "content" + board.content );
			System.out.println(i+"번째 "+ "writer" + board.writer );
		}
//		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
//			Board board = (Board) iterator.next();
//			
//		}
		
		
	}

}

class Board{
	String subject;
	String content;
	String writer;
	
	public Board(String subject, String content,	String writer) {
		this.subject = subject; this.content = content; this.writer = writer;
	}
	
}
