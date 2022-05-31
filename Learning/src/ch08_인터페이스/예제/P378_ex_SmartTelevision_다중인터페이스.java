package ch08_�������̽�.����;

public class P378_ex_SmartTelevision_�����������̽� {

	public static void main(String[] args) {
		SmarTelevision20 tv = new SmarTelevision20();
		
		RemoteControl20 rc = tv;
		Searchable20 searchable = tv;
	}

}

interface Searchable20 {
	void search(String url);
}

class SmarTelevision20 implements RemoteControl20, Searchable20 {
	private int volume;
	
	public void turnOn() {
		System.out.println("TV �մϴ�");
	}
	public void turnOff() {
		System.out.println("TV ���ϴ�");
	}

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
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}

}