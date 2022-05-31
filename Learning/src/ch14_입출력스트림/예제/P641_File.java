package ch14_입출력스트림.예제;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class P641_File {

	public static void main(String[] args) throws Exception {
		File dir = new File("C:/Temp/images");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");
		
		if(!dir.exists()) {
			dir.mkdirs();
		}
		if(!file1.exists()) {
			file1.createNewFile();
		}
		if(!file2.exists()) {
			file2.createNewFile();
		}
		if(!file3.exists()) {
			file3.createNewFile();
		}
		
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles();
		
		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("----------------------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for (File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t"+ file.getName());
			} else {
				System.out.print("\t\t\t"+ file.length()+ "\t"+file.getName());
			}
			System.out.println();
		}
	}

}
