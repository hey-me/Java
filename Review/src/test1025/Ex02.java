package test1025;

import java.util.*;

public class Ex02 {
	static Scanner s;
	static Map<String, String> map=new HashMap<String, String>();
	public static void main(String[] args) {

//		2. 1�� ������ Ȯ���Ͽ� ����ڰ� �ܾ��� ��(����, �ѱ�)�� �߰��� �� �ֵ��� ����� �߰��ؼ� �ۼ��غ�����.
		s=new Scanner(System.in);
		point1:
		while(true) {
		System.out.print("�ܾ �Է��Ͻðڽ��ϱ�?(Y/N)");
		String answer=s.next();
		if(answer.equals("Y")) {
		input();
		}else if(answer.equals("N")){
			break;
		}else {
			System.out.println("�߸� �Է��߽��ϴ�.");
			continue point1;
		}
		}
		point2:
		while(true) {
		System.out.print("�߰��� �ܾ �ֽ��ϱ�?(Y/N)");
		String answer2=s.next();
		if(answer2.equals("Y")) {
			input();
		}else if(answer2.equals("N")){
			search();
			break;
		}else {
			System.out.println("�߸� �Է��߽��ϴ�.");
			continue point2;
		}
		}
		

	}
	static void input() {
		s=new Scanner(System.in);
		String eng; String kor=null;
		here1:
		while(true) {
		System.out.print("��� �Է�: ");
		eng=s.nextLine();
		if(eng.equals("�׸�")){break;}
		for (int i = 0; i < eng.length(); i++) {
			if(String.valueOf(eng.charAt(i)).matches("[a-zA-Z]")){
			}else {
				System.out.println("����� �Է��ϼ���");
				continue here1;
			}
			
		}
		
		
		here2:
		while(true) {
		System.out.print("�ؼ� �Է�: ");
		kor=s.nextLine();
		if(kor.equals("�׸�")) {break;}
			for (int i = 0; i < kor.length(); i++) {
			if(String.valueOf(kor.charAt(i)).matches("[��-����-�Ӱ�-�R]")){
			}else {
				System.out.println("�ѱ۷� �Է��ϼ���");
				continue here2;
				}
			}
			map.put(eng, kor);
			continue here1;
		}
		
		}
	}
	static void search() {
		Set<String> set=map.keySet();
		Iterator<String> iterator=set.iterator();
		while(true) {
			String result=iterator.next();
			System.out.print("�˻��� ��� �Է�: ");
			String key=s.next();
			
			if(key.equals("stop")) {
				System.out.println("�����մϴ�.");
				System.exit(0);
			}
			if(key.equals(result)) {
				String value=map.get(key);
				System.out.println(key+"�� �ش��ϴ� �ѱ���: "+value);
			}else {
				System.out.println("�ش��ϴ� �ܾ �����ϴ�.");
			}
		}
	}

}
