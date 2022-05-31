package ch07_상속;

public class D0927_3_추상클래스 {
/*	
 	*추상 클래스 abstract ... class 앞에 적음.
 		- 실체 클래스들의 공통적인 특성을 추출하여 선언한 것
 		- 추상 클래스와 실체 클래스는 부모, 자식 클래스로서 상속 관계를 가짐.
 		- 부모 클래스가 추상클래스가 될 가능성이 많음.
 		- 하위 클래스의 공통적인 것을 모아 추상클래스에 선언.
 		- 실체 클래스를 작성할 때 시간 절약 = 공통적인 것은 추상클래스에 선언해두고, 다른 점만 실체 클래스에 선언.
 		*: abstract 아직 완성이 안된 클래스이므로 인스턴스 생성하면 오류남.
  		
  		
  	*추상 클래스 선언
  		abstract class {}
  		상속 통해 자식 클래스만 만들 수 있게 만듦.
  		자식 객체 생성될 때 객체화 됨.
  		자식생성자에서 super()형태로 추상 클래스의 생성자 호출.
  		
  		
  	*추상 메소드
  		abstract 리턴타입 메소드이름 (매개변수,...);   => 중괄호 생략
  		- 메소드 앞에 abstract 
  		- 상속받은 하위 메소드에서는 사용하려면 반드시 오버라이딩 해야됨.
  			>>오버라이딩 안하면 상속받는것이 의미 없음.
  	
  		class abstract Animal {  abstract sound(); }  이것만 {}가 없음.
  		class Dog extends { sound(){}  }  오버라이딩해야됨.
  		class Cat extends { sound(){}  }  오버라이딩해야됨.
  		
  		class abstract Animal {  abstract void sound(); }  추상메소드가 있으면 클래스도 추상클래스
  	
  	
 	*추상메소드 재정의
 		- 메소드 선언만 통일하고, 실행 내용은 실체 클래스마다 달라야 하는 경우
  
 
 */
	public static void main(String[] args) {
	}
}
