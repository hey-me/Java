package test0930;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("�� ���� ���� ���� ũ�� �Է�>> ");
		int size=s.nextInt();
		StringStack ss=new StringStack(size);
		
		while(true) {
			System.out.print("���ڿ� �Է�>> ");
			String str=s.next();
			ss.push(str);
		if(str.equals("�׸�")) {	
			break;
		}
	}	System.out.println("���α׷� ����");
		
		
		System.out.print("���ÿ� ����� ��� ���ڿ� ��: ");
		
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
		if(val.equals("�׸�")) {
			return false;
		}else {
		if(i>=code.length) {
			System.out.println("����");
			 return false;
		}else {
			code[i++]=val;
			return true;
		}}
		
//		if(code.length-i>0) {
//				code[i++]=val;
//				return true;
//			}else {
//				if(val.equals("�׸�")) {
//				return false;
//					
//				}else {
//				System.out.println("����");
//				}
//				return false;
			
	}
	
}