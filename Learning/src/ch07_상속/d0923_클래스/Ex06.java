package ch07_상속.d0923_클래스;

class SutdaDeck {

	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaCard index;

	SutdaDeck() {

//		for (int i = 0; i < 10; i++) {
//			int num = i + 1;
//			boolean isKwang = false;
//			if (num == 1 || num == 3 || num == 8) {
//				isKwang = true;
//			}
//			cards[i] = new SutdaCard(num, isKwang);
//		}
//		for (int i = 10; i < 20; i++) {
//			int num = i + 1 - 10;
//			boolean isKwang = false;
//			cards[i] = new SutdaCard(num, isKwang);
//		}
		for (int i = 0; i < CARD_NUM; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (num == 1 || num == 3 || num == 8) && (i < 10);
			cards[i] = new SutdaCard(num, isKwang);
		}

	}

	SutdaCard pick() {
		return cards[(int) (Math.random() * CARD_NUM)];
	}

	SutdaCard pick(int index) {
		if (index >= 0 && index < CARD_NUM)
			return cards[index];
		return null;
	}

	void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int start = (int) (Math.random() * CARD_NUM);
			int end = (int) (Math.random() * CARD_NUM);
			SutdaCard imsi = cards[start];
			cards[start] = cards[end];
			cards[end] = imsi;

		}
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

// info()대신 Object클래스의 toString()을 오버라이딩했다. 
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

class Ex06 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
	}
}
