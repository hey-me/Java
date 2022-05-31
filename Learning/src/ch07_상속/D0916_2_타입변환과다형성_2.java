package ch07_상속;

public class D0916_2_타입변환과다형성_2 {

	public static void main(String[] args) {

/*		* 강제 타입 변환
 			부모타입을 자식타입으로 변환.
			자식타입 변수 = (자식타입) 부모타입;
			자식타입이 부모타입으로 자동 타입변환한 후 다시 자식 타입으로 변환할 때 사용가능
			
			ex)	Parent parent = new Parent();
					Child child = (Child) parent; // 불가능
					Parent parent = new Child();
					Child child = (Child) parent; // 가능
					
		* instanceof 형변환...
			형변환 사용시 instanceof를 사용하기! 오류 안나도록.
			ex)  if (parent instanceof Child) => parent 를 Child로 형변환이 가능한가? > true, false
			
		실인스턴스가 하위에 있을때만 필요시 강제변환하여 사용할 수 있다.
		
		ex)
		Tire frontLeftTire = new Tire ("앞왼쪽",5);
		Tire 타입의 frontLeftTire 는 Tire에 ( , ) 형태의 인스턴스를 생성하여 넣은 것.

		Tire frontRightTire = new KumhoTire ("앞오른쪽",2);  
		=> 금호타이어는 타이어의 상속을 받는 하위 클래스구나~ 저렇게도 사용 가능. (new Tire 안하고 new KumhoTire 가능)
*/
		
	}

}
