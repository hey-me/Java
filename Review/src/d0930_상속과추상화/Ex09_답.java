package d0930_상속과추상화;
import java.util.Scanner;

public class Ex09_답 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int size=s.nextInt();
		
		StringStack3 stst=new StringStack3(size);
		
		while(true) {
			System.out.print("문자열 입력 >> ");
			String st=s.next();
			if(st.equals("그만")) {
				System.out.println("시스템 종료");
				break;
			}
			boolean res= stst.push(st);
			if(!res) {
				System.out.println("스택이 꽉 차서 푸시 불가!!");
			}
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
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
