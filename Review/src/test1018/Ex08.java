package test1018;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
/*	String bufferŬ������ Ȱ���Ͽ� ���ó�� ���ڿ� ����( �츮��!We => ���츮�¡��� ã�� We�� ����)
 * 	>>�츮�� love Java Programming.
		���: �츮��!We
		We love Java Programming.
		���: LOV!���
		ã�� �� �����ϴ�!
		���: lov!���
		We ���e Java Programming.
		���: ���!lov
		We love Java Programming.
		���: love!LOVE
		We LOVE Java Programming.
		���: �׸�
		�����մϴ�
*/
		StringBuffer a=new StringBuffer("�츮�� love Java Programming");
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.print("���: ");
			String input=s.next();
			if(input.equals("�׸�")) {
				System.out.println("�����մϴ�");
			break;
			}
			String inputs[]=input.split("!");
			if(inputs.length!=2) {
				System.out.println("�߸��� ����Դϴ�.");
			}else if(a.indexOf(inputs[0])!=-1) {
				a=a.replace(a.indexOf(inputs[0]),inputs[0].length(),inputs[inputs.length-1]);
			System.out.println(a);
			}else {
				System.out.println("ã�� �� �����ϴ�!");
			}
		}
	}

}
