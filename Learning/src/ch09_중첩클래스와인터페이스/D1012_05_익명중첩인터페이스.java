package ch09_중첩클래스와인터페이스;

public class D1012_05_익명중첩인터페이스 {
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
	Button.OnClickListener listener=new Button.OnClickListener() {	//클래스 이름이 ~listener나 ~able은 거의 인터페이스임
//		listener에는 OnClicListener를 구현하는 구현객체를 넣을 수 있다. new다음()뒤에 세미콜론이 아니므로 구현객체를 지금 만들겠다는 뜻
		//필드초기화
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window(){//먼저 Button타입의 필드르 ㄹ초기화하는게 우선
		b1.setOnClickListener(listener);
		b2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");				
			}
		});
	}
}