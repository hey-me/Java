package test0930;


public class Ex10 {

	public static void main(String[] args) {

		Dictionary dic=new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 "+dic.get("이재문"));
		System.out.println("황기태의 값은 "+dic.get("황기태"));
//		dic.delete("황기태");
//		System.out.println("황기태의 값은"+dic.get("황기태"));
		
		
		
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