package ch08_�������̽�;

public class P385_1_�������̽�_Ȯ�ι���1_3 {
	/*
	 1. oxoo
	 2. ooxo
	 
     3. */
	private static void printSound(Soundable s) {
		System.out.println(s.sound());
	} 
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}

class Cat implements Soundable{
	@Override
	public String sound() {
		return "�߿�";
	}
}
class Dog implements Soundable{
	@Override
	public String sound() {
		return "�۸�";
	}
}

