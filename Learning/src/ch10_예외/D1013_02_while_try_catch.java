package ch10_����;

import java.util.InputMismatchException;
import java.util.Scanner;

public class D1013_02_while_try_catch {

	public static void main(String[] args) {
//		�������� �� ��ó���ϰ� alt+shift+z ������ try/catch�ڵ��ϼ�
		
		Scanner s=new Scanner(System.in);
		boolean reverse=false;
		while(true) {
			try{
				System.out.print("���� 1�Է�:");
				int n1=s.nextInt();
		while(reverse!=true) {
				System.out.print("���� 2�Է�:");
				int n2=s.nextInt();
			
				System.out.println(n1/n2);
				reverse=true;
			}
			}
		catch (InputMismatchException e) {
				System.out.println("����");
				s.next();//���͸��о���� �����϶��ݺ��̾ȉ�
			} catch(ArithmeticException e) {
				System.out.println("0����");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
