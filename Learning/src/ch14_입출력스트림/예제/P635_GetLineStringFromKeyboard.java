package ch14_����½�Ʈ��.����;

import java.io.*;

public class P635_GetLineStringFromKeyboard {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			System.out.println("�Է��ϼ���");
			String lineStr = br.readLine();
			if(lineStr.equals("q")||lineStr.equals("quit")) {
				break;
			}
			System.out.println("�Էµ� ����"+lineStr);
			System.out.println();
		}
		br.close();
	}

}
