package ch14_입출력스트림.예제;

import java.io.*;

public class P605_8WriteReadExample {

	public static void main(String[] args) throws Exception {

		Writer writer = new FileWriter("C:/Temp/test8.txt");

		char[] array = { 'A', 'B', 'C' };

		writer.write(array);

		writer.flush();
		writer.close();

		Reader reader = new FileReader("C:/Temp/test8.txt");

		char[] buffer = new char[100];
		while (true) {
			int data = reader.read(buffer);
			if (data == -1) {
				break;
			}
			for (int i = 0; i < data; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close();
	}

}
