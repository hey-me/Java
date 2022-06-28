package programmers;

class Main {
	public int solution(String dartResult) {
		int number = 0;
		int[] result = new int[3];
		for (int i = 1; i < dartResult.length(); i++) {
			if (dartResult.charAt(i) == 'S') {
				int a = dartResult.charAt(i - 1) - '0';
				if (i > 1) {
					if (a == 0 && dartResult.charAt(i - 2) == '1') {
						a = 10;
					}
				}
				result[number] = a * 1;

				number++;
			} else if (dartResult.charAt(i) == 'D') {
				int a = dartResult.charAt(i - 1) - '0';
				if (i > 1) {
					if (a == 0 && dartResult.charAt(i - 2) == '1') {
						a = 10;
					}
				}
				result[number] = a * a;

				number++;
			} else if (dartResult.charAt(i) == 'T') {
				int a = dartResult.charAt(i - 1) - '0';
				if (i > 1) {
					if (a == 0 && dartResult.charAt(i - 2) == '1') {
						a = 10;
					}
				}
				result[number] = a * a * a;

				number++;
			} else if (dartResult.charAt(i) == '*') {
				if (number == 1) {
					result[number - 1] = result[number - 1] * 2;

				} else if (number > 1) {
					result[number - 2] = result[number - 2] * 2;
					result[number - 1] = result[number - 1] * 2;
				}

			} else if (dartResult.charAt(i) == '#') {
				if (number != 0) {
					result[number - 1] = result[number - 1] * (-1);
				}

			}
		}
		int answer = result[0] + result[1] + result[2];

		return answer;
	}
}