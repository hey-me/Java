package ch14_����½�Ʈ��;

import java.io.*;
import java.util.*;

public class D1028_�뷡��ġ�� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BufferedReader fReader = null;
		FileWriter fWriter = null;

		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");

		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
		String s1 = scanner.nextLine();

		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
		String s2 = scanner.nextLine();
		try {
			fReader = new BufferedReader(new InputStreamReader(new FileInputStream(s1), "utf-8")); // ù��° ���� ��Ʈ�� ����
			fWriter = new FileWriter("FullMusic.txt"); // ��ġ�� ���� �ϸ�
			writeToFile(fReader, fWriter); // ù��° ������ �о� ��ġ�� ���Ͽ� ���
			fReader.close(); // ù��° ��Ʈ�� �ݱ�

			fReader = new BufferedReader(new InputStreamReader(new FileInputStream(s2), "utf-8"));; // �ι�° ��Ʈ�� ����
			writeToFile(fReader, fWriter); // �ι�° ������ �о� ��ġ�� ���Ͽ� ���̾� ���

			fReader.close();
			fWriter.close();
			System.out.println("������Ʈ ���� �ؿ� FullMusic.txt ���Ͽ� �����Ͽ����ϴ�.");
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		} catch (IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}
		scanner.close();
	}

	private static void writeToFile(BufferedReader in, FileWriter out) throws IOException {
		char buf[] = new char[50]; // ���� ũ�� 50 ����Ʈ
		int count = 0; // count�� ���� ���� ����. while ���� ó�� ���� ���� �ӽ� ��.
		while (true) {
			count = in.read(buf, 0, buf.length); // buf[] ũ�� ��ŭ �б�
			if(count == -1)
				break; // ���� ���� ������
			if (count > 0) { // ���� ���� �ִٸ� 
				out.write(buf, 0, count); // ���� ��ŭ ��ġ�� ���Ͽ� ����
			}
		}
	}
}