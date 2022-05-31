package ch10_예외;

public class D1014_02_throw2 {

	public static void main(String[] args) {
		try {
		int result=sub(5,0);
		System.out.println("두 수의 차는: "+result);
		result=add(0,0);
		System.out.println("두 수의 합은: "+result);
		result=div(5,10);
		System.out.println("두 수의 나누기는: "+result);
		result=mul(-5,-3);
		System.out.println("두 수의 곱셈은: "+result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	static int sub(int i, int j) throws Exception {
		if(i<j) {
			throw new Ecp();
		}
		return i-j;
	}
	static int add(int i, int j) throws Exception {
		if(i+j<0) {
			throw new Ecp();
		}
		return i+j;
	}
	static int div(int i, int j) throws Exception {
		if(i<j) {
			throw new Ecp();
		}
		return i/j;
	}
	static int mul(int i, int j) throws Exception {
		if(i*j<0) {
			throw new Ecp();
		}
		return i*j;
	}
}

class Ecp extends Exception {
	Ecp(){
		super("예외처리가 필요합니다");
	}
}