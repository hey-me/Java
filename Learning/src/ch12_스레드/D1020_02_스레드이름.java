package ch12_������;

public class D1020_02_�������̸� {

	public static void main(String[] args) {
		Thread mainthread=Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�: "+mainthread.getName());
		
		ThreadA threadA=new ThreadA();
		System.out.println("�۾� ������ �̸�: "+ threadA.getName());
		threadA.start();
		
		ThreadB threadB=new ThreadB();
		System.out.println("�۾� ������ �̸�: "+ threadB.getName());
		threadB.start();
		
		ThreadC threadC=new ThreadC();
		System.out.println("�۾� ������ �̸�: "+ threadC.getName());
		
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

