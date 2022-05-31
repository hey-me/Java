package ch14_입출력스트림.예제;

import java.io.*;

public class P596_2WriteReadExample {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test2.db");

		byte[] array = { 10, 20, 30 };

		os.write(array);
		;
		os.flush();
		os.close();

		InputStream is = new FileInputStream("C:/Temp/test2.db");
		byte[] buffer = new byte[100];

		while (true) {
			int readByteNum = is.read(buffer);
			if (readByteNum == -1) {
				break;
			}
			for (int i = 0; i < readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();

	}
}
