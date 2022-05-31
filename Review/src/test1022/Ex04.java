package test1022;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
//		4. 강수량 평균을 계산하기 위해 0이 입력되기 전까지 강수량 데이터를 입력받아 LinkedList에 저장한 후 메소드 호출과 iterator()를 이용하여 평균을 계산하여 출력
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
