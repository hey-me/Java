package ch07_���;
public class P328_1_���Ȯ�ι��� {
	public static void main(String[] args) {
		
		Child child = new Child("", 1);
		Child2 child2 = new Child2();
	}
/*	1. x,o,o,o	2. o,x,o,o	3. x,x,o,x			*/ }

//4. super(name) �߰�
class Parent{
	String name;
	Parent(String name){
		this.name = name;
	}
}
class Child extends Parent {
	private int studentNo;
	
	Child (String name, int StudentNo){
		super(name); // �������� ù��° �ٿ��� ��. this()  or  super()  �߰����ֱ�... 
		// �θ������ Parent(String name)  => super(name) 
		//��ҿ� default ������ ���������.. ��������
		this.name = name;
		this.studentNo = studentNo;
	}
}
//5. ��� �����? ������?  �� �Ʒ�
class Parent2{
	String nation;
	
	Parent2(){
		this("���ѹα�"); //Parent2(String nation)�� ȣ��. => �Ʒ� �ι�° ������ ���� ���� �� ù��°�� ����.
		System.out.println("Parent2() call");
	}
	Parent2(String nation){
		this.nation = nation;
		System.out.println("Parent2(String nation) call");
	}
}
class Child2 extends Parent2 {
	private String name;
	
	Child2(){
		this("ȫ�浿");
		System.out.println("Child2() call");
	}
	Child2(String name){
		//super(); �ڵ����� �����Ϸ��� ���� ���ԵǾ�����.
		this.name = name;
		System.out.println("Child2(String name) call");
	}
}
//Parent2(String nation) call
//Parent2() call
//Child2(String name) call
//Child2() call

