package test1018;

public class Ex09 {

	public static void main(String[] args) throws InterruptedException {
/*
문자열을 입력하세요. 빈 칸이나 있어도 되고 영어 한글 모두 됩니다.
I Love You
Love YouI
Love YouI 
ove YouI L
ve YouI Lo
e YouI Lov
YouI Love
YouI Love 
ouI Love Y
uI Love Yo
I Love You
//String클래스에서 적절한 메소드 찾기
 */
		String a="I Love You";
		int cnt=0;
//		while(true) {
//		System.out.println(a);
//		String start=a.substring(0,1);
//		String end=a.substring(1);
//		a=end+start;
//		cnt++;
//		if(cnt==a.length()+1) {
//			break;
//		}
		System.out.println(a);
		for (int i = 0; i < a.length(); i++) {
			
			String start=a.substring(0,1);	//인덱스 0부터 1전까지 떼어내는 거=결국 인덱스0만 떼어냄
			String end=a.substring(1);//인덱스 1부터 마지막까지 떼어냄
			a=end+start;
			Thread.sleep(1000); //진행되는것을 보려고 속도를 늦춘거0.1초씩
			System.out.println(a);
		}
		
//		}
	}

}
