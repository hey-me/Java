package test1025;
import java.util.*;
public class Ex02_2 {
//봉운이꺼
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, String> ha = new HashMap<String, String>();
		try {
			while (true) {
				System.out.println("단어입력:1 단어찾기:2 종료:stop");
				String stop = s.nextLine();
//				s.nextLine();
				if (stop.equals("1")) {
					System.out.println("(영어,한글)로 추가해주세요");
					String a = s.nextLine();
					String[] ar = a.split(",");
					ha.put(ar[0].trim(), ar[1].trim());
				} else if (stop.equals("2")) {
					System.out.println("찾고싶은 한글을 영어로 입력해주세요 : ");
					
//					Set<String> key = ha.keySet();
					String a1 = s.next();
					
					if (ha.containsKey(a1)) {
						String a12 = ha.get(a1);
						System.out.println(a12);
					} else {
						System.out.println("사전에 없는 단어입니다.");
					}
				} else if (stop.equals("stop")) {
					break;
				} else {
					System.out.println("잘못입력하셨습니다.");
				}
			}
		} catch (Exception e) {
			System.out.println("오류입니다 처음부터 다시 실행해주세요.");
		}
	}

}
