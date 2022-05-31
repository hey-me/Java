package ch14_입출력스트림;

import java.io.*;
import java.util.Scanner;

public class D1028_파일출력 {

	public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(System.in);
		System.out.print("찾을 파일 명을 입력");
		String str = s.nextLine();
		InputStream isNew = null;
		BufferedReader readerNew = null;

		try {
			isNew = new FileInputStream("C:/JavaSF/workspace/JavaSF/" + str);
			readerNew = new BufferedReader(new InputStreamReader(new FileInputStream(str), "utf-8"));
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
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
