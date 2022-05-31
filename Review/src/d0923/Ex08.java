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
	int x, y; // 현재 위치
	void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void stop() { /* 현재 위치에 정지 */ }
}

class Marine extends Unit { // 보병
	void stimPack() { /* 스팀팩을 사용한다.*/ }
}

class Tank extends Unit { // 탱크
	void changeMode() { /* 공격모드를 변환한다. */ }
}

class Dropship extends Unit { // 수송선

	void load() { /* 선택된 대상을 태운다.*/ }
	void unload() { /* 선택된 대상을 내린다.*/ }
}