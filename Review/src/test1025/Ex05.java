package test1025;

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {

//5. 이름과 포인트점수를 관리할 수 있는 포인트관리 프로그램을 작성해보세요.
//Scanner로 이름과 포인트를 입력받아서 작업하되 이름에 "종료"를 입력하면 종료되도록 하세요.
//한 사람의 이름과 포인트를 처리한 후에 전체 회원의 이름과 포인트를 출력하도록 하세요.
//		포인트도 누적되야함
	
		Scanner s=new Scanner(System.in);
		Map<String, Integer> map=new HashMap<String, Integer>();
		while(true) {
		System.out.println("이름과 포인트를 입력하세요");
		String input=s.nextLine();
		if(input.equals("종료")) {
			break;
		}
		String[]inputs=input.split(",");
		for (int i = 0; i < inputs.length; i++) {
			inputs[i]=inputs[i].trim();
		}
		if(map.containsKey(inputs[0])) {
			map.put(inputs[0], (Integer.parseInt(inputs[1])+map.get(inputs[0])));
		}else {
		map.put(inputs[0],Integer.parseInt(inputs[1]));
		}
		}
		
		
		Set<Map.Entry<String, Integer>> entrySet=map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator=entrySet.iterator();
		System.out.println("회원 현황 총"+map.size()+"명");
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry=entryIterator.next();
			System.out.println("이름: "+entry.getKey()+", 포인트: "+entry.getValue());
		}
		
	}
//	put메소드를 오버라이딩하려고했으나 이미 기능이 만들어진 메소드이고 오버라이딩하려면 상속을 해야하기 때문에 번거로워짐
//	equals는 모든 클래스가 object를 상속하고있기 때문에 굳이 extends를 하지 않아도 가능
	

}
class Point3{
	String name;
	Integer point;
	Point3(String n, Integer p){
		name=n; point=p;
	}
	
	public int hashCode() {
		return name.hashCode()+point;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Point3) {
			Point3 p=(Point3)obj;
//			if(p.name==name) {		//매개변수를 갖고온 다음에 증감하는 메소드를 따로만들어서 작업해야함
//				p.point+=point;		//매개변수를 완료하지도 않은 상태에서 작업을 하려고하면 안됌
//			}
			return p.name==name;
		}else {
			return false;
		}
	}
	
}
