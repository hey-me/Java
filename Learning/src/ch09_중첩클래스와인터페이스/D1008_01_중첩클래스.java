package ch09_중첩클래스와인터페이스;

import ch09_중첩클래스와인터페이스.D2.InstInner;

public class D1008_01_중첩클래스 {
//	p.406
//중첩클래스 중 안에 클래스는 이너클래스 밖은 아우터클래스
//여러클래스와 관계를 맺는 경우는 독립적으로 클래스생성하는게 좋으나 특정클래스만 관계를 맺을거면 내부에 클래스선언하는게 좋음
//익명클래스를 이해하려면 상속,인터페이스,내부클래스 이해를 해야함	
//	정적멤버클래스랑 인스턴스 클래스 사용차이 인지하기
	public static void main(String[] args) {

		D2 d2 = new D2();
		D2.b = 0;
		System.out.println(d2.a); 
		InstInner inst=d2.new InstInner();	//import한 후에 사용가능
		D2.InstInner inst2=d2.new InstInner();
		D2.StaticInner si=new D2.StaticInner();
//		클래스안에 중첩클래스가 static일때 아닐때 인스턴스생성하는게 다름
	}

}

class D2 {
	int a; // 클래스 인스턴스 생성한 후에 변수.a하면 사용가능
	static int b; // 클래스이름.b하면 사용가능
	int[] ar; // 배열을 저장하고싶으면 배열선언을 하면되고
	// boolean, string, int등 다양한 것을 저장하고싶다면 InstInner클래스 안에 다양한 타입들을 선언해놓고 클래스를
	// 선언하면됌
	/*
	InstInner inst = new InstInner();
	InstInner inst2 = new InstInner(10, "엥", false);	//근데 왜 저 클래스 필드를 못쓰지?
	InstInner[]inst3=new InstInner[3];
	D2(){a=inst2.ia;
	inst3[0]=new InstInner(1, "ㄱ", true);
	inst3[1]=new InstInner(2, "ㄴ", false);
	inst3[2]=new InstInner(3, "ㄷ", true);
	
	}
*/
	
	// InstInner, StaticInner 둘다 내부클래스(멤버클래스)
	class InstInner {//인스턴스 클래스
		// 이것도 밖에 있는 클래스를 인스턴스 생성해서 사용가능
		int ia;
		String is;
		boolean ic;
//		static int ib;	//에러는 안나는데 사용이 아마 불가능일듯?p.408
		InstInner() { }

		InstInner(int a, String s, boolean c){
			ia=a; is=s; ic=c;
		}
//		static void method() {		}//에러는 안나는데 사용이 아마 불가능일듯?p.408
	}

	static class StaticInner {int sn; }// 인스턴스 생성 안해도 밖클래스 이름.스태틱클래스 로 사용가능

	void method() {//메소드 안에 들어가 있는 클래스는 로컬클래스. 메소드가 끝나면 사라짐 메소드 안에서만 동작
		class LocalInner{	}	//로컬에는 static을 붙이면 안됌(메소드가 호출될때에만 사용되므로) 사용하려면 인스턴스 생성해야함
		LocalInner li=new LocalInner();
	}	
}

/* 한 자바파일안에 클래스를 독립적으로 생성하면 bin폴더의 class파일은 여러개 생성됌
 * 클래스안에 클래스를 선언하면 클래스파일이 밖의클래스이름$내부클래스 이름으ㅣ 형식으로 생성됌
 * 내부클래스의 타입이 스태틱인지 인스턴스인지 알 수 없지만 로컬클래스는 $다음에 숫자가 써져있어서 구별 가능
 * */
