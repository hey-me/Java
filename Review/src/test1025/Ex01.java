package test1025;
import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
//		1. (����, �ѱ�) �ܾ ������ HashMap�� �����ϰ� ����� �ѱ��� �˻��ϴ� ���α׷��� �ۼ��غ�����. "exit"�� �Է��ϸ� ����ǵ��� �ϼ���.
		Map<String, String> map=new HashMap<String, String>();
		Scanner s=new Scanner(System.in);
//		���ܹ߻����Ϸ��� throw, ���ܸ� �������� throws
		String eng=null; String kor=null;
		here1:
		while(true) {
		System.out.print("��� �Է�: ");
		eng=s.nextLine();
		if(eng.equals("�׸�")){break;}
		for (int i = 0; i < eng.length(); i++) {
			if(String.valueOf(eng.charAt(i)).matches("[a-zA-z]")){
			}else {
				System.out.println("��� �Է��ϼ���");
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
				System.out.println("�ѱ۸� �Է��ϼ���");
				continue here2;
				}
			}
			map.put(eng, kor);
			continue here1;
		}
		
		}
		
	
		Set<String> set=map.keySet();
		Iterator<String> iterator=set.iterator();
		String result=iterator.next();
		while(true) {
			
			System.out.print("�˻��� ��� �Է�: ");
			String key=s.next();
			
			if(key.equals("stop")) {
				System.out.println("�����մϴ�.");
				break;
			}
			if(key.equals(result)) {	//containsKey�� �̿밡�� map.contains(key)
				
				String value=map.get(key);
				System.out.println(key+"�� �ش��ϴ� �ѱ���: "+value);
			}else {
				System.out.println("�ش��ϴ� �ܾ �����ϴ�.");
			}
		}
		
		

	}

}
