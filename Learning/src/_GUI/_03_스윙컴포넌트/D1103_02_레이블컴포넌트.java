package _GUI._03_����������Ʈ;

public class D1103_02_���̺�������Ʈ {	
/*
		*JLabel�� �뵵 
			- ���ڿ��̳� �̹����� ������Ʈȭ �Ͽ� ����ϱ� ���� ����
		
		*������
			- JLabel()  �� ���̺�
			- JLabel(Icon image)  �̹��� ���̺�
			- JLabel(String text)  ���ڿ� ���̺�
			- JLabel(String text, Icon image, int hAlign)  ���ڿ��� �̹����� ��� ���� ���̺�
				Align : ���� ���� ������, 
				SwingConstants.LEFT, SwingConstants.RIGHT, SwingConstants.CENTER �� �ϳ�
			
		   	*Icon image ...
				ImageIcon(Image image)
				ImageIcon(String filename)


		*�ܼ� �ؽ�Ʈ ���� ���� ���̺� ������Ʈ ����
			JLabel textLabel = new JLabel("����մϴ�");
		
		*�̹����� ���� ���̺� ������Ʈ ����
			-�̹��� ���Ϸκ��� �̹����� �б� ���� ImageIcon Ŭ���� ���  
			// �̹��������� ������Ʈ ������ �־�ߵ�. ��Ű���� ������ �� �� ����
			-�ٷ� �� �ִ� �̹��� : png, gif, jpg
				> sunset.jpg�� ��θ���  "images/sunset.jpg"�� ���
					ImageIcon image = new ImageIcon("images/sunset.jpg");
					JLabel imageLabel = new JLabel(image);
		
		*���� ���� ���� ���� ���̺� ������Ʈ ����
			-�ؽ�Ʈ �̹��� ��� ����ϰ��� �ϴ� ��� ���� ���� ����
				ImageIcon image = new ImageIcon("images/sunset.jpg");
				JLabel label = new JLabel("����մϴ�", image, SwingConstants.CENTER);

		

*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
