package ch08_인터페이스;
public class D0929_2_타입변환과다형성 {
/*	*인터페이스의 다형성
		- 인터페이스 사용 방법은 동일하지만 구현 객체를 교체하여 실행결과를 다양화 
		- 실 인스턴스만 바꿔주면 됨.
			ex)I i = new A();
			   I i = new B();
	
	*자동타입변환_p.387	
		인터페이스 변수 = 구현객체;  => 상속에서는 ... 상위클래스 변수 = 하위클래스;
		하위클래스는 상위클래스에 인스턴스하여 사용 가능
		
	*필드의 다형성... 상속클래스, 인터페이스 다 같음. _p.388
		Tire 앞왼쪽타이어 = new 한국타이어(); 
		Tire 앞오른쪽타이어 = new 한국타이어(); 
		
	*매개변수의 다형성
		interface에서 메소드 선언.. 구현객체를 참조변수로 사용  => Vehicle vehicle	
			ex)	void drive(Vehicle vehicle){ vehicle.rum(); }  
				Driver d = new Driver();
				Bus b = new Bus();
				d.drive(b); => Bus가 drive 인터페이스 정의하게 되어있으므로 사용가능.
		
	*강제타입변환(casting) ... **instanceof
 		구현클래스 변수 = (구현클래스) 인터페이스변수;
			ex)	Vehicle vehicle = new Bus(): 
			if( Vehicle instanceof Bus) {
				Bus bus = (Bus) vehicle;  }
			vehicle.run(); => 버스든 택시든 맞는것 실행됨.
				=> 강제형변환
		
	*인터페이스 상속	
		인터페이스끼리만 상속가능.
		public interface 하위인터페이스 extends 상위인터페이스1, 상위인터페이스2 {...} => 다중상속가능
		
		
		
		
		
		
		
		
		*/
	
	public static void main(String[] args) {
	}

}
