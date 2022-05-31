package ch02_변수와타입.예제;

public class P95_ex_QStop {

	public static void main(String[] args) 
	throws Exception {
		int KeyCode;
		//while 반복문
		while (true) {
			KeyCode= System.in.read();
			System.out.println("KeyCode: "+KeyCode);
			if (KeyCode==113) {
				break;
			}
			
		}

		System.out.println("종료");
		
	}

}
