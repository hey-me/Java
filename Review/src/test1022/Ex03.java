package test1022;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
//		3. 6과목에 대한 학점을 입력받아(A/B/C/D/F) ArrayList에 저장한 후 꺼내서 점수를 계산하여 출력
//		   - 입력 예시 ) C F A B B D
//		   - A : 4, B : 3, C : 2, D : 1, F : 0
//		입력할때 두글자를입력하던지AB, 한글을 입력하던지, F이후의 문자를 넣는다던지 제네릭인자는 char로
		List<Character> list=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		System.out.println("6과목의 학점을 입력하세요.");
		String grade=null;
		for (int i = 0; i < 6; i++) {
			grade=s.next();
			char ch=grade.charAt(0);
			if(ch>='A'&&ch<='F') {
				list.add(ch);
			}else {
				System.out.println(i+1+"번째 입력한 학점이 잘못입력되었습니다.");
				break;
			}
			if(grade.length()>6) {
				System.out.println("잘못 입력 되었습니다.");
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
		System.out.println("총 점수는: "+sum);
		
		
	
	}

}
