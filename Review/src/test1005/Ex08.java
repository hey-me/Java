package test1005;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("�ο���>>"); 
		int people=s.nextInt();
		PhoneBook pb=new PhoneBook(people);
		
		for (int i = 0; i < people; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ ���� �Է�)>>");
			String name=s.next();
			String tel=s.next();
			if(name.equals("�׸�")) {
				break;
			}
			pb.input(name,tel);
		}
		
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String sn=s.next();
			pb.search(sn);
			if(sn.equals("�׸�")) {
				System.out.println("���α׷� ����");
				break;
			}
		}
		
	}

}
class Phone{
	 String name;
	 String tel;
	Phone(){
		
	}
	
	Phone(String name, String tel){
		this.name=name; this.tel=tel;
	}
}

class PhoneBook{
	Phone[]p1;
	int k=0;
	PhoneBook(int p){
		p1=new Phone[p];
		
		for (int i = 0; i < p1.length; i++) {
			p1[i]=new Phone();
		}
	}
	
	void input(String name, String tel) {
		
		p1[k++]=new Phone(name,tel);
		}
		
	void search(String name) {
		int imsi=-1;
		for (int i = 0; i < p1.length; i++) {
		if(p1[i].name.equals(name)){
				System.out.println(name+"�� ��ȣ�� "+p1[i].tel+"�Դϴ�.");
				imsi=i;
				break;
			}
		}
		if(imsi==-1){
			System.out.println(name+"�� �����ϴ�.");
		}
	}
	
}