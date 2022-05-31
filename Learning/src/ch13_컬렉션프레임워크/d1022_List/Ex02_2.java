package ch13_컬렉션프레임워크.d1022_List;

import java.util.Scanner; 
import java.util.*;

public class Ex02_2 {

//	2. 정수를 저장할 수 있는 Vector를 생성하고 5개의 값을 입력한 후 메소드 호출을 통해 Vector에 저장된 값 중에서 최대값을 찾아 출력
	public static void main(String[] args) {

		List<Integer> v = new Vector<Integer>();
		Scanner s = new Scanner(System.in);

		System.out.println("5개의 값을 입력하세요(1,2,3,4,5)");
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
			System.out.println("정수를 입력하세요");
		}
		System.out.println(v.get(index));

	}

}