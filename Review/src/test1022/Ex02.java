package test1022;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Ex02 {

	public static void main(String[] args) {
//		2. 정수를 저장할 수 있는 Vector를 생성하고 5개의 값을 입력한 후 메소드 호출을 통해 Vector에 저장된 값 중에서 최대값을 찾아 출력
		List<Integer> list=new Vector<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요");
		for (int i = 0; i < 5; i++) {
			list.add(s.nextInt());
		}
		
		printArray(list);
		
	}

	public static void printArray(List<Integer> list) {
		int max=0;
		for (int i = 0; i < list.size(); i++) {
			if(max<list.get(i)) {
				max=list.get(i);
		}
	}
		System.out.println(max);

}
}
