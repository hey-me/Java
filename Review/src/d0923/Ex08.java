package d0923;

public class Ex08 {
	public static void main(String args[]) {
		Marine m = new Marine();
		Tank t = new Tank();
		Dropship d = new Dropship();
		
		m.move(1, 3);
		t.changeMode();
		t.stop();
		d.load();
		d.move(0, 0);
		
		
	}
	
}

class Unit {
	int x, y; // ���� ��ġ
	void move(int x, int y) { /* ������ ��ġ�� �̵� */ }
	void stop() { /* ���� ��ġ�� ���� */ }
}

class Marine extends Unit { // ����
	void stimPack() { /* �������� ����Ѵ�.*/ }
}

class Tank extends Unit { // ��ũ
	void changeMode() { /* ���ݸ�带 ��ȯ�Ѵ�. */ }
}

class Dropship extends Unit { // ���ۼ�

	void load() { /* ���õ� ����� �¿��.*/ }
	void unload() { /* ���õ� ����� ������.*/ }
}