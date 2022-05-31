package ch10_����;

public class D1014_02_throw {

	public static void main(String[] args) {
		try {
			int result=subtract(5,100);
				System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	static int subtract(int i, int j) throws Exception { //Exception��ſ� InvalidInputException����
		if(i<j) { //����i-j<0 �̷��� ���ص� ��
//			throw new Exception();�̰Ŵ�ſ� �Ʒ���
			throw new InvalidInputException();
		}
			return i-j;
	}
	
}

class InvalidInputException extends Exception{
	InvalidInputException(){
		super("�߸��� �Է��Դϴ�.");
	}
}