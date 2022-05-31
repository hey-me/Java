package ch05_참조타입.예제;

public class P196_ex_ArrayCopy {

	public static void main(String[] args) {

//		???????????????
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];

		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		// oldStrArray의 0번째 숫자 복사.
		// 가져올 배열, 인덱스, 가져올 숫자, 인덱스...???

		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}

}
