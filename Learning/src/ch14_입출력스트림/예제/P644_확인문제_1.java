//package ch14_����½�Ʈ��.����;
//
//import java.io.*;
//import java.util.*;
//
//public class P644_Ȯ�ι���_1 {
//
//	public static void main(String[] args) throws Exception {
//	
//		File dir = new File("C:/JavaSF/workspace/JavaSF/Board");
//		if(!dir.exists()) {
//			dir.mkdirs();
//		}
//	
//		
//		
////		File file1 = new File("C:/Temp/file3.txt");
////		
////		if(!file1.exists()) {
////			file1.createNewFile();
////		}
//		
//		BoardService2 bs = new BoardService2();
//		bs.showMenu();
//		
//		
//	}
//}
//class BoardService2  {
//	
//	private List<File> list = new ArrayList<>();
//	private Scanner s = new Scanner(System.in);
//	private int counter;
//	
//	OutputStream os= new FileOutputStream("C:/JavaSF/workspace/JavaSF/Board");
//	Writer writer = new OutputStreamWriter(os);
//	BufferedWriter bw = new BufferedWriter(writer);
//	InputStream is= new FileInputStream("C:/JavaSF/workspace/JavaSF/Board");
//	Reader reader = new InputStreamReader(is);
//	
////			new FileInputStream("C:/JavaSF/workspace/JavaSF/Board/file"+1+".txt");
//
//	public BoardService2() throws Exception {}
//	
//	void showListBoard() {
//		
//		for (File f : list) {
//			System.out.println("�Խñ� ���� : "+f.getName());
//		}
//	}
//	void showContentBoard() {
//		System.out.println("�󼼺����� �Խñ� ��ȣ : ");
//		String str = s.nextLine();
//		is = new FileInputStream("C:/JavaSF/workspace/JavaSF/Board/file"+str+".txt");
//		
//		while(is.read()) {
//			
//		}
//		for (File f : list) {
//			System.out.println(f.getName() +"�� �Խñ� ���� : ");
//		}			
//	}
//	void registerBoard() {
//		try {
//			File fi= new File("C:/JavaSF/workspace/JavaSF/Board/file+"+list.get(++counter)+".txt");
//			if(!fi.exists()) {
//				fi.createNewFile();
//			}
//			System.out.println("����: ");
//			
//			System.out.println("����: ");
//			b.setContent(s.nextLine());
//			list.add(b);
//		} catch (Exception e) {
//			System.out.println("����: "+e.getMessage());
//		}
//	}
//	void modifyBoard() {
//		try {
//			System.out.println("������ �Խñ� ��ȣ �Է�: ");
//			String num = s.nextLine();
//			Board2 mo=list.get(Integer.parseInt(num));
//			System.out.println(mo.getNum()+"�� �Խñ� ���� : "+ mo.getTitle()+"\n ���� : "+mo.getContent());
//			System.out.println("������ ���� �Է�: ");
//			String cont = s.nextLine();
//			mo.setContent(cont);
//			System.out.println("�����Ϸ�");
//			System.out.println(mo.getNum()+"�� �Խñ� ���� : "+ mo.getTitle()+"\n ���� : "+mo.getContent());
//		} catch (NumberFormatException e) {
//			System.out.println("���ڸ� �Է��ϼ���");
//		} catch (IndexOutOfBoundsException e) {
//			System.out.println("���� �Խñ��Դϴ�. ��ϵǾ��ִ� �Խñ� ��ȣ�� �Է��ϼ���");
//		}
//	}
//	void deleteBoard() {
//		try {
//			System.out.println("������ �Խñ� ��ȣ �Է�: ");
//			String num = s.nextLine();
//			Board2 de=list.get(Integer.parseInt(num));
//			System.out.println(de.getNum()+"�� �Խñ� ���� : "+ de.getTitle()+"\n ���� : "+de.getContent());
//			System.out.println("�����Ͻðڽ��ϱ�? Y�Է�");
//			String delete = s.nextLine().valueOf(0).toUpperCase();
//			if(delete.equals("Y")) {
//				list.remove(de);
//				System.out.println("�����Ϸ�");
//			} else {
//				System.out.println("������ ��� �Ǿ����ϴ�.");
//			}
//		} catch (NumberFormatException e) {
//			System.out.println("���ڸ� �Է��ϼ���");
//		} catch (IndexOutOfBoundsException e) {
//			System.out.println("���� �Խñ��Դϴ�. ��ϵǾ��ִ� �Խñ� ��ȣ�� �Է��ϼ���");
//		}
//	}
//	boolean isTrue() {
//		if(!list.isEmpty()) {
//			return true;
//		} else {
//			System.out.println("��ϵ� �Խñ��� �����ϴ�. ���� ����ϼ���");
//			return false;
//		}
//	}	
//	void showMenu() {
//		while(true) {
//			System.out.println();
//			System.out.println("---------------------------------------------------------");
//			System.out.println("1.��Ϻ��� | 2.�󼼺��� | 3.�����ϱ� | 4.�����ϱ� | 5.�������� | 6.����");
//			System.out.println("---------------------------------------------------------");
//			System.out.println("���� : ");
//			String str = s.nextLine();
//			if(isTrue()) {
//				switch (str) {
//				case "1":{showListBoard();	break;	}
//				case "2":{showContentBoard();break;}
//				case "3":{modifyBoard();break;}
//				case "4":{deleteBoard(); break;	}
//				case "5":{registerBoard(); break;	}
//				case "6":{System.out.println("����"); return ;}
//				}
//			}
//		}
//	}
//}
//class Board2{
//	private int num;
//	private String title;
//	private String content;
//	public int getNum() {return num;}
//	public void setNum(int num) {	this.num = num;	}
//	public String getTitle() {	return title;}
//	public void setTitle(String title) {	this.title = title;}
//	public String getContent() {	return content;}
//	public void setContent(String content) {	this.content = content;}
//}
