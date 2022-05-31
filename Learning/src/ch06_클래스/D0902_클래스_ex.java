package ch06_클래스;

import java.util.Scanner;

public class D0902_클래스_ex {

	public static void main(String[] args) {

		new Abca().run();

	}

}

class Abca {

	public void run() {

		Scanner s = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = s.next();
		int num = 4;
		int[] score = new int[num];
		String[] sub = new String[] { "국어", "영어", "수학", "자바" };
		int sum = 0;
		for (int i = 0; i < num; i++) {
			System.out.print(sub[i] + " 점수 입력 : ");
			score[i] = s.nextInt();
			sum += score[i];
		}

		System.out.println("이름 : " + name);
		for (int i = 0; i < score.length; i++) {
			System.out.println(sub[i] + " : " + score[i]);
		}
		System.out.println(name + "의 총점 : " + sum);

	}

}