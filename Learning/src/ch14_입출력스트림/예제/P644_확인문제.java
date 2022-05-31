package ch14_����½�Ʈ��.����;

import java.util.*;

public class P644_Ȯ�ι��� {

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
			System.out.println(b.getNum() +"�� ���� : "+ b.getTitle());
		}
	}
	void showContentBoard() {
		for (Board b : list) {
			System.out.println(b.getNum() +"�� ���� : "+ b.getTitle()+"\n ���� : "+b.getContent() );
		}			
	}
	void registerBoard() {
		try {
			Board b = new Board();
			b.setNum(++counter);
			System.out.println("����: ");
			b.setTitle(s.nextLine());
			System.out.println("����: ");
			b.setContent(s.nextLine());
			list.add(b);
		} catch (Exception e) {
			System.out.println("����: "+e.getMessage());
		}
	}
	void modifyBoard() {
		try {
			System.out.println("������ �Խñ� ��ȣ �Է�: ");
			String num = s.nextLine();
			Board mo=list.get(Integer.parseInt(num));
			System.out.println(mo.getNum()+"�� �Խñ� ���� : "+ mo.getTitle()+"\n ���� : "+mo.getContent());
			System.out.println("������ ���� �Է�: ");
			String cont = s.nextLine();
			mo.setContent(cont);
			System.out.println("�����Ϸ�");
			System.out.println(mo.getNum()+"�� �Խñ� ���� : "+ mo.getTitle()+"\n ���� : "+mo.getContent());
		} catch (NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ���");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("���� �Խñ��Դϴ�. ��ϵǾ��ִ� �Խñ� ��ȣ�� �Է��ϼ���");
		}
	}
	void deleteBoard() {
		try {
			System.out.println("������ �Խñ� ��ȣ �Է�: ");
			String num = s.nextLine();
			Board de=list.get(Integer.parseInt(num));
			System.out.println(de.getNum()+"�� �Խñ� ���� : "+ de.getTitle()+"\n ���� : "+de.getContent());
			System.out.println("�����Ͻðڽ��ϱ�? Y�Է�");
			String delete = s.nextLine().valueOf(0).toUpperCase();
			if(delete.equals("Y")) {
				list.remove(de);
				System.out.println("�����Ϸ�");
			} else {
				System.out.println("������ ��� �Ǿ����ϴ�.");
			}
		} catch (NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ���");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("���� �Խñ��Դϴ�. ��ϵǾ��ִ� �Խñ� ��ȣ�� �Է��ϼ���");
		}
	}
	boolean isTrue() {
		if(!list.isEmpty()) {
			return true;
		} else {
			System.out.println("��ϵ� �Խñ��� �����ϴ�. ���� ����ϼ���");
			return false;
		}
	}	
	void showMenu() {
		while(true) {
			System.out.println();
			System.out.println("---------------------------------------------------------");
			System.out.println("1.��Ϻ��� | 2.�󼼺��� | 3.�����ϱ� | 4.�����ϱ� | 5.�������� | 6.����");
			System.out.println("---------------------------------------------------------");
			System.out.println("���� : ");
			String str = s.nextLine();
			if(isTrue()) {
				switch (str) {
				case "1":{showListBoard();	break;	}
				case "2":{showContentBoard();break;}
				case "3":{modifyBoard();break;}
				case "4":{deleteBoard(); break;	}
				case "5":{registerBoard(); break;	}
				case "6":{System.out.println("����"); return;}
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
