package test1018;

import java.util.StringTokenizer;

public class Ex07 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����", "/"); 
		while (st.hasMoreTokens()) {
		System.out.println(st.nextToken());
		}
//		StringTokenizer�ϰ� split����
	}

}
