package ch05_참조타입.예제;

public class P198_ex_AdvancedFor {

	public static void main(String[] args) {

		int[] scores = { 95, 71, 84, 93, 87 };

		int sum = 0;
		for (int score : scores) { // 오른쪽 배열에 있는 수를 하나씩 꺼내와 score에 저장. 	for(저장할 곳 : 가져올 곳)
			sum += score;
		}
		System.out.println("점수 총합=" + sum);

		double avg = (double) sum / scores.length;
		System.out.println("점수 평균=" + avg);
	}

}
