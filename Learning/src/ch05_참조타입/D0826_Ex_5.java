package ch05_����Ÿ��;

public class D0826_Ex_5 {

	public static void main(String[] args) {

		
//	*	1~5 ���� ī��Ʈ�ϱ�.
		int[] ar = new int[20];
		int[] br = new int[5];

		for (int i = 0; i < ar.length; i++) {
			int n = (int) (Math.random() * 5) + 1;
			ar[i] = n;
		}
		for (int i = 0; i < ar.length; i++) {
			br[ar[i] - 1]++;
		}
		for (int i = 0; i < br.length; i++) {
			System.out.println(br[i]);
		}

	}

}
