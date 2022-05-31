package ch07_���.d0923_Ŭ����;

class MyTv3 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	private int previousChannel;
//	int previousChannel2;

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if (channel >= MIN_CHANNEL && channel <= MAX_CHANNEL) {
			previousChannel = this.channel;
			this.channel = channel;
//		previousChannel2 = channel;
		} else {
			System.out.println("channel�� 1~100 ������ ���� �����մϴ�");
		}
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
			this.volume = volume;
		} else {
			System.out.println("volume�� 0~100 ������ ���� �����մϴ�");
		}
	}

	void gotoPrevChannel() {
//	if (previousChannel2 == channel) {
//		channel = previousChannel;
////		System.out.println("���� ä�� " + previousChannel);
//	} else {
//		channel = previousChannel2;
////		System.out.println("���� ä�� " + previousChannel2);
//	}
		setChannel(previousChannel);
	}
}

class Ex04 {
	public static void main(String args[]) {
		MyTv3 t = new MyTv3();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
	}
}
