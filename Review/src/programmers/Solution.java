package programmers;

import java.util.*;

public class Solution {

	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        for (String string : participant) {
			m.put(string, m.getOrDefault(string, 0)+1);
		}
    
        for (String string : completion) {
        	m.put(string, m.getOrDefault(string, 0)-1);
        }
        
        for(String a : m.keySet()) {
        	if (m.get(a)!=0) {
				answer = a;
			}
        }
        return answer;
    }
	

	public static void main(String[] args) {
		String [] p = {"leo", "kiki", "eden"};
		String [] c = {"eden", "kiki"};
		
		System.out.println(solution(p,c));
	}
}