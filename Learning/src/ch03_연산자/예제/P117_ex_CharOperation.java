package ch03_������.����;

public class P117_ex_CharOperation {

	public static void main(String[] args) {

		char c1 = 'A' + 1; //error�� �ȳ��� ����: ���ͷ�(���)���� ���ϱ� ������ ������ �ȵ�.(�ʱⰪ ������ ��)
		char c2 = 'A'; 
//		char c3 = c2 + 1; //65+1=66
		char c3 = (char)(c2 + 1); //65+1=66
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
	}

}
