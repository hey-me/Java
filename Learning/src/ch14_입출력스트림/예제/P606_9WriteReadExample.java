package ch14_입출력스트림.예제;

import java.io.*;

public class P606_9WriteReadExample {

	public static void main(String[] args) throws Exception {

		Writer writer = new FileWriter("C:/Temp/test9.txt");

		char[] array = { 'A', 'B', 'C', 'D', 'E' };

		writer.write(array, 1, 3);

		writer.flush();
		writer.close();

		Reader reader = new FileReader("C:/Temp/test9.txt");

		char[] buffer = new char[5];

		int readCharNum = reader.read(buffer, 2, 3);

		if (readCharNum != -1) {
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}

		reader.close();
	}

}
