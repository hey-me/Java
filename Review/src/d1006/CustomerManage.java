package d1006;

public class CustomerManage {

	public static void main(String[] args) {
		
//		Customer c = new Customer();
//		System.out.println(c);
//		c.setName("홍길동");
//		c.setAge(200);
//		c.setHobby("놀기");
//		System.out.println(c);
//		c.show();
//		Customer c2 = new Customer("김길동", 30, "독서");
//		System.out.println(c2);
//		c2.show();
		
		int[] a = new int[5];
		a[0]=10;
		System.out.println(a[0]);
		
		String[] b = new String[5];
		b[0]="광주";
		b[1] = new String("광주");
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		Customer[] c = new Customer[3];
		System.out.println(c);
		c[0] = new Customer();
		c[1] = new Customer("홍길동", 50, "등산");
		c[2] = new Customer("김길동", 40, "음악감상");
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
			c[i].show();
		}
	}
}

class Customer {
	//필드
	private String name;
	private int age;
	private String hobby;
	//생성자
	public Customer() {}
	public Customer(String name, int age, String hobby) {
		this.name = name; this.age = age; this.hobby = hobby;
	}
	//메소드
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public String getHobby() {return hobby;}
	public void setHobby(String hobby) {this.hobby = hobby;}

	void show() {
		System.out.println("이름은 "+ name + ", 나이는 "+age +", 취미는 "+hobby);
	}
	
	@Override
	public String toString() {
		return name;
	}
}