package ch08_인터페이스.예제;

public class P372_ex_RemoteControl_인터페이스선언 {

}

interface RemoteControl20 {
	//상수
	public int 	MAX_VOLUME = 10;
	public int 	MIN_VOLUME = 0;
	//추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
