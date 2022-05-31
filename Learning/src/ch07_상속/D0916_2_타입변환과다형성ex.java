package ch07_상속;

public class D0916_2_타입변환과다형성ex {

	public static void main(String[] args) {
	
	BBB b = new BBB();
	AAA a = new BBB();
	a.method2();  //BB-method2
	CC c = new FF();
	c.method2();  //FF-method2
	c.method3();  //CC-method3
	}
}
class AAA{
	void method1() {System.out.println("A-method1");}
	void method2() {System.out.println("A-method2");}
	void method3() {System.out.println("A-method3");}
}

class BBB extends AAA{
	void method2() {	System.out.println("BB-method2");}
	void method4() {	System.out.println("BB-method4");}
}
class B1 extends AAA{
	void method1() {	System.out.println("B1-method1");}
	void method4() {	System.out.println("B1-method4");}
}
class CC extends AAA{
	void method2() {	System.out.println("CC-method2");}
	void method3() {	System.out.println("CC-method3");}
}
class C1 extends AAA{
	void method2() {	System.out.println("C1-method2");}
	void method4() {	System.out.println("C1-method4");}
}
class DD extends BBB{
	void method1() {	System.out.println("DD-method1");}
	void method2() {	System.out.println("DD-method2");}
}
class D1 extends B1{
	void method1() {	System.out.println("D1-method1");}
	void method3() {	System.out.println("D1-method3");}
}
class EE extends CC{
	void method1() {	System.out.println("EE-method1");}
	void method2() {	System.out.println("EE-method2");}
}
class E1 extends C1{
	void method2() {	System.out.println("E1-method2");}
	void method3() {	System.out.println("E1-method3");}
}
class FF extends EE{
	void method2() {	System.out.println("FF-method2");}
	void method4() {	System.out.println("FF-method4");}
}
class GG extends FF{
	void method1() {	System.out.println("GG-method1");}
	void method3() {	System.out.println("GG-method3");}
}