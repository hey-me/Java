package test0930;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Won2Dollar toDollar=new Won2Dollar(1200);
		toDollar.run();
	}

}

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;	//상수
	
	public void run() {
		Scanner scanner=new Scanner(System.in);
		System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
		System.out.print(getSrcString()+"을 입력하세요>> ");
		double val=scanner.nextDouble();
		double res=convert(val);
		System.out.println("변환 결과: "+res+getDestString()+"입니다.");
		scanner.close();
	}
}

class Won2Dollar extends Converter{
	public Won2Dollar(int i) {
		super.ratio=i;
	}

	@Override
	protected double convert(double src) {
		
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}
}