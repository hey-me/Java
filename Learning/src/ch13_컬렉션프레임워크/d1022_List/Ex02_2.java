package ch13_�÷��������ӿ�ũ.d1022_List;

import java.util.Scanner; 
import java.util.*;

public class Ex02_2 {

//	2. ������ ������ �� �ִ� Vector�� �����ϰ� 5���� ���� �Է��� �� �޼ҵ� ȣ���� ���� Vector�� ����� �� �߿��� �ִ밪�� ã�� ���
	public static void main(String[] args) {

		List<Integer> v = new Vector<Integer>();
		Scanner s = new Scanner(System.in);

		System.out.println("5���� ���� �Է��ϼ���(1,2,3,4,5)");
		String str = s.nextLine().trim();
		String st[] = str.split(",");
		int in[] = new int[st.length];
		int top = 0; int index = 0;
		// try
		try {
			for (int i = 0; i < in.length ; i++) {
				st[i] = st[i].trim();
				in[i] = Integer.valueOf(st[i]);
				v.add(in[i]);
				if (top < in[i]) {
					top = in[i];
					index = i;
				}
			}
		} 
		catch (Exception e) {
			System.out.println("������ �Է��ϼ���");
		}
		System.out.println(v.get(index));

	}

}