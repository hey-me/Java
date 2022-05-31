package ch08_인터페이스;

public class P385_1_인터페이스_확인문제1_3 {
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
		return "야옹";
	}
}
class Dog implements Soundable{
	@Override
	public String sound() {
		return "멍멍";
	}
}

