package ch09_��øŬ�������������̽�;

import ch09_��øŬ�������������̽�.D2.InstInner;

public class D1008_01_��øŬ���� {
//	p.406
//��øŬ���� �� �ȿ� Ŭ������ �̳�Ŭ���� ���� �ƿ���Ŭ����
//����Ŭ������ ���踦 �δ� ���� ���������� Ŭ���������ϴ°� ������ Ư��Ŭ������ ���踦 �����Ÿ� ���ο� Ŭ���������ϴ°� ����
//�͸�Ŭ������ �����Ϸ��� ���,�������̽�,����Ŭ���� ���ظ� �ؾ���	
//	�������Ŭ������ �ν��Ͻ� Ŭ���� ������� �����ϱ�
	public static void main(String[] args) {

		D2 d2 = new D2();
		D2.b = 0;
		System.out.println(d2.a); 
		InstInner inst=d2.new InstInner();	//import�� �Ŀ� ��밡��
		D2.InstInner inst2=d2.new InstInner();
		D2.StaticInner si=new D2.StaticInner();
//		Ŭ�����ȿ� ��øŬ������ static�϶� �ƴҶ� �ν��Ͻ������ϴ°� �ٸ�
	}

}

class D2 {
	int a; // Ŭ���� �ν��Ͻ� ������ �Ŀ� ����.a�ϸ� ��밡��
	static int b; // Ŭ�����̸�.b�ϸ� ��밡��
	int[] ar; // �迭�� �����ϰ������ �迭������ �ϸ�ǰ�
	// boolean, string, int�� �پ��� ���� �����ϰ�ʹٸ� InstInnerŬ���� �ȿ� �پ��� Ÿ�Ե��� �����س��� Ŭ������
	// �����ϸ��
	/*
	InstInner inst = new InstInner();
	InstInner inst2 = new InstInner(10, "��", false);	//�ٵ� �� �� Ŭ���� �ʵ带 ������?
	InstInner[]inst3=new InstInner[3];
	D2(){a=inst2.ia;
	inst3[0]=new InstInner(1, "��", true);
	inst3[1]=new InstInner(2, "��", false);
	inst3[2]=new InstInner(3, "��", true);
	
	}
*/
	
	// InstInner, StaticInner �Ѵ� ����Ŭ����(���Ŭ����)
	class InstInner {//�ν��Ͻ� Ŭ����
		// �̰͵� �ۿ� �ִ� Ŭ������ �ν��Ͻ� �����ؼ� ��밡��
		int ia;
		String is;
		boolean ic;
//		static int ib;	//������ �ȳ��µ� ����� �Ƹ� �Ұ����ϵ�?p.408
		InstInner() { }

		InstInner(int a, String s, boolean c){
			ia=a; is=s; ic=c;
		}
//		static void method() {		}//������ �ȳ��µ� ����� �Ƹ� �Ұ����ϵ�?p.408
	}

	static class StaticInner {int sn; }// �ν��Ͻ� ���� ���ص� ��Ŭ���� �̸�.����ƽŬ���� �� ��밡��

	void method() {//�޼ҵ� �ȿ� �� �ִ� Ŭ������ ����Ŭ����. �޼ҵ尡 ������ ����� �޼ҵ� �ȿ����� ����
		class LocalInner{	}	//���ÿ��� static�� ���̸� �ȉ�(�޼ҵ尡 ȣ��ɶ����� ���ǹǷ�) ����Ϸ��� �ν��Ͻ� �����ؾ���
		LocalInner li=new LocalInner();
	}	
}

/* �� �ڹ����Ͼȿ� Ŭ������ ���������� �����ϸ� bin������ class������ ������ ������
 * Ŭ�����ȿ� Ŭ������ �����ϸ� Ŭ���������� ����Ŭ�����̸�$����Ŭ���� �̸����� �������� ������
 * ����Ŭ������ Ÿ���� ����ƽ���� �ν��Ͻ����� �� �� ������ ����Ŭ������ $������ ���ڰ� �����־ ���� ����
 * */
