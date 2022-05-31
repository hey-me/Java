package ch07_상속.d0930;

import java.util.Scanner;

public class Ex09_오류 {

	public static void main(String[] args) {

		StringStack stack = new StringStack();
		stack.capacity();
		boolean res = true;
		while (res) {
			stack.pop();
			if(stack.push(stack.pop))
				res = false;
			System.out.println("스택이 꽉 차서 푸시 불가!");
		
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
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		capacity = scanner.nextInt();
		arr = new String[capacity];
		return capacity;
	}

	@Override
	public String pop() {
		System.out.print("문자열 입력 >> ");
		pop = scanner.next();
		if (pop.equals("그만")) {
			System.out.println("시스템 종료");
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