package test0930;

import java.util.Scanner;

public class Ex12_창민 {

	public static void main(String[] args) {
		System.out.println("** Bear의 Fish 먹기 게임을 시작합니다.**");
		char[][] game = new char[10][20];
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				game[i][j]='-';
			}
		}
		Bear2 b = new Bear2(0, 0, 1);
		Fish2 f = new Fish2((int)(Math.random()*10),(int)(Math.random()*20), 1);
		game[b.x][b.y]=b.getShape();
		game[f.x][f.y]=f.getShape();
		while (true) {
			if (b.collide(f)) {
				System.out.println("Bear가 Fish를 먹었습니다.");
				game[b.x][b.y] = b.getShape();
				for (int i = 0; i < game.length; i++) {
					for (int j = 0; j < game[i].length; j++) {
						System.out.print(game[i][j]);
					}
					System.out.println();
				}
				System.out.println("Bear Wins!!!");
				break;
			}

			for (int i = 0; i < game.length; i++) {
				for (int j = 0; j < game[i].length; j++) {
					System.out.print(game[i][j]);
				}
				System.out.println();
			}
			game[b.x][b.y]='-';
			game[f.x][f.y]='-';
			b.move();
			f.move();
			game[b.x][b.y]=b.getShape();
			game[f.x][f.y]=f.getShape();

			}

	}
}

class Bear2 extends GameObject2 {
Scanner s = new Scanner(System.in);
	Bear2(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	void move() {
		System.out.println("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
		String direction = s.next();
		if (direction.equals("a")) {
			y -= distance;
			if (y < 0) {
				y = 0;
			}
		} else if (direction.equals("s")) {
			x += distance;
			if (x > 9) {
				x = 9;
			}
		} else if (direction.equals("d")) {
			this.x -= this.distance;
			if (this.x < 0) {
				this.x = 0;
			}
		} else if (direction.equals("f")) {
			this.y += this.distance;
			if (this.y > 19) {
				this.y = 19;
			}
		}
		play++;

	}

	@Override
	char getShape() {

		return 'B';
	}

}

class Fish2 extends GameObject2 {

	Fish2(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	void move() {
		char[] ox = new char[5];
		for (int i = 0; i < ox.length; i++) {
			if (i > 3) {
				ox[i] = 'X';
			} else {
				ox[i] = 'O';
			}
		}

		for (int i = 0; i < 10; i++) {
			int st = (int) (Math.random() * 5);
			int ed = (int) (Math.random() * 5);
			char imsi = ox[st];
			ox[st] = ox[ed];
			ox[ed] = imsi;
		}
		if (ox[play % 5] == 'O') {
			int go = (int) (Math.random() * 4);
			if (go == 0) {
				this.y -= this.distance;
				if (this.y < 0) {
					this.y = 0;
				}
			} else if (go == 1) {
				this.x += this.distance;
				if (this.x > 9) {
					this.x = 9;
				}
			} else if (go == 2) {
				this.x -= this.distance;
				if (this.x < 0) {
					this.x = 0;
				}
			} else if (go == 3) {
				this.y += this.distance;
				if (this.y > 19) {
					this.y = 19;
				}
			}

		}


	}

	@Override
	char getShape() {
		return '@';
	}

}

abstract class GameObject2 {
	protected int distance;
	protected int x, y;
	protected char shape;
	int play = 0;
	Scanner s = new Scanner(System.in);
	GameObject2(int startX, int startY, int distance) {
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

	boolean collide(GameObject2 p) {
		if (this.x == p.getX() && this.y == p.getY()) {
			return true;
		} else {
			return false;
		}
	}

	abstract void move();

	abstract char getShape();
}


