package ch14_입출력스트림;

import java.io.*;
import java.util.*;

public class D1028_스캐너로파일읽어오기 {

	public static void main(String[] args) throws Exception {

		
//		Scanner s = new Scanner("C:/Temp/today.txt");
//		Scanner s = new Scanner(reader);
//		Reader reader = new FileReader(s.nextLine());
		
//		Scanner s= new Scanner("C:/Temp/today.txt", "UTF-8");
		
		InputStream is = new FileInputStream("C:/Temp/today.txt");
		BufferedInputStream bis = new BufferedInputStream(is);
		Scanner s= new Scanner(bis, "UTF-8");
		
		while(s.hasNext()) {
			System.out.println(s.nextLine().toUpperCase()); 
		}
		
//		Scanner s2= new Scanner(is, "UTF-8");
//		String str1 = s2.nextLine();
//		System.out.println(str1.toUpperCase());
//		String str2 = s2.nextLine();
//		System.out.println(str2.toUpperCase());
//		
//		
//		
//		Scanner s3= new Scanner(is, "UTF-8");
//		String str3 = s3.nextLine();
//		System.out.println(str3.toUpperCase());
//	
		
	}

}
