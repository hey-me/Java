package ch11_�⺻APIŬ����;

public class Ex04 {

	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		System.out.println(a + "�� ���̴� " + a.length()); // ���ڿ��� ����(���� ����)
		System.out.println(a.contains("#")); // ���ڿ��� ���� ����
		a = a.concat(b); // ���ڿ� ����
		System.out.println(a);
		a = a.trim(); // ���ڿ� �� ���� ���� ����
		System.out.println(a);
		a = a.replace("C#","Java"); // ���ڿ� ��ġ	//C#��ſ� �ڹٳִ°�
		System.out.println(a);
		String s[] = a.split(","); // ���ڿ� �и�
		for (int i=0; i<s.length; i++)
		System.out.println("�и��� ���ڿ�" + i + ": " + s[i]);
		a = a.substring(5); // �ε��� 5���� ������ ���� ��Ʈ�� ����
		System.out.println(a);
		char c = a.charAt(2); // �ε��� 2�� ���� ����
		System.out.println(c);
		
//		API���� StringŬ���� ������
	}

}
