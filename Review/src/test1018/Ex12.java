package test1018;

public class Ex12 {

	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345", "AB"));
	}
	public static int count(String src, String target) {
		int count = 0; // ã�� Ƚ��
		int pos = 0; // ã�� ������ ��ġ
		for (int i = 0; i <src.length(); i++) {
			if(src.indexOf(target)!=-1){
				count++;
				pos+=src.indexOf(target);
				i=pos;
		}else {
			break;
		}
		}
//		while(true){
//		pos=src.indexOf(target,pos);
//		if(pos !=-1){
//		count++;
//		pos+=target.length();
//		}else{
//		break;
//		}
		return count;
		

			
			
		/*
		(1) �ݺ����� ����ؼ� �Ʒ��� ������ �ݺ��Ѵ�. 
		 1. src���� target�� pos�� ��ġ���� ã�´�. 
		 2. ã���� count�� ���� 1 ���� ��Ű��, pos�� ���� target.length��ŭ ������Ų��. 
		 3. indexOf�� ����� -1�̸� �ݺ����� ���������� count�� ��ȯ�Ѵ�. */
	}
}
