package test1018;

public class Ex07_ex {

	public static void main(String[] args) {

//		StringŬ������ StringBuffer Ŭ���� ���̸� Ȯ���� �� �ֵ��� �ڵ� �ۼ�
		
		String a="korea";
		StringBuffer sb=new StringBuffer("korea");
		
//		System.out.println(a);
		System.out.println(sb);
//		System.out.println(a.hashCode());
		System.out.println(sb.hashCode());	//sb�� new�� �߱� ������ �ؽ��ڵ�� �ٸ�
		
		a+=" is korea";	//����a�� ������ a�� ������?StringŬ������ ���� ������ �Ұ��� ���ڿ��� ����(����)�ϸ� ���ο� �ּҿ� �޸𸮰� ����
		sb.append(" is korea");
		
//		System.out.println(a);
		System.out.println(sb);
//		System.out.println(a.hashCode());
		System.out.println(sb.hashCode());
		
//		���ڿ��� ��� �߰��ؾߵǴ� ��Ȳ������ StringŬ�������� Buffer�� ����ϴ°� ������ �Ȼ���
	}

}
