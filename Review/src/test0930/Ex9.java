package test0930;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("총 스택 저장 공간 크기 입력>> ");
		int size=s.nextInt();
		StringStack ss=new StringStack(size);
		
		while(true) {
			System.out.print("문자열 입력>> ");
			String str=s.next();
			ss.push(str);
		if(str.equals("그만")) {	
			break;
		}
	}	System.out.println("프로그램 종료");
		
		
		System.out.print("스택에 저장된 모든 문자열 팝: ");
		
		for (int i = 0; i <=ss.length() ; i++) {
			System.out.print(ss.pop()+" ");
			
		}
		s.close();
	}

}

interface Stack{
	int length();
	int capacity();
	String pop();
	boolean push(String val);	
	Scanner s= new Scanner(System.in);
}

class StringStack implements Stack{
	int total;
	int i=0;
	String code[];
	String val;
	
	StringStack(int size){
		code=new String[size];
	}
	
	
	@Override
	public int length() {
		
		return i;
	}

	@Override
	public int capacity() {
		return code.length;
	}

	@Override
	public String pop() {
		if( length()==0) {
			return null;
		}
		return code[--i];
		
	}

	@Override
	public boolean push(String val) {
		if(val.equals("그만")) {
			return false;
		}else {
		if(i>=code.length) {
			System.out.println("꽉참");
			 return false;
		}else {
			code[i++]=val;
			return true;
		}}
		
//		if(code.length-i>0) {
//				code[i++]=val;
//				return true;
//			}else {
//				if(val.equals("그만")) {
//				return false;
//					
//				}else {
//				System.out.println("꽉참");
//				}
//				return false;
			
	}
	
}