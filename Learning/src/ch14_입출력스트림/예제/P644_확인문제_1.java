//package ch14_입출력스트림.예제;
//
//import java.io.*;
//import java.util.*;
//
//public class P644_확인문제_1 {
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
//			System.out.println("게시글 제목 : "+f.getName());
//		}
//	}
//	void showContentBoard() {
//		System.out.println("상세보기할 게시글 번호 : ");
//		String str = s.nextLine();
//		is = new FileInputStream("C:/JavaSF/workspace/JavaSF/Board/file"+str+".txt");
//		
//		while(is.read()) {
//			
//		}
//		for (File f : list) {
//			System.out.println(f.getName() +"번 게시글 내용 : ");
//		}			
//	}
//	void registerBoard() {
//		try {
//			File fi= new File("C:/JavaSF/workspace/JavaSF/Board/file+"+list.get(++counter)+".txt");
//			if(!fi.exists()) {
//				fi.createNewFile();
//			}
//			System.out.println("제목: ");
//			
//			System.out.println("내용: ");
//			b.setContent(s.nextLine());
//			list.add(b);
//		} catch (Exception e) {
//			System.out.println("에러: "+e.getMessage());
//		}
//	}
//	void modifyBoard() {
//		try {
//			System.out.println("수정할 게시글 번호 입력: ");
//			String num = s.nextLine();
//			Board2 mo=list.get(Integer.parseInt(num));
//			System.out.println(mo.getNum()+"번 게시글 제목 : "+ mo.getTitle()+"\n 내용 : "+mo.getContent());
//			System.out.println("수정할 내용 입력: ");
//			String cont = s.nextLine();
//			mo.setContent(cont);
//			System.out.println("수정완료");
//			System.out.println(mo.getNum()+"번 게시글 제목 : "+ mo.getTitle()+"\n 내용 : "+mo.getContent());
//		} catch (NumberFormatException e) {
//			System.out.println("숫자를 입력하세요");
//		} catch (IndexOutOfBoundsException e) {
//			System.out.println("없는 게시글입니다. 등록되어있는 게시글 번호를 입력하세요");
//		}
//	}
//	void deleteBoard() {
//		try {
//			System.out.println("삭제할 게시글 번호 입력: ");
//			String num = s.nextLine();
//			Board2 de=list.get(Integer.parseInt(num));
//			System.out.println(de.getNum()+"번 게시글 제목 : "+ de.getTitle()+"\n 내용 : "+de.getContent());
//			System.out.println("삭제하시겠습니까? Y입력");
//			String delete = s.nextLine().valueOf(0).toUpperCase();
//			if(delete.equals("Y")) {
//				list.remove(de);
//				System.out.println("삭제완료");
//			} else {
//				System.out.println("삭제가 취소 되었습니다.");
//			}
//		} catch (NumberFormatException e) {
//			System.out.println("숫자를 입력하세요");
//		} catch (IndexOutOfBoundsException e) {
//			System.out.println("없는 게시글입니다. 등록되어있는 게시글 번호를 입력하세요");
//		}
//	}
//	boolean isTrue() {
//		if(!list.isEmpty()) {
//			return true;
//		} else {
//			System.out.println("등록된 게시글이 없습니다. 글을 등록하세요");
//			return false;
//		}
//	}	
//	void showMenu() {
//		while(true) {
//			System.out.println();
//			System.out.println("---------------------------------------------------------");
//			System.out.println("1.목록보기 | 2.상세보기 | 3.수정하기 | 4.삭제하기 | 5.파일저장 | 6.종료");
//			System.out.println("---------------------------------------------------------");
//			System.out.println("선택 : ");
//			String str = s.nextLine();
//			if(isTrue()) {
//				switch (str) {
//				case "1":{showListBoard();	break;	}
//				case "2":{showContentBoard();break;}
//				case "3":{modifyBoard();break;}
//				case "4":{deleteBoard(); break;	}
//				case "5":{registerBoard(); break;	}
//				case "6":{System.out.println("종료"); return ;}
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
