package ch14_����½�Ʈ��;

import java.io.*;
import java.util.Scanner;

public class D1028_������� {

	public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(System.in);
		System.out.print("ã�� ���� ���� �Է�");
		String str = s.nextLine();
		InputStream isNew = null;
		BufferedReader readerNew = null;

		try {
			isNew = new FileInputStream("C:/JavaSF/workspace/JavaSF/" + str);
			readerNew = new BufferedReader(new InputStreamReader(new FileInputStream(str), "utf-8"));
		} catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�.");
		}
		try {
			System.out.println();
			readerNew.read();
			while (true) {
				int data = readerNew.read();
				if (data == -1) {
					break;
				}
				System.out.print((char)data);
			}
		} catch (NullPointerException e) {
			System.out.println();
		}

	}

}
