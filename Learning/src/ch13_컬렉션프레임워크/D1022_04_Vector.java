package ch13_컬렉션프레임워크;
import java.util.*;
public class D1022_04_Vector {

	public static void main(String[] args) {
//벡터는 동기화(synchronized)가 되어있음
//		그래서 멀티스레드가 동시에 벡터의 메소드를 실행할 순 없음. 안전하게 스레드작업가능
		
		List<Board> list=new Vector<Board>();
		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		for (int i = 0; i < list.size(); i++) {
			Board board=list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
		System.out.println();
		
		for(Board board:list) {	//향상된 for문을 이용해서 출력
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
		
		
	}

}
class Board{
	String subject;
	String content;
	String writer;
	
	Board(String subject, String content, String writer){
		this.subject=subject;
		this.content=content;
		this.writer=writer;
	}
}