package ch12_스레드;

public class D1020_01_멀티스레드 {

	public static void main(String[] args) {
//스레드는 하나의 프로그램에서의 흐름임(ex DOS, DOS에서는 다른작업을 하고싶으면 하고있던 작업을 종료시키고 다른 작업을 해야했음 단일task task와 스레드는 다름)
//		하나의 프로그램안에 여러개의 작업을 동시에 하는것:멀티태스킹 멀티태스킹이 가능하다해서 멀티스레드가 가능한것은아님 멀티스레드->하나의 프로그램 안에서 여러가지 동작을 하는것
//		운영체제는 여러개의 프로세스(현재 실행중인 프로그램)를 순차적으로 실행함->사용자 입장에선 동시에 실행하고있다고 느끼는거임
//		멀티스레드는 메인스레드가 주가 되고 메인에서 시작해 라고 하면 나머지도 실행됨
//		프로그램의 종료시점은 메인스레드와 멀티스레드중 가장 늦게 끝나는 지점에서 종료됌
//		thread1.start(); 실행할때 사용하는 것
//		스레드클래스만드는방법: 1.스레드클래스를 상속해서 만ㄷ름, 2 runnable인터페이스를 구현하든지 
//		스레드클래스에는 start메소드가 없음 대신 run이라는 메소드가 있음
//		run메소드를 오버라이딩해야함->run메소드 안에 작업할거를 적어놓으면 됌
//		동기화메소드:수신호를 맞추는것
//		스레드로 동작하려면 직접 run메소드를호출하지않고 start메소드를 통해서 JVM이 run메소드를 호출하게끔 해야함 
		
		X x=new X();
		x.checkAccess();
		x.run();
		x.start();
		
		Runnable y=new Y();
		Thread thread=new Thread(y);
		thread.setName("threadY");
		System.out.println(thread.getName());
//		y는 한번만사용되고 이후로 사용되지않음 그래서 익명클래스로 가능
//		Thread thread=new Thread(new Runnable() {
//			@Override
//			public void run() {
//				
//			}
//		});
		
	}
}

class X extends Thread{
	
}
class Y implements Runnable{
	Y(){
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}