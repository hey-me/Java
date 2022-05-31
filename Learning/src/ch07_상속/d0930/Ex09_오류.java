package ch07_���.d0930;

import java.util.Scanner;

public class Ex09_���� {

	public static void main(String[] args) {

		StringStack stack = new StringStack();
		stack.capacity();
		boolean res = true;
		while (res) {
			stack.pop();
			if(stack.push(stack.pop))
				res = false;
			System.out.println("������ �� ���� Ǫ�� �Ұ�!");
		
		}
	}
}

interface Stack {
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}

class StringStack implements Stack {

	Scanner scanner = new Scanner(System.in);
	int capacity;
	String pop;
	int index = 0;
	String[] arr;

	@Override
	public int length() {
		return index + 1;
	}

	@Override
	public int capacity() {
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		capacity = scanner.nextInt();
		arr = new String[capacity];
		return capacity;
	}

	@Override
	public String pop() {
		System.out.print("���ڿ� �Է� >> ");
		pop = scanner.next();
		if (pop.equals("�׸�")) {
			System.out.println("�ý��� ����");
			System.exit(0);
		} else if(push(pop)) {
			arr[index++] = pop;
		}
		return null;
	}

	@Override
	public boolean push(String val) {
		if( index == arr.length-1 ) {
			return false;
		}
		return true;
	}

}