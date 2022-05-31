package ch12_스레드;

public class D1020_04_동기화메소드 {

	public static void main(String[] args) {
//		공유되어있는 뭔가를 실행할 때 다른스레드가 변경할 수 없게 하는 것
//		임계 영역: 하나의 스레드만 실행할 수 있게 하는 것-> 메소드 앞에 synchronized를 쓰면 됌
//		동기화블록이란것도있음->알아서공부하기
		Corn corn=new Corn();
		
		Star star=new Star();
		star.setCorn(corn);
		star.setPriority(Thread.MAX_PRIORITY);
//		star.setPriority(10);
		star.start();

		
		Moon moon=new Moon();
		moon.setCorn(corn);
		moon.setPriority(Thread.MIN_PRIORITY);
//		moon.setPriority(1);
		moon.start();

		
		
	}

}
class Corn{
	private int memory;
	int getMemory() {
		return memory;
	}
public /*synchronized*/ void setMemory(int memory) {
		this.memory=memory;
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+": "+this.memory);
	}
}

class Star extends Thread{
	private Corn corn;
	
	public	void setCorn(Corn corn) {
		setName("Star");
		this.corn=corn;
	}
	@Override
	public void run() {
		corn.setMemory(100);
	}
}

class Moon extends Thread{
	private Corn corn;
	public void setCorn(Corn corn) {
		setName("Moon");
		this.corn=corn;
	}
	@Override
	public void run() {
		corn.setMemory(50);
	}
}