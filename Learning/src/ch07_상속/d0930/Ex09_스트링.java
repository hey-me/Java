package ch07_���.d0930;

import java.util.Scanner;

public class Ex09_��Ʈ�� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		int size = s.nextInt();

		StringStack2 stst = new StringStack2(size);

		while (true) {
			System.out.print("���ڿ� �Է� >> ");
			String st = s.next();
			if (st.equals("�׸�")) {
				break;
			}
			boolean res = stst.push(st);
			if (!res) {
				System.out.println("������ �� ���� Ǫ�� �Ұ�!!");
			}
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
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
	// �ʵ�
	private String[] ss;
	private int index;

	// ������
	public StringStack2(int size) {
		ss = new String[size];
		index = -1;
	}

	// �޼ҵ�
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
