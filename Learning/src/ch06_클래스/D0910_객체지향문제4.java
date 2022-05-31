package ch06_클래스;

public class D0910_객체지향문제4 {

	public static void main(String[] args) {

		Marine m = new Marine();
		m.now(1, 5);
		m.weaponUp(2);
		m.armorUp(3);
		m.hpDown(10);
		
		System.out.println("마린의 위치는 ("+ m.x +", "+ m.y+")" );
		System.out.println("hp : "+ m.hp);
		System.out.println("weapon : "+ m.weapon);
		System.out.println("armor : "+ m.armor);
		
		Marine m2 = new Marine();
		System.out.println("마린의 위치는 ("+ m2.x +", "+ m2.y+")" );
		System.out.println("hp : "+ m2.hp);
		System.out.println("weapon : "+ m2.weapon);
		System.out.println("armor : "+ m2.armor);
		
		Marine m3 = new Marine();
		m3.hpDown(100);
		System.out.println("마린의 위치는 ("+ m3.x +", "+ m3.y+")" );
		System.out.println("hp : "+ m3.hp);
		System.out.println("weapon : "+ m3.weapon);
		System.out.println("armor : "+ m3.armor);
	}

}

class Marine {
	
	int x =1;
	int y =1;
	int hp = 100;
	static int weapon = 1;
	static int armor = 1;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public static int getWeapon() {
		return weapon;
	}
	public static void setWeapon(int weapon) {
		Marine.weapon = weapon;
	}
	public static int getArmor() {
		return armor;
	}
	public static void setArmor(int armor) {
		Marine.armor = armor;
	}
	void weaponUp(int weapon) {
		this.weapon = this.weapon+weapon;
	}
	void armorUp(int armor) {
		this.armor = this.armor+armor;
	}
	void hpDown(int hp) {
		this.hp = this.hp-hp;
		if (this.hp <= 0) {
			System.out.println("마린이 죽었습니다.");
		};
	}
	void now (int x, int y) {
		this.x = x;
		this.y = y;
	}
}