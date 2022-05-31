package test1018;

import java.util.StringTokenizer;

public class Ex07 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã", "/"); 
		while (st.hasMoreTokens()) {
		System.out.println(st.nextToken());
		}
//		StringTokenizerÇÏ°í splitÂ÷ÀÌ
	}

}
