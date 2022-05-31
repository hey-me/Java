package ch14_입출력스트림.예제;

import java.io.*;

public class P604_7WriteReadExample {

	public static void main(String[] args) throws Exception {

		Writer writer = new FileWriter("C:/Temp/test7.txt");
		char a = 'A';
		char b = 'B';
		char c = 'C';

		writer.write(a);
		writer.write(b);
		writer.write(c);

		writer.flush();
		writer.close();

		Reader reader = new FileReader("C:/Temp/test7.txt");
		while (true) {
			int data = reader.read();
			if (data == -1)
				break;
			System.out.println((char) data);

		}
		reader.close();
	}

}
