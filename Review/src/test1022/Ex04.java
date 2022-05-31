package test1022;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
//		4. ������ ����� ����ϱ� ���� 0�� �ԷµǱ� ������ ������ �����͸� �Է¹޾� LinkedList�� ������ �� �޼ҵ� ȣ��� iterator()�� �̿��Ͽ� ����� ����Ͽ� ���
		Scanner s=new Scanner(System.in);
		List<Integer> list=new LinkedList<>();
		while(true) {
			int input=s.nextInt();
			if(input==0) {
				break;
			}else {
				list.add(input);
			}
		}
		Iterator<Integer> it=list.iterator();
		System.out.println(avg(it));
		
	}
	public static double avg(Iterator<Integer> it) {
		int sum=0;
		int cnt=0;
		while(it.hasNext()) {
			sum+=it.next();
			cnt++;
		}
		return (double)sum/cnt;
	}

}
