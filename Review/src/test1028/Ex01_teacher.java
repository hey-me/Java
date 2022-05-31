package test1028;

import java.util.Scanner;
import java.io.*;

public class Ex01_teacher {

	public static void main(String[] args)  {

		Scanner s = new Scanner(System.in);// System.in->inputStream(바이트스트림)
		BufferedReader fReader = null;// filereader가아닌 buffer쓴 이유:
//		한글코드를 utp-8형식으로 읽을거면
//		filreader에도 문자형식지정할수있긴하네
		FileWriter fWriter = null;

		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다");

		System.out.print("첫번째 파일 이름을 입력하세요>>");
		String s1 = s.nextLine();// 사용한느 메소드에 따라서 스트림을 읽어올 바이트가 달라짐

		System.out.print("두번째 파일 이름을 입력하세요>>");
		String s2 = s.nextLine();
//		두번째파일에서 notfound예외가 발생하는이유->입력에선 에러가 나는게 아니니까 try문 안에서 파일ㅇ르 합치기때문에
		try {
			fReader = new BufferedReader(new InputStreamReader(new FileInputStream(s1), "utf-8"));// 파일여는거
			fWriter = new FileWriter("FullMusic.txt"); // 합칠파일이름
			writeToFile(fReader, fWriter);
			fReader.close();

			fReader = new BufferedReader(new InputStreamReader(new FileInputStream(s2), "utf-8"));
			writeToFile(fReader, fWriter);

			fReader.close();
			fWriter.close();
			System.out.println("프로젝트 폴더 밑에 appended.txt파일에 저장되었습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾ㅇ르 수 없습니다.");
		} catch (IOException e) {
			System.out.println("입출력 오류가 발생");
		}

		s.close();
	}

	private static void writeToFile(BufferedReader in, FileWriter out) throws IOException {
		char buf[] = new char[50];
		int count = 0;
		while (true) {
			count = in.read(buf, 0, buf.length); // buf[]크기만큼읽기
			if (count == -1)
				break;
			if (count > 0) {
				out.write(buf, 0, count);
			}
		}

	}

}
