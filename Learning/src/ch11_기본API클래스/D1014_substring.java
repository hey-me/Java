package ch11_�⺻APIŬ����;

public class D1014_substring {

	public static void main(String[] args) {
//		p.494
		String oldStr="�ڹٴ� ��ü ���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr=oldStr.replace("�ڹ�", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		String ssn="880815-1234567";
		String firstNum=ssn.substring(1, 6);	//������ ���� "�ε���", ó������ ������ ����	
		System.out.println(firstNum);
		String secondNum=ssn.substring(7);//�����ε������� ������
		System.out.println(secondNum);
	}

}
