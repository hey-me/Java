package test1022;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Ex02 {

	public static void main(String[] args) {
//		2. ������ ������ �� �ִ� Vector�� �����ϰ� 5���� ���� �Է��� �� �޼ҵ� ȣ���� ���� Vector�� ����� �� �߿��� �ִ밪�� ã�� ���
		List<Integer> list=new Vector<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("���� 5���� �Է��ϼ���");
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
