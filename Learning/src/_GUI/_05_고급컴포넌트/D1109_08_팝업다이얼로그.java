package _GUI._05_���������Ʈ;

import javax.swing.JOptionPane;

public class D1109_08_�˾����̾�α� {
/*
 	*JOptionPane
		�����ϰ� ������ �˾� ���̾�α� ����
		static �� Ÿ���� ������ �޼ҵ� �̿�

 	*�Է� ���̾�α�
		�� ���� �Է� �޴� ���̾�α�
		String JOptionPane.showInputDialog(String msg)

	*Ȯ�� ���̾�α�
		����ڷκ��� Yes/No �� Ȯ���� �Է¹޴� ���̾�α�
		int JOptionPane.showConfirmDialog(Component parentComponent, Object msg, String title, int optionType)

	*�޽��� ���̾�α�
		�ܼ� �޽����� ����ϴ� ���̾�α�
		void JOptionPane.showMessageDialog(Component parentComponent, Object msg, String title, int messageType)


	**JOptionPane �˾� ���̾�α׿� �ڵ� ����   		 */
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���.");
		// name�� ��Java Kim�� ����
		// ����ڰ� �Է� ���� â�� ������ null ����
		
		int result = JOptionPane.showConfirmDialog(null, "����� ���Դϱ�?", 					"Confirm", JOptionPane.YES_NO_OPTION);
		if(result == JOptionPane.CLOSED_OPTION) {
			// ����ڰ� "��"�� "�ƴϿ�"�� ���þ��� ���̾�α� â�� ���� ���
		}
		else if(result == JOptionPane.YES_OPTION) {
			// ����ڰ� "��"�� ������ ���
			
		}
		else {	// ����ڰ� "�ƴϿ�"�� ������ ���
		}
		
		
		JOptionPane.showMessageDialog(null, "�����ϼ���", "Message", 
				JOptionPane.ERROR_MESSAGE); 

	}

}
