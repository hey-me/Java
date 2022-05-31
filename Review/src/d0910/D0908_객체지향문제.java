package d0910;

public class D0908_객체지향문제 {

	public static void main(String[] args) {

		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}

class SutdaCard {

	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	String info() {
		String oh = isKwang ? num + "K" : num + "";
		return oh;
	}
}

