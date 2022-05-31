package ch07_상속.d0923_클래스;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	int previousChannel;

	/*
	 * (1) 알맞은 코드를 넣어 완성하시오.
	 */
	

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if (channel >= MIN_CHANNEL && channel <= MAX_CHANNEL) {
			this.channel = channel;
		} else {
			System.out.println("channel은 1~100 사이의 수만 가능합니다");
		}
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if (volume >= MIN_VOLUME  && volume <= MAX_VOLUME ) {
			this.volume = volume;
		} else {
			System.out.println("volume은 0~100 사이의 수만 가능합니다");
		}
	}


}

class Ex03 {
	public static void main(String args[]) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
	}
}
