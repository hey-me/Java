package ch04_���ǹ����ݺ���.����;

public class P158_ex_BreakOutter {

	public static void main(String[] args) {
		
		Outter : for (char upper='A'; upper<='Z'; upper++) {
			for ( char lower = 'a'; lower <='z'; lower++) {
				System.out.println(upper + "-"+lower);
				if (lower == 'g') {
					break Outter;
				}
			}
		}
		System.out.println("���α׷� ���� ����");
	}

}
