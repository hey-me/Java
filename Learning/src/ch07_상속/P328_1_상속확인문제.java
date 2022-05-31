package ch07_상속;
public class P328_1_상속확인문제 {
	public static void main(String[] args) {
		
		Child child = new Child("", 1);
		Child2 child2 = new Child2();
	}
/*	1. x,o,o,o	2. o,x,o,o	3. x,x,o,x			*/ }

//4. super(name) 추가
class Parent{
	String name;
	Parent(String name){
		this.name = name;
	}
}
class Child extends Parent {
	private int studentNo;
	
	Child (String name, int StudentNo){
		super(name); // 생성자의 첫번째 줄에는 꼭. this()  or  super()  추가해주기... 
		// 부모생성자 Parent(String name)  => super(name) 
		//평소에 default 생성자 만들어주자.. 오류방지
		this.name = name;
		this.studentNo = studentNo;
	}
}
//5. 출력 결과는? 이유는?  맨 아래
class Parent2{
	String nation;
	
	Parent2(){
		this("대한민국"); //Parent2(String nation)를 호출. => 아래 두번째 생성자 먼저 실행 후 첫번째꺼 실행.
		System.out.println("Parent2() call");
	}
	Parent2(String nation){
		this.nation = nation;
		System.out.println("Parent2(String nation) call");
	}
}
class Child2 extends Parent2 {
	private String name;
	
	Child2(){
		this("홍길동");
		System.out.println("Child2() call");
	}
	Child2(String name){
		//super(); 자동으로 컴파일러에 의해 삽입되어있음.
		this.name = name;
		System.out.println("Child2(String name) call");
	}
}
//Parent2(String nation) call
//Parent2() call
//Child2(String name) call
//Child2() call

