package ch07_상속;
	
public class D0916_2_타입변환과다형성_1 {public static void main(String[] args) {

/*
 		* 다형성 : 다양한 객체 활용해 여러 샐행결과가 나오도록 하는 성질
	       		     메소드 재정의 + 타입 변환 => 다형성
  
		* 자동 타입 변환
			-> 부모타입변수 = 자식타입; */
				AA1  a = new AA1();
				BB1  b = new BB1();
//				b=a;  //불가능
				a=b;  //자식타입은 부모타입에 넣을 수 있음.
 				a = new BB1(); // 윗 줄과 동일함.
				
				a.method2();  // => B-method2가 출력되어버림. 오버라이딩.
}}
				class AA1{
					void method1() {
						System.out.println("A-method1");}
					void method2() {
						System.out.println("A-method2");}
				}
				class BB1 extends AA1{
					void method2() { //오버라이딩
						System.out.println("B-method2");}
					void method4() {
						System.out.println("B-method4");}
				}

			






	
	
	
	
	
	
	
	
	
