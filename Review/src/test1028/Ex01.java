package test1028;
import java.io.*;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) throws IOException {
//		fullmusic�̶�� ������ ���� ù��°�� �о�ͼ� �����ϰ�
//		�ι�°���� �о�ͼ� �����ϰ�
//
//		fullmusic������ javasf(������Ʈ����)�� workspace�� javasf�� �����ϱ�
//		scanner�� �����̸��� �Է¹ް� ex music1.txt
//		�ι����̸��Է¹ް�
//		�̸����⸸�ϸ� ���� ���� ����(fullmusic)�ϰ� ���� 1,2��ġ��
//
//		��ü��θ��̾ƴ� �����̸��� �Է��ϴ°��(��ΰ�������) ������ ������Ʈ���վ���մϴ�
//		�����̸��� ������ workspace���� javasf�� ������ �����ǰ� �ű⿡ �ִ� ������ �ҷ��� �� ����
		
		while(true) {
			Writer writer=new FileWriter("fullmusic.txt",true);
			Scanner s=new Scanner(System.in);
			try {
			System.out.print("�ҷ��� ���ϸ��� �Է��ϼ���: ");
			String str=s.nextLine();
			if(str.equals("�׸�"))break;
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
			System.out.println("���� �̸��� �߸� �Ǿ����ϴ�.");
			continue;
		}
	}
		
	}

}
