package ch06_클래스;

public class D0902_3_생성자_ex {

	public static void main(String[] args) {
		Abc a = new Abc();
		a.add(5, 10);
		System.out.println(a.add(5, 10));

		new Abc(); // 사용안하고 올려만 둠.
		new Abc().add(5, 10); // 주소 저장 안해도 메소드 호출 가능.
		System.out.println(new Abc().add(5, 10)); // 한번만 쓰려고 참조변수 a에 굳이 저장 안하고 사용.
	}
}

class Abc {
	int add(int a, int b) {
		return a + b;
	}
}

// 	인스턴스화 => 클래스를 메모리에 올리면 인스턴스화 한다고 표현.
// 	인스턴스 instance  = 객체