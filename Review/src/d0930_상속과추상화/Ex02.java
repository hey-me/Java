package d0930_��Ӱ��߻�ȭ;

public class Ex02 {

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}

}

class IPTV extends ColorTV {
	private String ip;

	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}

	void printProperty() {
		System.out.print("���� IPTV�� " + ip + " �ּ��� ");
		super.printProperty();
	}
}