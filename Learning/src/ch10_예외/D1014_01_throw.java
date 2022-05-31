package ch10_����;

public class D1014_01_throw {

	public static void main(String[] args) {
		Stock s=new Stock();
//		s.updateStock(); /*5.�갡 �����޼ҵ带 �ҷ��� ���⵵ ���ܻ���*/
/*6*/	try {		//���⼭�� ����ó���� ������� ���ϸ� main�� ȣ���� �ü������ ���ܰ� �������ϱ�
			s.updateStock();	
		} catch (Exception e) {
			System.out.println("����ó���Ϸ�");
			System.out.println(e.getMessage());	///*7null�� ������ ����: ���ܰ� �߻��� �ʱ���¸� ������*/
			//���⼭ ���� syso�ϴ°ͺ��� �ڹٰ� �����ϴ� ����Ŭ������ ���ؼ� �޼����� �����ϴ°� ���� 
			e.printStackTrace(); //���ܰ� �߻��ѰԾƴϰ� ����ó�� ������ �����ִ°�
		}
	}

}

class Stock{
	void updateStock()/*4.�굵 ���ܴ���*/ throws Exception {
		Goods g=new Goods();
		g.subStock(200); /*3*/ //�����߻�
	}
}
class Goods{
	int stockNum=100;
	void subStock(int amount) /*2*/ throws Exception {
		if(stockNum<amount) {
			//��� ������ ��(������ ���� ���) ���ܰ� �߻��ϵ��� �ϰ� ����.
			//���ܸ� ������ �߻���Ű�� ���ܵ� Ŭ�����������ϱ� ���� �����ϸ� ��
//	/*1*/	throw new Exception();
			//���ܰ� �߻��ϸ� ��ġ�� ���ؾ���: try-catch�� ����ó���� �ϴ��� ���ܸ� ��������throws
	/*8*/	//throw new Ex���� �ڵ��ϼ����� Exception�� �����ε��Ǿ����� ( ���⿡ �޼����� ������ ��)
	/*9*/	throw new Exception("��� �����մϴ�.");
	
		}
	}
}
