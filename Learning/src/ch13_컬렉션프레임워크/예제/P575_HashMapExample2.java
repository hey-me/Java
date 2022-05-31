package ch13_ÄÃ·º¼ÇÇÁ·¹ÀÓ¿öÅ©.¿¹Á¦;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class P575_HashMapExample2 {

	public static void main(String[] args) {
		
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "È«±æµ¿"),95 );
		map.put(new Student(1, "È«±æµ¿"),100 );
		map.put(new Student(2, "È«±æµ¿"),95 );
		map.put(new Student(3, "È«±æµ¿"),90 );
		System.out.println("ÃÑ Entry ¼ö : "+ map.size());
		System.out.println(map.get(new Student(1, "È«±æµ¿")));
		
		Set<Student> keySet = map.keySet();
		Iterator<Student> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			Student key = keyIterator.next();
			Integer value = map.get(new Student(key.sno, key.name));
			System.out.println(key.sno + key.name + ":" + value);
	}
}
	}

class Student {
	int sno;
	String name;
	
	public Student(	int sno,String name) {
	this.sno = sno; this.name = name;}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student)obj;
			return (sno==student.sno)&& (name.equals(student.name));
		}  else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
}