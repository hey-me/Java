package test1022;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
//		1. ���� �޴� 4������ �Է¹޾� ArrayList�� �����ϰ� ��� ����� �� ���� �� �̸��� ���
		ArrayList<String> al=new ArrayList<String>();
		Scanner s=new Scanner(System.in);
		System.out.println("���� �޴� 4������ �Է��ϼ���.");
		for (int i = 0; i < 4; i++) {
			System.out.print(i+1+"��°: ");
			al.add(s.next());	
		}
		String str=""; //��ġ�, ���, �ܹ���, ���Ľ��Ұ��
		for (int i = 0; i < al.size(); i++) {
			if(str.length()<al.get(i).length())
				str=al.get(i);
		}
		System.out.println(str);
		
		
		
		
	}

}
