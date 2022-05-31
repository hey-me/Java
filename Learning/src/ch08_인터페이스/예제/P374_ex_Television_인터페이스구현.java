package ch08_인터페이스.예제;

public class P374_ex_Television_인터페이스구현 {

	public static void main(String[] args) {
		RemoteControl20 rc;
		rc = new Television20();
		rc = new Audio20();
	}
}

class Television20 implements RemoteControl20 {
	// 필드
	private int volume;

	// turnOn() 추상메소드의 실체메소드
	public void turnOn() {
		System.out.println("TV 켭니다");
	}

	public void turnOff() {
		System.out.println("TV 끕니다");
	}

	// set~ 추상메소드의 실체메소드
	public void setVolume(int volume) {
		if (volume > RemoteControl20.MAX_VOLUME) {
			this.volume = RemoteControl20.MAX_VOLUME;
		} else if (volume < RemoteControl20.MIN_VOLUME) {
			this.volume = RemoteControl20.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 티비 볼륨 : " + this.volume);
	}
}

class Audio20 implements RemoteControl20 {
	private int volume;

	public void turnOn() {
		System.out.println("오디오를 켭니다");
	}

	public void turnOff() {
		System.out.println("오디오를 끕니다");
	}

	public void setVolume(int volume) {
		if (volume > RemoteControl20.MAX_VOLUME) {
			this.volume = RemoteControl20.MAX_VOLUME;
		} else if (volume < RemoteControl20.MIN_VOLUME) {
			this.volume = RemoteControl20.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨 : " + this.volume);
	}
}
