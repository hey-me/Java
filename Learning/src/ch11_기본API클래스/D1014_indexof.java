package ch11_�⺻APIŬ����;

public class D1014_indexof {

	public static void main(String[] args) {
//		p.492
//		indexOf�� ������ ���ڿ��� ù���ڰ� �ִ� ��ġ�� ������
		String subject="�ڹ� ���α׷���";
		
		int location=subject.indexOf("���α׷���");	//���ڰ� �����ϴ� �ε����� ��������
		
		System.out.println(location);
		
		System.out.println(subject.length());
		int location2=subject.indexOf("�ڹ�");
		System.out.println(subject.indexOf("?"));

		if(subject.indexOf("�ڹ�")!=-1) {
			System.out.println("�ڹٿ� ���õ�å");
		}else {
			System.out.println("�ڹٿ� ���þ���");
		}
		
	}

}
