package ch07_���;
	
public class D0916_2_Ÿ�Ժ�ȯ��������_1 {public static void main(String[] args) {

/*
 		* ������ : �پ��� ��ü Ȱ���� ���� �������� �������� �ϴ� ����
	       		     �޼ҵ� ������ + Ÿ�� ��ȯ => ������
  
		* �ڵ� Ÿ�� ��ȯ
			-> �θ�Ÿ�Ժ��� = �ڽ�Ÿ��; */
				AA1  a = new AA1();
				BB1  b = new BB1();
//				b=a;  //�Ұ���
				a=b;  //�ڽ�Ÿ���� �θ�Ÿ�Կ� ���� �� ����.
 				a = new BB1(); // �� �ٰ� ������.
				
				a.method2();  // => B-method2�� ��µǾ����. �������̵�.
}}
				class AA1{
					void method1() {
						System.out.println("A-method1");}
					void method2() {
						System.out.println("A-method2");}
				}
				class BB1 extends AA1{
					void method2() { //�������̵�
						System.out.println("B-method2");}
					void method4() {
						System.out.println("B-method4");}
				}

			






	
	
	
	
	
	
	
	
	
