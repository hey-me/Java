package ch10_����.d1013;

public class Ex01 {

	public static void main(String[] args) {

		String[] ar = { "123", "345", "56.7", "789" };
		
		try {
			for (int i = 0; i < ar.length; i++) {
				int num = Integer.parseInt(ar[i]);
				System.out.println(i + 1 + "��°������: " + num);
			}
		} catch (NumberFormatException e) {
			System.out.println("Ÿ�� ���� ����");
		}
		

	}

}
