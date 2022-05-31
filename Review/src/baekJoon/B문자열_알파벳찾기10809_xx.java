package baekJoon;

public class B문자열_알파벳찾기10809_xx {

	public static void main(String[] args) {

//		알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 
//		단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
//		포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

		// 입력
		String str = "baekjoon";
//		출력할 배열 만들기
		int[] ohoh = new int[26];
		for (int i = 0; i < ohoh.length; i++) {
			ohoh[i] = -1;
		}
		// char로 바꾸고 ch배열에 넣기
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		// abc 배열에 a~z 넣기.
		char[] abc = new char[26];
		for (int i = 0; i < abc.length; i++) {
			abc[i] = (char) ('a' + i);
		}

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < abc.length; j++) {
				if (ohoh[j] == -1 && ch[i] == abc[j]) {
					ohoh[j] = i;
				}
			}
		}
		for (int i = 0; i < abc.length; i++) {
			System.out.print(ohoh[i] + " ");
		}

	}

}
