package ch09_��øŬ�������������̽�;

public class D1008_03_�͸�ü {

	public static void main(String[] args) {
//�̸��� ����.Anonymous �̸��� ��� �Ǵ� ����?
//	�Ŭ������ ����ϰų� �������̽��� �����ؾ���
//	�͸�Ŭ������ �ڽ��� �����ڸ� ���� �� �����Ƿ� ����Ŭ������ ��ü �״�θ� �������̵��� �����ϴ�	
//	�͸�Ŭ������ �ѹ��� ����ϱ� ������ �͸�����
		Animal d=new Animal() {
			void eat() {	//�̸��� �����Ƿ� �������̵��� �ȵ� �޼ҵ�� ���Ұ�
				System.out.println("�Խ��ϴ�.");
			}
			void cry() {
				System.out.println("�ۤ���");
				eat();	//����Ŭ�������� �޼ҵ� ȣ�Ⱑ��
			}
		};
		d.cry();
		
	}

}
class Parent{
	void parentMethod() {
		System.out.println("�θ�");
	}
	}
class Child extends Parent{}


class PA{
	Parent field=new Parent() {	//parent�� ����ϴ� �ڽ�Ŭ������ Ÿ���� field�� ����
			int childField;
			void ChildMethod() {}
				@Override
				void parentMethod() {
					System.out.println("�ڽ�");
				}
		};//�߰�ȣ ������ �� �����ݷ� new Parent()���� };������ �� ����
}

class Animal{
	int kind;
	void cry() {
		System.out.println("������ �Ҹ��� ���ϴ�");
	}
}
//class Dog{
//	
//}