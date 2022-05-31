package ch14_����½�Ʈ��.����;

import java.io.*;

public class P595_1WriteReadExample {

	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("C:/Temp/test1.db");

		byte a = 10;
		byte b = 20;
		byte c = 30;

		os.write(a);
		os.write(b);
		os.write(c);

		os.flush();
		// ������ �ȵǾ��������� �����Ƿ� flush(); ���ֱ�
		// flush=> �ӽ�����ҿ� �ִ°��� ���Ͽ� ������
		os.close();

		InputStream is = new FileInputStream("C:/Temp/test1.db");
		while (true) {
			int data = is.read();
			if (data == -1) {
				break;
			}
			System.out.println(data);
		}
		is.close();

	}

}
