package ch14_����½�Ʈ��.����;

import java.io.*;

public class P607_10WriteReadExample {

	public static void main(String[] args) throws Exception {

		Writer writer = new FileWriter("C:/Temp/test10.txt");

		String str = "ABC";

		writer.write(str);

		writer.flush();
		writer.close();
	}

}
