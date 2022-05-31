package ch09_중첩클래스와인터페이스;

public class D1012_06_익명객체_로컬변수 {
//p.414 참조 p.435
	public static void main(String[] args) {
		Anonymous a=new Anonymous();
		a.mothod(0, 0);
		a.mothod(10,5);
	}

}

interface Calculatable{
	int sum();
}

class Anonymous{
	private int field;
	
	void mothod(int arg1, int arg2) {	//final로 간주
		int var1=0;
		int var2=0;
		field=10;
		Calculatable calc=new Calculatable() {
			
			@Override
			public int sum() {
				int result=field+arg1+arg2+var1+var2;
				return result;
			}
		};	//원래 메소드한번만쓰면 사라지는데 계속유지해야되는경우 이런식으로 메소드를 사용함
		System.out.println(calc.sum());
	}
}