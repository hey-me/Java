package ch14_입출력스트림;

import java.io.*;

public class D1027_3_성능향상보조스트림 {

	public static void main(String[] args) throws Exception {
/*
	
	BufferedOutputStream
	BufferedWriter
	
	BufferedInputStream
	BufferedReader
	
	
	
	
*/
		
		BufferedOutputStream bis = new BufferedOutputStream(new FileOutputStream("C:/Temp/bis.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Temp/bw.txt"));
		
		
		
		// Serializable 직렬화해도 좋다고 승인하는 역할.
	}

}
