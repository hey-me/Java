package _GUI._04_�׷���������Ʈ;

public class D1108_03_Color_FontŬ���� {
/*
 **Color 
	:�ϳ��� ���� ǥ���ϴ� Ŭ����
		-Red, Green, Blue �� 3 �������� ����
		-�� ������ ũ��� 0-255(8��Ʈ)

 	*������	
		Color(int r, int g, int b)
			-red(r), green(g), blue(b) ��, sRGB �� ����
			-new Color(255, 0, 0) ; // ���� ������
		Color(int rgb)
			-rgb ���� ���� �� 32��Ʈ �� ���� 24 ��Ʈ���� ��ȿ�ϰ�  0x00rrggbb�� ǥ�� 
			-���� 8��Ʈ�� blue, �� ���� ���� 8 ��Ʈ�� green, �� ���� 8 ��Ʈ�� red  ����
			-new Color(0x0000ff00);  // ���� �ʷ�

	*���� ����ϴ� �ٸ� ���
		Color.BLUE ���� static ��� Ȱ��

	ex) 
	Graphics g;
	g.setColor(new Color(255, 0, 0)); 	// ������
	g.setColor(new Color(0x0000ff00)); 	// �ʷϻ�
	g.setColor(Color.YELLOW); 	// �����


**Font
	:��Ʈ�� ǥ���ϴ� Ŭ����

 	*������
		Font(String fontFace, int style, int size)
			-fontFace�� "���ü", "Arial" ��
			-style�� Font.BOLD, Font.ITALIC , Font.PLAIN �� �ϳ�
			-size�� �ȼ� ������ ũ��

 	*Graphics ��ü���� ����� ��Ʈ ����
		-void setColor(Color color)
			:ĥ�� ���� color�� ����
		-void setFont(Font font)
			:��Ʈ�� font�� ����

	ex)
	Graphics g;
	Font f = new Font("Arial", Font.ITALIC, 30);
	g.setFont(f);
	g.setColor(Color.RED);
	g.drawString("How much", 30,30);

	
 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
