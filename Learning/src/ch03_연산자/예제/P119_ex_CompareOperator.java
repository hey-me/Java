package ch03_������.����;

public class P119_ex_CompareOperator {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1=" + result1);	//T
		System.out.println("result2=" + result2); 	//F
		System.out.println("result3=" + result3);	//T

		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);	
		System.out.println("result4=" + result4);	//T
	}

}
