package ch07_상속.d0930;

import java.util.Scanner;

public class Ex09_스트링 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int size = s.nextInt();

		StringStack2 stst = new StringStack2(size);

		while (true) {
			System.out.print("문자열 입력 >> ");
			String st = s.next();
			if (st.equals("그만")) {
				break;
			}
			boolean res = stst.push(st);
			if (!res) {
				System.out.println("스택이 꽉 차서 푸시 불가!!");
			}
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		int index = stst.length();
		for (int i = 0; i < index; i++) {
			System.out.print(stst.pop() + " ");
		}
		s.close();

	}
}

interface Stack2 {
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}

class StringStack2 implements Stack2 {
	// 필드
	private String[] ss;
	private int index;

	// 생성자
	public StringStack2(int size) {
		ss = new String[size];
		index = -1;
	}

	// 메소드
	@Override
	public int length() {
		return index + 1;
	}

	@Override
	public int capacity() {
		return ss.length;
	}

	@Override
	public String pop() {
		if (index == -1) {
			return null;
		}

		return ss[index--];
	}

	@Override
	public boolean push(String val) {
		if (index == ss.length - 1) {
			return false;
		}
		ss[++index] = val;
		return true;
	}

}
