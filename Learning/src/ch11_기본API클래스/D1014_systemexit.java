package ch11_기본API클래스;

public class D1014_systemexit {

	public static void main(String[] args) {
		for (int i = 0; i <10; i++) {
			if(i==5) {
				System.exit(0);	//exit를 쓰게되면 아예 종료하게 되므로 마무리가 출력되지 않음
			}
		}
		System.out.println("마무리");

	}

}
