package ch06_클래스;

public class D0907_5_인스턴스멤버와_정적멤버 {

	public static void main(String[] args) {
/*	메모리에 올라간 것을 인스턴스라고.. 함.
 
	*인스턴스 멤버 this
		:객체마다 가지고 있는 멤버, 객체를 생성한 후 사용할 수 있는 필드와 메소드
		-인스턴스 필드 : 힙 영역의 객체마다 가지고 있는 멤버, 객체마다 다른 데이터를 저장
		-인스턴스 메소드 : 객체가 있어야 호출 가능한 메소드
			클래스 코드에 위치하지만 객체마다 가지고 있는 메소드라고 생각해도 됨.
		
	*정적 멤버 static 따로 저장됨. 여러 곳에 사용 가능.
		인스턴스 생성 없이 사용 가능.
		:객체와 상관 없는 멤버, 클래스 코드에 위치, 객체 없이 클래스만으로 사용 가능
		정적필드 및 상수, 정적 메소드 모두 객체 없이 사용 가능
		
	*객체마다 다를 수 있는 필드값=>인스턴스 필드로 선언
	 다를 필요 없는 필드 값	=> 정적 필드로 선언
		
	*싱글톤
		전체 프로그램에서 단 하나의 객체만 만들어야 될 때, 객체를 싱글톤이라 한다.
		외부에서 new연산자로 생성자를 호출할 수 없도록 막아야됨.
		
		*외부 클래스에서 호출할 때
			Singleton obj1 = Singleton.getInstance();
			Singleton obj2 = Singleton.getInstance();
		*싱글톤 클래스
			class 클래스 {
			private static 클래스 singleton = new Singleton();
			private 클래스() {}
			static 클래스 getInstance() {return singleton;}}
		
	*final필드
		초기값이 저장되면 이것이 최종적인 값이 되어 프로그램 실행 도중 수정할 수 없음.
		생성자에서 final필드의 최종 초기화 마쳐야 함. 안되면 컴파일 에러.

	*상수(constant) 불변의 값    
		public static final 이 거의 붙어있음 > 어디서나 쓰고, 인스턴스 할 필요 없고, 값이 안 변하고.
		상수 이름은 모두 대문자로 작성하는 것이 관례, 서로 다른 단어는 언더바로 연결
		상수는 static 이면서 final
		static final 타입 상수 = 초기값;
		
	
	
		
*/	
	}

  
  
  }
 
 
