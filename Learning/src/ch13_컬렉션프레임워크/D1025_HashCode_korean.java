package ch13_�÷��������ӿ�ũ;

public class D1025_HashCode_korean {

	public static void main(String[] args) {

		//String Ŭ������ ��� Ư����. ���ڿ��� ������ HashCode�� ����.
		String a = "Korea";
		String b = "Korea";
		String c = a +"n";
		String d = "Korean";
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
	}

}
