package ch08_인터페이스.예제;
public class P400_ex_Interface_인터페이스상속 {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();

		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();

		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();

		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();
	}
}

interface InterfaceA {
	void methodA();
}

interface InterfaceB {
	void methodB();
}

interface InterfaceC extends InterfaceA, InterfaceB {
	void methodC();
}

class ImplementationC implements InterfaceC {
	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
	}
	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
	}
	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}
}