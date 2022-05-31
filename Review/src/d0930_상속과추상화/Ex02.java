package d0930_상속과추상화;

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
		System.out.print("나의 IPTV는 " + ip + " 주소의 ");
		super.printProperty();
	}
}