package test1025;
import java.util.*;
public class Ex02_2 {
//�����̲�
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, String> ha = new HashMap<String, String>();
		try {
			while (true) {
				System.out.println("�ܾ��Է�:1 �ܾ�ã��:2 ����:stop");
				String stop = s.nextLine();
//				s.nextLine();
				if (stop.equals("1")) {
					System.out.println("(����,�ѱ�)�� �߰����ּ���");
					String a = s.nextLine();
					String[] ar = a.split(",");
					ha.put(ar[0].trim(), ar[1].trim());
				} else if (stop.equals("2")) {
					System.out.println("ã����� �ѱ��� ����� �Է����ּ��� : ");
					
//					Set<String> key = ha.keySet();
					String a1 = s.next();
					
					if (ha.containsKey(a1)) {
						String a12 = ha.get(a1);
						System.out.println(a12);
					} else {
						System.out.println("������ ���� �ܾ��Դϴ�.");
					}
				} else if (stop.equals("stop")) {
					break;
				} else {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
				}
			}
		} catch (Exception e) {
			System.out.println("�����Դϴ� ó������ �ٽ� �������ּ���.");
		}
	}

}
