package ch08_�������̽�.����;
public class P400_ex_Interface_�������̽���� {

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
		System.out.println("ImplementationC-methodA() ����");
	}
	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB() ����");
	}
	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() ����");
	}
}