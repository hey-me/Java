package ch07_���.d0923_Ŭ����;

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
	 * (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
	 */
	

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if (channel >= MIN_CHANNEL && channel <= MAX_CHANNEL) {
			this.channel = channel;
		} else {
			System.out.println("channel�� 1~100 ������ ���� �����մϴ�");
		}
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if (volume >= MIN_VOLUME  && volume <= MAX_VOLUME ) {
			this.volume = volume;
		} else {
			System.out.println("volume�� 0~100 ������ ���� �����մϴ�");
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
