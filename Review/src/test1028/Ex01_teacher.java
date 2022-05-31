package test1028;

import java.util.Scanner;
import java.io.*;

public class Ex01_teacher {

	public static void main(String[] args)  {

		Scanner s = new Scanner(System.in);// System.in->inputStream(����Ʈ��Ʈ��)
		BufferedReader fReader = null;// filereader���ƴ� buffer�� ����:
//		�ѱ��ڵ带 utp-8�������� �����Ÿ�
//		filreader���� �������������Ҽ��ֱ��ϳ�
		FileWriter fWriter = null;

		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�");

		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
		String s1 = s.nextLine();// ����Ѵ� �޼ҵ忡 ���� ��Ʈ���� �о�� ����Ʈ�� �޶���

		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
		String s2 = s.nextLine();
//		�ι�°���Ͽ��� notfound���ܰ� �߻��ϴ�����->�Է¿��� ������ ���°� �ƴϴϱ� try�� �ȿ��� ���Ϥ��� ��ġ�⶧����
		try {
			fReader = new BufferedReader(new InputStreamReader(new FileInputStream(s1), "utf-8"));// ���Ͽ��°�
			fWriter = new FileWriter("FullMusic.txt"); // ��ĥ�����̸�
			writeToFile(fReader, fWriter);
			fReader.close();

			fReader = new BufferedReader(new InputStreamReader(new FileInputStream(s2), "utf-8"));
			writeToFile(fReader, fWriter);

			fReader.close();
			fWriter.close();
			System.out.println("������Ʈ ���� �ؿ� appended.txt���Ͽ� ����Ǿ����ϴ�.");
		} catch (FileNotFoundException e) {
			System.out.println("������ ã���� �� �����ϴ�.");
		} catch (IOException e) {
			System.out.println("����� ������ �߻�");
		}

		s.close();
	}

	private static void writeToFile(BufferedReader in, FileWriter out) throws IOException {
		char buf[] = new char[50];
		int count = 0;
		while (true) {
			count = in.read(buf, 0, buf.length); // buf[]ũ�⸸ŭ�б�
			if (count == -1)
				break;
			if (count > 0) {
				out.write(buf, 0, count);
			}
		}

	}

}
