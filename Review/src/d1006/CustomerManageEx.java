package d1006;

import java.util.Scanner;

public class CustomerManageEx {

	// 필드
	Scanner s = new Scanner(System.in);
	private String[] name;
	private int[] age;
	private String[] hobby;
	int num;

	// 생성자
	public CustomerManageEx() {
		System.out.print("고객 수 입력 >>");
		num = s.nextInt();
		name = new String[num];
		age = new int[num];
		hobby = new String[num];
	}

	// 메소드
	public static void main(String[] args) {
		CustomerManageEx cm = new CustomerManageEx();
		for (int i = 0; i < cm.num; i++) {
			System.out.print("이름>>");
			cm.name[i] = cm.s.next();
			System.out.print("나이>>");
			cm.age[i] = cm.s.nextInt();
			System.out.print("취미>>");
			cm.hobby[i] = cm.s.next();
		}

		for (int i = 0; i < cm.num; i++) {
			System.out.print("이름 : " + cm.name[i] + " ");
			System.out.print("나이 : " + cm.age[i] + " ");
			System.out.println("취미 : " + cm.hobby[i] + " ");
		}

	}
}
