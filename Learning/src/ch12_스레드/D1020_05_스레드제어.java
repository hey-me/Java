package ch12_스레드;

public class D1020_05_스레드제어 {

	public static void main(String[] args) {
//		p.541
//		.start()를 썼다고 해서 스레드가 무조건 동시에 실행되는 건 아님. 운영체제가 짧은 스레드부터 먼저 실행시켜놓고 다른걸실행함(라운드 로빈 방식)
//		먼저 실행된 스레드를 끝까지 다 실행하는건 아니고 스레드1은 8초, 스레드2는 10초고 cpu할당량이 5초라면
//		스레드1부터 시작하는데 cpu할당량인 5초까지만 실행하고 남은3초는 대기상태로 보낸후에 스레드2를 실행함
		
//스레드의 상태를 알아야 함(스레드 객체 생성->실행대기->실행(대기와 실행 구간 반복)->종료)
//					(New->Runnable->Running->Terminated)
		
//스레드를 주어진 시간동안 일시정지하려면 Thread.sleep(1/1000시간) sleep을 쓰려면 예외처리를 꼭해줘야함(try/catch->InterruptedException)		

		
	}

}
