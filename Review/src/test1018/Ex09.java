package test1018;

public class Ex09 {

	public static void main(String[] args) throws InterruptedException {
/*
���ڿ��� �Է��ϼ���. �� ĭ�̳� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.
I Love You
Love YouI
Love YouI 
ove YouI L
ve YouI Lo
e YouI Lov
YouI Love
YouI Love 
ouI Love Y
uI Love Yo
I Love You
//StringŬ�������� ������ �޼ҵ� ã��
 */
		String a="I Love You";
		int cnt=0;
//		while(true) {
//		System.out.println(a);
//		String start=a.substring(0,1);
//		String end=a.substring(1);
//		a=end+start;
//		cnt++;
//		if(cnt==a.length()+1) {
//			break;
//		}
		System.out.println(a);
		for (int i = 0; i < a.length(); i++) {
			
			String start=a.substring(0,1);	//�ε��� 0���� 1������ ����� ��=�ᱹ �ε���0�� ���
			String end=a.substring(1);//�ε��� 1���� ���������� ���
			a=end+start;
			Thread.sleep(1000); //����Ǵ°��� ������ �ӵ��� �����0.1�ʾ�
			System.out.println(a);
		}
		
//		}
	}

}
