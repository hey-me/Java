package ch09_��øŬ�������������̽�;

public class D1012_05_�͸���ø�������̽� {
//p.433
	public static void main(String[] args) {
		Window w=new Window();
		w.b1.touch();
		w.b2.touch();
	}

}

class Button{
	OnClickListener listener;
	void setOnClickListener(OnClickListener listener) {
		this.listener=listener;
	}
	void touch() {
		listener.onClick();
	}
	static interface OnClickListener{
		void onClick();
	}
}

class Window{
	Button b1=new Button();
	Button b2=new Button();
	Button.OnClickListener listener=new Button.OnClickListener() {	//Ŭ���� �̸��� ~listener�� ~able�� ���� �������̽���
//		listener���� OnClicListener�� �����ϴ� ������ü�� ���� �� �ִ�. new����()�ڿ� �����ݷ��� �ƴϹǷ� ������ü�� ���� ����ڴٴ� ��
		//�ʵ��ʱ�ȭ
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	
	Window(){//���� ButtonŸ���� �ʵ帣 ���ʱ�ȭ�ϴ°� �켱
		b1.setOnClickListener(listener);
		b2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("�޼����� �����ϴ�.");				
			}
		});
	}
}