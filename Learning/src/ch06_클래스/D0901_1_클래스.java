package ch06_클래스;

public class D0901_1_클래스 {

	public static void main(String[] args) {
/*
	*메소드 선언부
		리턴타입: 메소드가 리턴하는 결과의 타입표시
			
	*인스턴스 = 클래스로부터 만들어진 객체
		클래스를 사용하기 위해 메모리에 올리는 것 = 인스턴스한다. 클래스이름 참조변수 = new 클래스이름();
	
	*객체 : 속성(필드-변할수있는것-변수로 표현)+동작(메소드)로 구성
	
	*라이브러리 (API:Application Program Interface) 클래스
	 	객체 생성 및 메소드 제공 역할 - ____.java
	
	*클래스 변수 (06-2필드)
	
	*클래스 멤버 (클래스를 구성)
		-필드(Field):변수: 객체의 데이터가 저장되는 곳
		-생성자(Constructor): 객체 생성시 초기화 역할 (클래스와 이름이 같은 메소드) 
							생성자는 호출 불가.(메모리 올라갈때 한번만 호출.)
							리턴 타입 없어야 됨.
		-메소드(Method): 객체의 동작에 해당하는 실행 블록
	
	
	*오버로딩
		이름이 같은 메소드를 여러 개 만드는 것.
		매개값을 다양하게 받아 처리할 수 있도록 하기 위함.
		매개 변수의 타입, 개수, 순서 중 하나가 달라야 됨.
		
		int plus (int a, int b);
		double plus(int a, double b);
		int plus (int a, int b, int c);
		double plus(double a, int b);
		
		어떤 값을 받아도 오류 없이 작용.
		메소드 이름은 같고// 매개 변수의 타입, 개수 순서는 다름. 주의. 뒤에꺼 같으면 메소드 오버로딩이 아님.. 
	
	
	
	*오버라이딩 -> 상속에서 나옴/... 출력시 toString메소드 말고 그냥 참조변수로 출력 가능.
		@Override 
		public String toString() {
			return "[ Marine의 위치는 ("+x+", "+y+")이고, 체력은 "+
					hp+", "+"공격력은 "+weapon+", "+"방어력은 "+
					armor+" 입니다. ]";
				
		Marine m1=new Marine();
		System.out.println(m1.toString); 이렇게 메소드 출력 안하고
		System.out.println(m1); 참조변수만 출력해도 됨.
*/
	}

}
