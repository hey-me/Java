package d0827;

public class Test_5 {

	public static void main(String[] args) {

		char[] ar = new char[26];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = (char) (i + 97);
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}
