package programmers;

import java.util.HashSet;
import java.util.TreeSet;

public class ex_두개뽑아서더하기 {

	public static void main(String[] args) {
		int[] numbers = { 2, 1, 3, 4, 1 };
		for (int i = 0; i < solution(numbers).length; i++) {
			System.out.println(solution(numbers)[i]);
		}
	}

	public static int[] solution(int[] numbers) {
		HashSet<Integer> tree = new HashSet<>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (i != j) {
					int a = numbers[i] + numbers[j];
					tree.add(a);
				}
			}
		}
		int[] answer = new int[tree.size()];
		int i = 0;
		for (int a : tree) {
				answer[i] = a;
				i++;
		}
		return answer;
	}

}
