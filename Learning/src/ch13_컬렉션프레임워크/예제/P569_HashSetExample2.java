package ch13_컬렉션프레임워크.예제;

import java.util.*;

public class P569_HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		System.out.println(set.size());
		
		Member m1 =new Member("홍길동", 30);
		Member m2 =new Member("홍길동", 30);
		
		//Member클래스에서 오버라이딩 안하면 모두 false 
		//오버라이딩 하면 첫번째꺼는 true 두번째꺼는false
		System.out.println(m1);
		System.out.println(m2);
		
		System.out.println("문자열"+m1.equals(m2));
		System.out.println(m1==m2);
		System.out.print("HashCode");
		System.out.println(m1.hashCode()==m2.hashCode());
		System.out.println();
	}

}
class Member{
	String name;
	int age;
	
	Member(String name, int age) {
		this.name = name;
		this.age = age;
	
	}
	// equals와 hashCode 오버라이딩 안해주면 같은 객체로 인식 못하고 주소로 확인해서 객체 수는 2개
	public boolean equals(Object obj){
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age ==age);
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode()+ age;
	}
	
}



