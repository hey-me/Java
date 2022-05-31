package ch06_클래스.d0910_객체지향_;

public class D0910_객체지향문제4 {

	public static void main(String[] args) {

		Marine m1 = new Marine();
		m1.now(1, 5);
		m1.weaponUp(2);
		m1.armorUp(3);
		m1.hpDown(10);
		
		System.out.println("m1 마린의 위치는 ("+ m1.x +", "+ m1.y+")" );
		System.out.println("m1 마린의 hp : "+ m1.hp);
		System.out.println("m1 마린의 weapon : "+ m1.weapon);
		System.out.println("m1 마린의 armor : "+ m1.armor);
		System.out.println();
		
		Marine m2 = new Marine();
		m2.now(2, 3);
		m2.hpDown(20);
		m2.armorUp(3);
		System.out.println("m2 마린의 위치는 ("+ m2.x +", "+ m2.y+")" );
		System.out.println("m2 마린의 hp : "+ m2.hp);
		System.out.println("m2 마린의 weapon : "+ m2.weapon);
		System.out.println("m2 마린의 armor : "+ m2.armor);
		System.out.println();
		
		Marine m3 = new Marine();
		m3.hpDown(100);
		System.out.println("m3 마린의 위치는 ("+ m3.x +", "+ m3.y+")" );
		System.out.println("m3 마린의 hp : "+ m3.hp);
		System.out.println("m3 마린의 weapon : "+ m3.weapon);
		System.out.println("m3 마린의 armor : "+ m3.armor);
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
		this.weapon = this.weapon + weapon;
	}
	void armorUp(int armor) {
		this.armor = this.armor + armor;
	}
	void hpDown(int hp) {
		this.hp = this.hp-hp;
		if (this.hp <= 0) {
			this.hp = 0;
			System.out.println("마린 사망..");
		};
	}
	void now (int x, int y) {
		this.x = x;
		this.y = y;
	}
}