package programmers;

import java.util.HashMap;

public class ex_완주하지못한선수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
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
	

}
