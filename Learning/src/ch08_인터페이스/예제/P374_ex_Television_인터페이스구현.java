package ch08_�������̽�.����;

public class P374_ex_Television_�������̽����� {

	public static void main(String[] args) {
		RemoteControl20 rc;
		rc = new Television20();
		rc = new Audio20();
	}
}

class Television20 implements RemoteControl20 {
	// �ʵ�
	private int volume;

	// turnOn() �߻�޼ҵ��� ��ü�޼ҵ�
	public void turnOn() {
		System.out.println("TV �մϴ�");
	}

	public void turnOff() {
		System.out.println("TV ���ϴ�");
	}

	// set~ �߻�޼ҵ��� ��ü�޼ҵ�
	public void setVolume(int volume) {
		if (volume > RemoteControl20.MAX_VOLUME) {
			this.volume = RemoteControl20.MAX_VOLUME;
		} else if (volume < RemoteControl20.MIN_VOLUME) {
			this.volume = RemoteControl20.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� Ƽ�� ���� : " + this.volume);
	}
}

class Audio20 implements RemoteControl20 {
	private int volume;

	public void turnOn() {
		System.out.println("������� �մϴ�");
	}

	public void turnOff() {
		System.out.println("������� ���ϴ�");
	}

	public void setVolume(int volume) {
		if (volume > RemoteControl20.MAX_VOLUME) {
			this.volume = RemoteControl20.MAX_VOLUME;
		} else if (volume < RemoteControl20.MIN_VOLUME) {
			this.volume = RemoteControl20.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� ����� ���� : " + this.volume);
	}
}
