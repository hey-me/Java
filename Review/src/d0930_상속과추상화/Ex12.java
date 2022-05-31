package d0930_상속과추상화;

public class Ex12 {

	public static void main(String[] args) {
//		Game game = new Game();
	}

}

class Bear extends GameObject {
	String[][] gameArr = new String[10][20];

	protected int distance;
	protected int x, y;

	Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	void move() {
		this.move();
	}

	void move(String move) {
		if (move.equals("a")) {
			if (y >= 0 && y - distance >= 0) {
				y -= distance;
			} else {
				y = 0;
			}
		}
		if (move.equals("s")) {
			if (x < 10 && x + distance < 10) {
				x += distance;
			} else {
				x = 9;
			}
		}
		if (move.equals("d")) {
			if (y >= 0 && y - distance >= 0) {
				y -= distance;
			} else {
				y = 0;
			}
		}
		if (move.equals("f")) {
			if (y < 20 && y + distance < 20) {
				y += distance;
			} else {
				y = 19;
			}
		}
	}

	@Override
	char getShape() {
		return 'B';
	}
}

class Fish extends GameObject {
	protected int distance;
	protected int x, y;

	Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	void move() {
		
	}


	@Override
	char getShape() {
		return 0;
	}

}

abstract class GameObject {
	protected int distance;
	protected int x, y;

	GameObject(int startX, int startY, int distance) {
		this.x = startX;
		this.y = startY;
		this.distance = distance;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	boolean collide(GameObject p) {
		if (this.x == p.getX() && this.y == p.getY())
			return true;
		else
			return false;
	}

	abstract void move();

	abstract char getShape();
}