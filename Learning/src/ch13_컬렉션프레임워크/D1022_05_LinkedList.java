package ch13_�÷��������ӿ�ũ;

import java.util.*;

public class D1022_05_LinkedList {

	public static void main(String[] args) {
//		ArrayList�� ����� ������ ���α����� �ٸ�
//		�߰��� �����ϰų� �����ϸ� ��ũ�� ���� ���ָ� ��
//		����/������ ����ϰ� �߻��ϴ� �����͸� ������ �� ����ϸ� ��.
		
		List<String> list1=new ArrayList<String>();
		List<String> list2=new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime=System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println("ArrayList �ɸ��ð�: "+ (endTime-startTime)+"ns");
		//�����ɸ��� �ִ�ð��� ���ϴ°�
		
		startTime=System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println("LinkedList �ɸ��ð�: "+ (endTime-startTime)+"ns");
		
	}

}
