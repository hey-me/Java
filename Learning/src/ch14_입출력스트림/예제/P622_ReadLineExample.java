package ch14_����½�Ʈ��.����;
import java.io.*;
public class P622_ReadLineExample {

	public static void main(String[] args) throws Exception {

		Reader reader= new FileReader(P622_ReadLineExample.class.getResource("language.txt").getPath());
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			String data = br.readLine();
			if(data ==null) break;
			System.out.println(data);
		}
		
		br.close();
	}

}
