package ch08_인터페이스;

import ch02_변수와타입.예제.P74_ex_Promotion;

public class D0928_시작하기전에 {

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

interface RemoteControl10 { // interface클래스 내에는 추상메소드만 .. 미완성만
	
//	(static final) int MIN_VOLUME = 0;
	int MIN_VOLUME = 0;
	int MAX_VOLUME = 100;

	int getVolume();
	void setVolume(int volume);
	void powerOn();
	void powerOff();

}

class Tv10 implements RemoteControl10 {
	// 필드
	private int volume;
//	static final int MIN_VOLUME = 0;
//	static final int MAX_VOLUME = 100;

	// 생성자
//	public Tv() {}			
//	Tv(int v){volume = v;}

	// 메소드
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
	// 필드
	private int volume;
//	static final int MIN_VOLUME = 0;
//	static final int MAX_VOLUME = 100;

	// 생성자
//		public Audio() {}			
//		Audio(int v){volume = v;}

	// 메소드
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
