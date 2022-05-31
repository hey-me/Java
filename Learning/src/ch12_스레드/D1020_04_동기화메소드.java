package ch12_������;

public class D1020_04_����ȭ�޼ҵ� {

	public static void main(String[] args) {
//		�����Ǿ��ִ� ������ ������ �� �ٸ������尡 ������ �� ���� �ϴ� ��
//		�Ӱ� ����: �ϳ��� �����常 ������ �� �ְ� �ϴ� ��-> �޼ҵ� �տ� synchronized�� ���� ��
//		����ȭ����̶��͵�����->�˾Ƽ������ϱ�
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