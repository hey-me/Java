package ch10_예외;

public class D1014_02_throw {

	public static void main(String[] args) {
		try {
			int result=subtract(5,100);
				System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	static int subtract(int i, int j) throws Exception { //Exception대신에 InvalidInputException가능
		if(i<j) { //굳이i-j<0 이렇게 안해도 됌
//			throw new Exception();이거대신에 아래꺼
			throw new InvalidInputException();
		}
			return i-j;
	}
	
}

class InvalidInputException extends Exception{
	InvalidInputException(){
		super("잘못된 입력입니다.");
	}
}