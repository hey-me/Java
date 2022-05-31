package ch03_연산자;

public class P125_삼항_조건연산자 {

	public static void main(String[] args) {

//		*삼항 연산자
//		3개의 피연산자를 필요로 하는 연산자
//		
//		[a]			? 		[b]		 :		 [c]  
//		조건식				값 또는 연산식		값 또는 연산식
//		(피연산자1)			(피연산자2)		(피연산자3)
//		[a]를 [b]로, [a]를 [c]로...
//		[a]가 True일때 [b]실행
//		[a]가 False일떄 [c]실행

		int score = 95;
		char grade = (score > 90) ? 'A' : 'B';
		
//		(score > 90) 이 True면 'A', False면 'B'
//		(조건식)안에 들어가는 것은 문자열만 제외하고는 모두 가능

	}

}
