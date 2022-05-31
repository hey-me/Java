package test1025;
import java.util.*;
public class Ex03 {

	public static void main(String[] args) {

//		3. id�� ��ȭ��ȣ�� �����Ǵ� Student Ŭ������ �����, �̸��� 'Ű'�� �ϰ� Student ��ü�� '��'�����ϴ� HashMap �� ����� �̸��� �˻��ؼ� Student�� id�� ��ȭ��ȣ�� ����ϵ��� �ۼ��غ�����.
		Map<String,Student3> map=new HashMap<String, Student3>();
		Scanner s=new Scanner(System.in);
		while(true) {
		System.out.println("�л��� ������ �Է��ϼ���.(�̸�, ID, ��ȭ��ȣ)");
		String input=s.nextLine();
		if(input.equals("�׸�")) {
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
			System.out.print("�˻��� �̸��� �Է�: ");
			String key=s.next();
			if(key.equals(result)) {
				Student3 value=map.get(key);
				System.out.println(key+"�� ID��: "+value.id+", ��ȭ��ȣ��: "+value.number+" �Դϴ�.");
			}else {
				System.out.println("�Է��� �̸��� ��	���ϴ�.");
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