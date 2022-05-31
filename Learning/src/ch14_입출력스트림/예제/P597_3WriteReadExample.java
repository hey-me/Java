package ch14_입출력스트림.예제;

import java.io.*;

public class P597_3WriteReadExample {

	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("C:/Temp/test3.db");

		byte[] array = { 10, 20, 30, 40, 50 };
		os.write(array, 1, 3);
		os.flush();
		os.close();

		InputStream is = new FileInputStream("C:/Temp/test3.db");
		byte[] buffer = new byte[5];
		int readByteNum = is.read(buffer, 2, 3);
		if (readByteNum != -1) {
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
	}

}
