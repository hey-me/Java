package _GUI._02_Event;

public class D1102_5_Key�̺�Ʈ����Ŀ�� {
/*
	 * Ű �Է� ��, ���� �� ��쿡 Key �̺�Ʈ �߻� 
	  	Ű�� ������ ���� 
	 	���� Ű�� ���� ���� 
	  	���� Ű�� ���� ����(Unicode Ű�� ��쿡��)
	  
	 * Ű �̺�Ʈ�� ���� �� �ִ� ���� 
	  	��� ������Ʈ ����������, ���� ��Ŀ��(focus)�� ���� ������Ʈ
	 
	 * ��Ŀ��(focus) 
	  	������Ʈ�� �������α׷��� Ű �̺�Ʈ�� �����ϴ� ���� 
	  	������Ʈ�� ��Ŀ�� ���� ��� : ���� 2 ������ �ڵ� �ʿ�
	  	1. component.setFocusable(true); // component�� ��Ŀ���� ���� �� �ֵ��� ����
		2. component.requestFocus(); // component�� ��Ŀ�� ���� ����
	  
	  
	 * �ڹ��÷������� ���� ȯ���� �ʱ�ȭ�� ���� �ٸ� �� �ֱ� ������ ���� �ڵ尡 �ʿ���
	 	component.setFocusable(true); 
	 	
	 * ���� �������� ������� ��Ŀ���� �ְ��� �ϴ� ���
			-JFrame�� setVisible(true) ���Ŀ�  ��Ŀ���� �־�� �� 
				setVisible(true); // ���� ������ ���
				component.setFocusable(true);
				component.requestFocus(); 



	* ���콺�� ������Ʈ�� Ŭ���� �� ��Ŀ�� �����ϴ� ���
		-�������� �ʿ��� �� ��Ŀ�� �� �� ����
			
			component.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					Component c = (Component)e.getSource(); // Ŭ���� ������Ʈ
					c.setFocusable(true);
					c.requestFocus(); 
				}
			}); // ���� 10-8���� Ȱ���Ͽ���
	
	*Virtual Key ����Ű
	 	VK_LEFT
	 	VK_PGDN...
	 	
	 	
	* Ű�� �ԷµǸ� Ű ������ ���� �̺�Ʈ ��ü ����  : KeyEvent ��ü
		-KeyEvent ��ü�� �����ʿ� ���޵�

	1.Ű�� ���� �ڵ�(�����ڵ�) �˾Ƴ���, ... char KeyEvent.getKeyChar()
		-������ Ű�� �ش��ϴ� ���� �ڵ�(�����ڵ�) ����
		-������ Ű�� ���� Ű�� ��쿡�� �۵�

	2.�Էµ� Ű�� ���� Ű �� �˾Ƴ���, ... int KeyEvent.getKeyCode()
		-��� Ű�� ���� �۵�
		-�Էµ� Ű�� �Ǻ��ϱ� ���� ����Ű(Virtual Key) ���� ��
		-���� Ű ���� KeyEvent Ŭ������ ����� ���ǵ�

	3.Ű �̸� ���ڿ� ���� ... String KeyEvent.getKeyText(int keyCode)
		-Static �޼ҵ�
		-�Ű����� keyCode�� �ڵ� ��(���� Ű)�� �ش��ϴ� Ű�� �̸� ���ڿ� ����	
			F1 Ű�� ��� "F1", Shift Ű�� ��� "SHIFT" ���� ���ڿ� ����
 	
 ***
    aŰ�� ������
     public void keyPressed(KeyEvent e){
     	char keyChar = e.getKeyChar();
     	int keyCode = e.getKeyCode();
     }
 =>>>
 	keyChar : �����ڵ尪 'a'
 	keyCode : VK_A
	 	
 
 ***
    <F5>Ű�� ������
     public void keyPressed(KeyEvent e){
     	char keyChar = e.getKeyChar();
     	int keyCode = e.getKeyCode();
     }
 =>>>
 	keyChar : �����ڵ尪: CHAR_UNDEFINED
 	keyCode : VK_F5
	 	
 
 ***
    <F5>Ű�� ����
     public void keyTyped(KeyEvent e){
     	char keyChar = e.getKeyChar();
     	int keyCode = e.getKeyCode();
     }
=>>>
 	keyChar : ����
 	keyCode : ����
	 	
	 	
*/

}
