package d0930_상속과추상화;

public class Ex10 {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
	}
}

class Dictionary extends PairMap {
	protected String keyArray[];
	protected String valueArray[];
	int index = 0;

	public Dictionary() {}
	public Dictionary(int size) {
		keyArray = new String[size];
		valueArray = new String[size];
	}
	@Override
	void put(String key, String value) {
		for (int i = 0; i < keyArray.length; i++) {
			if (key == keyArray[i]) {
				valueArray[i] = value;
				break;
			}
		}
		keyArray[index] = key;
		valueArray[index] = value;
		index++;
	}
	@Override
	String get(String key) {
		for (int i = 0; i < keyArray.length; i++) {
			if (key == keyArray[i])
				return valueArray[i];
		}
		return null;
	}
	@Override
	String delete(String key) {
		for (int i = 0; i < keyArray.length; i++) {
			if (key == keyArray[i])
				valueArray[i] = null;
		}
		return null;
	}
	@Override
	int length() {
		int num = 0;
		for (int i = 0; i < keyArray.length; i++) {
			if (!(keyArray[i] == null)) {
				num++;
			}
		}
		return num;
	}
}

abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}