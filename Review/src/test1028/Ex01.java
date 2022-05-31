package test1028;
import java.io.*;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) throws IOException {
//		fullmusic이라는 파일을 만들어서 첫번째꺼 읽어와서 저장하고
//		두번째꺼도 읽어와서 저장하고
//
//		fullmusic파일은 javasf(프로젝트폴더)에 workspace의 javasf에 저장하기
//		scanner로 파일이름을 입력받고 ex music1.txt
//		두번쨰이름입력받고
//		이름쓰기만하면 새로 파일 생성(fullmusic)하고 파일 1,2합치기
//
//		전체경로명이아닌 파일이름만 입력하는경우(경로가없으면) 파일은 프로젝트에잇어야합니다
//		파일이름만 적으면 workspace안의 javasf에 파일이 생성되고 거기에 있는 파일을 불러올 수 있음
		
		while(true) {
			Writer writer=new FileWriter("fullmusic.txt",true);
			Scanner s=new Scanner(System.in);
			try {
			System.out.print("불러올 파일명을 입력하세요: ");
			String str=s.nextLine();
			if(str.equals("그만"))break;
			if(!str.isEmpty()) {
				InputStream is=new FileInputStream(str);
				Scanner input=new Scanner(is, "UTF-8");
				while(input.hasNext()) {
					String sr=input.nextLine();
						writer.write(sr+"\r\n");

				}
				writer.write("\r\n\r\n");
				input.close();
			}
		
		writer.flush();
		writer.close();
		}catch(FileNotFoundException e) {
			System.out.println("파일 이름이 잘못 되었습니다.");
			continue;
		}
	}
		
	}

}
