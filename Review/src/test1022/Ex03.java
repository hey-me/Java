package test1022;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
//		3. 6���� ���� ������ �Է¹޾�(A/B/C/D/F) ArrayList�� ������ �� ������ ������ ����Ͽ� ���
//		   - �Է� ���� ) C F A B B D
//		   - A : 4, B : 3, C : 2, D : 1, F : 0
//		�Է��Ҷ� �α��ڸ��Է��ϴ���AB, �ѱ��� �Է��ϴ���, F������ ���ڸ� �ִ´ٴ��� ���׸����ڴ� char��
		List<Character> list=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		System.out.println("6������ ������ �Է��ϼ���.");
		String grade=null;
		for (int i = 0; i < 6; i++) {
			grade=s.next();
			char ch=grade.charAt(0);
			if(ch>='A'&&ch<='F') {
				list.add(ch);
			}else {
				System.out.println(i+1+"��° �Է��� ������ �߸��ԷµǾ����ϴ�.");
				break;
			}
			if(grade.length()>6) {
				System.out.println("�߸� �Է� �Ǿ����ϴ�.");
				break;
			}
		}
			
		int sum=0;
		char c=0;
		for (int i = 0; i < list.size(); i++) {
			c=list.get(i);
			switch(c) {
			case 'A': sum+=4; break;
			case 'B': sum+=3; break;
			case 'C': sum+=2; break;
			case 'D': sum+=1; break;
			default: sum+=0; break;
			}
		}
		System.out.println("�� ������: "+sum);
		
		
	
	}

}
