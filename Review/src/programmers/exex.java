package programmers;

public class exex {
	public int solution(String dartResult) {
		int number = 0;
		int[] result = new int[3];
		for (int i = 1; i < dartResult.length(); i++) {
			int a = dartResult.charAt(i - 1) - '0';
			if (i > 1) {
				if (a == 0 && dartResult.charAt(i - 2) == '1') {
					a = 10;
				}
			}
			switch (dartResult.charAt(i)) {
			case 'S':
				result[number] = a * 1;
				number++;
				break;
			case 'D':
				result[number] = a * a;
				number++;
				break;
			case 'T':
				result[number] = a * a * a;
				number++;
				break;
			case '*':
				if (number == 1) {
					result[number - 1] = result[number - 1] * 2;

				} else if (number > 1) {
					result[number - 2] = result[number - 2] * 2;
					result[number - 1] = result[number - 1] * 2;
				}
				break;
			case '#':
				if (number != 0) {
					result[number - 1] = result[number - 1] * (-1);
				}
				break;
			}
		}
		int answer = result[0] + result[1] + result[2];
		return answer;
	}
}
