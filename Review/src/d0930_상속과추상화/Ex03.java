package d0930_상속과추상화;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200); //환율
		toDollar.run();
	}

}

abstract class Converter {
	abstract protected double convert (double src);
	abstract protected String getSrcString ();
	abstract protected String getDestString ();
	protected double ratio;
	
	void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.print(getSrcString() + "을 "+ getDestString() + "로 바꿉니다. ");
		System.out.print(getSrcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환결과 : "+res + getDestString() + " 입니다.");
		scanner.close();  //파일 입출력.. 반드시 닫아야됨. 나중에 배웁니다.ㅠㅠ
	}
}

class Won2Dollar extends Converter {
//	Won2Dollar() {}
	Won2Dollar(double val) {
		ratio = val;
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