package ch08_�������̽�;

import ch02_������Ÿ��.����.P74_ex_Promotion;

public class D0928_�����ϱ����� {

	public static void main(String[] args) {

//		Tv10 t = new Tv10();
//		t.turnOn();
//		t.setVolume(500);
//		System.out.println(t.getVolume());
//		t.turnOff();
//
//		Audio10 a = new Audio10();
//		a.powerOn();
//		a.setVolume(500);
//		System.out.println(a.getVolume());
//		a.powerOff();
		RemoteControl10 t;
		t = new Audio10();
		t.powerOn();
		t.setVolume(50);
		System.out.println(t.getVolume());
	}
}

interface RemoteControl10 { // interfaceŬ���� ������ �߻�޼ҵ常 .. �̿ϼ���
	
//	(static final) int MIN_VOLUME = 0;
	int MIN_VOLUME = 0;
	int MAX_VOLUME = 100;

	int getVolume();
	void setVolume(int volume);
	void powerOn();
	void powerOff();

}

class Tv10 implements RemoteControl10 {
	// �ʵ�
	private int volume;
//	static final int MIN_VOLUME = 0;
//	static final int MAX_VOLUME = 100;

	// ������
//	public Tv() {}			
//	Tv(int v){volume = v;}

	// �޼ҵ�
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if (volume < MIN_VOLUME) {
			volume = MIN_VOLUME;
		} else if (volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		} else {
			this.volume = volume;
		}
		this.volume = volume;
	}

	public void powerOn() {
		System.out.println("Tv On");
	}

	public void powerOff() {
		System.out.println("Tv Off");
	}
}

class Audio10 implements RemoteControl10 {
	// �ʵ�
	private int volume;
//	static final int MIN_VOLUME = 0;
//	static final int MAX_VOLUME = 100;

	// ������
//		public Audio() {}			
//		Audio(int v){volume = v;}

	// �޼ҵ�
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if (volume < MIN_VOLUME) {
			volume = MIN_VOLUME;
		} else if (volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		} else {
			this.volume = volume;
		}
		this.volume = volume;
	}

	public void powerOn() {
		System.out.println("Audio On");
	}

	public void powerOff() {
		System.out.println("Audio Off");
	}
}
