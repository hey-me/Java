package ch14_����½�Ʈ��.����;

import java.io.*;

public class P621_BufferedStreamExample {

	public static void main(String[] args) throws Exception {

		String originalFilePath1 = P621_BufferedStreamExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		String originalFilePath2 = P621_BufferedStreamExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long nonBufferTime = copy(fis,fos);
		System.out.println("���۸� ������� �ʾ�����: \t"+ nonBufferTime+"ns");
		
		long BufferTime = copy(bis,bos);
		System.out.println("���۸� ����Ҷ�: \t"+ BufferTime+"ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
		
	}
	
	static int data = -1;
	static long copy(InputStream is, OutputStream os) throws Exception{
		long start = System.nanoTime();
		while(true) {
			data = is.read();
			if(data==-1) {
				break;
			}
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return (end-start);
	}

}
