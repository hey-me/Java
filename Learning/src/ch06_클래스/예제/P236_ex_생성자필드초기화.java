package ch06_Ŭ����.����;

public class P236_ex_�������ʵ��ʱ�ȭ {

	public static void main(String[] args) {

		Korean k1 = new Korean("���ڹ�", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);

		Korean k2 = new Korean("���ڹ�", "930525-0654321");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);

	}

}

class Korean {

	String nation = "���ѹα�";
	String name;
	String ssn;

	Korean(String n, String s) {
		name = n;
		ssn = s;
	}
}