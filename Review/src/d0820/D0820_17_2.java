package d0820;

import java.util.Scanner;

public class D0820_17_2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("가위, 바위, 보 중에 하나를 입력하세요");
		String str = s.next();
		int user = (str == "가위") ? 1 : (str == "바위") ? 2 : 3;
		int com = (int) (Math.random() * 3 + 1);

		if (user == com)  {
			System.out.println("무승부");
		} else if ( (user == 1 && com == 2) ||(user==2 && com==3) || (user==3 && com==1) ) {
			System.out.println("컴 승");
		} else {
			System.out.println("유저 승");
		}
	}

}
