package test1025;
import java.util.*;
public class Ex03 {

	public static void main(String[] args) {

//		3. id와 전화번호로 구성되는 Student 클래스를 만들고, 이름을 '키'로 하고 Student 객체를 '값'으로하는 HashMap 을 만들고 이름을 검색해서 Student의 id와 전화번호를 출력하도록 작성해보세요.
		Map<String,Student3> map=new HashMap<String, Student3>();
		Scanner s=new Scanner(System.in);
		while(true) {
		System.out.println("학생의 정보를 입력하세요.(이름, ID, 전화번호)");
		String input=s.nextLine();
		if(input.equals("그만")) {
			break;
		}
		String []inputs=input.split(",");
		for (int i = 0; i < inputs.length; i++) {
			inputs[i]=inputs[i].trim();
		}
		map.put(inputs[0], new Student3(inputs[1],inputs[2]));
		}
		
		Set<String> keySet=map.keySet();
		Iterator<String> keyIterator=keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String result=keyIterator.next();
			System.out.print("검색할 이름을 입력: ");
			String key=s.next();
			if(key.equals(result)) {
				Student3 value=map.get(key);
				System.out.println(key+"의 ID는: "+value.id+", 전화번호는: "+value.number+" 입니다.");
			}else {
				System.out.println("입력한 이름이 없	습니다.");
			}
		}
		
	}

}

class Student3{
	String id;
	String number;
	Student3(String id, String number){
		this.id=id;
		this.number=number;
	}
	@Override
	public int hashCode() {
		return Integer.parseInt(number)+id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student3) {
			Student3 student3=(Student3)obj;
			return student3.id.equals(id);
		}else {
			return false;
		}
	}
}