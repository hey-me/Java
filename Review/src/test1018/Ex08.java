package test1018;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
/*	String buffer클래스를 활용하여 명령처럼 문자열 수정( 우리는!We => “우리는”을 찾아 We로 수정)
 * 	>>우리는 love Java Programming.
		명령: 우리는!We
		We love Java Programming.
		명령: LOV!사랑
		찾을 수 없습니다!
		명령: lov!사랑
		We 사랑e Java Programming.
		명령: 사랑!lov
		We love Java Programming.
		명령: love!LOVE
		We LOVE Java Programming.
		명령: 그만
		종료합니다
*/
		StringBuffer a=new StringBuffer("우리는 love Java Programming");
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.print("명령: ");
			String input=s.next();
			if(input.equals("그만")) {
				System.out.println("종료합니다");
			break;
			}
			String inputs[]=input.split("!");
			if(inputs.length!=2) {
				System.out.println("잘못된 명령입니다.");
			}else if(a.indexOf(inputs[0])!=-1) {
				a=a.replace(a.indexOf(inputs[0]),inputs[0].length(),inputs[inputs.length-1]);
			System.out.println(a);
			}else {
				System.out.println("찾을 수 없습니다!");
			}
		}
	}

}
