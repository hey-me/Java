package ch14_입출력스트림;

import java.util.*;
import java.io.*;
import java.text.*;

public class D1028_일기장 {

	
	public static void main(String[] args) throws Exception {
		List<String> list = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		Writer writer = new FileWriter("C:/Temp/일기장.txt", true);
		BufferedWriter br = new BufferedWriter(writer);
		
		SimpleDateFormat formatter = new SimpleDateFormat ( "yyyy.MM.dd HH:mm:ss", Locale.KOREA );
		Date currentTime = new Date ( );
		String dTime = formatter.format ( currentTime );
		System.out.println ( dTime );
		
		System.out.print("내용을 입력하세요");
		while (true) {
			String str = s.nextLine();
			if (str=="" ) {
				System.out.println("끝");
				break;
			} else {
				list.add(str+"\n");
			}
		}
		br.write(dTime);
		br.write("\r\n");
		for (int i = 0; i < list.size(); i++) {
			br.write(list.get(i));			
		}
		br.write("\r\n");
		
		br.flush();
		br.close();
	}

}
