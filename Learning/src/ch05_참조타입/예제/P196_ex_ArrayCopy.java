package ch05_����Ÿ��.����;

public class P196_ex_ArrayCopy {

	public static void main(String[] args) {

//		???????????????
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];

		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		// oldStrArray�� 0��° ���� ����.
		// ������ �迭, �ε���, ������ ����, �ε���...???

		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}

}
