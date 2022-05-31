package ch13_�÷��������ӿ�ũ;
import java.util.*;
public class D1022_04_Vector {

	public static void main(String[] args) {
//���ʹ� ����ȭ(synchronized)�� �Ǿ�����
//		�׷��� ��Ƽ�����尡 ���ÿ� ������ �޼ҵ带 ������ �� ����. �����ϰ� �������۾�����
		
		List<Board> list=new Vector<Board>();
		list.add(new Board("����1","����1","�۾���1"));
		list.add(new Board("����2","����2","�۾���2"));
		list.add(new Board("����3","����3","�۾���3"));
		list.add(new Board("����4","����4","�۾���4"));
		list.add(new Board("����5","����5","�۾���5"));
		for (int i = 0; i < list.size(); i++) {
			Board board=list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
		System.out.println();
		
		for(Board board:list) {	//���� for���� �̿��ؼ� ���
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