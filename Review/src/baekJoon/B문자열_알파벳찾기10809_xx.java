package baekJoon;

public class B���ڿ�_���ĺ�ã��10809_xx {

	public static void main(String[] args) {

//		���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, 
//		�ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, 
//		���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		// �Է�
		String str = "baekjoon";
//		����� �迭 �����
		int[] ohoh = new int[26];
		for (int i = 0; i < ohoh.length; i++) {
			ohoh[i] = -1;
		}
		// char�� �ٲٰ� ch�迭�� �ֱ�
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		// abc �迭�� a~z �ֱ�.
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
