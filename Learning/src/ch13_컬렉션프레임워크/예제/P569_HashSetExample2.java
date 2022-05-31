package ch13_�÷��������ӿ�ũ.����;

import java.util.*;

public class P569_HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿", 30));
		System.out.println(set.size());
		
		Member m1 =new Member("ȫ�浿", 30);
		Member m2 =new Member("ȫ�浿", 30);
		
		//MemberŬ�������� �������̵� ���ϸ� ��� false 
		//�������̵� �ϸ� ù��°���� true �ι�°����false
		System.out.println(m1);
		System.out.println(m2);
		
		System.out.println("���ڿ�"+m1.equals(m2));
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
	// equals�� hashCode �������̵� �����ָ� ���� ��ü�� �ν� ���ϰ� �ּҷ� Ȯ���ؼ� ��ü ���� 2��
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



