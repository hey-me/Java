package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ex_1_실패율 {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		float[] imsiAnswer = new float[N];
		int[] cnt = new int[N];

		for (int i = 0; i < imsiAnswer.length; i++) {
			answer[i] = -1;
			imsiAnswer[i] = 0;
			cnt[i] = 0;
		}

		for (int i = 0; i < stages.length; i++) {
			int n = stages[i];
			if (n > N) {
				for (int k = 0; k < n - 1; k++) {
					cnt[k]++;
				}
			} else {
				for (int k = 0; k < n; k++) {
					cnt[k]++;
				}
			}
			if (n <= N)
				imsiAnswer[n - 1]++;
		}

		for (int i = 0; i < imsiAnswer.length; i++) {
			if (cnt[i] != 0) {
				imsiAnswer[i] = imsiAnswer[i] / cnt[i];
			} else {
				imsiAnswer[i] = 0;
			}
		}

		Map<Integer, Float> m = new HashMap<>();

		for (int i = 0; i < cnt.length; i++) {
			m.put(i, imsiAnswer[i]);
		}

//		for (int i = 0; i < imsiAnswer.length; i++) {
//			for (int j = 0; j < imsiAnswer.length; j++) {
//				if (imsiAnswer[i] > imsiAnswer[j]) {
//					float imsi = imsiAnswer[i];
//					imsiAnswer[i] = imsiAnswer[j];
//					imsiAnswer[j] = imsi;
//				} else if (imsiAnswer[i] == imsiAnswer[j]) {
//					if (i > j) {
//						float imsi = imsiAnswer[i];
//						imsiAnswer[i] = imsiAnswer[j];
//						imsiAnswer[j] = imsi;
//					}
//				}
//			}
//		}
//		for (float i : imsiAnswer) {
//			System.out.print("   " + i);
//		}
//
//		for(int i : m.keySet()) {
//			System.out.print(m.get(i)+" ");
//		}
		List<Integer> listKeySet = new ArrayList<>(m.keySet());
		Collections.sort(listKeySet, (value1, value2) -> (m.get(value2).compareTo(m.get(value1))));
		for(int key : listKeySet) {
			System.out.println("key : " + key + " , " + "value : " + m.get(key));
		}
		
		for (int i = 0; i < cnt.length; i++) {
			answer[i] = listKeySet.get(i)+1;
		}

//		for (int i = 0; i < cnt.length; i++) {
////			System.out.println(imsiAnswer[i]);
//			for (int j = 0; j < m.size(); j++) {
//				if (imsiAnswer[i] == m.get(j)) {
//					answer[i] = j + 1;
//					for (int j2 = 0; j2 < cnt.length; j2++) {
//						if (answer[j2] == m.get(j)) {
////							break;
//							for (int j3 = j + 1; j3 < m.size(); j3++) {
//								if (imsiAnswer[i] == m.get(j3)) {
//									answer[i] = j3 + 1;
//									System.out.println("ghkd");
//								}
//							}
//						} 
//					}
//				}else {
//					answer[i] = j + 1;
//				}
//			}
//		}
//
////		System.out.println(Arrays.toString(imsiAnswer));
//		System.out.println();
		return answer;

	}

	public static void main(String[] args) {
	 
		ex_1_실패율 s = new ex_1_실패율();

		int n = 5;
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
//		int n = 4;
//		int[] stages = { 4, 4, 4, 4, 4 };

		System.out.println(Arrays.toString(s.solution(n, stages)));
	}
}
