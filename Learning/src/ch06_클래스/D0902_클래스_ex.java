package ch06_Ŭ����;

import java.util.Scanner;

public class D0902_Ŭ����_ex {

	public static void main(String[] args) {

		new Abca().run();

	}

}

class Abca {

	public void run() {

		Scanner s = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = s.next();
		int num = 4;
		int[] score = new int[num];
		String[] sub = new String[] { "����", "����", "����", "�ڹ�" };
		int sum = 0;
		for (int i = 0; i < num; i++) {
			System.out.print(sub[i] + " ���� �Է� : ");
			score[i] = s.nextInt();
			sum += score[i];
		}

		System.out.println("�̸� : " + name);
		for (int i = 0; i < score.length; i++) {
			System.out.println(sub[i] + " : " + score[i]);
		}
		System.out.println(name + "�� ���� : " + sum);

	}

}