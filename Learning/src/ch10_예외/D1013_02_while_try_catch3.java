package ch10_����;

import java.util.InputMismatchException;
import java.util.Scanner;

public class D1013_02_while_try_catch3 {

	public static void main(String[] args) {
//		�������� �� ��ó���ϰ� alt+shift+z ������ try/catch�ڵ��ϼ�
		
		Scanner s=new Scanner(System.in);
		int n1=0, n2=0;
		while(true) {
			try{
				System.out.print("���� 1�Է�:");
				n1=s.nextInt();
				break;
				}
			catch (InputMismatchException e) {
				System.out.println("����");
				s.next();//���͸��о���� �����϶��ݺ��̾ȉ�
			} catch(ArithmeticException e) {
				System.out.println("0����");
			}catch(Exception e) {
				e.printStackTrace();
			}}
		while(true) {
			try {
				System.out.print("���� 2�Է�:");
				n2=s.nextInt();
				System.out.println(n1/n2);
				break;
			}
		catch (InputMismatchException e) {
				System.out.println("����");
				s.next();//���͸��о���� �����϶��ݺ��̾ȉ�
			} catch(ArithmeticException e) {
				System.out.println("0����");
			}catch(Exception e) {
				e.printStackTrace();
			}}
	}

}
