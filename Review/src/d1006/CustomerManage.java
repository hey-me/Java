package d1006;

public class CustomerManage {

	public static void main(String[] args) {
		
//		Customer c = new Customer();
//		System.out.println(c);
//		c.setName("ȫ�浿");
//		c.setAge(200);
//		c.setHobby("���");
//		System.out.println(c);
//		c.show();
//		Customer c2 = new Customer("��浿", 30, "����");
//		System.out.println(c2);
//		c2.show();
		
		int[] a = new int[5];
		a[0]=10;
		System.out.println(a[0]);
		
		String[] b = new String[5];
		b[0]="����";
		b[1] = new String("����");
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		Customer[] c = new Customer[3];
		System.out.println(c);
		c[0] = new Customer();
		c[1] = new Customer("ȫ�浿", 50, "���");
		c[2] = new Customer("��浿", 40, "���ǰ���");
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
			c[i].show();
		}
	}
}

class Customer {
	//�ʵ�
	private String name;
	private int age;
	private String hobby;
	//������
	public Customer() {}
	public Customer(String name, int age, String hobby) {
		this.name = name; this.age = age; this.hobby = hobby;
	}
	//�޼ҵ�
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public String getHobby() {return hobby;}
	public void setHobby(String hobby) {this.hobby = hobby;}

	void show() {
		System.out.println("�̸��� "+ name + ", ���̴� "+age +", ��̴� "+hobby);
	}
	
	@Override
	public String toString() {
		return name;
	}
}