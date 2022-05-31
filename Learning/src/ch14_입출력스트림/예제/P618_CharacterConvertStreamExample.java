package ch14_����½�Ʈ��.����;

import java.io.*;

public class P618_CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception {

		write("���ں�ȯ��Ʈ��������մϴ�.");
		String data = read();
		System.out.println(data);
	}

	static void write(String str) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/test1.txt");
		Writer writer = new OutputStreamWriter(fos);
		writer.write(str);
		writer.flush();
		writer.close();
	}

	static String read() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Temp/test1.txt");
		Reader reader = new InputStreamReader(fis);
		char[] buffer = new char[100];
		int num = reader.read(buffer);
		reader.close();
		String data = new String(buffer, 0, num);
		return data;
	}

}