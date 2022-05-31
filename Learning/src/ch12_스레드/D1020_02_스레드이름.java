package ch12_스레드;

public class D1020_02_스레드이름 {

	public static void main(String[] args) {
		Thread mainthread=Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: "+mainthread.getName());
		
		ThreadA threadA=new ThreadA();
		System.out.println("작업 스레드 이름: "+ threadA.getName());
		threadA.start();
		
		ThreadB threadB=new ThreadB();
		System.out.println("작업 스레드 이름: "+ threadB.getName());
		threadB.start();
		
		ThreadC threadC=new ThreadC();
		System.out.println("작업 스레드 이름: "+ threadC.getName());
		
	}

}
class ThreadA extends Thread{
	ThreadA(){
		setName("ThreadA");
	}
	
}
class ThreadB extends Thread{
	
}
class ThreadC extends Thread{
	
}

