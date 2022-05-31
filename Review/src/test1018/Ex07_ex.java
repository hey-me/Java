package test1018;

public class Ex07_ex {

	public static void main(String[] args) {

//		String클래스와 StringBuffer 클래스 차이를 확인할 수 있도록 코드 작성
		
		String a="korea";
		StringBuffer sb=new StringBuffer("korea");
		
//		System.out.println(a);
		System.out.println(sb);
//		System.out.println(a.hashCode());
		System.out.println(sb.hashCode());	//sb에 new를 했기 때문에 해시코드는 다름
		
		a+=" is korea";	//위의a와 여기의 a는 같을까?String클래스는 원래 수정이 불가함 문자열을 수정(연결)하면 새로운 주소에 메모리가 생김
		sb.append(" is korea");
		
//		System.out.println(a);
		System.out.println(sb);
//		System.out.println(a.hashCode());
		System.out.println(sb.hashCode());
		
//		문자열을 계속 추가해야되는 상황에서는 String클래스보다 Buffer를 사용하는게 문제가 안생김
	}

}
