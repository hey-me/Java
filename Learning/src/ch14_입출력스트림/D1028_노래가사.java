package ch14_입출력스트림;

import java.io.*;
import java.util.*;

public class D1028_노래가사 {

	public static void main(String[] args) throws Exception {

		
		InputStream is1 = new FileInputStream("C:/JavaSF/workspace/JavaSF/music1.txt");
		Reader reader1 = new InputStreamReader(is1, "utf-8");
		InputStream is2 = new FileInputStream("C:/JavaSF/workspace/JavaSF/music1.txt");
		Reader reader2 = new InputStreamReader(is2, "utf-8");
		Writer writer = new FileWriter("C:/JavaSF/workspace/JavaSF/fullmusic.txt");
		BufferedWriter br = new BufferedWriter(writer);
		
		while(true) {
			int data = reader1.read();
			if(data==-1) {break;}
			br.write((char)data);
		}
		while(true) {
			int data = reader2.read();
			if(data==-1) {break;}
			br.write((char)data);
		}
		
		reader1.close();
		reader2.close();
		br.flush();
		br.close();
		
		
		
	}

}

