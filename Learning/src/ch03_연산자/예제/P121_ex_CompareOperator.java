package ch03_������.����;

public class P121_ex_CompareOperator {

	public static void main(String[] args) {

		//*1
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // T �񱳿����ڿ��� ���� �����ϱ� ���� �ǿ������� Ÿ���� ��ġ��Ŵ

			// �߰�
			double vv = v2;
			System.out.println(vv);
		
		//*2
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); // F
		System.out.println((float) v4 == v5); // T
		System.out.println(v4 == (double) v5); // F

			//�߰�
			double vvv=v5;
			System.out.println(v4);
			System.out.println(v5);
			System.out.println(vvv); //������ �߻��ϹǷ� ������ False����

	}

}
