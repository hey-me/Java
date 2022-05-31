package ch04_조건문과반복문;

public class P160_반복문_확인문제 {

	public static void main(String[] args) {

//	*2.	
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

//	*3.
		while (true) {
			int n1 = (int) (Math.random() * 6) + 1;
			int n2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + n1 + "," + n2 + ")");
			if (n1 + n2 == 5)
				break;
		}

//	*4.	
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y < 10; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	
		
		
		
		
	}

}
