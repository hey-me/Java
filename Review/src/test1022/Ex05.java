package test1022;

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
//		5. �л��̸�, �а�, �й�, �������(�Ǽ���)�� �Է¹޾� ������ �� �ִ� Student Ŭ������ Student Ŭ������ ������ �� �ֵ��� ArrayList�� �����Ѵ�.
//		�л� �̸��� stop (��ҹ��ڹ���)�� �Էµ� ������ �л������͸� �Է¹޴´�. 
//		�Է��� ����Ǹ� ArrayList�� �Էµ� ��� �л� ������ iterator()�� �̿��Ͽ� ���� ���� ����ϰ�,
//		�л��̸��� �˻��ؼ� �л��� ������ ����� �� �ֵ��� �ۼ��ϼ���. �л��̸��� '����'�� �Է��ϸ� ���α׷��� ����ǵ��� �ϼ���.
//		  - �Է�����) ȫ�浿, ��ǻ��, 12345, 3.54
//		studentŬ������ ���� �̸� �а��� string �����double 
		
		Scanner s=new Scanner(System.in);
		List<Student> list=new ArrayList<Student>();
		System.out.println("�л��̸�, �а�, �й�, ��������� �Է��ϼ���");
		while(true) {
			String str=s.next();
			String [] sr=str.split(",");
			for (int i = 0; i < sr.length; i++) {
				sr[i]=sr[i].trim();
			}
			Student st=new Student(sr[0],sr[1],Integer.parseInt(sr[2]),Double.parseDouble(sr[3]));
			if(sr[0]=="stop") {
				break;
			}else {
				list.add(st);
			}
		}
		Iterator<Student> it=list.iterator();
		System.out.println("<<�Էµ� ��� �л��� ����>>");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
class Student{
	String name;
	String major;
	int num;
	double avg;
	
	Student(String name, String major, int num, double avg){
		this.name=name;
		this.major=major;
		this.num=num;
		this.avg=avg;
	}
}
