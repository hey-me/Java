package programmers;

public class ex_없는숫자더하기 {

	public static int solution(int[] numbers) {
		int answer = -1;
		int sum = 45;
		for (int i = 0; i < numbers.length; i++) {
			answer = -1;
			for (int j = 0; j <= 9; j++) {
				if (numbers[i] == j) {
					sum -= j;
				}
			}
		}
		answer = sum;

//			Vector<Integer> v = new Vector<>();
//			int[] numbers1 = {0,1,2,3,4,5,6,7,8,9};
//			for (int i = 0; i < numbers1.length; i++) {
//				v.add(numbers1[i]);
//			}
//			
//			for (int i = 0; i < numbers.length; i++) {
//				for (int j = 0; j < numbers.length; j++) {
//					answer = -1;
//					for (int k = 0; k < numbers.length; k++) {
//						if ( v.get(num) == numbers[k]) {
//							answer = v.get(num);
//							v.remove(num);
//						}
//					}
//					System.out.println("size"+v.size());
//					System.out.println("number"+(numbers1.length -numbers.length));
//					if (v.size()> (numbers1.length -numbers.length) && answer == -1) {
//						num++;
//					}
//					System.out.println("num"+num);
//				}
//			}
//			for (int i = 0; i < v.size(); i++) {
//				sum += v.get(i);
//			}
//			answer = sum;
		return answer;
	}

	public static void main(String[] args) {
		int[] numberss = { 5, 8, 4, 0, 6, 7, 9 };
		System.out.println(solution(numberss));

	}
}
