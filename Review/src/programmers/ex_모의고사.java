package programmers;

import java.util.HashMap;

public class ex_모의고사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] solution(int[] answers) {
		int[] answer1 = { 1, 2, 3, 4, 5 };
		int[] answer2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] answer3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == answer1[i % answer1.length]) {
				cnt1++;
			}
			if (answers[i] == answer2[i % answer2.length]) {
				cnt2++;
			}
			if (answers[i] == answer3[i % answer3.length]) {
				cnt3++;
			}
		}
		int[] cnt = { cnt1, cnt2, cnt3 };
		HashMap<Integer, Integer> m = new HashMap<>();
		m.put(1, cnt1);
		m.put(2, cnt2);
		m.put(3, cnt3);
		int max = cnt1;
		if (cnt1 != cnt2 && cnt2 != cnt3 && cnt1 != cnt3) {
			for (int i = 0; i < cnt.length; i++) {
				for (int j = i + 1; j < cnt.length; j++) {
					if (cnt[i] > cnt[j]) {
						max = cnt[i];
					}
				}
			}
			for (int i = 0; i < cnt.length; i++) {
				if (max == m.get(i + 1)) {
					max = i + 1;
				}
			}
			answers = new int[] { max };
		} else if (cnt1 == cnt2 || cnt2 == cnt3 || cnt1 == cnt3) {
			
		}
		else {
			for (int i = 0; i < cnt.length; i++) {
				for (int j = i + 1; j < cnt.length; j++) {
					if (cnt[i] < cnt[j]) {
						int imsi = cnt[i];
						cnt[i] = cnt[j];
						cnt[j] = imsi;
					}
				}
			}
			for (int i = 0; i < cnt.length; i++) {
				if (cnt[i] == m.get(i + 1)) {
					cnt[i] = i + 1;
				}
			}
			answers = cnt;
		}
		System.out.println(cnt1);
		System.out.println(cnt2);
		System.out.println(cnt3);
		return answers;
	}
}
