package ch14_입출력스트림.예제;

import java.util.*;

public class P644_확인문제 {

	public static void main(String[] args) {
		BoardService bs = new BoardService();
		bs.showMenu();
	}
}
class BoardService {
	private List<Board> list = new ArrayList<Board>();
	private Scanner s = new Scanner(System.in);
	private int counter;
	
	void showListBoard() {
		for (Board b : list) {
			System.out.println(b.getNum() +"번 제목 : "+ b.getTitle());
		}
	}
	void showContentBoard() {
		for (Board b : list) {
			System.out.println(b.getNum() +"번 제목 : "+ b.getTitle()+"\n 내용 : "+b.getContent() );
		}			
	}
	void registerBoard() {
		try {
			Board b = new Board();
			b.setNum(++counter);
			System.out.println("제목: ");
			b.setTitle(s.nextLine());
			System.out.println("내용: ");
			b.setContent(s.nextLine());
			list.add(b);
		} catch (Exception e) {
			System.out.println("에러: "+e.getMessage());
		}
	}
	void modifyBoard() {
		try {
			System.out.println("수정할 게시글 번호 입력: ");
			String num = s.nextLine();
			Board mo=list.get(Integer.parseInt(num));
			System.out.println(mo.getNum()+"번 게시글 제목 : "+ mo.getTitle()+"\n 내용 : "+mo.getContent());
			System.out.println("수정할 내용 입력: ");
			String cont = s.nextLine();
			mo.setContent(cont);
			System.out.println("수정완료");
			System.out.println(mo.getNum()+"번 게시글 제목 : "+ mo.getTitle()+"\n 내용 : "+mo.getContent());
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("없는 게시글입니다. 등록되어있는 게시글 번호를 입력하세요");
		}
	}
	void deleteBoard() {
		try {
			System.out.println("삭제할 게시글 번호 입력: ");
			String num = s.nextLine();
			Board de=list.get(Integer.parseInt(num));
			System.out.println(de.getNum()+"번 게시글 제목 : "+ de.getTitle()+"\n 내용 : "+de.getContent());
			System.out.println("삭제하시겠습니까? Y입력");
			String delete = s.nextLine().valueOf(0).toUpperCase();
			if(delete.equals("Y")) {
				list.remove(de);
				System.out.println("삭제완료");
			} else {
				System.out.println("삭제가 취소 되었습니다.");
			}
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("없는 게시글입니다. 등록되어있는 게시글 번호를 입력하세요");
		}
	}
	boolean isTrue() {
		if(!list.isEmpty()) {
			return true;
		} else {
			System.out.println("등록된 게시글이 없습니다. 글을 등록하세요");
			return false;
		}
	}	
	void showMenu() {
		while(true) {
			System.out.println();
			System.out.println("---------------------------------------------------------");
			System.out.println("1.목록보기 | 2.상세보기 | 3.수정하기 | 4.삭제하기 | 5.파일저장 | 6.종료");
			System.out.println("---------------------------------------------------------");
			System.out.println("선택 : ");
			String str = s.nextLine();
			if(isTrue()) {
				switch (str) {
				case "1":{showListBoard();	break;	}
				case "2":{showContentBoard();break;}
				case "3":{modifyBoard();break;}
				case "4":{deleteBoard(); break;	}
				case "5":{registerBoard(); break;	}
				case "6":{System.out.println("종료"); return;}
				}
			}
		}
	}
}
class Board{
	private int num;
	private String title;
	private String content;
	public int getNum() {return num;}
	public void setNum(int num) {	this.num = num;	}
	public String getTitle() {	return title;}
	public void setTitle(String title) {	this.title = title;}
	public String getContent() {	return content;}
	public void setContent(String content) {	this.content = content;}
}
