package ch14_입출력스트림.예제;

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
		// 저장이 안되어있을수도 있으므로 flush(); 해주기
		// flush=> 임시저장소에 있는것을 파일에 적어줌
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
