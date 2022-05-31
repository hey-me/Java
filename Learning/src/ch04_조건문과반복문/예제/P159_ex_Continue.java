package ch04_조건문과반복문.예제;

public class P159_ex_Continue {

	public static void main(String[] args) {

		for (int i = 0; i <=10 ; i++) {
			if (i%2 !=0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
