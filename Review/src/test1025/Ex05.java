package test1025;

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {

//5. �̸��� ����Ʈ������ ������ �� �ִ� ����Ʈ���� ���α׷��� �ۼ��غ�����.
//Scanner�� �̸��� ����Ʈ�� �Է¹޾Ƽ� �۾��ϵ� �̸��� "����"�� �Է��ϸ� ����ǵ��� �ϼ���.
//�� ����� �̸��� ����Ʈ�� ó���� �Ŀ� ��ü ȸ���� �̸��� ����Ʈ�� ����ϵ��� �ϼ���.
//		����Ʈ�� �����Ǿ���
	
		Scanner s=new Scanner(System.in);
		Map<String, Integer> map=new HashMap<String, Integer>();
		while(true) {
		System.out.println("�̸��� ����Ʈ�� �Է��ϼ���");
		String input=s.nextLine();
		if(input.equals("����")) {
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
		System.out.println("ȸ�� ��Ȳ ��"+map.size()+"��");
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry=entryIterator.next();
			System.out.println("�̸�: "+entry.getKey()+", ����Ʈ: "+entry.getValue());
		}
		
	}
//	put�޼ҵ带 �������̵��Ϸ��������� �̹� ����� ������� �޼ҵ��̰� �������̵��Ϸ��� ����� �ؾ��ϱ� ������ ���ŷο���
//	equals�� ��� Ŭ������ object�� ����ϰ��ֱ� ������ ���� extends�� ���� �ʾƵ� ����
	

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
//			if(p.name==name) {		//�Ű������� ����� ������ �����ϴ� �޼ҵ带 ���θ��� �۾��ؾ���
//				p.point+=point;		//�Ű������� �Ϸ������� ���� ���¿��� �۾��� �Ϸ����ϸ� �ȉ�
//			}
			return p.name==name;
		}else {
			return false;
		}
	}
	
}
