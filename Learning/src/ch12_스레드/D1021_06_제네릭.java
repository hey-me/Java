package ch12_스레드;

public class D1021_06_제네릭 {

	public static void main(String[] args) {
		Box abox=new Box();
		Box obox=new Box();
		
		abox.set(new Apple());
		obox.set(new Orange());
		
		Apple ap=(Apple)abox.get();
		Orange og=(Orange) obox.get();
		
		System.out.println(ap);
		System.out.println(og);
	}

}
class Apple{
	public String toString() {
		return "I am an apple";
	}
}
class Orange{
	public String toString() {
		return "I am an orange";
	}
}

class Box{
	private Object ob;
	public void set(Object o) {
		ob=o;
	}
	public Object get() {
		return ob;
	}
}
