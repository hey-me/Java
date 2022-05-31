package ch09_중첩클래스와인터페이스;

public class D1012_04_익명구현객체 {

	public static void main(String[] args) {

		Anim a=new Anim() { //이름덜쓰고 자동완성으로 하면 알아서 구현해줌
			
			@Override
			public void sound() {/*오버라이디 ㅇ안할거면 내용을 지우면 됌*/}
			
			@Override
			public void sleep() {}
			
			@Override
			public void eat() {}
		};
	}

}

interface Anim{
	void sound();
	void eat();
	void sleep();
}
