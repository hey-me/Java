package _GUI._04_�׷���������Ʈ;

public class D1108_07_�׷��������̹����׸��� {

	/*
	 
	1. JLabel ������Ʈ�� �̹��� �׸���
		ImageIcon image = new ImageIcon("images/apple.jpg");
		JLabel label = new JLabel(image);
		panel.add(label);

		*����
			-�̹��� �׸��Ⱑ �����ϰ� ���� ����
			-�̹����� ������Ʈ�̹Ƿ� �̺�Ʈ �߻�
			-�̹����� ���콺 Ŭ���ϸ� �̺�Ʈ ���� �� ����
		*����
			-�̹��� ũ�� ���� �Ұ� : ���� ũ��θ� �׸���

	2. JPanel�� Graphics �޼ҵ�� �̹��� �׸���
		*����
			-�̹����� ���� ũ��� �ٸ���, �̹��� �Ϻκ� �� �׸��� ����
	 	*����
			-������Ʈ�� ���� ���� ����
			-�����ڰ� ��Ȳ�� ���� �̹����� ��ġ�� ũ�� ���� ������ �����ؾ� ��
			-�̹����� ���콺�� Ŭ���ص� �̹����� �̺�Ʈ �߻����� ����

	*�� 6 ���� �޼ҵ�
		���� ũ��� �׸���
		1) void drawImage(Image img, int x, int y, Color bgColor, ImageObserver observer)
		2) void drawImage(Image img, int x, int y, ImageObserver observer)

		ũ�� �����Ͽ� �׸��� 
		3) void drawImage(Image img, int x, int y, int width, int height, Color bgColor, ImageObserver observer)
		4) void drawImage(Image img, int x, int y, int width, int height, ImageObserver observer)

		������ �Ϻκ��� ũ�� �����Ͽ� �׸���
		5) void drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgColor, ImageObserver observer)
		6) void drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer)

	 	* ImageObserver�� �̹����� �� �׷����� ��, �뺸�� �޴� ��ü�� �����ϴ� �Ű�����
  		  �̹����� ��쿡 ���� ���ڵ� ������ ���� �ð��� ���� �ɸ� �� �ֱ� ������, 
  		  �̹��� �׸��Ⱑ �Ϸ�Ǿ����� �뺸 ���� �� ���.
  		  ������ ��� this�� �ְų� null�� �־� �뺸�� ���� ���� �� ����

*�̹��� �׸��� ���� �ڵ�	  
	
	-�̹��� �ε� : Image ��ü ����
		//�׸����� �ϴ� �̹����� ��image/image0.jpg���� ���
		ImageIcon icon = new ImageIcon(��image/image0.jpg��);
		Image img = icon.getImage();



	-���� �̹����� (20,20) ��ġ�� ���� ũ��� �׸���
 		���� ũ����
 		public void paintComponent(Graphics g) {
    		super.paintComponent(g);
    		g.drawImage(img, 20, 20, this);
		}

	-���� �̹����� 100x100 ũ��� �����Ͽ� �׸���
		���� ũ����
		public void paintComponent(Graphics g) {
    		super.paintComponent(g);
    		g.drawImage(img, 20, 20, 100, 100, this);
		}


	-���� �̹����� �гο� �� ������ �׸���
		JPanel�� ũ��� �����Ͽ� �׸���
		���� ũ��
		JPanel�� ũ�Ⱑ ���� ������ �̹����� ũ�⵵ ���� ����
		public void paintComponent(Graphics g) {
    		super.paintComponent(g);
    		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}

	-���� �̹����� (50, 0)���� (150,150) �簢�� �κ��� JPanel�� (20,20)���� (250,100) ������ �׸���
		���� ũ����
		public void paintComponent(Graphics g) {
    		super.paintComponent(g);
    		g.drawImage(img, 20,20,250,100,50,0,150,150, this);
		}

	  
	  
	 
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
