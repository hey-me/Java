package ch03_������.����;

public class P123_ex_LogicalOperator {

	public static void main(String[] args) {

		int charCode = 'A';
		if ((charCode >= 65/*'A'����*/) & (charCode < 90)) {
			System.out.println("�빮�ڱ���");
		}	//T "�빮�ڱ���"  �� �� �����ϹǷ� ���

		if ((charCode >= 97) && (charCode <= 122)) {
			System.out.println("�ҹ��ڱ���");
		}	//F  ù��°�� F, �ι�°�� �� �ʿ� ����

		if (!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9 ���ڱ���");
		}	//F ù��°�� T, �ι�°�� F

		int value = 6;

		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 �Ǵ� 3�� �������");
		}	//T "2 �Ǵ� 3�� �������" T, T

		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 �Ǵ� 3�� �������");
		}	//T "2 �Ǵ� 3�� �������" T
	}

}
