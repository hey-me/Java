package d0930_상속과추상화;

public class Ex04 {

	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
		
	}

}
class Km2Mile extends Converter {

	public Km2Mile(double src) {
		ratio = src;
	}
	@Override
	protected double convert(double src) {
		return src/ratio;
	}
	@Override
	protected String getSrcString() {
		return "Km";
	}
	@Override
	protected String getDestString() {
		return "mile";
	}
	
} 