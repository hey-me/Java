package ch09_��øŬ�������������̽�;

public class D1012_04_�͸�����ü {

	public static void main(String[] args) {

		Anim a=new Anim() { //�̸������� �ڵ��ϼ����� �ϸ� �˾Ƽ� ��������
			
			@Override
			public void sound() {/*�������̵� �����ҰŸ� ������ ����� ��*/}
			
			@Override
			public void sleep() {}
			
			@Override
			public void eat() {}
		};
	}

}

interface Anim{
	void sound();
	void eat();
	void sleep();
}
