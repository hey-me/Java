package codeUp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	int h = s.nextInt();
	int r = s.nextInt();
	int cnt = 0;
	
	String [] str = new String[(h*2-1)*r];
	for (int i = 0; i < str.length; i++) {
		str[i] = "*";
	}
	for (int i = 0; i < h; i++) {
		str[i] = " "+ str[i];
	}
	for (int i = h; i <(h-1)*2; i++) {
		str[i] = str[h-2];
	}
	for (int i = 0; i < r; i++) {
		System.out.println(str[i]);
	}
	
	
	}

}
