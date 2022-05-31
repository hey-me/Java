package ch09_중첩클래스와인터페이스;

public class D1008_03_익명객체 {

	public static void main(String[] args) {
//이름이 없음.Anonymous 이름이 없어도 되는 이유?
//	어떤클래스를 상속하거나 인터페이스를 구현해야함
//	익명클래스는 자신의 생성자를 만들 수 없으므로 상위클래스의 객체 그대로만 오버라이딩이 가능하다	
//	익명클래스는 한번만 사용하기 때문에 익명으로
		Animal d=new Animal() {
			void eat() {	//이름이 없으므로 오버라이딩이 안된 메소드는 사용불가
				System.out.println("먹습니다.");
			}
			void cry() {
				System.out.println("멍ㅁ멍");
				eat();	//같은클래스에선 메소드 호출가능
			}
		};
		d.cry();
		
	}

}
class Parent{
	void parentMethod() {
		System.out.println("부모");
	}
	}
class Child extends Parent{}


class PA{
	Parent field=new Parent() {	//parent를 상속하는 자식클래스의 타입을 field에 넣음
			int childField;
			void ChildMethod() {}
				@Override
				void parentMethod() {
					System.out.println("자식");
				}
		};//중괄호 끝나고 꼭 세미콜론 new Parent()부터 };까지가 한 문장
}

class Animal{
	int kind;
	void cry() {
		System.out.println("동물이 소리를 냅니다");
	}
}
//class Dog{
//	
//}