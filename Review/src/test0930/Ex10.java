package test0930;


public class Ex10 {

	public static void main(String[] args) {

		Dictionary dic=new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� "+dic.get("���繮"));
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
//		dic.delete("Ȳ����");
//		System.out.println("Ȳ������ ����"+dic.get("Ȳ����"));
		
		
		
	}

}

abstract class PairMap{
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}

class Dictionary extends PairMap{
	int i=0;
	int i2=0;
	Dictionary(int x){
		super.keyArray=new String [x];
		super.valueArray=new String [x];
		
	}

	@Override
	String get(String key) {
		if(keyArray.length>0) {
			return valueArray[i2++];
		}else {
			return null;
		}
	}

	@Override
	void put(String key, String value) {
		keyArray[i]=key;
		i++;
		valueArray[i2]=value;
		i2++;
	}

	@Override
	String delete(String key) {
		if(keyArray[i].equals(key)){
			return valueArray[i]=null;
		}else {
			return null;
		}
		
	}

	@Override
	int length() {
		return valueArray.length;
	}
	
}