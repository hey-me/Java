package ch04_조건문과반복문;

public class P140_Math_random {

	public static void main(String[] args) {

		System.out.println(Math.random());
			
//	**	Math.random() .....Math.PI(파이값)..Math.E(e값)
//			0.0과 0.1 사이에 속하는 double 타입의 난수 하나를 리턴함.(랜덤한 수)
//			0.0 <= Math.random() < 1.0


//	**	start 부터 시작하는 n개의 정수 중에서 임의의 정수를 하나 얻기 위한 연산식
//			int num = (int) (Math.random() * n ) + start;	

//			ex) 1~10사이의 정수
//				0.0 *10 <=        Math.random() * 10	< 1.0 *10
//				(int)0.0<= (int) (Math.random() * 10)   < (int)10.0
//				0+1		<= (int) (Math.random() * 10) + 1 < 10+1
//				1		<= (int) (Math.random() * 10) + 1 < 11
//			ex) 주사위 번호 (1~6)
//			int num = (int) (Math.random() * 6) + 1;		
		
		
		
	}

}
