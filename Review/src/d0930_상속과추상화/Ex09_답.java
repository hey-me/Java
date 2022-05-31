package d0930_��Ӱ��߻�ȭ;
import java.util.Scanner;

public class Ex09_�� {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		int size=s.nextInt();
		
		StringStack3 stst=new StringStack3(size);
		
		while(true) {
			System.out.print("���ڿ� �Է� >> ");
			String st=s.next();
			if(st.equals("�׸�")) {
				System.out.println("�ý��� ����");
				break;
			}
			boolean res= stst.push(st);
			if(!res) {
				System.out.println("������ �� ���� Ǫ�� �Ұ�!!");
			}
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		int index=stst.length();
		for (int i = 0; i < index; i++) {
			System.out.print( stst.pop()+" " );
		}
		s.close();
	}
}

class StringStack3 implements Stack{
	private String[] arr;
	private int index;
	
	public StringStack3(int size) {
		arr=new String[size];
		index=-1;
	}
	
	@Override
	public int length() {
		return index+1;
	}
	@Override
	public int capacity() {
		return arr.length;
	}
	@Override
	public String pop() {
		if( index == -1) {
			return null;
		}
		return arr[index--];
	}
	@Override
	public boolean push(String val) {
		if( index == capacity()-1 ) {
			return false;
		}
		arr[++index]=val;
		return true;
	}
	
}
