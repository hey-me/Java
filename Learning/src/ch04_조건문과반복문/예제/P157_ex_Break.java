package ch04_���ǹ����ݺ���.����;

public class P157_ex_Break {

	public static void main(String[] args) {

		while (true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if (num==6) {
				break;
			}
		}
		System.out.println("���α׷� ����");
	}	

}
