package ch09_��øŬ�������������̽�;

public class D1012_06_�͸�ü_���ú��� {
//p.414 ���� p.435
	public static void main(String[] args) {
		Anonymous a=new Anonymous();
		a.mothod(0, 0);
		a.mothod(10,5);
	}

}

interface Calculatable{
	int sum();
}

class Anonymous{
	private int field;
	
	void mothod(int arg1, int arg2) {	//final�� ����
		int var1=0;
		int var2=0;
		field=10;
		Calculatable calc=new Calculatable() {
			
			@Override
			public int sum() {
				int result=field+arg1+arg2+var1+var2;
				return result;
			}
		};	//���� �޼ҵ��ѹ������� ������µ� ��������ؾߵǴ°�� �̷������� �޼ҵ带 �����
		System.out.println(calc.sum());
	}
}