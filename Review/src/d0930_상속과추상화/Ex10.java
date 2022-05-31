package d0930_��Ӱ��߻�ȭ;

public class Ex10 {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̽�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
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