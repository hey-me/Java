package test0930;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		System.out.println("**Bear의 fish먹기 게임을 시작합니다.**");
		
		Bear bear=new Bear();
		Fish fish=new Fish();
		
		int cnt=0;
		while(!bear.collide(fish)) {
			for(char[] a:bear.ch)
			System.out.println(a);
		System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f)>> ");
		bear.move();
		System.out.println(cnt);
		cnt++;
		if(cnt==5) {
			bear.gof.move();
			
			
			System.out.println(bear.gof.x+bear.gof.y);
		}
		if(bear.collide(fish)) {
			System.out.println("냠");
		}
	}

}
}

abstract class GameObject{
	protected int distance;
	protected int x, y;
	GameObject(){
		
	}
	GameObject(int startX, int startY, int distance){
		this.x=startX;
		this.y=startY;
		this.distance=distance;
	}
	
	int getX() { return x;}
	int getY() { return y;}
	
	boolean collide(GameObject p) {
		if(this.x==p.getX()&&this.y==p.getY()) {
			return true;
	} else {
		return false;
	}
	}
	abstract void move();
	abstract char getShape();
}


class Bear extends GameObject{
	Scanner s=new Scanner(System.in);
	GameObject gof=new Fish();
	char[][]ch;
	String str;
	
	Bear(){
		this(0,0,1);
		ch=new char[10][20];
		
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				ch[i][j]='-';
			}
		}
		
		ch[x][y]=getShape();
		ch[gof.x][gof.y]=gof.getShape();
		
		
	}
	Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	void move() {
		str=s.next();
		switch(str) {
		case "s" : 
			if(x<ch.length-1&&x>=0) {
			ch[x][y]='-';
			ch[x+distance][y]=getShape(); 
			x+=distance;
			}
			break;
		
		case "a" :
			if(y>0&&y<ch[x].length-1) {
			ch[x][y]='-';
			ch[x][y-distance]=getShape();
			y-=distance;
			}
			break;
		case "d" :
			if(x>0&&x<ch.length-1) {
			ch[x][y]='-';
			ch[x-distance][y]=getShape();
			x-=distance;
			}
			break;
		case "f" :
			if(y>=0&&y<ch[x].length-1) {
			ch[x][y]='-';
			ch[x][y+distance]=getShape();
			y+=distance;
			}
			break;
		}
	}

	@Override
	char getShape() {
		return 'B';
	}
}

class Fish extends GameObject{
	Fish(){
		this(6,6,1);
	}
	Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	void move() {
		this.x=(int)(Math.random()*10);
		this.y=(int)(Math.random()*20);
	}

	@Override
	char getShape() {
		return '@';
	}
	
}